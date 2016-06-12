package com.company.FrontController;

/**
 * Created by Dauster on 09/06/16.
 */
public class KerberosMediador {
    private CadastroCliente cliente;
    private CadastroFornecedor fornecedor;

    public KerberosMediador(){
        cliente = new CadastroCliente();
        fornecedor = new CadastroFornecedor();
    }

    public void processar(String requisicao){
        if(requisicao == "CLIENTE"){
            cliente.exibir();
        }
        else{
            fornecedor.exibir();
        }
    }

}
