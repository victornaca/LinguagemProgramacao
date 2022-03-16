/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Locadora;

/**
 *
 * @author victo
 */
public class Carro{

    // atributos da classe -> características

    String placa;
    double potencia;
    String modelo;
    String cor;
    String marca;
    boolean cambio_automatico;
    int ano;
    float preco;


    //métodos -> ações

    public void andar() {
        System.out.println("andando...");
    }

    public boolean frear() {
        System.out.println("freando...");
        return true;
    }

    public void correr(int velocidade) {
        System.out.println("Estou correndo" + velocidade);
    }
    
    public static void main (String[] args) {

        //instânciando objetos da classe
        Carro C1 = new Carro();

        //declarei e depois instânciei o objeto
        Carro C2;
        C2 = new Carro();

        C1.ano = 2020;
        C1.cor = "vermelho";
        C1.andar();

        C2.marca = "Ferrari";
        C2.correr(300);


    }

}