package app.model;

import app.situacoes.Situacao;

import java.util.Objects;

public class Pessoa {

    private String nome;
    private int idade;
    private String cpf;
    private String endereco;
    private String numSusCard;
    private String email;
    private String telefone;
    private String profissao;
    private boolean comorbidades;
    private Situacao situacao;
    private int dataDose;

    public Pessoa(String nome, String cpf, String endereco, String numSusCard, String email, String telefone, String profissao, boolean comorbidades, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.numSusCard = numSusCard;
        this.email = email;
        this.telefone = telefone;
        this.profissao = profissao;
        this.comorbidades = comorbidades;
        this.idade = idade;
        this.situacao = null;
        this.dataDose = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumSusCard() {
        return numSusCard;
    }

    public void setNumSusCard(String numSusCard) {
        this.numSusCard = numSusCard;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public boolean getComorbidades() {
        return comorbidades;
    }

    public void setComorbidades(boolean comorbidades) {
        this.comorbidades = comorbidades;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getDataDose() {
        return dataDose;
    }

    public void setDataDose(int dataDose) {
        this.dataDose = dataDose;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cpf='" + cpf + '\'' +
                ", endereco='" + endereco + '\'' +
                ", numSusCard='" + numSusCard + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", profissao='" + profissao + '\'' +
                ", comorbidades=" + comorbidades +
                ", situacao=" + situacao +
                ", dataDose=" + dataDose +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return idade == pessoa.idade && comorbidades == pessoa.comorbidades && Objects.equals(nome, pessoa.nome) && Objects.equals(cpf, pessoa.cpf) && Objects.equals(endereco, pessoa.endereco) && Objects.equals(numSusCard, pessoa.numSusCard) && Objects.equals(email, pessoa.email) && Objects.equals(telefone, pessoa.telefone) && Objects.equals(profissao, pessoa.profissao) && Objects.equals(situacao, pessoa.situacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade, cpf, endereco, numSusCard, email, telefone, profissao, comorbidades, situacao);
    }
}
