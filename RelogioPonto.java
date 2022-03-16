/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Locadora;

/**
 *
 * @author victo
 */
public class RelogioPonto{
    String nome;
    int idade;
    String funcao;
    int registro;
    int data;
    int horamin;
    
    public void pontodata(int data){
    System.out.println("Data: "+ data);
    }
    public void baterponto(String nome){
    System.out.println("Batendo ponto... \n"+ nome);
    }
    
    
    public static void main (String[] args){
    RelogioPonto B1 = new RelogioPonto();
    B1.nome = "Arthur Henrique Santos";
    B1.idade = 25;
    B1.funcao = "Mecanico";
    B1.registro = 123456;
    B1.data = 13032022;
    B1.horamin = 2040;
    B1.baterponto(B1.nome);
    B1.pontodata(B1.data);
    }
    
}
