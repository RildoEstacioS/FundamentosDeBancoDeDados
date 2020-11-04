package br.com.imobiliariaestacio.view;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.management.modelmbean.ModelMBean;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JPasswordField;

public class TelaUsuario extends JFrame {

	private JPanel contentPane, cardLayoutPane, panelCadastrarImovel, panelEmBranco, panelCadastrarCliente;
	private JPanel panelCadastrarProprietario;
	private JPanel panelFuncionario;
	
	public CardLayout cardLayout;	
	
	private JTextField tipoImovelTF;
	private JTextField valorImovelTF;
	private JTextField statusImovelTF;
	private JTextField areaImovelTF;
	private JTextField cpfClienteTF;
	private JTextField rgClienteTF;
	private JTextField emailClienteTF;
	private JTextField sobrenomeClienteTF;
	private JTextField nomeClienteTF;
	private JTextField ruaClienteTF;
	private JTextField cidadeClienteTF;
	private JTextField bairroClienteTF;
	private JTextField codigoImovelTF;
	private JTextField rgProprietarioTF;
	private JTextField cpfProprietarioTF;
	private JTextField sobrenomeProprietarioTF;
	private JTextField nomeProprietarioTF;
	private JTextField numeroClienteTF;
	private JTextField estadoClienteTF;
	private JTextField cepClienteTF;
	private JTextField estadoProprietarioTF;
	private JTextField cidadeProprietarioTF;
	private JTextField bairroProprietarioTF;
	private JTextField ruaProprietarioTF;
	private JTextField numeroProprietarioTF;
	private JTextField cepProprietarioTF;
	private JTextField nomeFuncTF;
	private JTextField sobrenomeFuncTF;
	private JTextField cpfFuncTF;
	private JTextField RGFuncTF;
	private JTextField loginFuncTF;
	private JTextField estadoImovelTF;
	private JTextField cidadeImovelTF;
	private JTextField bairroImovelTF;
	private JTextField ruaImovelTF;
	private JTextField numeroImovelTF;
	private JTextField cepImovelTF;
	
	private JLabel imagemLable, imobLabel, cadastrarImoLabel, tipoLabel, valorLabel, statusLabel, areaLabel, cadastrarClienteLabel, cadastrarClienteLabel_1, lblNewLabel_2, lblNewLabel_1_5, lblNewLabel_1_2_1, lblNewLabel_1_1_1;
	private JLabel lblNewLabel, lblNewLabel_9, lblNewLabel_1_9, lblNewLabel_1_2_2, lblNewLabel_1_3_2, lblNewLabel_1_4_1, lblNewLabel_1_5_1;
	private JLabel lblNewLabel_1, senhaFuncLabel, lblNewLabel_3_1;
	private JLabel lblNewLabel_1_1, confirmarSenhaFuncTF;
	private JLabel lblNewLabel_1_2;
	private JLabel lblNewLabel_1_3;
	private JLabel lblEndereo;
	private JLabel lblRua;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_1_4;
	private JLabel lblDados;
	private JLabel lblCdigoDoImvel;
	private JLabel lblEndereo_1;
	private JLabel lblNewLabel_6;
	private JLabel lblRua_4;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_1_6;
	private JLabel lblNewLabel_1_7;
	private JLabel lblEndereo_2;
	private JLabel lblNewLabel_10;
	private JLabel lblRua_1;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_1_10;
	private JLabel lblNewLabel_1_11;
	private JLabel lblNewLabel_1_8;
	
	private JButton sairButton, limparClienteButton, cadastrarClienteButton, confirmarFuncButton, limparFuncionarioButton ;
	private JButton limparProprietarioButton;
	private JButton cadastrarProprietarioButton;
	private JButton limparImovelButton;
	private JButton cadastrarImovelButton;

	private JMenu cadastrarMenu, ImoveisMenu, vendasMenu, inicioMenu;
	private JMenu sairMenu;
	
	private JMenuBar menuJMenuBar;

	private JMenuItem cadastrarImovelItem, cadastrarClienteItem, cadastrarProprietarioItem, cadastrarFuncionarioItem, imoveisVendaItem, imoveisAluguelItem, imoveisListaItem, realizarVendaItem, vendasAnterioresItem, buscarMenu, contratosMenu, parcelasMenu;
	private JPasswordField senhaFuncTF;
	private JPasswordField confirmarSenhaFuncionarioTF;

	public TelaUsuario() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		setUndecorated(true);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(135, 206, 235)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		imobLabel = new JLabel("Imobili\u00E1ria Est\u00E1cio");
		imobLabel.setFont(new Font("Sitka Text", Font.PLAIN, 30));
		imobLabel.setBounds(738, 277, 274, 38);
		contentPane.add(imobLabel);
		
		imagemLable = new JLabel("");
		imagemLable.setIcon(new ImageIcon("res/imagemMenor.png"));
		imagemLable.setBounds(736, 69, 263, 197);
		contentPane.add(imagemLable);
		
		sairButton = new JButton("");
		sairButton.setBounds(979, 8, 35, 31);
		contentPane.add(sairButton);
		sairButton.setIcon(new ImageIcon(TelaUsuario.class.getResource("/com/sun/javafx/scene/control/skin/modena/dialog-error.png")));
		
		menuJMenuBar = new JMenuBar();
		menuJMenuBar.setBounds(10, 8, 979, 26);
		contentPane.add(menuJMenuBar);
		
		inicioMenu = new JMenu("Inicio");
		inicioMenu.setFont(new Font("Sitka Text", Font.PLAIN, 15));
		menuJMenuBar.add(inicioMenu);
		
		cadastrarMenu = new JMenu("Cadastrar");
		cadastrarMenu.setFont(new Font("Sitka Text", Font.PLAIN, 15));
		menuJMenuBar.add(cadastrarMenu);
		
		cadastrarImovelItem = new JMenuItem("Cadastrar Imovel");
		cadastrarImovelItem.setFont(new Font("Sitka Text", Font.PLAIN, 15));
		cadastrarMenu.add(cadastrarImovelItem);
		
		cadastrarClienteItem = new JMenuItem("Cadastrar Cliente");
		cadastrarClienteItem.setFont(new Font("Sitka Text", Font.PLAIN, 15));
		cadastrarMenu.add(cadastrarClienteItem);
		
		cadastrarProprietarioItem = new JMenuItem("Cadastrar Propriet\u00E1rio");
		cadastrarProprietarioItem.setFont(new Font("Sitka Text", Font.PLAIN, 15));
		cadastrarMenu.add(cadastrarProprietarioItem);
		
		cadastrarFuncionarioItem = new JMenuItem("Cadastrar Funcionario");
		cadastrarFuncionarioItem.setFont(new Font("Sitka Text", Font.PLAIN, 15));
		cadastrarMenu.add(cadastrarFuncionarioItem);
		
		ImoveisMenu = new JMenu("Imoveis");
		ImoveisMenu.setFont(new Font("Sitka Text", Font.PLAIN, 15));
		menuJMenuBar.add(ImoveisMenu);
		
		imoveisVendaItem = new JMenuItem("Imoveis para venda");
		imoveisVendaItem.setFont(new Font("Sitka Text", Font.PLAIN, 15));
		ImoveisMenu.add(imoveisVendaItem);
		
