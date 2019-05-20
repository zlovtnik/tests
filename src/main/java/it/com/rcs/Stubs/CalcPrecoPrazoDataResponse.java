
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
 *         &lt;element name="CalcPrecoPrazoDataResult" type="{http://tempuri.org/}cResultado"/&gt;
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
    "calcPrecoPrazoDataResult"
})
@XmlRootElement(name = "CalcPrecoPrazoDataResponse")
public class CalcPrecoPrazoDataResponse {

    @XmlElement(name = "CalcPrecoPrazoDataResult", required = true)
    protected CResultado calcPrecoPrazoDataResult;

    /**
     * Obt�m o valor da propriedade calcPrecoPrazoDataResult.
     * 
     * @return
     *     possible object is
     *     {@link CResultado }
     *     
     */
    public CResultado getCalcPrecoPrazoDataResult() {
        return calcPrecoPrazoDataResult;
    }

    /**
     * Define o valor da propriedade calcPrecoPrazoDataResult.
     * 
     * @param value
     *     allowed object is
     *     {@link CResultado }
     *     
     */
    public void setCalcPrecoPrazoDataResult(CResultado value) {
        this.calcPrecoPrazoDataResult = value;
    }

}
