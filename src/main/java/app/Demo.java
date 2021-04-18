package app;

import app.controller.PessoaController;
import app.model.Pessoa;

public class Demo {

     public static void main(String[] args) {

          PessoaController controller = new PessoaController();


          Pessoa pessoa = controller.cadastraPessoa("Gutemberg", "1112223334" , "blablabal123", "123456789", "Gutemebrg@gmail.com", "99996666", "programador", false, 24);
          Pessoa pessoa1 = controller.cadastraPessoa("Julia", "2223334445" , "blablabal321", "123543567", "Julia@gmail.com", "99996666", "medico", true, 55);


          System.out.println("\nNão Habilitado!\n");

          controller.naoHabilitado(pessoa);
          controller.naoHabilitado(pessoa1);

          System.out.println(pessoa.getNome() + " " + pessoa.getSituacao());
          System.out.println(pessoa1.getNome() + " " + pessoa1.getSituacao());


          System.out.println("\nHabilitado para a primeira Dose!\n");

          controller.habilitadoPrimeiraDose(pessoa);
          controller.habilitadoPrimeiraDose(pessoa1);


          System.out.println(pessoa.getNome() + " " + pessoa.getSituacao());
          System.out.println(pessoa1.getNome() + " " + pessoa1.getSituacao());

          System.out.println("\nTomou a primeira Dose!\n");

          controller.tomouPrimeiraDose(pessoa);
          controller.tomouPrimeiraDose(pessoa1);


          System.out.println(pessoa.getNome() + " " + pessoa.getSituacao());
          System.out.println(pessoa1.getNome() + " " + pessoa1.getSituacao());

          System.out.println("\nHabilitado para a segunda Dose!\n");

          pessoa.setDataDose(20);                                //Passando 20 dias após a tomada da primeira dose da Pessoa
          pessoa1.setDataDose(20);                               //Passando 20 dias após a tomada da primeira dose da Pessoa1
          controller.habilitadoSegundaDose(pessoa);
          controller.habilitadoSegundaDose(pessoa1);


          System.out.println(pessoa.getNome() + " " + pessoa.getSituacao());
          System.out.println(pessoa1.getNome() + " " + pessoa1.getSituacao());

          System.out.println("\nFinalizado!\n");

          controller.finalizado(pessoa);
          controller.finalizado(pessoa1);


          System.out.println(pessoa.getNome() + " " + pessoa.getSituacao());
          System.out.println(pessoa1.getNome() + " " + pessoa1.getSituacao());




     }
}