		imoveisAluguelItem = new JMenuItem("Imoveis para aluguel");
		imoveisAluguelItem.setFont(new Font("Sitka Text", Font.PLAIN, 15));
		ImoveisMenu.add(imoveisAluguelItem);
		
		imoveisListaItem = new JMenuItem("Lista de todos os imoveis");
		imoveisListaItem.setFont(new Font("Sitka Text", Font.PLAIN, 15));
		ImoveisMenu.add(imoveisListaItem);
		
		vendasMenu = new JMenu("Venda");
		vendasMenu.setFont(new Font("Sitka Text", Font.PLAIN, 15));
		menuJMenuBar.add(vendasMenu);
		
		realizarVendaItem = new JMenuItem("Realizar Venda");
		realizarVendaItem.setFont(new Font("Sitka Text", Font.PLAIN, 15));
		vendasMenu.add(realizarVendaItem);
		
		vendasAnterioresItem = new JMenuItem("Vendas anteriores");
		vendasAnterioresItem.setFont(new Font("Sitka Text", Font.PLAIN, 15));
		vendasMenu.add(vendasAnterioresItem);
		
		buscarMenu = new JMenu("Buscar");
		buscarMenu.setFont(new Font("Sitka Text", Font.PLAIN, 15));
		menuJMenuBar.add(buscarMenu);
		
		contratosMenu = new JMenu("Contratos");
		contratosMenu.setFont(new Font("Sitka Text", Font.PLAIN, 15));
		menuJMenuBar.add(contratosMenu);
		
		 parcelasMenu = new JMenu("Parcelas");
		 parcelasMenu.setFont(new Font("Sitka Text", Font.PLAIN, 15));
		menuJMenuBar.add(parcelasMenu);
		
		JMenu funcionarioMenu = new JMenu("Funcionario");
		funcionarioMenu.setFont(new Font("Sitka Text", Font.PLAIN, 15));
		menuJMenuBar.add(funcionarioMenu);
		
		JMenuItem listarFuncionariosItem = new JMenuItem("ListarFuncionarios");
		listarFuncionariosItem.setFont(new Font("Sitka Text", Font.PLAIN, 15));
		funcionarioMenu.add(listarFuncionariosItem);
		
		sairMenu = new JMenu("Sair");
		sairMenu.setFont(new Font("Sitka Text", Font.PLAIN, 15));
		menuJMenuBar.add(sairMenu);
		
		cardLayoutPane = new JPanel();
		cardLayout = new CardLayout();
		cardLayoutPane.setBounds(10, 64, 1002, 663);
		cardLayoutPane.setLayout(cardLayout);
		contentPane.add(cardLayoutPane);
		
		panelEmBranco = new JPanel();
		panelEmBranco.setBackground(new Color(224, 255, 255));
		panelEmBranco.setLayout(null);

		panelCadastrarImovel = new JPanel();
		panelCadastrarImovel.setBackground(new Color(224, 255, 255));
		panelCadastrarImovel.setLayout(null);
		
		cadastrarImoLabel = new JLabel("Cadastrar Imovel");
		cadastrarImoLabel.setBackground(new Color(224, 255, 255));
		cadastrarImoLabel.setFont(new Font("Sitka Text", Font.BOLD, 30));
		cadastrarImoLabel.setBounds(10, 11, 256, 38);
		panelCadastrarImovel.add(cadastrarImoLabel);
		
		tipoLabel = new JLabel("Tipo:");
		tipoLabel.setFont(new Font("Sitka Text", Font.BOLD, 20));
		tipoLabel.setBounds(102, 106, 52, 26);
		panelCadastrarImovel.add(tipoLabel);
		
		tipoImovelTF = new JTextField();
		tipoImovelTF.setFont(new Font("Sitka Text", Font.BOLD, 15));
		tipoImovelTF.setColumns(10);
		tipoImovelTF.setBounds(164, 107, 317, 26);
		panelCadastrarImovel.add(tipoImovelTF);
		
		valorLabel = new JLabel("Valor:");
		valorLabel.setFont(new Font("Sitka Text", Font.BOLD, 20));
		valorLabel.setBounds(92, 143, 62, 26);
		panelCadastrarImovel.add(valorLabel);
		
		valorImovelTF = new JTextField();
		valorImovelTF.setFont(new Font("Sitka Text", Font.BOLD, 15));
		valorImovelTF.setColumns(10);
		valorImovelTF.setBounds(164, 144, 317, 26);
		panelCadastrarImovel.add(valorImovelTF);
		
		statusLabel = new JLabel("Status:");
		statusLabel.setFont(new Font("Sitka Text", Font.BOLD, 20));
		statusLabel.setBounds(84, 180, 70, 26);
		panelCadastrarImovel.add(statusLabel);
		
		statusImovelTF = new JTextField();
		statusImovelTF.setFont(new Font("Sitka Text", Font.BOLD, 15));
		statusImovelTF.setColumns(10);
		statusImovelTF.setBounds(164, 181, 317, 26);
		panelCadastrarImovel.add(statusImovelTF);
		
		areaLabel = new JLabel("\u00C1rea:");
		areaLabel.setFont(new Font("Sitka Text", Font.BOLD, 20));
		areaLabel.setBounds(100, 212, 54, 26);
		panelCadastrarImovel.add(areaLabel);
		
		areaImovelTF = new JTextField();
		areaImovelTF.setFont(new Font("Sitka Text", Font.BOLD, 15));
		areaImovelTF.setColumns(10);
		areaImovelTF.setBounds(164, 213, 317, 26);
		panelCadastrarImovel.add(areaImovelTF);
		
		
		
		lblDados = new JLabel("Dados:");
		lblDados.setFont(new Font("Sitka Text", Font.BOLD, 25));
		lblDados.setBounds(60, 63, 84, 32);
		panelCadastrarImovel.add(lblDados);
		
		lblCdigoDoImvel = new JLabel("C\u00F3digo do Im\u00F3vel:");
		lblCdigoDoImvel.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblCdigoDoImvel.setBounds(10, 254, 180, 26);
		panelCadastrarImovel.add(lblCdigoDoImvel);
		
		codigoImovelTF = new JTextField();
		codigoImovelTF.setFont(new Font("Sitka Text", Font.BOLD, 15));
		codigoImovelTF.setColumns(10);
		codigoImovelTF.setBounds(200, 250, 281, 26);
		panelCadastrarImovel.add(codigoImovelTF);
		
		limparImovelButton = new JButton("Limpar");
		limparImovelButton.setFont(new Font("Sitka Text", Font.BOLD, 13));
		limparImovelButton.setBounds(733, 410, 97, 80);
		panelCadastrarImovel.add(limparImovelButton);
		
		cadastrarImovelButton = new JButton("Cadastrar");
		cadastrarImovelButton.setFont(new Font("Sitka Text", Font.BOLD, 13));
		cadastrarImovelButton.setBounds(852, 410, 97, 80);
		panelCadastrarImovel.add(cadastrarImovelButton);
		
