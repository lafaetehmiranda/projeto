package auxiliarAutenticar;

import entities.Secretaria;
import interfaces.PermitirAcesso;

//todo essa classe so vai receber quem implementa a interface autenticar
public class FuncaoAutenticacao {

    private PermitirAcesso permitirAcesso;


    public boolean autenticarAcesso(){
        return permitirAcesso.autenticar();
    }

    public FuncaoAutenticacao(PermitirAcesso acesso) {
        this.permitirAcesso = acesso;
    }

}
