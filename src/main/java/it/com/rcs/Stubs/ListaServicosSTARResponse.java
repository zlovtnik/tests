
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
 *         &lt;element name="ListaServicosSTARResult" type="{http://tempuri.org/}cResultadoServicos"/&gt;
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
    "listaServicosSTARResult"
})
@XmlRootElement(name = "ListaServicosSTARResponse")
public class ListaServicosSTARResponse {

    @XmlElement(name = "ListaServicosSTARResult", required = true)
    protected CResultadoServicos listaServicosSTARResult;

    /**
     * Obt�m o valor da propriedade listaServicosSTARResult.
     * 
     * @return
     *     possible object is
     *     {@link CResultadoServicos }
     *     
     */
    public CResultadoServicos getListaServicosSTARResult() {
        return listaServicosSTARResult;
    }

    /**
     * Define o valor da propriedade listaServicosSTARResult.
     * 
     * @param value
     *     allowed object is
     *     {@link CResultadoServicos }
     *     
     */
    public void setListaServicosSTARResult(CResultadoServicos value) {
        this.listaServicosSTARResult = value;
    }

}