		lblEndereo_2 = new JLabel("Endere\u00E7o do Imovel");
		lblEndereo_2.setFont(new Font("Sitka Text", Font.BOLD, 29));
		lblEndereo_2.setBackground(new Color(224, 255, 255));
		lblEndereo_2.setBounds(10, 362, 293, 38);
		panelCadastrarImovel.add(lblEndereo_2);
		
		lblNewLabel_10 = new JLabel("Bairro:");
		lblNewLabel_10.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblNewLabel_10.setBounds(45, 451, 72, 26);
		panelCadastrarImovel.add(lblNewLabel_10);
		
		lblRua_1 = new JLabel("Rua:");
		lblRua_1.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblRua_1.setBounds(71, 414, 46, 26);
		panelCadastrarImovel.add(lblRua_1);
		
		lblNewLabel_11 = new JLabel("Cidade:");
		lblNewLabel_11.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblNewLabel_11.setBounds(43, 488, 74, 26);
		panelCadastrarImovel.add(lblNewLabel_11);
		
		lblNewLabel_12 = new JLabel("Estado:");
		lblNewLabel_12.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblNewLabel_12.setBounds(43, 525, 74, 26);
		panelCadastrarImovel.add(lblNewLabel_12);
		
		estadoImovelTF = new JTextField();
		estadoImovelTF.setFont(new Font("Sitka Text", Font.BOLD, 15));
		estadoImovelTF.setColumns(10);
		estadoImovelTF.setBounds(127, 526, 289, 26);
		panelCadastrarImovel.add(estadoImovelTF);
		
		cidadeImovelTF = new JTextField();
		cidadeImovelTF.setFont(new Font("Sitka Text", Font.BOLD, 15));
		cidadeImovelTF.setColumns(10);
		cidadeImovelTF.setBounds(127, 489, 289, 26);
		panelCadastrarImovel.add(cidadeImovelTF);
		
		bairroImovelTF = new JTextField();
		bairroImovelTF.setFont(new Font("Sitka Text", Font.BOLD, 15));
		bairroImovelTF.setColumns(10);
		bairroImovelTF.setBounds(127, 452, 289, 26);
		panelCadastrarImovel.add(bairroImovelTF);
		
		ruaImovelTF = new JTextField();
		ruaImovelTF.setFont(new Font("Sitka Text", Font.BOLD, 15));
		ruaImovelTF.setColumns(10);
		ruaImovelTF.setBounds(127, 415, 289, 26);
		panelCadastrarImovel.add(ruaImovelTF);
		
		lblNewLabel_1_10 = new JLabel("N\u00BA:");
		lblNewLabel_1_10.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblNewLabel_1_10.setBounds(456, 414, 35, 26);
		panelCadastrarImovel.add(lblNewLabel_1_10);
		
		numeroImovelTF = new JTextField();
		numeroImovelTF.setFont(new Font("Sitka Text", Font.BOLD, 15));
		numeroImovelTF.setColumns(10);
		numeroImovelTF.setBounds(501, 415, 97, 26);
		panelCadastrarImovel.add(numeroImovelTF);
		
		lblNewLabel_1_11 = new JLabel("CEP:");
		lblNewLabel_1_11.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblNewLabel_1_11.setBounds(444, 453, 47, 26);
		panelCadastrarImovel.add(lblNewLabel_1_11);
		
		cepImovelTF = new JTextField();
		cepImovelTF.setFont(new Font("Sitka Text", Font.BOLD, 15));
		cepImovelTF.setColumns(10);
		cepImovelTF.setBounds(501, 452, 97, 26);
		panelCadastrarImovel.add(cepImovelTF);

//		cardLayout.show(cardLayoutPane, "1");
//		
		panelCadastrarCliente = new JPanel();
		panelCadastrarCliente.setBackground(new Color(224, 255, 255));
		panelCadastrarCliente.setForeground(new Color(224, 255, 255));
		panelCadastrarCliente.setLayout(null);
		
		cadastrarClienteLabel = new JLabel("Cadastrar Cliente");
		cadastrarClienteLabel.setFont(new Font("Sitka Text", Font.BOLD, 30));
		cadastrarClienteLabel.setBackground(new Color(224, 255, 255));
		cadastrarClienteLabel.setBounds(10, 11, 258, 38);
		panelCadastrarCliente.add(cadastrarClienteLabel);
		
		lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblNewLabel.setBounds(64, 83, 66, 26);
		panelCadastrarCliente.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Sobrenome:");
		lblNewLabel_1.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblNewLabel_1.setBounds(10, 120, 120, 26);
		panelCadastrarCliente.add(lblNewLabel_1);
		
		cpfClienteTF = new JTextField();
		cpfClienteTF.setFont(new Font("Sitka Text", Font.BOLD, 15));
		cpfClienteTF.setColumns(10);
		cpfClienteTF.setBounds(130, 161, 289, 20);
		panelCadastrarCliente.add(cpfClienteTF);
		
		lblNewLabel_1_1 = new JLabel("CPF:");
		lblNewLabel_1_1.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(84, 157, 46, 26);
		panelCadastrarCliente.add(lblNewLabel_1_1);
		
		lblNewLabel_1_2 = new JLabel("RG:");
		lblNewLabel_1_2.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(93, 192, 37, 26);
		panelCadastrarCliente.add(lblNewLabel_1_2);
		
		rgClienteTF = new JTextField();
		rgClienteTF.setFont(new Font("Sitka Text", Font.BOLD, 15));
		rgClienteTF.setColumns(10);
		rgClienteTF.setBounds(130, 196, 289, 20);
		panelCadastrarCliente.add(rgClienteTF);
		
		lblNewLabel_1_3 = new JLabel("E-mail:");
		lblNewLabel_1_3.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblNewLabel_1_3.setBounds(57, 229, 73, 26);
		panelCadastrarCliente.add(lblNewLabel_1_3);
		
		emailClienteTF = new JTextField();
		emailClienteTF.setFont(new Font("Sitka Text", Font.BOLD, 15));
		emailClienteTF.setColumns(10);
		emailClienteTF.setBounds(130, 233, 289, 20);
		panelCadastrarCliente.add(emailClienteTF);
		
		sobrenomeClienteTF = new JTextField();
		sobrenomeClienteTF.setFont(new Font("Sitka Text", Font.BOLD, 15));
		sobrenomeClienteTF.setColumns(10);
		sobrenomeClienteTF.setBounds(130, 124, 289, 20);
		panelCadastrarCliente.add(sobrenomeClienteTF);
		
		nomeClienteTF = new JTextField();
		nomeClienteTF.setFont(new Font("Sitka Text", Font.BOLD, 15));
		nomeClienteTF.setColumns(10);
		nomeClienteTF.setBounds(130, 87, 289, 20);
		panelCadastrarCliente.add(nomeClienteTF);
		
		lblEndereo = new JLabel("Endere\u00E7o do cliente");
		lblEndereo.setFont(new Font("Sitka Text", Font.BOLD, 30));
		lblEndereo.setBackground(new Color(224, 255, 255));
		lblEndereo.setBounds(10, 309, 290, 38);
		panelCadastrarCliente.add(lblEndereo);
		
		lblRua = new JLabel("Rua:");
		lblRua.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblRua.setBounds(74, 367, 46, 26);
		panelCadastrarCliente.add(lblRua);
		
