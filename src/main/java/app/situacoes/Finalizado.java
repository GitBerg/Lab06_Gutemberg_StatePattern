package app.situacoes;

import app.model.Pessoa;

public class Finalizado implements Situacao{
    @Override
    public void atualizaEstado(Pessoa pessoa) {
        if (pessoa.getSituacao() instanceof HabilitadoSegundaDose) {
            pessoa.setSituacao(this);
        }
    }

    @Override
    public String toString() {
        return "Finalizado";
    }
}
