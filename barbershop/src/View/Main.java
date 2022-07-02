/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Models.Cliente;
import Models.Servico;
import Models.Usuario;



/**
 *
 * @author wes
 */
public class Main {
    
    public static void main(String[] args) {
        
        String nome = "Lucio";
        System.out.println(nome);
        
        Servico servico = new Servico(1, "barba", 30);
        
        System.out.println(servico.getDescricao());        
        System.out.println(servico.getValor());
        
        Cliente cliente = new Cliente(1, "Douglas", "Rua Alva - 750", "9985746100");
        
        System.out.println(cliente.getNome());
        
        Usuario ususario = new Usuario(1, "Karlos", "009tuukamo");
        
        System.out.println(ususario);

    }
    
}
