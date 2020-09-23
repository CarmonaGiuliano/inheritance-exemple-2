package com.company;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

      PessoaFisica pf = new PessoaFisica();
      PessoaJuridica pj = new PessoaJuridica();
      Scanner scan = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            System.out.println("Digite o nome da Pessoa Física:");
            pf.setNomeCont(scan.next());
            System.out.println("Digite a Renda Bruta da pessoa:");
            pf.setRendaBruta(scan.nextDouble());
            pf.calculaImposto();
            System.out.println("O imposto a ser pago por: " + pf.getNomeCont() + " é: " + pf.getImposto());
    }
        for(int i = 0; i < 3; i++){
            System.out.println("Digite o nome da Pessoa Juridica:");
            pj.setNomeCont(scan.next());
            System.out.println("Digite a Renda Bruta da pessoa:");
            pj.setRendaBruta(scan.nextDouble());
            pj.calculaImposto();
            System.out.println("O imposto a ser pago por: " + pj.getNomeCont() + " é: " + pj.getImposto());
        }
}

}