package com.company.BusinessDelegate;

/**
 * Created by Dauster on 09/06/16.
 */
public class PDVBusinessFactory {
    public PDVBusinessService getTipoNF(String tipo){
        if(tipo == "DANFE"){
           return new DANFE();
        }else
            return new CTE();
        }
}
