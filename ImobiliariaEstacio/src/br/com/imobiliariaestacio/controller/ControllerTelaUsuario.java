package br.com.imobiliariaestacio.controller;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

import br.com.imobiliariaestacio.dao.DaoEndereco;
import br.com.imobiliariaestacio.facade.Facade;
import br.com.imobiliariaestacio.model.Endereco;
import br.com.imobiliariaestacio.model.Funcionario;
import br.com.imobiliariaestacio.model.Imovel;
import br.com.imobiliariaestacio.model.Proprietario;
import br.com.imobiliariaestacio.sql.SQLUtil.ImovelSQL;
import br.com.imobiliariaestacio.view.Mensagem;
import br.com.imobiliariaestacio.view.TelaLogin;
import br.com.imobiliariaestacio.view.TelaUsuario;

public class ControllerTelaUsuario implements ActionListener{

	TelaLogin telaLogin;
	TelaUsuario telaUsuario;
	Facade facade;
	
	public ControllerTelaUsuario(TelaLogin telaLogin, TelaUsuario telaUsuario, Facade facade) {
		super();
		this.telaLogin = telaLogin;
		this.telaUsuario = telaUsuario;
		this.facade = facade;
		control();
	}
	
	public void control() {
		telaUsuario.getSairButton().addActionListener(this);
		telaUsuario.getCadastrarImovelItem().addActionListener(this);
		telaUsuario.getCadastrarFuncionarioItem().addActionListener(this);
		telaUsuario.getCadastrarClienteItem().addActionListener(this);
		telaUsuario.getCadastrarProprietarioItem().addActionListener(this);
		telaUsuario.getLimparFuncButton().addActionListener(this);
		telaUsuario.getImoveisListaItem().addActionListener(this);

		
		telaUsuario.getCadastrarClienteButton().addActionListener(this);
		telaUsuario.getConfirmarFuncButton().addActionListener(this);
		telaUsuario.getCadastrarImovelButton().addActionListener(this);
		telaUsuario.getCadastrarProprietarioButton().addActionListener(this);

		telaUsuario.getLimparClienteButton().addActionListener(this);
		telaUsuario.getLimparFuncButton().addActionListener(this);
		telaUsuario.getLimparFuncionarioButton().addActionListener(this);
		telaUsuario.getLimparProprietarioButton().addActionListener(this);
		telaUsuario.getLimparImovelButton().addActionListener(this);
		
		telaUsuario.getSairMenu().addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				telaUsuario.setVisible(false);
				telaLogin.setVisible(true);			
				telaUsuario.cardLayout.show(telaUsuario.getCardLayoutPane(), "branco");

			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		telaUsuario.getInicioMenu().addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
		
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				telaUsuario.cardLayout.show(telaUsuario.getCardLayoutPane(), "branco");
				telaUsuario.getInicioMenu().setSelected(false);		
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(telaUsuario.getSairButton())) {
			if (Mensagem.mensagemSair()) 
				System.exit(0);			
		}
		
		if(e.getSource().equals(telaUsuario.getCadastrarImovelItem())){
			telaUsuario.cardLayout.show(telaUsuario.getCardLayoutPane(), "imovel");
		}
		
		if (e.getSource().equals(telaUsuario.getCadastrarFuncionarioItem())) {
			telaUsuario.cardLayout.show(telaUsuario.getCardLayoutPane(), "funcionario");
		}
		
		if (e.getSource().equals(telaUsuario.getCadastrarClienteItem())) {
			telaUsuario.cardLayout.show(telaUsuario.getCardLayoutPane(), "cliente");
		}
		if (e.getSource().equals(telaUsuario.getCadastrarProprietarioItem())) {
			telaUsuario.cardLayout.show(telaUsuario.getCardLayoutPane(), "proprietario");
			
		}
		
		if (e.getSource().equals(telaUsuario.getCadastrarClienteButton())) {
//			facade.salvarUsuario(usuario);
		}
		
		if (e.getSource().equals(telaUsuario.getImoveisListaItem())) {
			telaUsuario.cardLayout.show(telaUsuario.getCardLayoutPane(), "imovelLista");
			
		}
		
