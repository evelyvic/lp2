/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Aluno
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

class Caminhao extends Carro {
    private int carga;
    public Caminhao(String marca, String nome, int carga) {
        super(marca, nome);
        this.carga = carga;
    }
    public void mostraCarga() {
        System.out.println("O caminhão " + super.nomeCompleto() +
        " carrega " + carga + " toneladas");
    }
}
public class App {
    public static void main(String[] args) {
        Caminhao caminhao = new Caminhao("Mercedes", "1318", 16);
        // O caminhão Mercedes 1318 carrega 16 toneladas
        caminhao.mostraCarga();
    }
}

class Caminhao extends Carro {
    private int carga;
    public Caminhao(String marca, String nome, int carga) {
        super(marca, nome);
        this.carga = carga;
    }
    public void andar() {
        System.out.println("O caminhão " + super.nomeCompleto() +
        " está carregando " + carga + " toneladas");
    }
    public void andar(boolean deRe) {
        if (deRe)
            System.out.println("O caminhão " + super.nomeCompleto() +
            " está carregando " + carga + " toneladas de ré");
        else
            andar();
    }
}
