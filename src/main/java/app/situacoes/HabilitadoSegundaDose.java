package app.situacoes;

import app.model.Pessoa;

public class HabilitadoSegundaDose  implements Situacao{
    @Override
    public void atualizaEstado(Pessoa pessoa) {
        if(pessoa.getDataDose() >= 20 && pessoa.getSituacao() instanceof TomouPrimeiraDose){
            pessoa.setSituacao(this);
        }
    }

    @Override
    public String toString() {
        return "HabilitadoSegundaDose";
    }
}
