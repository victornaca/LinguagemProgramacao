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
    int dia;
    int mes;
    int ano;
    int horamin;
    
    public void baterponto(){
    System.out.println("Batendo ponto...");
    }
    
    public static void main (String[] args){
    RelogioPonto B1 = new RelogioPonto();
    B1.nome = "Arthur";
    B1.idade = 25;
    B1.funcao = "Mecanico";
    B1.registro = 123456;
    B1.dia = 13;
    B1.mes = 10;
    B1.ano = 2022;
    B1.horamin = 2040;
    B1.baterponto();
    }
    
}
