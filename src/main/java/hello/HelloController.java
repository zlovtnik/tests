package hello;

import com.sun.xml.internal.messaging.saaj.soap.ver1_2.Message1_2Impl;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.cxf.common.message.CxfConstants;
import org.apache.cxf.message.MessageContentsList;
import org.springframework.stereotype.Controller;

import javax.xml.soap.SOAPBody;

@Controller
public class HelloController extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        from("timer://test?period=1m")
                .setHeader(CxfConstants.OPERATION_NAMESPACE, simple("http://tempuri.org/"))
                .setHeader(CxfConstants.OPERATION_NAME, simple("getVersao"))
                .to("cxf://http://ws.correios.com.br/calculador/CalcPrecoPrazo.asmx?" +
                        "wsdlURL=./wsdl/correios.wsdl&" +
                        "serviceClass=it.com.rcs.Stubs.CalcPrecoPrazoWSSoap&" +
                        "dataFormat=POJO&" +
                        "loggingFeatureEnabled=true")
                .process(new Processor() {
                    @Override
                    public void process(Exchange exchange) throws Exception {
                        MessageContentsList xml = (MessageContentsList)exchange.getIn().getBody();

                        while (!xml.isEmpty()){
                            System.out.println(xml.get(0));
                        }
                    }
                })
                .log("${out.body}");

    }
}
