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
    
    public void cadastrar(String nome){
    System.out.println("Cadastrado Finalizado " + nome);
    }
    
    public static void main (String[] args){
        CadastroCliente CC1 = new CadastroCliente();
        CC1.nome = "Patrick";
        CC1.idade = 12;
        CC1.cpf = 123456789;
        CC1.cadastrar(CC1.nome);
    }
}