		if (e.getSource().equals(telaUsuario.getConfirmarFuncButton())) {
				
				if (telaUsuario.getNomeFuncTF().getText().equalsIgnoreCase("") ||
					telaUsuario.getSobrenomeFuncTF().getText().equalsIgnoreCase("") ||
					telaUsuario.getRGFuncTF().getText().equalsIgnoreCase("") ||
					telaUsuario.getCpfFuncTF().getText().equalsIgnoreCase("") ||
					telaUsuario.getLoginFuncTF().getText().equalsIgnoreCase("") ||
					telaUsuario.getSenhaFuncTF().getText().equalsIgnoreCase("") ||
					telaUsuario.getConfirmarSenhaFuncionarioTF().getText().equalsIgnoreCase("")) {
					Mensagem.mensagemInserida("Campo(s) em branco!", 1);
				}
				else if (!(telaUsuario.getSenhaFuncTF().getText().equals(telaUsuario.getConfirmarSenhaFuncionarioTF().getText()))) {
					Mensagem.mensagemInserida("Senhas não coincidem!", 1);
				}else {
					try {
						Funcionario funcionario;
						
						funcionario = new Funcionario(telaUsuario.getNomeFuncTF().getText(),
													  telaUsuario.getSobrenomeFuncTF().getText(),
													  telaUsuario.getRGFuncTF().getText(),
													  telaUsuario.getCpfFuncTF().getText(),
													  telaUsuario.getLoginFuncTF().getText(),
													  telaUsuario.getSenhaFuncTF().getText());
						
						if (!(facade.buscarFuncionarioCpf(funcionario.getCpf()))) {
							facade.salvarFuncionario(funcionario);
							Mensagem.mensagemInserida("Funcionario Cadastrado com Sucesso!", 2);
						}else {
							Mensagem.mensagemInserida("CPF já cadastrado, realize o cadastro com um cpf diferente", 2);
						}
							
								
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						System.out.println(e + "Erro: Funcionario não inserido!");
					}
				}
				
				}
		if (e.getSource().equals(telaUsuario.getCadastrarImovelButton())) {
			if (telaUsuario.getTipoImovelTF().getText().equals("") ||
				telaUsuario.getValorImovelTF().getText().equals("") ||
				telaUsuario.getStatusImovelTF().getText().equals("")||
				telaUsuario.getAreaImovelTF().getText().equals("") ||
				telaUsuario.getCodigoImovelTF().getText().equals("") ||
				telaUsuario.getRuaImovelTF().getText().equals("") ||
				telaUsuario.getBairroImovelTF().getText().equals("") ||
				telaUsuario.getCidadeImovelTF().getText().equals("") ||
				telaUsuario.getEstadoImovelTF().getText().equals("") ||
				telaUsuario.getNumeroImovelTF().getText().equals("") ||
				telaUsuario.getCepImovelTF().getText().equals(""))
			{
				Mensagem.mensagemInserida("Campo(s) em branco!", 1);
				
			} else if (somenteNumero()) {
					
					try {
						System.out.println("chegou aqui");

						Endereco endereco = new Endereco(telaUsuario.getRuaImovelTF().getText(), 
								telaUsuario.getBairroImovelTF().getText(),
								telaUsuario.getCidadeImovelTF().getText(),
								telaUsuario.getEstadoImovelTF().getText(),
								telaUsuario.getNumeroImovelTF().getText(),
								telaUsuario.getCepImovelTF().getText());	
						
						facade.salvarEndereco(endereco);
						
						Imovel imovel = new Imovel(telaUsuario.getTipoImovelTF().getText(),
								Integer.parseInt(telaUsuario.getValorImovelTF().getText()),
								telaUsuario.getStatusImovelTF().getText(),
								telaUsuario.getAreaImovelTF().getText(),
								Integer.parseInt(telaUsuario.getCodigoImovelTF().getText()),
								DaoEndereco.chaveEstrangeiraImovel);
						
						facade.salvarImovel(imovel);
						
						Mensagem.mensagemInserida("Imovel Cadastrado com Sucesso!", 2);
						
					} catch (Exception e1) {
						System.out.println(e1 + ": Imovel não cadastrado");
					}
			}
		}
		
