/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Locadora;

/**
 *
 * @author victo
 */
    public class Moto{
        String placa;
        int cilindrada;
        String modelo;
        String cor;
        String marca;
        int ano;
        float preco;
        
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
        Moto M1 = new Moto();

        //declarei e depois instânciei o objeto
        Moto M2;
        M2 = new Moto();

        M1.ano = 2022;
        M1.cor = "azul";
        M1.andar();

        M2.marca = "Honda";
        M2.correr(200);

    }
}