		ruaClienteTF = new JTextField();
		ruaClienteTF.setFont(new Font("Sitka Text", Font.BOLD, 15));
		ruaClienteTF.setColumns(10);
		ruaClienteTF.setBounds(130, 371, 289, 20);
		panelCadastrarCliente.add(ruaClienteTF);
		
		lblNewLabel_3 = new JLabel("Bairro:");
		lblNewLabel_3.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblNewLabel_3.setBounds(48, 404, 72, 26);
		panelCadastrarCliente.add(lblNewLabel_3);
		
		bairroClienteTF = new JTextField();
		bairroClienteTF.setFont(new Font("Sitka Text", Font.BOLD, 15));
		bairroClienteTF.setColumns(10);
		bairroClienteTF.setBounds(130, 408, 289, 20);
		panelCadastrarCliente.add(bairroClienteTF);
		
		lblNewLabel_1_4 = new JLabel("N\u00BA:");
		lblNewLabel_1_4.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblNewLabel_1_4.setBounds(459, 365, 35, 26);
		panelCadastrarCliente.add(lblNewLabel_1_4);
		
		cidadeClienteTF = new JTextField();
		cidadeClienteTF.setFont(new Font("Sitka Text", Font.BOLD, 15));
		cidadeClienteTF.setColumns(10);
		cidadeClienteTF.setBounds(130, 445, 289, 20);
		panelCadastrarCliente.add(cidadeClienteTF);
		
		limparClienteButton = new JButton("Limpar");
		limparClienteButton.setFont(new Font("Sitka Text", Font.BOLD, 13));
		limparClienteButton.setBounds(733, 410, 97, 80);
		panelCadastrarCliente.add(limparClienteButton);
		
		cadastrarClienteButton = new JButton("Cadastrar");
		cadastrarClienteButton.setFont(new Font("Sitka Text", Font.BOLD, 13));
		cadastrarClienteButton.setBounds(852, 410, 97, 80);
		panelCadastrarCliente.add(cadastrarClienteButton); 
		
		numeroClienteTF = new JTextField();
		numeroClienteTF.setFont(new Font("Sitka Text", Font.BOLD, 15));
		numeroClienteTF.setColumns(10);
		numeroClienteTF.setBounds(504, 371, 97, 20);
		panelCadastrarCliente.add(numeroClienteTF);
		
		lblNewLabel_4 = new JLabel("Cidade:");
		lblNewLabel_4.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblNewLabel_4.setBounds(46, 441, 74, 26);
		panelCadastrarCliente.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Estado:");
		lblNewLabel_5.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblNewLabel_5.setBounds(46, 478, 74, 26);
		panelCadastrarCliente.add(lblNewLabel_5);
		
		estadoClienteTF = new JTextField();
		estadoClienteTF.setFont(new Font("Sitka Text", Font.BOLD, 15));
		estadoClienteTF.setColumns(10);
		estadoClienteTF.setBounds(130, 482, 289, 20);
		panelCadastrarCliente.add(estadoClienteTF);
		
		lblNewLabel_1_6 = new JLabel("CEP:");
		lblNewLabel_1_6.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblNewLabel_1_6.setBounds(447, 404, 47, 26);
		panelCadastrarCliente.add(lblNewLabel_1_6);
		
		cepClienteTF = new JTextField();
		cepClienteTF.setFont(new Font("Sitka Text", Font.BOLD, 15));
		cepClienteTF.setColumns(10);
		cepClienteTF.setBounds(504, 408, 97, 20);
		panelCadastrarCliente.add(cepClienteTF);
		
		panelCadastrarProprietario = new JPanel();
		panelCadastrarProprietario.setBackground(new Color(224, 255, 255));
		panelCadastrarProprietario.setLayout(null);
		
		cadastrarClienteLabel_1 = new JLabel("Cadastrar Propriet\u00E1rio");
		cadastrarClienteLabel_1.setFont(new Font("Sitka Text", Font.BOLD, 30));
		cadastrarClienteLabel_1.setBackground(new Color(224, 255, 255));
		cadastrarClienteLabel_1.setBounds(10, 11, 341, 38);
		panelCadastrarProprietario.add(cadastrarClienteLabel_1);
		
		lblNewLabel_2 = new JLabel("Nome:");
		lblNewLabel_2.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblNewLabel_2.setBounds(64, 105, 66, 26);
		panelCadastrarProprietario.add(lblNewLabel_2);
		
		lblNewLabel_1_5 = new JLabel("Sobrenome:");
		lblNewLabel_1_5.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblNewLabel_1_5.setBounds(10, 142, 120, 26);
		panelCadastrarProprietario.add(lblNewLabel_1_5);
		
		lblNewLabel_1_2_1 = new JLabel("RG:");
		lblNewLabel_1_2_1.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblNewLabel_1_2_1.setBounds(93, 216, 37, 26);
		panelCadastrarProprietario.add(lblNewLabel_1_2_1);
		
		lblNewLabel_1_1_1 = new JLabel("CPF:");
		lblNewLabel_1_1_1.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(84, 179, 46, 26);
		panelCadastrarProprietario.add(lblNewLabel_1_1_1);
		
		rgProprietarioTF = new JTextField();
		rgProprietarioTF.setFont(new Font("Sitka Text", Font.BOLD, 15));
		rgProprietarioTF.setColumns(10);
		rgProprietarioTF.setBounds(130, 217, 289, 26);
		panelCadastrarProprietario.add(rgProprietarioTF);
		
		cpfProprietarioTF = new JTextField();
		cpfProprietarioTF.setFont(new Font("Sitka Text", Font.BOLD, 15));
		cpfProprietarioTF.setColumns(10);
		cpfProprietarioTF.setBounds(130, 180, 289, 26);
		panelCadastrarProprietario.add(cpfProprietarioTF);
		
		sobrenomeProprietarioTF = new JTextField();
		sobrenomeProprietarioTF.setFont(new Font("Sitka Text", Font.BOLD, 15));
		sobrenomeProprietarioTF.setColumns(10);
		sobrenomeProprietarioTF.setBounds(130, 143, 289, 26);
		panelCadastrarProprietario.add(sobrenomeProprietarioTF);
		
		nomeProprietarioTF = new JTextField();
		nomeProprietarioTF.setFont(new Font("Sitka Text", Font.BOLD, 15));
		nomeProprietarioTF.setColumns(10);
		nomeProprietarioTF.setBounds(130, 106, 289, 26);
		panelCadastrarProprietario.add(nomeProprietarioTF);
		
		limparProprietarioButton = new JButton("Limpar");
		limparProprietarioButton.setFont(new Font("Sitka Text", Font.BOLD, 13));
		limparProprietarioButton.setBounds(733, 410, 97, 80);
		panelCadastrarProprietario.add(limparProprietarioButton);
		
		cadastrarProprietarioButton = new JButton("Cadastrar");
		cadastrarProprietarioButton.setFont(new Font("Sitka Text", Font.BOLD, 13));
		cadastrarProprietarioButton.setBounds(852, 410, 97, 80);
		panelCadastrarProprietario.add(cadastrarProprietarioButton);
		
