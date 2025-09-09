package app;

import java.time.LocalDate;

public class PessoaJuridica extends Pessoa{
	private String nomeFantasia;
    private String cnpj;

    public PessoaJuridica (String nome, String endereco, String nomeFantasia, String cnpj){
        super(nome, endereco);
        this.setNomeFantasia(nomeFantasia);
        this.setCnpj(cnpj);
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia){
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }

    @Override
    public String exibirInformacoes() {
        return "---Informações da Pessoa Jurídica---\n" +
                "Nome: " + this.getNome() + "\n" + 
                "Endereço: " + this.getEndereco() + "\n" + 
                "CNPJ: " + this.getCnpj() + "\n" + 
                "---------------------------------------";
    }
}