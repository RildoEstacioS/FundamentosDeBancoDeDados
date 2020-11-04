package br.com.imobiliariaestacio.controller;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import br.com.imobiliariaestacio.facade.Facade;
import br.com.imobiliariaestacio.model.Funcionario;
import br.com.imobiliariaestacio.view.Mensagem;
import br.com.imobiliariaestacio.view.TelaCadastro;
import br.com.imobiliariaestacio.view.TelaLogin;
import br.com.imobiliariaestacio.view.TelaUsuario;



public class ControllerTelaLogin {

	TelaLogin telaLogin;
	TelaUsuario telaUsuario;
	TelaCadastro telaCadastro;
	Facade facade;
	Funcionario funcionario;
	public ControllerTelaLogin(TelaLogin telaLogin, TelaUsuario telaUsuario, TelaCadastro telaCadastro, Facade facade) {
		super();
		this.telaLogin = telaLogin;
		this.telaUsuario = telaUsuario;
		this.telaCadastro = telaCadastro;
		this.facade = facade;
		control();
	}
	
	@SuppressWarnings("deprecation")
	public boolean efetuarLogin() {
	    try {
	    	funcionario = new Funcionario(telaLogin.getLoginTF().getText(),telaLogin.getSenhaField().getText());
	    	Funcionario f = new Funcionario();
	   
	    	f = facade.funcionarioLogin(telaLogin.getLoginTF().getText(), telaLogin.getSenhaField().getText());
	    	if (funcionario != null && f.getLogin().equals(telaLogin.getLoginTF().getText()) && f.getSenha().equals(telaLogin.getSenhaField().getText())) {
	    		return true;
	   
	    }
	    		return false;
	    }catch (Exception e) {
			// TODO: handle exception
	    	System.out.println(e + ": Login não encontrado!");
	    	return false;
		}
 }
    
	
	
	public void control(){
		telaLogin.getCadastrarButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				telaLogin.getLoginTF().setText("");
				telaLogin.getSenhaField().setText("");
				telaLogin.setVisible(false);
				telaCadastro.setVisible(true);
			
			}});
		

		telaLogin.getSairButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

				System.exit(0);
			}
		});
		
		telaLogin.getEntrarButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				if (telaLogin.getLoginTF().getText().equals("") || telaLogin.getSenhaField().getText().equals("")) {
					Mensagem.mensagemInserida("Campo(s) em branco", 1);
				}else if (efetuarLogin()) {
					telaLogin.getLoginTF().setText("");
					telaLogin.getSenhaField().setText("");
					telaLogin.setVisible(false);
					telaUsuario.setVisible(true);					
					
				}else{
					Mensagem.mensagemInserida("Login e/ou senha errado(s), tente novamente!", 1);
				}
				
				
			}
		});
	}
}
