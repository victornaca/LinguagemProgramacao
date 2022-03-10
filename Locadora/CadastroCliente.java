/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Locadora;

/**
 *l
 * @author victo
 */
public class CadastroCliente {
    String nome;
    int idade;
    int cpf;
    
    public void cadastrar(){
    System.out.println("cadastrando...");
    }
    public static void main (String[] args){
        CadastroCliente C1 = new CadastroCliente();
        C1.nome = "Patrick";
        C1.idade = 12;
        C1.cpf = 123456789;
        C1.cadastrar();
    }
}
