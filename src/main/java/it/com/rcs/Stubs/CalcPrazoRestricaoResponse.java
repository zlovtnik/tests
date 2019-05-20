
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
 *         &lt;element name="CalcPrazoRestricaoResult" type="{http://tempuri.org/}cResultado"/&gt;
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
    "calcPrazoRestricaoResult"
})
@XmlRootElement(name = "CalcPrazoRestricaoResponse")
public class CalcPrazoRestricaoResponse {

    @XmlElement(name = "CalcPrazoRestricaoResult", required = true)
    protected CResultado calcPrazoRestricaoResult;

    /**
     * Obt�m o valor da propriedade calcPrazoRestricaoResult.
     * 
     * @return
     *     possible object is
     *     {@link CResultado }
     *     
     */
    public CResultado getCalcPrazoRestricaoResult() {
        return calcPrazoRestricaoResult;
    }

    /**
     * Define o valor da propriedade calcPrazoRestricaoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link CResultado }
     *     
     */
    public void setCalcPrazoRestricaoResult(CResultado value) {
        this.calcPrazoRestricaoResult = value;
    }

}
