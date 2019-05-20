
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
 *         &lt;element name="ListaServicosResult" type="{http://tempuri.org/}cResultadoServicos"/&gt;
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
    "listaServicosResult"
})
@XmlRootElement(name = "ListaServicosResponse")
public class ListaServicosResponse {

    @XmlElement(name = "ListaServicosResult", required = true)
    protected CResultadoServicos listaServicosResult;

    /**
     * Obt�m o valor da propriedade listaServicosResult.
     * 
     * @return
     *     possible object is
     *     {@link CResultadoServicos }
     *     
     */
    public CResultadoServicos getListaServicosResult() {
        return listaServicosResult;
    }

    /**
     * Define o valor da propriedade listaServicosResult.
     * 
     * @param value
     *     allowed object is
     *     {@link CResultadoServicos }
     *     
     */
    public void setListaServicosResult(CResultadoServicos value) {
        this.listaServicosResult = value;
    }

}
