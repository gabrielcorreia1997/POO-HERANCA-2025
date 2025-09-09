package app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Pessoa{
    private String nome;
	private String endereco;
	private LocalDate dataCriacao;

    public Pessoa (String nome, String endereco){
        this.setNome(nome);
        this.setDataCriacao(LocalDate.now());
        this.setEndereco(endereco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao){
        this.dataCriacao = dataCriacao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public abstract String exibirInformacoes();

}