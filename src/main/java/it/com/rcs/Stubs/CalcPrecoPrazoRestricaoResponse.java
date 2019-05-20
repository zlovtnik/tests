
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
 *         &lt;element name="CalcPrecoPrazoRestricaoResult" type="{http://tempuri.org/}cResultado"/&gt;
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
    "calcPrecoPrazoRestricaoResult"
})
@XmlRootElement(name = "CalcPrecoPrazoRestricaoResponse")
public class CalcPrecoPrazoRestricaoResponse {

    @XmlElement(name = "CalcPrecoPrazoRestricaoResult", required = true)
    protected CResultado calcPrecoPrazoRestricaoResult;

    /**
     * Obt�m o valor da propriedade calcPrecoPrazoRestricaoResult.
     * 
     * @return
     *     possible object is
     *     {@link CResultado }
     *     
     */
    public CResultado getCalcPrecoPrazoRestricaoResult() {
        return calcPrecoPrazoRestricaoResult;
    }

    /**
     * Define o valor da propriedade calcPrecoPrazoRestricaoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link CResultado }
     *     
     */
    public void setCalcPrecoPrazoRestricaoResult(CResultado value) {
        this.calcPrecoPrazoRestricaoResult = value;
    }

}