		lblEndereo_1 = new JLabel("Endere\u00E7o do Propriet\u00E1rio");
		lblEndereo_1.setFont(new Font("Sitka Text", Font.BOLD, 30));
		lblEndereo_1.setBackground(new Color(224, 255, 255));
		lblEndereo_1.setBounds(10, 309, 378, 38);
		panelCadastrarProprietario.add(lblEndereo_1);
		
		lblNewLabel_6 = new JLabel("Bairro:");
		lblNewLabel_6.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblNewLabel_6.setBounds(58, 406, 72, 26);
		panelCadastrarProprietario.add(lblNewLabel_6);
		
		lblRua_4 = new JLabel("Rua:");
		lblRua_4.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblRua_4.setBounds(84, 369, 46, 26);
		panelCadastrarProprietario.add(lblRua_4);
		
		lblNewLabel_7 = new JLabel("Cidade:");
		lblNewLabel_7.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblNewLabel_7.setBounds(56, 443, 74, 26);
		panelCadastrarProprietario.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("Estado:");
		lblNewLabel_8.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblNewLabel_8.setBounds(56, 480, 74, 26);
		panelCadastrarProprietario.add(lblNewLabel_8);
		
		estadoProprietarioTF = new JTextField();
		estadoProprietarioTF.setFont(new Font("Sitka Text", Font.BOLD, 15));
		estadoProprietarioTF.setColumns(10);
		estadoProprietarioTF.setBounds(130, 480, 289, 26);
		panelCadastrarProprietario.add(estadoProprietarioTF);
		
		cidadeProprietarioTF = new JTextField();
		cidadeProprietarioTF.setFont(new Font("Sitka Text", Font.BOLD, 15));
		cidadeProprietarioTF.setColumns(10);
		cidadeProprietarioTF.setBounds(130, 443, 289, 26);
		panelCadastrarProprietario.add(cidadeProprietarioTF);
		
		bairroProprietarioTF = new JTextField();
		bairroProprietarioTF.setFont(new Font("Sitka Text", Font.BOLD, 15));
		bairroProprietarioTF.setColumns(10);
		bairroProprietarioTF.setBounds(130, 406, 289, 26);
		panelCadastrarProprietario.add(bairroProprietarioTF);
		
		ruaProprietarioTF = new JTextField();
		ruaProprietarioTF.setFont(new Font("Sitka Text", Font.BOLD, 15));
		ruaProprietarioTF.setColumns(10);
		ruaProprietarioTF.setBounds(130, 369, 289, 26);
		panelCadastrarProprietario.add(ruaProprietarioTF);
		
		lblNewLabel_1_7 = new JLabel("N\u00BA:");
		lblNewLabel_1_7.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblNewLabel_1_7.setBounds(456, 369, 35, 26);
		panelCadastrarProprietario.add(lblNewLabel_1_7);
		
		numeroProprietarioTF = new JTextField();
		numeroProprietarioTF.setFont(new Font("Sitka Text", Font.BOLD, 15));
		numeroProprietarioTF.setColumns(10);
		numeroProprietarioTF.setBounds(490, 369, 97, 26);
		panelCadastrarProprietario.add(numeroProprietarioTF);
		
		lblNewLabel_1_8 = new JLabel("CEP:");
		lblNewLabel_1_8.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblNewLabel_1_8.setBounds(444, 408, 47, 26);
		panelCadastrarProprietario.add(lblNewLabel_1_8);
		
		cepProprietarioTF = new JTextField();
		cepProprietarioTF.setFont(new Font("Sitka Text", Font.BOLD, 15));
		cepProprietarioTF.setColumns(10);
		cepProprietarioTF.setBounds(490, 406, 97, 26);
		panelCadastrarProprietario.add(cepProprietarioTF);
		
		panelFuncionario = new JPanel();
		panelFuncionario.setBackground(new Color(224, 255, 255));
		panelFuncionario.setLayout(null);
		
		lblNewLabel_9 = new JLabel("Cadastrar Funcionario");
		lblNewLabel_9.setFont(new Font("Sitka Text", Font.BOLD, 30));
		lblNewLabel_9.setBounds(10, 11, 335, 38);
		panelFuncionario.add(lblNewLabel_9);
		
		lblNewLabel_1_9 = new JLabel("Nome:");
		lblNewLabel_1_9.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblNewLabel_1_9.setBounds(99, 108, 66, 26);
		panelFuncionario.add(lblNewLabel_1_9);
		
		lblNewLabel_1_2_2 = new JLabel("Sobrenome:");
		lblNewLabel_1_2_2.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblNewLabel_1_2_2.setBounds(45, 145, 120, 26);
		panelFuncionario.add(lblNewLabel_1_2_2);
		
		lblNewLabel_1_3_2 = new JLabel("CPF:");
		lblNewLabel_1_3_2.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblNewLabel_1_3_2.setBounds(119, 182, 46, 26);
		panelFuncionario.add(lblNewLabel_1_3_2);
		
		lblNewLabel_1_4_1 = new JLabel("RG:");
		lblNewLabel_1_4_1.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblNewLabel_1_4_1.setBounds(129, 219, 37, 26);
		panelFuncionario.add(lblNewLabel_1_4_1);
		
		lblNewLabel_1_5_1 = new JLabel("Login:");
		lblNewLabel_1_5_1.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblNewLabel_1_5_1.setBounds(119, 410, 64, 25);
		panelFuncionario.add(lblNewLabel_1_5_1);
		
		senhaFuncLabel = new JLabel("Senha:");
		senhaFuncLabel.setFont(new Font("Sitka Text", Font.BOLD, 20));
		senhaFuncLabel.setBounds(115, 446, 68, 26);
		panelFuncionario.add(senhaFuncLabel);
		
		confirmarSenhaFuncTF = new JLabel("Confirmar Senha:");
		confirmarSenhaFuncTF.setFont(new Font("Sitka Text", Font.BOLD, 20));
		confirmarSenhaFuncTF.setBounds(5, 483, 177, 26);
		panelFuncionario.add(confirmarSenhaFuncTF);
		
		nomeFuncTF = new JTextField();
		nomeFuncTF.setFont(new Font("Sitka Text", Font.BOLD, 15));
		nomeFuncTF.setColumns(10);
		nomeFuncTF.setBounds(165, 108, 289, 26);
		panelFuncionario.add(nomeFuncTF);
		
		sobrenomeFuncTF = new JTextField();
		sobrenomeFuncTF.setFont(new Font("Sitka Text", Font.BOLD, 15));
		sobrenomeFuncTF.setColumns(10);
		sobrenomeFuncTF.setBounds(165, 145, 289, 26);
		panelFuncionario.add(sobrenomeFuncTF);
		
		cpfFuncTF = new JTextField();
		cpfFuncTF.setFont(new Font("Sitka Text", Font.BOLD, 15));
		cpfFuncTF.setColumns(10);
		cpfFuncTF.setBounds(165, 182, 289, 26);
		panelFuncionario.add(cpfFuncTF);
		
		RGFuncTF = new JTextField();
		RGFuncTF.setFont(new Font("Sitka Text", Font.BOLD, 15));
		RGFuncTF.setColumns(10);
		RGFuncTF.setBounds(166, 219, 289, 26);
		panelFuncionario.add(RGFuncTF);
		
