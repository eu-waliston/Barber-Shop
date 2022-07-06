/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

//será responsável por gerenciar a View da página de login

import Controller.Helper.LoginHelper;
import Models.Usuario;
import View.Login;

/**
 *
 * @author wes
 */
public class LoginController {
    
    private final Login view;
    private LoginHelper helper;
    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void entrarNoSistema() {
        
        //1° pegar um user da view
        Usuario usuario = helper.obterModelo();
        
        
        
        //2° Pesquisar um usuario no banco
        //3° Se o usuario da view tiver o mesmo nome e usuario do banco, redirecionar para o menu principal
        //Se não for igual vou mostrar uma msg pro usuario "usuario ou senha invalidos"
     }
    
    public void fizTarefa() {
        System.out.println("Busquei algo do banco de dados");
        
        this.view.exibeMensagem("Executei o fiz tarefa");
    }
    
    
}
