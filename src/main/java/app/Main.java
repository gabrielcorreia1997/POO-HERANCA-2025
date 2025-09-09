package app;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args){


        //  Código comentado aula 01-09
        //  Tarefa[] tarefas = new Tarefa[5];
        //  Compromisso[] compromissos = new Compromisso[5];

        //  tarefas[0] = new Tarefa(0, "Teste", false);
        //  tarefas[4] = new Tarefa(4, "Novo Teste", false);

        //  compromissos[2] = new Compromisso(0, "Compromisso", "Hoje", "Amanhã");

        //  System.out.println(tarefas[4].getDescricao());
    
        PessoaFisica pf = new PessoaFisica("Marco", "Rua sem nome, 0", LocalDate.of(1980, Month.MARCH, 29), "12345678");
    
        System.out.println(pf.exibirInformacoes());
    
        PessoaJuridica pj = new PessoaJuridica("FATEC", "Av. Shunji Nishimura", "FATEC Pompeia", "1234564646513215");

        System.out.println(pj.exibirInformacoes());

        Pessoa p1 = pf;
        System.out.println(p1.exibirInformacoes());

        p1 = pj;
        System.out.println(pj.exibirInformacoes());
        

    }
}