		loginFuncTF = new JTextField();
		loginFuncTF.setFont(new Font("Sitka Text", Font.BOLD, 15));
		loginFuncTF.setColumns(10);
		loginFuncTF.setBounds(182, 410, 272, 26);
		panelFuncionario.add(loginFuncTF);
		
		lblNewLabel_3_1 = new JLabel("Dados para Login");
		lblNewLabel_3_1.setFont(new Font("Sitka Text", Font.BOLD, 30));
		lblNewLabel_3_1.setBounds(10, 309, 260, 38);
		panelFuncionario.add(lblNewLabel_3_1);
		
		confirmarFuncButton = new JButton("Cadastrar");
		confirmarFuncButton.setFont(new Font("Sitka Text", Font.BOLD, 13));
		confirmarFuncButton.setBounds(852, 410, 97, 80);
		panelFuncionario.add(confirmarFuncButton);
		
		limparFuncionarioButton = new JButton("Limpar");
		limparFuncionarioButton.setFont(new Font("Sitka Text", Font.BOLD, 13));
		limparFuncionarioButton.setBounds(733, 410, 97, 80);
		panelFuncionario.add(limparFuncionarioButton);
		
		//Antes disso é só variavel, aqui mexe no cardLayout
		
		cardLayoutPane.add(panelEmBranco, "branco");
		cardLayoutPane.add(panelCadastrarImovel, "imovel");
		
		JLabel lblNewLabel_13 = new JLabel("* Somente n\u00FAmeros");
		lblNewLabel_13.setFont(new Font("Sitka Text", Font.BOLD, 11));
		lblNewLabel_13.setBounds(491, 151, 106, 14);
		panelCadastrarImovel.add(lblNewLabel_13);
		
		JLabel lblNewLabel_13_1 = new JLabel("* Somente n\u00FAmeros");
		lblNewLabel_13_1.setFont(new Font("Sitka Text", Font.BOLD, 11));
		lblNewLabel_13_1.setBounds(492, 261, 106, 14);
		panelCadastrarImovel.add(lblNewLabel_13_1);
		cardLayoutPane.add(panelCadastrarProprietario, "proprietario");
		cardLayoutPane.add(panelFuncionario, "funcionario");
		
		senhaFuncTF = new JPasswordField();
		senhaFuncTF.setFont(new Font("Sitka Text", Font.BOLD, 15));
		senhaFuncTF.setBounds(182, 447, 272, 26);
		panelFuncionario.add(senhaFuncTF);
		
		confirmarSenhaFuncionarioTF = new JPasswordField();
		confirmarSenhaFuncionarioTF.setFont(new Font("Sitka Text", Font.BOLD, 15));
		confirmarSenhaFuncionarioTF.setBounds(182, 484, 272, 26);
		panelFuncionario.add(confirmarSenhaFuncionarioTF);
		cardLayoutPane.add(panelCadastrarCliente, "cliente");
				
		cardLayout.show(cardLayoutPane, "branco");
		
		panelCadastrarCliente.setLayout(null);
		
