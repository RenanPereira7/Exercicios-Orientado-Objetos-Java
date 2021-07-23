package Exercicio3;

public class Funcionarios {

    public Integer salAtendente = 1200;
    public Integer salGerente = 4000;
    public Integer salSupervisor = 3000;


    public void setSalAtendente(Integer salAtendente) {
        this.salAtendente = salAtendente;
    }

    public void setSalGerente(Integer salGerente) {
        this.salGerente = salGerente;
    }

    public void setSalSupervisor(Integer salSupervisor) {
        this.salSupervisor = salSupervisor;
    }

    public double calculaImpostoA() {
        return this.salAtendente * 0.01;
    }

    public String SaidaAtendente(){
        return "Atendente paga o valor = " + calculaImpostoA();
    }


    public double calculaImpostoG() {
        return this.salGerente * 0.1;
    }

    public String SaidaGerente(){
        return "Gerente paga o valor = "  + calculaImpostoG();
    }

    public double calculaImpostoS() {
        return this.salSupervisor * 0.05;
    }

    public String SaidaSupervisor(){
        return "Supervisor paga o valor = "  + calculaImpostoS();
    }
}
