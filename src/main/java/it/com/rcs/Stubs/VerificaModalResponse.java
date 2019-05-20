
package it.com.rcs.Stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VerificaModalResult" type="{http://tempuri.org/}cResultadoModal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "verificaModalResult"
})
@XmlRootElement(name = "VerificaModalResponse")
public class VerificaModalResponse {

    @XmlElement(name = "VerificaModalResult", required = true)
    protected CResultadoModal verificaModalResult;

    /**
     * Obt�m o valor da propriedade verificaModalResult.
     * 
     * @return
     *     possible object is
     *     {@link CResultadoModal }
     *     
     */
    public CResultadoModal getVerificaModalResult() {
        return verificaModalResult;
    }

    /**
     * Define o valor da propriedade verificaModalResult.
     * 
     * @param value
     *     allowed object is
     *     {@link CResultadoModal }
     *     
     */
    public void setVerificaModalResult(CResultadoModal value) {
        this.verificaModalResult = value;
    }

}