		setLocationRelativeTo(null);
	}
	public JPanel getCardLayoutPane() {
		return cardLayoutPane;
	}
	public void setCardLayoutPane(JPanel cardLayoutPane) {
		this.cardLayoutPane = cardLayoutPane;
	}
	public JPanel getPanelCadastrar() {
		return panelCadastrarImovel;
	}
	public void setPanelCadastrar(JPanel panelCadastrar) {
		this.panelCadastrarImovel = panelCadastrar;
	}
	public JPanel getPanelEmBranco() {
		return panelEmBranco;
	}
	public void setPanelEmBranco(JPanel panelEmBranco) {
		this.panelEmBranco = panelEmBranco;
	}
	public JTextField getTipoTF() {
		return tipoImovelTF;
	}
	public void setTipoTF(JTextField tipoTF) {
		this.tipoImovelTF = tipoTF;
	}
	public JTextField getValorTF() {
		return valorImovelTF;
	}
	public void setValorTF(JTextField valorTF) {
		this.valorImovelTF = valorTF;
	}
	public JTextField getStatusTF() {
		return statusImovelTF;
	}
	public void setStatusTF(JTextField statusTF) {
		this.statusImovelTF = statusTF;
	}
	public JTextField getAreaTF() {
		return areaImovelTF;
	}
	public void setAreaTF(JTextField areaTF) {
		this.areaImovelTF = areaTF;
	}
	public JButton getSairButton() {
		return sairButton;
	}
	public void setSairButton(JButton sairButton) {
		this.sairButton = sairButton;
	}
	public JMenuBar getMenuJMenuBar() {
		return menuJMenuBar;
	}
	public void setMenuJMenuBar(JMenuBar menuJMenuBar) {
		this.menuJMenuBar = menuJMenuBar;
	}
	public JMenu getCadastrarMenu() {
		return cadastrarMenu;
	}
	public void setCadastrarMenu(JMenu cadastrarMenu) {
		this.cadastrarMenu = cadastrarMenu;
	}
	public JMenuItem getCadastrarImovelItem() {
		return cadastrarImovelItem;
	}
	public void setCadastrarImovelItem(JMenuItem cadastrarImovelItem) {
		this.cadastrarImovelItem = cadastrarImovelItem;
	}
	public JMenuItem getCadastrarClienteItem() {
		return cadastrarClienteItem;
	}
	public void setCadastrarClienteItem(JMenuItem cadastrarClienteItem) {
		this.cadastrarClienteItem = cadastrarClienteItem;
	}
	public JMenuItem getCadastrarProprietarioItem() {
		return cadastrarProprietarioItem;
	}
	public void setCadastrarProprietarioItem(JMenuItem cadastrarProprietarioItem) {
		this.cadastrarProprietarioItem = cadastrarProprietarioItem;
	}
	public JMenuItem getCadastrarFuncionarioItem() {
		return cadastrarFuncionarioItem;
	}
	public void setCadastrarFuncionarioItem(JMenuItem cadastrarFuncionarioItem) {
		this.cadastrarFuncionarioItem = cadastrarFuncionarioItem;
	}
	public JMenuItem getImoveisVendaItem() {
		return imoveisVendaItem;
	}
	public void setImoveisVendaItem(JMenuItem imoveisVendaItem) {
		this.imoveisVendaItem = imoveisVendaItem;
	}
	public JMenuItem getImoveisAluguelItem() {
		return imoveisAluguelItem;
	}
	public void setImoveisAluguelItem(JMenuItem imoveisAluguelItem) {
		this.imoveisAluguelItem = imoveisAluguelItem;
	}
	public JMenuItem getImoveisListaItem() {
		return imoveisListaItem;
	}
	public void setImoveisListaItem(JMenuItem imoveisListaItem) {
		this.imoveisListaItem = imoveisListaItem;
	}
	public JMenuItem getRealizarVendaItem() {
		return realizarVendaItem;
	}
	public void setRealizarVendaItem(JMenuItem realizarVendaItem) {
		this.realizarVendaItem = realizarVendaItem;
	}
	public JMenuItem getVendasAnterioresItem() {
		return vendasAnterioresItem;
	}
	public void setVendasAnterioresItem(JMenuItem vendasAnterioresItem) {
		this.vendasAnterioresItem = vendasAnterioresItem;
	}

	public JPanel getPanelCadastrarImovel() {
		return panelCadastrarImovel;
	}
	public void setPanelCadastrarImovel(JPanel panelCadastrarImovel) {
		this.panelCadastrarImovel = panelCadastrarImovel;
	}
	public JPanel getPanelCadastrarCliente() {
		return panelCadastrarCliente;
	}
	public void setPanelCadastrarCliente(JPanel panelCadastrarCliente) {
		this.panelCadastrarCliente = panelCadastrarCliente;
	}
	public JMenu getImoveisMenu() {
		return ImoveisMenu;
	}
	public void setImoveisMenu(JMenu imoveisMenu) {
		ImoveisMenu = imoveisMenu;
	}
	public JMenu getVendasMenu() {
		return vendasMenu;
	}
	public void setVendasMenu(JMenu vendasMenu) {
		this.vendasMenu = vendasMenu;
	}
	public JPanel getPanelCadastrarProprietario() {
		return panelCadastrarProprietario;
	}
	public void setPanelCadastrarProprietario(JPanel panelCadastrarProprietario) {
		this.panelCadastrarProprietario = panelCadastrarProprietario;
	}
	public JPanel getPanelFuncionario() {
		return panelFuncionario;
	}
	public void setPanelFuncionario(JPanel panelFuncionario) {
		this.panelFuncionario = panelFuncionario;
	}
	public CardLayout getCardLayout() {
		return cardLayout;
	}
	public void setCardLayout(CardLayout cardLayout) {
		this.cardLayout = cardLayout;
	}
	public JTextField getTipoImovelTF() {
		return tipoImovelTF;
	}
	public void setTipoImovelTF(JTextField tipoImovelTF) {
		this.tipoImovelTF = tipoImovelTF;
	}
	public JTextField getValorImovelTF() {
		return valorImovelTF;
	}
	public void setValorImovelTF(JTextField valorImovelTF) {
		this.valorImovelTF = valorImovelTF;
	}
	public JTextField getStatusImovelTF() {
		return statusImovelTF;
	}
	public void setStatusImovelTF(JTextField statusImovelTF) {
		this.statusImovelTF = statusImovelTF;
	}
	public JTextField getAreaImovelTF() {
		return areaImovelTF;
	}
	public void setAreaImovelTF(JTextField areaImovelTF) {
		this.areaImovelTF = areaImovelTF;
	}
	public JTextField getCpfClienteTF() {
		return cpfClienteTF;
	}
	public void setCpfClienteTF(JTextField cpfClienteTF) {
		this.cpfClienteTF = cpfClienteTF;
	}
	public JTextField getRgClienteTF() {
		return rgClienteTF;
	}
	public void setRgClienteTF(JTextField rgClienteTF) {
		this.rgClienteTF = rgClienteTF;
	}
	public JTextField getEmailClienteTF() {
		return emailClienteTF;
	}
	public void setEmailClienteTF(JTextField emailClienteTF) {
		this.emailClienteTF = emailClienteTF;
	}
	public JTextField getSobrenomeClienteTF() {
		return sobrenomeClienteTF;
	}
	public void setSobrenomeClienteTF(JTextField sobrenomeClienteTF) {
		this.sobrenomeClienteTF = sobrenomeClienteTF;
	}
	public JTextField getNomeClienteTF() {
		return nomeClienteTF;
	}
	public void setNomeClienteTF(JTextField nomeClienteTF) {
		this.nomeClienteTF = nomeClienteTF;
	}
	public JTextField getRuaClienteTF() {
		return ruaClienteTF;
	}
	public void setRuaClienteTF(JTextField ruaClienteTF) {
		this.ruaClienteTF = ruaClienteTF;
	}
	public JTextField getCidadeClienteTF() {
		return cidadeClienteTF;
	}
	public void setCidadeClienteTF(JTextField cidadeClienteTF) {
		this.cidadeClienteTF = cidadeClienteTF;
	}
	public JTextField getBairroClienteTF() {
		return bairroClienteTF;
	}
	public void setBairroClienteTF(JTextField bairroClienteTF) {
		this.bairroClienteTF = bairroClienteTF;
	}
	public JTextField getCodigoImovelTF() {
		return codigoImovelTF;
	}
	public void setCodigoImovelTF(JTextField codigoImovelTF) {
		this.codigoImovelTF = codigoImovelTF;
	}
	public JTextField getRgProprietarioTF() {
		return rgProprietarioTF;
	}
	public void setRgProprietarioTF(JTextField rgProprietarioTF) {
		this.rgProprietarioTF = rgProprietarioTF;
	}
	public JTextField getCpfProprietarioTF() {
		return cpfProprietarioTF;
	}
	public void setCpfProprietarioTF(JTextField cpfProprietarioTF) {
		this.cpfProprietarioTF = cpfProprietarioTF;
	}
	public JTextField getSobrenomeProprietarioTF() {
		return sobrenomeProprietarioTF;
	}
	public void setSobrenomeProprietarioTF(JTextField sobrenomeProprietarioTF) {
		this.sobrenomeProprietarioTF = sobrenomeProprietarioTF;
	}
	public JTextField getNomeProprietarioTF() {
		return nomeProprietarioTF;
	}
	public void setNomeProprietarioTF(JTextField nomeProprietarioTF) {
		this.nomeProprietarioTF = nomeProprietarioTF;
	}
	public JTextField getNumeroClienteTF() {
		return numeroClienteTF;
	}
	public void setNumeroClienteTF(JTextField numeroClienteTF) {
		this.numeroClienteTF = numeroClienteTF;
	}
	public JTextField getEstadoClienteTF() {
		return estadoClienteTF;
	}
	public void setEstadoClienteTF(JTextField estadoClienteTF) {
		this.estadoClienteTF = estadoClienteTF;
	}
	public JTextField getCepClienteTF() {
		return cepClienteTF;
	}
	public void setCepClienteTF(JTextField cepClienteTF) {
		this.cepClienteTF = cepClienteTF;
	}
	public JTextField getEstadoProprietarioTF() {
		return estadoProprietarioTF;
	}
	public void setEstadoProprietarioTF(JTextField estadoProprietarioTF) {
		this.estadoProprietarioTF = estadoProprietarioTF;
	}
	public JTextField getCidadeProprietarioTF() {
		return cidadeProprietarioTF;
	}
	public void setCidadeProprietarioTF(JTextField cidadeProprietarioTF) {
		this.cidadeProprietarioTF = cidadeProprietarioTF;
	}
	public JTextField getBairroProprietarioTF() {
		return bairroProprietarioTF;
	}
	public void setBairroProprietarioTF(JTextField bairroProprietarioTF) {
		this.bairroProprietarioTF = bairroProprietarioTF;
	}
	public JTextField getRuaProprietarioTF() {
		return ruaProprietarioTF;
	}
	public void setRuaProprietarioTF(JTextField ruaProprietarioTF) {
		this.ruaProprietarioTF = ruaProprietarioTF;
	}
	public JTextField getNumeroProprietarioTF() {
		return numeroProprietarioTF;
	}
	public void setNumeroProprietarioTF(JTextField numeroProprietarioTF) {
		this.numeroProprietarioTF = numeroProprietarioTF;
	}
	public JTextField getCepProprietarioTF() {
		return cepProprietarioTF;
	}
	public void setCepProprietarioTF(JTextField cepProprietarioTF) {
		this.cepProprietarioTF = cepProprietarioTF;
	}
	public JTextField getNomeFuncTF() {
		return nomeFuncTF;
	}
	public void setNomeFuncTF(JTextField nomeFuncTF) {
		this.nomeFuncTF = nomeFuncTF;
	}
	public JTextField getSobrenomeFuncTF() {
		return sobrenomeFuncTF;
	}
	public void setSobrenomeFuncTF(JTextField sobrenomeFuncTF) {
		this.sobrenomeFuncTF = sobrenomeFuncTF;
	}
	public JTextField getCpfFuncTF() {
		return cpfFuncTF;
	}
	public void setCpfFuncTF(JTextField cpfFuncTF) {
		this.cpfFuncTF = cpfFuncTF;
	}
	public JTextField getRGFuncTF() {
		return RGFuncTF;
	}
	public void setRGFuncTF(JTextField rGFuncTF) {
		RGFuncTF = rGFuncTF;
	}

	public JTextField getLoginFuncTF() {
		return loginFuncTF;
	}
	public void setLoginFuncTF(JTextField loginFuncTF) {
		this.loginFuncTF = loginFuncTF;
	}
	public JTextField getSenhaFuncTF() {
		return senhaFuncTF;
	}
	public void setSenhaFuncTF(JPasswordField senhaFuncTF) {
		this.senhaFuncTF = senhaFuncTF;
	}
	public JTextField getConfirmarSenhaFuncionarioTF() {
		return confirmarSenhaFuncionarioTF;
	}
	public void setConfirmarSenhaFuncionarioTF(JPasswordField confirmarSenhaFuncionarioTF) {
		this.confirmarSenhaFuncionarioTF = confirmarSenhaFuncionarioTF;
	}
	public JTextField getEstadoImovelTF() {
		return estadoImovelTF;
	}
	public void setEstadoImovelTF(JTextField estadoImovelTF) {
		this.estadoImovelTF = estadoImovelTF;
	}
	public JTextField getCidadeImovelTF() {
		return cidadeImovelTF;
	}
	public void setCidadeImovelTF(JTextField cidadeImovelTF) {
		this.cidadeImovelTF = cidadeImovelTF;
	}
	public JTextField getBairroImovelTF() {
		return bairroImovelTF;
	}
	public void setBairroImovelTF(JTextField bairroImovelTF) {
		this.bairroImovelTF = bairroImovelTF;
	}
	public JTextField getRuaImovelTF() {
		return ruaImovelTF;
	}
	public void setRuaImovelTF(JTextField ruaImovelTF) {
		this.ruaImovelTF = ruaImovelTF;
	}
	public JTextField getNumeroImovelTF() {
		return numeroImovelTF;
	}
	public void setNumeroImovelTF(JTextField numeroImovelTF) {
		this.numeroImovelTF = numeroImovelTF;
	}
	public JTextField getCepImovelTF() {
		return cepImovelTF;
	}
	public void setCepImovelTF(JTextField cepImovelTF) {
		this.cepImovelTF = cepImovelTF;
	}

	public JLabel getConfirmarSenhaFuncLbl() {
		return confirmarSenhaFuncTF;
	}
	public void setConfirmarSenhaFuncTF(JLabel confirmarSenhaFuncTF) {
		this.confirmarSenhaFuncTF = confirmarSenhaFuncTF;
	}
	public JButton getVoltarClienteButton() {
		return limparClienteButton;
	}
	public void setVoltarClienteButton(JButton voltarClienteButton) {
		this.limparClienteButton = voltarClienteButton;
	}
	public JButton getCadastrarClienteButton() {
		return cadastrarClienteButton;
	}
	public void setCadastrarClienteButton(JButton cadastrarClienteButton) {
		this.cadastrarClienteButton = cadastrarClienteButton;
	}
	public JButton getConfirmarFuncButton() {
		return confirmarFuncButton;
	}
	public void setConfirmarFuncButton(JButton confirmarFuncButton) {
		this.confirmarFuncButton = confirmarFuncButton;
	}
	public JButton getLimparFuncButton() {
		return limparFuncionarioButton;
	}
	public void setVoltarFuncButton(JButton voltarFuncButton) {
		this.limparFuncionarioButton = voltarFuncButton;
	}
	public JButton getVoltarProprietarioButton() {
		return limparProprietarioButton;
	}
	public void setVoltarProprietarioButton(JButton voltarProprietarioButton) {
		this.limparProprietarioButton = voltarProprietarioButton;
	}
	public JButton getCadastrarProprietarioButton() {
		return cadastrarProprietarioButton;
	}
	public void setCadastrarProprietarioButton(JButton cadastrarProprietarioButton) {
		this.cadastrarProprietarioButton = cadastrarProprietarioButton;
	}
	public JButton getVoltarImovelButton() {
		return limparImovelButton;
	}
	public void setVoltarImovelButton(JButton voltarImovelButton) {
		this.limparImovelButton = voltarImovelButton;
	}
	public JButton getCadastrarImovelButton() {
		return cadastrarImovelButton;
	}
	public void setCadastrarImovelButton(JButton cadastrarImovelButton) {
		this.cadastrarImovelButton = cadastrarImovelButton;
	}
	public JMenu getInicioMenu() {
		return inicioMenu;
	}
	public void setInicioMenu(JMenu inicioMenu) {
		this.inicioMenu = inicioMenu;
	}
	public JMenu getSairMenu() {
		return sairMenu;
	}

	public void setSairMenu(JMenu sairMenu) {
		this.sairMenu = sairMenu;
	}
	public JMenuItem getContratosMenu() {
		return contratosMenu;
	}
	public void setContratosMenu(JMenuItem contratosMenu) {
		this.contratosMenu = contratosMenu;
	}
	public JMenuItem getParcelasMenu() {
		return parcelasMenu;
	}
	public void setParcelasMenu(JMenuItem parcelasMenu) {
		this.parcelasMenu = parcelasMenu;
	}

	public JButton getLimparClienteButton() {
		return limparClienteButton;
	}
	public void setLimparClienteButton(JButton limparClienteButton) {
		this.limparClienteButton = limparClienteButton;
	}
	public JButton getLimparFuncionarioButton() {
		return limparFuncionarioButton;
	}
	public void setLimparFuncionarioButton(JButton limparFuncionarioButton) {
		this.limparFuncionarioButton = limparFuncionarioButton;
	}
	public JButton getLimparProprietarioButton() {
		return limparProprietarioButton;
	}
	public void setLimparProprietarioButton(JButton limparProprietarioButton) {
		this.limparProprietarioButton = limparProprietarioButton;
	}
	public JButton getLimparImovelButton() {
		return limparImovelButton;
	}
	public void setLimparImovelButton(JButton limparImovelButton) {
		this.limparImovelButton = limparImovelButton;
	}
}
