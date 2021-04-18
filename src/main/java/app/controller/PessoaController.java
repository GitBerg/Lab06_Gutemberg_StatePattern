package app.controller;

import app.model.Pessoa;
import app.service.PessoaService;

public class PessoaController {

    PessoaService pessoaService = new PessoaService();

    public Pessoa cadastraPessoa(String nome, String cpf, String endereco, String numSusCard, String email, String telefone, String profissao, boolean comorbidades, int idade){
        Pessoa pessoa = pessoaService.cadastraPessoa(nome, cpf, endereco, numSusCard, email, telefone, profissao, comorbidades, idade);
        return pessoa;

    }

    public void habilitadoPrimeiraDose(Pessoa pessoa){
        pessoaService.habilitadoPrimeiraDose(pessoa);
    }

    public void tomouPrimeiraDose(Pessoa pessoa){
        pessoaService.tomouPrimeiraDose(pessoa);
    }
    public void habilitadoSegundaDose(Pessoa pessoa){
        pessoaService.habilitadoSegundaDose(pessoa);
    }
    public void finalizado(Pessoa pessoa){
        pessoaService.finalizado(pessoa);
    }
    public void naoHabilitado(Pessoa pessoa){
        pessoaService.naoHabilitado(pessoa);
    }

}
