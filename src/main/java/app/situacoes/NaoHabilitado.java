package app.situacoes;

import app.model.Pessoa;

public class NaoHabilitado implements Situacao {

    @Override
    public void atualizaEstado(Pessoa pessoa) {
        if ((pessoa.getIdade() < 50 && pessoa.getComorbidades()) || pessoa.getIdade() < 50 || pessoa.getComorbidades() == false || pessoa.getSituacao() == null) {
            pessoa.setSituacao(this);
        }
    }

    @Override
    public String toString() {
        return "NaoHabilitado";
    }
}