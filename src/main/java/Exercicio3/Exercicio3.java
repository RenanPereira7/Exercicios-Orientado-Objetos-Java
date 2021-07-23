package Exercicio3;

public class Exercicio3 {

    public static void main(String[] args) {

        Funcionarios Atendente = new Atendente();
        Funcionarios Funcionarios = new Funcionarios();
        Funcionarios Gerente = new Gerente();


        System.out.println(Atendente.SaidaAtendente());
        System.out.println(Funcionarios.SaidaSupervisor());
        System.out.println(Gerente.SaidaGerente());



    }
}
