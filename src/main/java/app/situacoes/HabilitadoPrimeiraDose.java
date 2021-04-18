package app.situacoes;

import app.model.Pessoa;

public class HabilitadoPrimeiraDose  implements Situacao{

    @Override
    public void atualizaEstado(Pessoa pessoa) {
        if(pessoa.getProfissao().equals("medico") || pessoa.getProfissao().equals("enfermeiro") || (pessoa.getComorbidades() && pessoa.getIdade() >= 50)){
            pessoa.setSituacao(this);
        }
    }

    @Override
    public String toString() {
        return "HabilitadoPrimeiraDose";
    }
}