		if (e.getSource().equals(telaUsuario.getCadastrarProprietarioButton())) {

			if (telaUsuario.getNomeProprietarioTF().getText().equals("") ||
				telaUsuario.getSobrenomeProprietarioTF().getText().equals("") ||
				telaUsuario.getCpfProprietarioTF().getText().equals("")||
				telaUsuario.getRgProprietarioTF().getText().equals("") ||
				telaUsuario.getRuaProprietarioTF().getText().equals("") ||
				telaUsuario.getBairroProprietarioTF().getText().equals("") ||
				telaUsuario.getCidadeProprietarioTF().getText().equals("") ||
				telaUsuario.getEstadoProprietarioTF().getText().equals("") ||
				telaUsuario.getNumeroProprietarioTF().getText().equals("") ||
				telaUsuario.getCepProprietarioTF().getText().equals("")){
				Mensagem.mensagemInserida("Campo(s) em branco!", 1);
				
			}else{
				try {
					if (!(facade.buscarProprietarioCpf(telaUsuario.getCpfProprietarioTF().getText()))) {	
						Endereco endereco = new Endereco(telaUsuario.getRuaProprietarioTF().getText(), 
								telaUsuario.getBairroProprietarioTF().getText(),
								telaUsuario.getCidadeProprietarioTF().getText(),
								telaUsuario.getEstadoProprietarioTF().getText(),
								telaUsuario.getNumeroProprietarioTF().getText(),
								telaUsuario.getCepProprietarioTF().getText());	
						
						facade.salvarEndereco(endereco);
						
						Proprietario proprietario = new Proprietario(telaUsuario.getRgProprietarioTF().getText(),
								telaUsuario.getCpfProprietarioTF().getText(),
								telaUsuario.getNomeProprietarioTF().getText(),
								telaUsuario.getSobrenomeProprietarioTF().getText(),
								DaoEndereco.chaveEstrangeiraProprietario);
						
						
						facade.salvarProprietario(proprietario);
						
						Mensagem.mensagemInserida("Proprietario cadastrado com sucesso!", 2);
						
					}else {
						System.out.println("Erro");
					}
				} catch (Exception e1) {

					System.out.println(e1 + ": Proprietario não cadastrado");
				}
			
			}
		}
		if (e.getSource().equals(telaUsuario.getLimparFuncionarioButton())) {
			limparTodosOsCampos(telaUsuario);
		}
		
		if (e.getSource().equals(telaUsuario.getLimparImovelButton())) {
			limparTodosOsCampos(telaUsuario);
		}
		
		if (e.getSource().equals(telaUsuario.getLimparProprietarioButton())) {
			limparTodosOsCampos(telaUsuario);
		}
		
		if (e.getSource().equals(telaUsuario.getLimparFuncButton())) {
			limparTodosOsCampos(telaUsuario);
		}
		
		if (e.getSource().equals(telaUsuario.getLimparClienteButton())) {
			limparTodosOsCampos(telaUsuario);
		}

		
	}
	public void limparTodosOsCampos(TelaUsuario usuario) {
		
		usuario.getAreaImovelTF().setText("");
		usuario.getAreaTF().setText("");
		usuario.getBairroClienteTF().setText("");
		usuario.getBairroImovelTF().setText("");
		usuario.getBairroProprietarioTF().setText("");
		usuario.getCepClienteTF().setText("");
		usuario.getCepImovelTF().setText("");
		usuario.getCepProprietarioTF().setText("");
		usuario.getCidadeClienteTF().setText("");
		usuario.getCidadeImovelTF().setText("");
		usuario.getCidadeProprietarioTF().setText("");
		usuario.getCodigoImovelTF().setText("");
		usuario.getConfirmarSenhaFuncionarioTF().setText("");
		usuario.getCpfClienteTF().setText("");
		usuario.getCpfFuncTF().setText("");
		usuario.getEmailClienteTF().setText("");
		usuario.getEstadoClienteTF().setText("");
		usuario.getEstadoImovelTF().setText("");
		usuario.getEstadoProprietarioTF().setText("");
		usuario.getLoginFuncTF().setText("");
		usuario.getNomeClienteTF().setText("");
		usuario.getNomeFuncTF().setText("");
		usuario.getNomeProprietarioTF().setText("");
		usuario.getNumeroClienteTF().setText("");
		usuario.getNumeroImovelTF().setText("");
		usuario.getNumeroProprietarioTF().setText("");
		usuario.getRgClienteTF().setText("");
		usuario.getRGFuncTF().setText("");
		usuario.getRgProprietarioTF().setText("");
		usuario.getRuaClienteTF().setText("");
		usuario.getRuaImovelTF().setText("");
		usuario.getRuaProprietarioTF().setText("");
		usuario.getSenhaFuncTF().setText("");
		usuario.getSobrenomeClienteTF().setText("");
		usuario.getSobrenomeFuncTF().setText("");
		usuario.getSobrenomeProprietarioTF().setText("");
		usuario.getStatusImovelTF().setText("");
		usuario.getTipoImovelTF().setText("");
		usuario.getTipoTF().setText("");
		usuario.getValorImovelTF().setText("");
		usuario.getValorTF().setText("");
	 	usuario.getCpfProprietarioTF().setText("");
		
	}

	public boolean somenteNumero() {

		try {
			Long.parseLong(telaUsuario.getValorImovelTF().getText());
		} catch (NumberFormatException e2) {
			Mensagem.mensagemInserida("Digite somente números no campo \"Valor\"", 1);
			System.out.println(e2 + ": Campo numerico incorreto");
			return false;

		}
		
		try {
			Long.parseLong(telaUsuario.getCodigoImovelTF().getText());
		} catch (NumberFormatException e2) {
			Mensagem.mensagemInserida("Digite somente números no campo \"Codigo do Imovel\"", 1);
			System.out.println(e2 + ": Campo numerico incorreto");
			return false;

		}
		return true;
		
	}
}
