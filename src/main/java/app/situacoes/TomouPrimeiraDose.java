package app.situacoes;

import app.model.Pessoa;

public class TomouPrimeiraDose implements Situacao{

    @Override
    public void atualizaEstado(Pessoa pessoa) {

        if(pessoa.getSituacao() instanceof HabilitadoPrimeiraDose){
            pessoa.setSituacao(this);
        }
    }

    @Override
    public String toString() {
        return "TomouPrimeiraDose";
    }
}
