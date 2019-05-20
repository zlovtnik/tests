
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
 *         &lt;element name="getVersaoResult" type="{http://tempuri.org/}versao"/&gt;
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
    "getVersaoResult"
})
@XmlRootElement(name = "getVersaoResponse")
public class GetVersaoResponse {

    @XmlElement(required = true)
    protected Versao getVersaoResult;

    /**
     * Obt�m o valor da propriedade getVersaoResult.
     * 
     * @return
     *     possible object is
     *     {@link Versao }
     *     
     */
    public Versao getGetVersaoResult() {
        return getVersaoResult;
    }

    /**
     * Define o valor da propriedade getVersaoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link Versao }
     *     
     */
    public void setGetVersaoResult(Versao value) {
        this.getVersaoResult = value;
    }

}
