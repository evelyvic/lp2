/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author Aluno
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Carro carro = new Carro("Fiat", "Gol");
    carro.marca = "VW"; // Irá apresentar um erro de compilação
    carro.andar(); 
    }
  lass Carro {
  private String marca;
  private String nome;
  public Carro(String marca, String nome) {
    this.marca = marca;
    this.nome = nome;
  }
  protected String nomeCompleto() {
    return marca + " " + nome;
  }
  public void andar() {
    System.out.println("O carro " + nomeCompleto() + " está andando");
  }
}

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
