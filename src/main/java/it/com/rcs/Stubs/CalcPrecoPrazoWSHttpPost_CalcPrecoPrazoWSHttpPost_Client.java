
package it.com.rcs.Stubs;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.3.0
 * 2019-05-20T14:27:26.469-03:00
 * Generated source version: 3.3.0
 *
 */
public final class CalcPrecoPrazoWSHttpPost_CalcPrecoPrazoWSHttpPost_Client {

    private static final QName SERVICE_NAME = new QName("http://tempuri.org/", "CalcPrecoPrazoWS");

    private CalcPrecoPrazoWSHttpPost_CalcPrecoPrazoWSHttpPost_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = CalcPrecoPrazoWS.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        CalcPrecoPrazoWS ss = new CalcPrecoPrazoWS(wsdlURL, SERVICE_NAME);
        CalcPrecoPrazoWSHttpPost port = ss.getCalcPrecoPrazoWSHttpPost();

        {
        System.out.println("Invoking calcPrazoRestricao...");
        java.lang.String _calcPrazoRestricao_nCdServico = "";
        java.lang.String _calcPrazoRestricao_sCepOrigem = "";
        java.lang.String _calcPrazoRestricao_sCepDestino = "";
        java.lang.String _calcPrazoRestricao_sDtCalculo = "";
        it.com.rcs.Stubs.CResultado _calcPrazoRestricao__return = port.calcPrazoRestricao(_calcPrazoRestricao_nCdServico, _calcPrazoRestricao_sCepOrigem, _calcPrazoRestricao_sCepDestino, _calcPrazoRestricao_sDtCalculo);
        System.out.println("calcPrazoRestricao.result=" + _calcPrazoRestricao__return);


        }
        {
        System.out.println("Invoking calcPrecoFAC...");
        java.lang.String _calcPrecoFAC_nCdServico = "";
        java.lang.String _calcPrecoFAC_nVlPeso = "";
        java.lang.String _calcPrecoFAC_strDataCalculo = "";
        it.com.rcs.Stubs.CResultado _calcPrecoFAC__return = port.calcPrecoFAC(_calcPrecoFAC_nCdServico, _calcPrecoFAC_nVlPeso, _calcPrecoFAC_strDataCalculo);
        System.out.println("calcPrecoFAC.result=" + _calcPrecoFAC__return);


        }
        {
        System.out.println("Invoking calcPreco...");
        java.lang.String _calcPreco_nCdEmpresa = "";
        java.lang.String _calcPreco_sDsSenha = "";
        java.lang.String _calcPreco_nCdServico = "";
        java.lang.String _calcPreco_sCepOrigem = "";
        java.lang.String _calcPreco_sCepDestino = "";
        java.lang.String _calcPreco_nVlPeso = "";
        java.lang.String _calcPreco_nCdFormato = "";
        java.lang.String _calcPreco_nVlComprimento = "";
        java.lang.String _calcPreco_nVlAltura = "";
        java.lang.String _calcPreco_nVlLargura = "";
        java.lang.String _calcPreco_nVlDiametro = "";
        java.lang.String _calcPreco_sCdMaoPropria = "";
        java.lang.String _calcPreco_nVlValorDeclarado = "";
        java.lang.String _calcPreco_sCdAvisoRecebimento = "";
        it.com.rcs.Stubs.CResultado _calcPreco__return = port.calcPreco(_calcPreco_nCdEmpresa, _calcPreco_sDsSenha, _calcPreco_nCdServico, _calcPreco_sCepOrigem, _calcPreco_sCepDestino, _calcPreco_nVlPeso, _calcPreco_nCdFormato, _calcPreco_nVlComprimento, _calcPreco_nVlAltura, _calcPreco_nVlLargura, _calcPreco_nVlDiametro, _calcPreco_sCdMaoPropria, _calcPreco_nVlValorDeclarado, _calcPreco_sCdAvisoRecebimento);
        System.out.println("calcPreco.result=" + _calcPreco__return);


        }
        {
        System.out.println("Invoking calcPrazo...");
        java.lang.String _calcPrazo_nCdServico = "";
        java.lang.String _calcPrazo_sCepOrigem = "";
        java.lang.String _calcPrazo_sCepDestino = "";
        it.com.rcs.Stubs.CResultado _calcPrazo__return = port.calcPrazo(_calcPrazo_nCdServico, _calcPrazo_sCepOrigem, _calcPrazo_sCepDestino);
        System.out.println("calcPrazo.result=" + _calcPrazo__return);


        }
        {
        System.out.println("Invoking verificaModal...");
        java.lang.String _verificaModal_nCdServico = "";
        java.lang.String _verificaModal_sCepOrigem = "";
        java.lang.String _verificaModal_sCepDestino = "";
        it.com.rcs.Stubs.CResultadoModal _verificaModal__return = port.verificaModal(_verificaModal_nCdServico, _verificaModal_sCepOrigem, _verificaModal_sCepDestino);
        System.out.println("verificaModal.result=" + _verificaModal__return);


        }
        {
        System.out.println("Invoking listaServicos...");
        it.com.rcs.Stubs.CResultadoServicos _listaServicos__return = port.listaServicos();
        System.out.println("listaServicos.result=" + _listaServicos__return);


        }
        {
        System.out.println("Invoking listaServicosSTAR...");
        it.com.rcs.Stubs.CResultadoServicos _listaServicosSTAR__return = port.listaServicosSTAR();
        System.out.println("listaServicosSTAR.result=" + _listaServicosSTAR__return);


        }
        {
        System.out.println("Invoking calcPrecoPrazo...");
        java.lang.String _calcPrecoPrazo_nCdEmpresa = "";
        java.lang.String _calcPrecoPrazo_sDsSenha = "";
        java.lang.String _calcPrecoPrazo_nCdServico = "";
        java.lang.String _calcPrecoPrazo_sCepOrigem = "";
        java.lang.String _calcPrecoPrazo_sCepDestino = "";
        java.lang.String _calcPrecoPrazo_nVlPeso = "";
        java.lang.String _calcPrecoPrazo_nCdFormato = "";
        java.lang.String _calcPrecoPrazo_nVlComprimento = "";
        java.lang.String _calcPrecoPrazo_nVlAltura = "";
        java.lang.String _calcPrecoPrazo_nVlLargura = "";
        java.lang.String _calcPrecoPrazo_nVlDiametro = "";
        java.lang.String _calcPrecoPrazo_sCdMaoPropria = "";
        java.lang.String _calcPrecoPrazo_nVlValorDeclarado = "";
        java.lang.String _calcPrecoPrazo_sCdAvisoRecebimento = "";
        it.com.rcs.Stubs.CResultado _calcPrecoPrazo__return = port.calcPrecoPrazo(_calcPrecoPrazo_nCdEmpresa, _calcPrecoPrazo_sDsSenha, _calcPrecoPrazo_nCdServico, _calcPrecoPrazo_sCepOrigem, _calcPrecoPrazo_sCepDestino, _calcPrecoPrazo_nVlPeso, _calcPrecoPrazo_nCdFormato, _calcPrecoPrazo_nVlComprimento, _calcPrecoPrazo_nVlAltura, _calcPrecoPrazo_nVlLargura, _calcPrecoPrazo_nVlDiametro, _calcPrecoPrazo_sCdMaoPropria, _calcPrecoPrazo_nVlValorDeclarado, _calcPrecoPrazo_sCdAvisoRecebimento);
        System.out.println("calcPrecoPrazo.result=" + _calcPrecoPrazo__return);


        }
        {
        System.out.println("Invoking calcPrecoPrazoRestricao...");
        java.lang.String _calcPrecoPrazoRestricao_nCdEmpresa = "";
        java.lang.String _calcPrecoPrazoRestricao_sDsSenha = "";
        java.lang.String _calcPrecoPrazoRestricao_nCdServico = "";
        java.lang.String _calcPrecoPrazoRestricao_sCepOrigem = "";
        java.lang.String _calcPrecoPrazoRestricao_sCepDestino = "";
        java.lang.String _calcPrecoPrazoRestricao_nVlPeso = "";
        java.lang.String _calcPrecoPrazoRestricao_nCdFormato = "";
        java.lang.String _calcPrecoPrazoRestricao_nVlComprimento = "";
        java.lang.String _calcPrecoPrazoRestricao_nVlAltura = "";
        java.lang.String _calcPrecoPrazoRestricao_nVlLargura = "";
        java.lang.String _calcPrecoPrazoRestricao_nVlDiametro = "";
        java.lang.String _calcPrecoPrazoRestricao_sCdMaoPropria = "";
        java.lang.String _calcPrecoPrazoRestricao_nVlValorDeclarado = "";
        java.lang.String _calcPrecoPrazoRestricao_sCdAvisoRecebimento = "";
        java.lang.String _calcPrecoPrazoRestricao_sDtCalculo = "";
        it.com.rcs.Stubs.CResultado _calcPrecoPrazoRestricao__return = port.calcPrecoPrazoRestricao(_calcPrecoPrazoRestricao_nCdEmpresa, _calcPrecoPrazoRestricao_sDsSenha, _calcPrecoPrazoRestricao_nCdServico, _calcPrecoPrazoRestricao_sCepOrigem, _calcPrecoPrazoRestricao_sCepDestino, _calcPrecoPrazoRestricao_nVlPeso, _calcPrecoPrazoRestricao_nCdFormato, _calcPrecoPrazoRestricao_nVlComprimento, _calcPrecoPrazoRestricao_nVlAltura, _calcPrecoPrazoRestricao_nVlLargura, _calcPrecoPrazoRestricao_nVlDiametro, _calcPrecoPrazoRestricao_sCdMaoPropria, _calcPrecoPrazoRestricao_nVlValorDeclarado, _calcPrecoPrazoRestricao_sCdAvisoRecebimento, _calcPrecoPrazoRestricao_sDtCalculo);
        System.out.println("calcPrecoPrazoRestricao.result=" + _calcPrecoPrazoRestricao__return);


        }
        {
        System.out.println("Invoking calcPrecoPrazoData...");
        java.lang.String _calcPrecoPrazoData_nCdEmpresa = "";
        java.lang.String _calcPrecoPrazoData_sDsSenha = "";
        java.lang.String _calcPrecoPrazoData_nCdServico = "";
        java.lang.String _calcPrecoPrazoData_sCepOrigem = "";
        java.lang.String _calcPrecoPrazoData_sCepDestino = "";
        java.lang.String _calcPrecoPrazoData_nVlPeso = "";
        java.lang.String _calcPrecoPrazoData_nCdFormato = "";
        java.lang.String _calcPrecoPrazoData_nVlComprimento = "";
        java.lang.String _calcPrecoPrazoData_nVlAltura = "";
        java.lang.String _calcPrecoPrazoData_nVlLargura = "";
        java.lang.String _calcPrecoPrazoData_nVlDiametro = "";
        java.lang.String _calcPrecoPrazoData_sCdMaoPropria = "";
        java.lang.String _calcPrecoPrazoData_nVlValorDeclarado = "";
        java.lang.String _calcPrecoPrazoData_sCdAvisoRecebimento = "";
        java.lang.String _calcPrecoPrazoData_sDtCalculo = "";
        it.com.rcs.Stubs.CResultado _calcPrecoPrazoData__return = port.calcPrecoPrazoData(_calcPrecoPrazoData_nCdEmpresa, _calcPrecoPrazoData_sDsSenha, _calcPrecoPrazoData_nCdServico, _calcPrecoPrazoData_sCepOrigem, _calcPrecoPrazoData_sCepDestino, _calcPrecoPrazoData_nVlPeso, _calcPrecoPrazoData_nCdFormato, _calcPrecoPrazoData_nVlComprimento, _calcPrecoPrazoData_nVlAltura, _calcPrecoPrazoData_nVlLargura, _calcPrecoPrazoData_nVlDiametro, _calcPrecoPrazoData_sCdMaoPropria, _calcPrecoPrazoData_nVlValorDeclarado, _calcPrecoPrazoData_sCdAvisoRecebimento, _calcPrecoPrazoData_sDtCalculo);
        System.out.println("calcPrecoPrazoData.result=" + _calcPrecoPrazoData__return);


        }
        {
        System.out.println("Invoking getVersao...");
        it.com.rcs.Stubs.Versao _getVersao__return = port.getVersao();
        System.out.println("getVersao.result=" + _getVersao__return);


        }
        {
        System.out.println("Invoking calcPrecoData...");
        java.lang.String _calcPrecoData_nCdEmpresa = "";
        java.lang.String _calcPrecoData_sDsSenha = "";
        java.lang.String _calcPrecoData_nCdServico = "";
        java.lang.String _calcPrecoData_sCepOrigem = "";
        java.lang.String _calcPrecoData_sCepDestino = "";
        java.lang.String _calcPrecoData_nVlPeso = "";
        java.lang.String _calcPrecoData_nCdFormato = "";
        java.lang.String _calcPrecoData_nVlComprimento = "";
        java.lang.String _calcPrecoData_nVlAltura = "";
        java.lang.String _calcPrecoData_nVlLargura = "";
        java.lang.String _calcPrecoData_nVlDiametro = "";
        java.lang.String _calcPrecoData_sCdMaoPropria = "";
        java.lang.String _calcPrecoData_nVlValorDeclarado = "";
        java.lang.String _calcPrecoData_sCdAvisoRecebimento = "";
        java.lang.String _calcPrecoData_sDtCalculo = "";
        it.com.rcs.Stubs.CResultado _calcPrecoData__return = port.calcPrecoData(_calcPrecoData_nCdEmpresa, _calcPrecoData_sDsSenha, _calcPrecoData_nCdServico, _calcPrecoData_sCepOrigem, _calcPrecoData_sCepDestino, _calcPrecoData_nVlPeso, _calcPrecoData_nCdFormato, _calcPrecoData_nVlComprimento, _calcPrecoData_nVlAltura, _calcPrecoData_nVlLargura, _calcPrecoData_nVlDiametro, _calcPrecoData_sCdMaoPropria, _calcPrecoData_nVlValorDeclarado, _calcPrecoData_sCdAvisoRecebimento, _calcPrecoData_sDtCalculo);
        System.out.println("calcPrecoData.result=" + _calcPrecoData__return);


        }
        {
        System.out.println("Invoking calcDataMaxima...");
        java.lang.String _calcDataMaxima_codigoObjeto = "";
        it.com.rcs.Stubs.CResultadoObjeto _calcDataMaxima__return = port.calcDataMaxima(_calcDataMaxima_codigoObjeto);
        System.out.println("calcDataMaxima.result=" + _calcDataMaxima__return);


        }
        {
        System.out.println("Invoking calcPrazoData...");
        java.lang.String _calcPrazoData_nCdServico = "";
        java.lang.String _calcPrazoData_sCepOrigem = "";
        java.lang.String _calcPrazoData_sCepDestino = "";
        java.lang.String _calcPrazoData_sDtCalculo = "";
        it.com.rcs.Stubs.CResultado _calcPrazoData__return = port.calcPrazoData(_calcPrazoData_nCdServico, _calcPrazoData_sCepOrigem, _calcPrazoData_sCepDestino, _calcPrazoData_sDtCalculo);
        System.out.println("calcPrazoData.result=" + _calcPrazoData__return);


        }

        System.exit(0);
    }

}
