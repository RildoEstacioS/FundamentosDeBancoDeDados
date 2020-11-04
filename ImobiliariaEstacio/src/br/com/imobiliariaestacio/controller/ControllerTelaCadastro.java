package br.com.imobiliariaestacio.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import br.com.imobiliariaestacio.facade.Facade;
import br.com.imobiliariaestacio.model.Funcionario;
import br.com.imobiliariaestacio.view.Mensagem;
import br.com.imobiliariaestacio.view.TelaCadastro;
import br.com.imobiliariaestacio.view.TelaLogin;

public class ControllerTelaCadastro implements ActionListener {

	private TelaLogin login;
	private TelaCadastro cadastro;
	private Facade facade;
	
	public ControllerTelaCadastro(TelaLogin login, TelaCadastro cadastro, Facade facade) {
		super();
		this.login = login;
		this.cadastro = cadastro;
		this.facade = facade;
		control();
	}
	
	public void control() {
		cadastro.getSairButton().addActionListener(this);
		cadastro.getVoltarButton().addActionListener(this);
		cadastro.getBtnConfirmar().addActionListener(this);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(cadastro.getSairButton())) {
			if (Mensagem.mensagemSair()) {
				System.exit(0);
			}
		}
		
		if (e.getSource().equals(cadastro.getVoltarButton())) {
			cadastro.getNomeTF().setText("");
			cadastro.getSobrenomeTF().setText("");
			cadastro.getRgTF().setText("");
			cadastro.getCpfTF().setText("");
			cadastro.getLoginTF().setText("");
			cadastro.getSenhaTF().setText("");
			cadastro.getConfirmarTF().setText("");
			login.setVisible(true);
			cadastro.setVisible(false);
		
		}
		
		if (e.getSource().equals(cadastro.getBtnConfirmar())) {
		
			if (cadastro.getNomeTF().getText().equalsIgnoreCase("") ||
				cadastro.getSobrenomeTF().getText().equalsIgnoreCase("") ||
				cadastro.getRgTF().getText().equalsIgnoreCase("") ||
				cadastro.getCpfTF().getText().equalsIgnoreCase("") ||
				cadastro.getLoginTF().getText().equalsIgnoreCase("") ||
				cadastro.getSenhaTF().getText().equalsIgnoreCase("") ||
				cadastro.getConfirmarTF().getText().equalsIgnoreCase("")) {
				Mensagem.mensagemInserida("Campo(s) em branco!", 1);
					
		
			}else if (!(cadastro.getSenhaTF().getText().equals(cadastro.getConfirmarTF().getText()))) {
				Mensagem.mensagemInserida("Senhas não coincidem!", 1);
			}else {
				try {
					Funcionario funcionario;
					
					funcionario = new Funcionario(
							cadastro.getNomeTF().getText(),
							cadastro.getSobrenomeTF().getText(),
							cadastro.getRgTF().getText(),
							cadastro.getCpfTF().getText(),
							cadastro.getLoginTF().getText(),
							cadastro.getSenhaTF().getText());
					
					if (facade.buscarFuncionarioCpf(funcionario.getCpf())) {
						Mensagem.mensagemInserida("CPF já cadastrado, realize o cadastro com um cpf diferente", 1);
					}else if (facade.buscarLoginFuncionario(funcionario.getLogin())) {
						Mensagem.mensagemInserida("Login já existente, insira outro login", 2);

					}else{
						Mensagem.mensagemInserida("Funcionario Cadastrado com Sucesso!", 2);
						facade.salvarFuncionario(funcionario);
						
					}
						
							
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					System.out.println(e1 + ": Funcionario não cadastrado");
				}
			}
			
			}
		}
		
}
	

