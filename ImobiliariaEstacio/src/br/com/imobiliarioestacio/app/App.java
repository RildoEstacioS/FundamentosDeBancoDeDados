package br.com.imobiliarioestacio.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.UIManager;

import com.sun.media.jfxmedia.events.NewFrameEvent;

import br.com.imobiliariaestacio.controller.ControllerTelaCadastro;
import br.com.imobiliariaestacio.controller.ControllerTelaLogin;
import br.com.imobiliariaestacio.controller.ControllerTelaUsuario;
import br.com.imobiliariaestacio.facade.Facade;
import br.com.imobiliariaestacio.model.Endereco;
import br.com.imobiliariaestacio.model.Funcionario;
import br.com.imobiliariaestacio.view.Mensagem;
import br.com.imobiliariaestacio.view.TelaCadastro;
import br.com.imobiliariaestacio.view.TelaLogin;
import br.com.imobiliariaestacio.view.TelaUsuario;

public class App {

	static TelaLogin telaLogin;
	static TelaUsuario telaUsuario;
	static TelaCadastro telaCadastro;
	static Facade facade;
	static Endereco endereco;
	
	public static void main(String[] args) throws Exception {	
//		UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");

		
		facade = new Facade();
		
		telaLogin = new TelaLogin();
		telaUsuario = new TelaUsuario();
		telaCadastro = new TelaCadastro();
		
		
		new ControllerTelaLogin(telaLogin, telaUsuario, telaCadastro, facade);
		new ControllerTelaUsuario(telaLogin, telaUsuario, facade);
		new ControllerTelaCadastro(telaLogin, telaCadastro,facade);
		

	//Cadastro de usuario - Login - Cadastro de Imovel - Cadastro de Proprietario - Endereço
	//       Feito       -  Feito - 
	}
}
