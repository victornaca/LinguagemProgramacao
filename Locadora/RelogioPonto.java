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
    int hora;
    int min;
    
    public void pontodata(int data){
    System.out.println("Data: "+ data);
    }
    public void baterponto(){
    System.out.println("Registrando ponto...\n Nome: " + nome
    + "\n Data/ Hora: " + dia + "/" + mes + "/" + ano + " " + hora + ":" + min);
    }
    
    
    public static void main (String[] args){
    RelogioPonto B1 = new RelogioPonto();
    B1.nome = "Arthur Henrique Santos";
    B1.idade = 25;
    B1.funcao = "Mecanico";
    B1.registro = 123456;
    B1.dia = 13;
    B1.mes = 03;
    B1.ano = 22;
    B1.hora = 20;
    B1.min = 40;
    B1.baterponto();
    }
    
}
