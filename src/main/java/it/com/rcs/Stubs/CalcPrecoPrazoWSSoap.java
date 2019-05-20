package it.com.rcs.Stubs;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.0
 * 2019-05-20T14:27:26.738-03:00
 * Generated source version: 3.3.0
 *
 */
@WebService(targetNamespace = "http://tempuri.org/", name = "CalcPrecoPrazoWSSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface CalcPrecoPrazoWSSoap {

    /**
     * Calcula o prazo considerando restrição de entrega
     */
    @WebMethod(operationName = "CalcPrazoRestricao", action = "http://tempuri.org/CalcPrazoRestricao")
    @RequestWrapper(localName = "CalcPrazoRestricao", targetNamespace = "http://tempuri.org/", className = "it.com.rcs.Stubs.CalcPrazoRestricao")
    @ResponseWrapper(localName = "CalcPrazoRestricaoResponse", targetNamespace = "http://tempuri.org/", className = "it.com.rcs.Stubs.CalcPrazoRestricaoResponse")
    @WebResult(name = "CalcPrazoRestricaoResult", targetNamespace = "http://tempuri.org/")
    public it.com.rcs.Stubs.CResultado calcPrazoRestricao(
        @WebParam(name = "nCdServico", targetNamespace = "http://tempuri.org/")
        java.lang.String nCdServico,
        @WebParam(name = "sCepOrigem", targetNamespace = "http://tempuri.org/")
        java.lang.String sCepOrigem,
        @WebParam(name = "sCepDestino", targetNamespace = "http://tempuri.org/")
        java.lang.String sCepDestino,
        @WebParam(name = "sDtCalculo", targetNamespace = "http://tempuri.org/")
        java.lang.String sDtCalculo
    );

    /**
     * Calcula os preços dos serviços FAC
     */
    @WebMethod(operationName = "CalcPrecoFAC", action = "http://tempuri.org/CalcPrecoFAC")
    @RequestWrapper(localName = "CalcPrecoFAC", targetNamespace = "http://tempuri.org/", className = "it.com.rcs.Stubs.CalcPrecoFAC")
    @ResponseWrapper(localName = "CalcPrecoFACResponse", targetNamespace = "http://tempuri.org/", className = "it.com.rcs.Stubs.CalcPrecoFACResponse")
    @WebResult(name = "CalcPrecoFACResult", targetNamespace = "http://tempuri.org/")
    public it.com.rcs.Stubs.CResultado calcPrecoFAC(
        @WebParam(name = "nCdServico", targetNamespace = "http://tempuri.org/")
        java.lang.String nCdServico,
        @WebParam(name = "nVlPeso", targetNamespace = "http://tempuri.org/")
        java.lang.String nVlPeso,
        @WebParam(name = "strDataCalculo", targetNamespace = "http://tempuri.org/")
        java.lang.String strDataCalculo
    );

    /**
     * Calcula somente o preço com a data atual
     */
    @WebMethod(operationName = "CalcPreco", action = "http://tempuri.org/CalcPreco")
    @RequestWrapper(localName = "CalcPreco", targetNamespace = "http://tempuri.org/", className = "it.com.rcs.Stubs.CalcPreco")
    @ResponseWrapper(localName = "CalcPrecoResponse", targetNamespace = "http://tempuri.org/", className = "it.com.rcs.Stubs.CalcPrecoResponse")
    @WebResult(name = "CalcPrecoResult", targetNamespace = "http://tempuri.org/")
    public it.com.rcs.Stubs.CResultado calcPreco(
        @WebParam(name = "nCdEmpresa", targetNamespace = "http://tempuri.org/")
        java.lang.String nCdEmpresa,
        @WebParam(name = "sDsSenha", targetNamespace = "http://tempuri.org/")
        java.lang.String sDsSenha,
        @WebParam(name = "nCdServico", targetNamespace = "http://tempuri.org/")
        java.lang.String nCdServico,
        @WebParam(name = "sCepOrigem", targetNamespace = "http://tempuri.org/")
        java.lang.String sCepOrigem,
        @WebParam(name = "sCepDestino", targetNamespace = "http://tempuri.org/")
        java.lang.String sCepDestino,
        @WebParam(name = "nVlPeso", targetNamespace = "http://tempuri.org/")
        java.lang.String nVlPeso,
        @WebParam(name = "nCdFormato", targetNamespace = "http://tempuri.org/")
        int nCdFormato,
        @WebParam(name = "nVlComprimento", targetNamespace = "http://tempuri.org/")
        java.math.BigDecimal nVlComprimento,
        @WebParam(name = "nVlAltura", targetNamespace = "http://tempuri.org/")
        java.math.BigDecimal nVlAltura,
        @WebParam(name = "nVlLargura", targetNamespace = "http://tempuri.org/")
        java.math.BigDecimal nVlLargura,
        @WebParam(name = "nVlDiametro", targetNamespace = "http://tempuri.org/")
        java.math.BigDecimal nVlDiametro,
        @WebParam(name = "sCdMaoPropria", targetNamespace = "http://tempuri.org/")
        java.lang.String sCdMaoPropria,
        @WebParam(name = "nVlValorDeclarado", targetNamespace = "http://tempuri.org/")
        java.math.BigDecimal nVlValorDeclarado,
        @WebParam(name = "sCdAvisoRecebimento", targetNamespace = "http://tempuri.org/")
        java.lang.String sCdAvisoRecebimento
    );

    /**
     * Calcula somente o prazo com a data atual
     */
    @WebMethod(operationName = "CalcPrazo", action = "http://tempuri.org/CalcPrazo")
    @RequestWrapper(localName = "CalcPrazo", targetNamespace = "http://tempuri.org/", className = "it.com.rcs.Stubs.CalcPrazo")
    @ResponseWrapper(localName = "CalcPrazoResponse", targetNamespace = "http://tempuri.org/", className = "it.com.rcs.Stubs.CalcPrazoResponse")
    @WebResult(name = "CalcPrazoResult", targetNamespace = "http://tempuri.org/")
    public it.com.rcs.Stubs.CResultado calcPrazo(
        @WebParam(name = "nCdServico", targetNamespace = "http://tempuri.org/")
        java.lang.String nCdServico,
        @WebParam(name = "sCepOrigem", targetNamespace = "http://tempuri.org/")
        java.lang.String sCepOrigem,
        @WebParam(name = "sCepDestino", targetNamespace = "http://tempuri.org/")
        java.lang.String sCepDestino
    );

    /**
     * Método para mostrar se o trecho consultado utiliza modal aéreo ou terrestre
     */
    @WebMethod(operationName = "VerificaModal", action = "http://tempuri.org/VerificaModal")
    @RequestWrapper(localName = "VerificaModal", targetNamespace = "http://tempuri.org/", className = "it.com.rcs.Stubs.VerificaModal")
    @ResponseWrapper(localName = "VerificaModalResponse", targetNamespace = "http://tempuri.org/", className = "it.com.rcs.Stubs.VerificaModalResponse")
    @WebResult(name = "VerificaModalResult", targetNamespace = "http://tempuri.org/")
    public it.com.rcs.Stubs.CResultadoModal verificaModal(
        @WebParam(name = "nCdServico", targetNamespace = "http://tempuri.org/")
        java.lang.String nCdServico,
        @WebParam(name = "sCepOrigem", targetNamespace = "http://tempuri.org/")
        java.lang.String sCepOrigem,
        @WebParam(name = "sCepDestino", targetNamespace = "http://tempuri.org/")
        java.lang.String sCepDestino
    );

    /**
     * Lista os serviços que estão disponíveis para cálculo de preço e/ou prazo
     */
    @WebMethod(operationName = "ListaServicos", action = "http://tempuri.org/ListaServicos")
    @RequestWrapper(localName = "ListaServicos", targetNamespace = "http://tempuri.org/", className = "it.com.rcs.Stubs.ListaServicos")
    @ResponseWrapper(localName = "ListaServicosResponse", targetNamespace = "http://tempuri.org/", className = "it.com.rcs.Stubs.ListaServicosResponse")
    @WebResult(name = "ListaServicosResult", targetNamespace = "http://tempuri.org/")
    public it.com.rcs.Stubs.CResultadoServicos listaServicos();

    /**
     * Lista os serviços que são calculados pelo STAR
     */
    @WebMethod(operationName = "ListaServicosSTAR", action = "http://tempuri.org/ListaServicosSTAR")
    @RequestWrapper(localName = "ListaServicosSTAR", targetNamespace = "http://tempuri.org/", className = "it.com.rcs.Stubs.ListaServicosSTAR")
    @ResponseWrapper(localName = "ListaServicosSTARResponse", targetNamespace = "http://tempuri.org/", className = "it.com.rcs.Stubs.ListaServicosSTARResponse")
    @WebResult(name = "ListaServicosSTARResult", targetNamespace = "http://tempuri.org/")
    public it.com.rcs.Stubs.CResultadoServicos listaServicosSTAR();

    /**
     * Calcula o preço e o prazo com a data atual
     */
    @WebMethod(operationName = "CalcPrecoPrazo", action = "http://tempuri.org/CalcPrecoPrazo")
    @RequestWrapper(localName = "CalcPrecoPrazo", targetNamespace = "http://tempuri.org/", className = "it.com.rcs.Stubs.CalcPrecoPrazo")
    @ResponseWrapper(localName = "CalcPrecoPrazoResponse", targetNamespace = "http://tempuri.org/", className = "it.com.rcs.Stubs.CalcPrecoPrazoResponse")
    @WebResult(name = "CalcPrecoPrazoResult", targetNamespace = "http://tempuri.org/")
    public it.com.rcs.Stubs.CResultado calcPrecoPrazo(
        @WebParam(name = "nCdEmpresa", targetNamespace = "http://tempuri.org/")
        java.lang.String nCdEmpresa,
        @WebParam(name = "sDsSenha", targetNamespace = "http://tempuri.org/")
        java.lang.String sDsSenha,
        @WebParam(name = "nCdServico", targetNamespace = "http://tempuri.org/")
        java.lang.String nCdServico,
        @WebParam(name = "sCepOrigem", targetNamespace = "http://tempuri.org/")
        java.lang.String sCepOrigem,
        @WebParam(name = "sCepDestino", targetNamespace = "http://tempuri.org/")
        java.lang.String sCepDestino,
        @WebParam(name = "nVlPeso", targetNamespace = "http://tempuri.org/")
        java.lang.String nVlPeso,
        @WebParam(name = "nCdFormato", targetNamespace = "http://tempuri.org/")
        int nCdFormato,
        @WebParam(name = "nVlComprimento", targetNamespace = "http://tempuri.org/")
        java.math.BigDecimal nVlComprimento,
        @WebParam(name = "nVlAltura", targetNamespace = "http://tempuri.org/")
        java.math.BigDecimal nVlAltura,
        @WebParam(name = "nVlLargura", targetNamespace = "http://tempuri.org/")
        java.math.BigDecimal nVlLargura,
        @WebParam(name = "nVlDiametro", targetNamespace = "http://tempuri.org/")
        java.math.BigDecimal nVlDiametro,
        @WebParam(name = "sCdMaoPropria", targetNamespace = "http://tempuri.org/")
        java.lang.String sCdMaoPropria,
        @WebParam(name = "nVlValorDeclarado", targetNamespace = "http://tempuri.org/")
        java.math.BigDecimal nVlValorDeclarado,
        @WebParam(name = "sCdAvisoRecebimento", targetNamespace = "http://tempuri.org/")
        java.lang.String sCdAvisoRecebimento
    );

    /**
     * Calcula o preço e o prazo considerando as restrições de entrega
     */
    @WebMethod(operationName = "CalcPrecoPrazoRestricao", action = "http://tempuri.org/CalcPrecoPrazoRestricao")
    @RequestWrapper(localName = "CalcPrecoPrazoRestricao", targetNamespace = "http://tempuri.org/", className = "it.com.rcs.Stubs.CalcPrecoPrazoRestricao")
    @ResponseWrapper(localName = "CalcPrecoPrazoRestricaoResponse", targetNamespace = "http://tempuri.org/", className = "it.com.rcs.Stubs.CalcPrecoPrazoRestricaoResponse")
    @WebResult(name = "CalcPrecoPrazoRestricaoResult", targetNamespace = "http://tempuri.org/")
    public it.com.rcs.Stubs.CResultado calcPrecoPrazoRestricao(
        @WebParam(name = "nCdEmpresa", targetNamespace = "http://tempuri.org/")
        java.lang.String nCdEmpresa,
        @WebParam(name = "sDsSenha", targetNamespace = "http://tempuri.org/")
        java.lang.String sDsSenha,
        @WebParam(name = "nCdServico", targetNamespace = "http://tempuri.org/")
        java.lang.String nCdServico,
        @WebParam(name = "sCepOrigem", targetNamespace = "http://tempuri.org/")
        java.lang.String sCepOrigem,
        @WebParam(name = "sCepDestino", targetNamespace = "http://tempuri.org/")
        java.lang.String sCepDestino,
        @WebParam(name = "nVlPeso", targetNamespace = "http://tempuri.org/")
        java.lang.String nVlPeso,
        @WebParam(name = "nCdFormato", targetNamespace = "http://tempuri.org/")
        int nCdFormato,
        @WebParam(name = "nVlComprimento", targetNamespace = "http://tempuri.org/")
        java.math.BigDecimal nVlComprimento,
        @WebParam(name = "nVlAltura", targetNamespace = "http://tempuri.org/")
        java.math.BigDecimal nVlAltura,
        @WebParam(name = "nVlLargura", targetNamespace = "http://tempuri.org/")
        java.math.BigDecimal nVlLargura,
        @WebParam(name = "nVlDiametro", targetNamespace = "http://tempuri.org/")
        java.math.BigDecimal nVlDiametro,
        @WebParam(name = "sCdMaoPropria", targetNamespace = "http://tempuri.org/")
        java.lang.String sCdMaoPropria,
        @WebParam(name = "nVlValorDeclarado", targetNamespace = "http://tempuri.org/")
        java.math.BigDecimal nVlValorDeclarado,
        @WebParam(name = "sCdAvisoRecebimento", targetNamespace = "http://tempuri.org/")
        java.lang.String sCdAvisoRecebimento,
        @WebParam(name = "sDtCalculo", targetNamespace = "http://tempuri.org/")
        java.lang.String sDtCalculo
    );

    /**
     * Calcula o preço e o prazo com uma data especificada
     */
    @WebMethod(operationName = "CalcPrecoPrazoData", action = "http://tempuri.org/CalcPrecoPrazoData")
    @RequestWrapper(localName = "CalcPrecoPrazoData", targetNamespace = "http://tempuri.org/", className = "it.com.rcs.Stubs.CalcPrecoPrazoData")
    @ResponseWrapper(localName = "CalcPrecoPrazoDataResponse", targetNamespace = "http://tempuri.org/", className = "it.com.rcs.Stubs.CalcPrecoPrazoDataResponse")
    @WebResult(name = "CalcPrecoPrazoDataResult", targetNamespace = "http://tempuri.org/")
    public it.com.rcs.Stubs.CResultado calcPrecoPrazoData(
        @WebParam(name = "nCdEmpresa", targetNamespace = "http://tempuri.org/")
        java.lang.String nCdEmpresa,
        @WebParam(name = "sDsSenha", targetNamespace = "http://tempuri.org/")
        java.lang.String sDsSenha,
        @WebParam(name = "nCdServico", targetNamespace = "http://tempuri.org/")
        java.lang.String nCdServico,
        @WebParam(name = "sCepOrigem", targetNamespace = "http://tempuri.org/")
        java.lang.String sCepOrigem,
        @WebParam(name = "sCepDestino", targetNamespace = "http://tempuri.org/")
        java.lang.String sCepDestino,
        @WebParam(name = "nVlPeso", targetNamespace = "http://tempuri.org/")
        java.lang.String nVlPeso,
        @WebParam(name = "nCdFormato", targetNamespace = "http://tempuri.org/")
        int nCdFormato,
        @WebParam(name = "nVlComprimento", targetNamespace = "http://tempuri.org/")
        java.math.BigDecimal nVlComprimento,
        @WebParam(name = "nVlAltura", targetNamespace = "http://tempuri.org/")
        java.math.BigDecimal nVlAltura,
        @WebParam(name = "nVlLargura", targetNamespace = "http://tempuri.org/")
        java.math.BigDecimal nVlLargura,
        @WebParam(name = "nVlDiametro", targetNamespace = "http://tempuri.org/")
        java.math.BigDecimal nVlDiametro,
        @WebParam(name = "sCdMaoPropria", targetNamespace = "http://tempuri.org/")
        java.lang.String sCdMaoPropria,
        @WebParam(name = "nVlValorDeclarado", targetNamespace = "http://tempuri.org/")
        java.math.BigDecimal nVlValorDeclarado,
        @WebParam(name = "sCdAvisoRecebimento", targetNamespace = "http://tempuri.org/")
        java.lang.String sCdAvisoRecebimento,
        @WebParam(name = "sDtCalculo", targetNamespace = "http://tempuri.org/")
        java.lang.String sDtCalculo
    );

    /**
     * Retorna a versão atual do componente
     */
    @WebMethod(action = "http://tempuri.org/getVersao")
    @RequestWrapper(localName = "getVersao", targetNamespace = "http://tempuri.org/", className = "it.com.rcs.Stubs.GetVersao")
    @ResponseWrapper(localName = "getVersaoResponse", targetNamespace = "http://tempuri.org/", className = "it.com.rcs.Stubs.GetVersaoResponse")
    @WebResult(name = "getVersaoResult", targetNamespace = "http://tempuri.org/")
    public it.com.rcs.Stubs.Versao getVersao();

    /**
     * Calcula somente o preço com uma data especificada
     */
    @WebMethod(operationName = "CalcPrecoData", action = "http://tempuri.org/CalcPrecoData")
    @RequestWrapper(localName = "CalcPrecoData", targetNamespace = "http://tempuri.org/", className = "it.com.rcs.Stubs.CalcPrecoData")
    @ResponseWrapper(localName = "CalcPrecoDataResponse", targetNamespace = "http://tempuri.org/", className = "it.com.rcs.Stubs.CalcPrecoDataResponse")
    @WebResult(name = "CalcPrecoDataResult", targetNamespace = "http://tempuri.org/")
    public it.com.rcs.Stubs.CResultado calcPrecoData(
        @WebParam(name = "nCdEmpresa", targetNamespace = "http://tempuri.org/")
        java.lang.String nCdEmpresa,
        @WebParam(name = "sDsSenha", targetNamespace = "http://tempuri.org/")
        java.lang.String sDsSenha,
        @WebParam(name = "nCdServico", targetNamespace = "http://tempuri.org/")
        java.lang.String nCdServico,
        @WebParam(name = "sCepOrigem", targetNamespace = "http://tempuri.org/")
        java.lang.String sCepOrigem,
        @WebParam(name = "sCepDestino", targetNamespace = "http://tempuri.org/")
        java.lang.String sCepDestino,
        @WebParam(name = "nVlPeso", targetNamespace = "http://tempuri.org/")
        java.lang.String nVlPeso,
        @WebParam(name = "nCdFormato", targetNamespace = "http://tempuri.org/")
        int nCdFormato,
        @WebParam(name = "nVlComprimento", targetNamespace = "http://tempuri.org/")
        java.math.BigDecimal nVlComprimento,
        @WebParam(name = "nVlAltura", targetNamespace = "http://tempuri.org/")
        java.math.BigDecimal nVlAltura,
        @WebParam(name = "nVlLargura", targetNamespace = "http://tempuri.org/")
        java.math.BigDecimal nVlLargura,
        @WebParam(name = "nVlDiametro", targetNamespace = "http://tempuri.org/")
        java.math.BigDecimal nVlDiametro,
        @WebParam(name = "sCdMaoPropria", targetNamespace = "http://tempuri.org/")
        java.lang.String sCdMaoPropria,
        @WebParam(name = "nVlValorDeclarado", targetNamespace = "http://tempuri.org/")
        java.math.BigDecimal nVlValorDeclarado,
        @WebParam(name = "sCdAvisoRecebimento", targetNamespace = "http://tempuri.org/")
        java.lang.String sCdAvisoRecebimento,
        @WebParam(name = "sDtCalculo", targetNamespace = "http://tempuri.org/")
        java.lang.String sDtCalculo
    );

    /**
     * Calcula a data máxima de entrega de determinado objeto
     */
    @WebMethod(operationName = "CalcDataMaxima", action = "http://tempuri.org/CalcDataMaxima")
    @RequestWrapper(localName = "CalcDataMaxima", targetNamespace = "http://tempuri.org/", className = "it.com.rcs.Stubs.CalcDataMaxima")
    @ResponseWrapper(localName = "CalcDataMaximaResponse", targetNamespace = "http://tempuri.org/", className = "it.com.rcs.Stubs.CalcDataMaximaResponse")
    @WebResult(name = "CalcDataMaximaResult", targetNamespace = "http://tempuri.org/")
    public it.com.rcs.Stubs.CResultadoObjeto calcDataMaxima(
        @WebParam(name = "codigoObjeto", targetNamespace = "http://tempuri.org/")
        java.lang.String codigoObjeto
    );

    /**
     * Calcula somente o prazo com uma data especificada
     */
    @WebMethod(operationName = "CalcPrazoData", action = "http://tempuri.org/CalcPrazoData")
    @RequestWrapper(localName = "CalcPrazoData", targetNamespace = "http://tempuri.org/", className = "it.com.rcs.Stubs.CalcPrazoData")
    @ResponseWrapper(localName = "CalcPrazoDataResponse", targetNamespace = "http://tempuri.org/", className = "it.com.rcs.Stubs.CalcPrazoDataResponse")
    @WebResult(name = "CalcPrazoDataResult", targetNamespace = "http://tempuri.org/")
    public it.com.rcs.Stubs.CResultado calcPrazoData(
        @WebParam(name = "nCdServico", targetNamespace = "http://tempuri.org/")
        java.lang.String nCdServico,
        @WebParam(name = "sCepOrigem", targetNamespace = "http://tempuri.org/")
        java.lang.String sCepOrigem,
        @WebParam(name = "sCepDestino", targetNamespace = "http://tempuri.org/")
        java.lang.String sCepDestino,
        @WebParam(name = "sDtCalculo", targetNamespace = "http://tempuri.org/")
        java.lang.String sDtCalculo
    );
}