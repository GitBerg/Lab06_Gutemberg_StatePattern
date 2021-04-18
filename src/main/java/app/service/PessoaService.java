package app.service;

import app.model.Pessoa;
import app.situacoes.*;

public class PessoaService {

    private HabilitadoPrimeiraDose habilitadoPrimeiraDose = new HabilitadoPrimeiraDose();
    private HabilitadoSegundaDose habilitadoSegundaDose = new HabilitadoSegundaDose();
    private Finalizado finalizado = new Finalizado();
    private NaoHabilitado naoHabilitado = new NaoHabilitado();
    private TomouPrimeiraDose tomouPrimeiraDose = new TomouPrimeiraDose();

    public Pessoa cadastraPessoa(String nome, String cpf, String endereco, String numSusCard, String email, String telefone, String profissao, boolean comorbidades, int idade){

        Pessoa pessoa = new Pessoa(nome,cpf, endereco, numSusCard, email, telefone, profissao, comorbidades, idade);
        return pessoa;

    }

    public void habilitadoPrimeiraDose(Pessoa pessoa){
        habilitadoPrimeiraDose.atualizaEstado(pessoa);
    }

    public void tomouPrimeiraDose(Pessoa pessoa){
        tomouPrimeiraDose.atualizaEstado(pessoa);
    }
    public void habilitadoSegundaDose(Pessoa pessoa){
        habilitadoSegundaDose.atualizaEstado(pessoa);
    }
    public void finalizado(Pessoa pessoa){
        finalizado.atualizaEstado(pessoa);
    }
    public void naoHabilitado(Pessoa pessoa){
        naoHabilitado.atualizaEstado(pessoa);
    }


}
