package br.com.imobiliariaestacio.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class TelaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField nomeTF;
	private JTextField sobrenomeTF;
	private JTextField cpfTF;
	private JTextField rgTF;
	private JTextField loginTF;
	private JButton sairButton, voltarButton, btnConfirmar;
	private JPasswordField confirmarTF;
	private JPasswordField senhaTF;
	
	
	public TelaCadastro() {
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 769);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(135, 206, 250)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastrar Novo Usuario");
		lblNewLabel.setFont(new Font("Sitka Text", Font.BOLD, 30));
		lblNewLabel.setBounds(19, 88, 358, 38);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblNewLabel_1.setBounds(109, 137, 66, 26);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Sobrenome:");
		lblNewLabel_1_2.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(55, 174, 120, 26);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("CPF:");
		lblNewLabel_1_3.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblNewLabel_1_3.setBounds(129, 211, 46, 26);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("RG:");
		lblNewLabel_1_4.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblNewLabel_1_4.setBounds(139, 248, 37, 26);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Login:");
		lblNewLabel_1_5.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblNewLabel_1_5.setBounds(133, 404, 64, 25);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Senha:");
		lblNewLabel_1_6.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblNewLabel_1_6.setBounds(129, 440, 68, 26);
		contentPane.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_8 = new JLabel("Confirmar Senha:");
		lblNewLabel_1_8.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblNewLabel_1_8.setBounds(19, 477, 177, 26);
		contentPane.add(lblNewLabel_1_8);
		
		nomeTF = new JTextField();
		nomeTF.setFont(new Font("Sitka Text", Font.BOLD, 15));
		nomeTF.setBounds(179, 137, 289, 26);
		contentPane.add(nomeTF);
		nomeTF.setColumns(10);
		
		sobrenomeTF = new JTextField();
		sobrenomeTF.setFont(new Font("Sitka Text", Font.BOLD, 15));
		sobrenomeTF.setColumns(10);
		sobrenomeTF.setBounds(179, 174, 289, 26);
		contentPane.add(sobrenomeTF);
		
		cpfTF = new JTextField();
		cpfTF.setFont(new Font("Sitka Text", Font.BOLD, 15));
		cpfTF.setColumns(10);
		cpfTF.setBounds(179, 211, 289, 26);
		contentPane.add(cpfTF);
		
		rgTF = new JTextField();
		rgTF.setFont(new Font("Sitka Text", Font.BOLD, 15));
		rgTF.setColumns(10);
		rgTF.setBounds(180, 248, 289, 26);
		contentPane.add(rgTF);
		
		loginTF = new JTextField();
		loginTF.setFont(new Font("Sitka Text", Font.BOLD, 15));
		loginTF.setColumns(10);
		loginTF.setBounds(195, 404, 272, 26);
		contentPane.add(loginTF);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("res/imagemMaior.png"));
		lblNewLabel_2.setBounds(493, 63, 521, 475);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Imobili\u00E1ria Est\u00E1cio");
		lblNewLabel_2_1.setFont(new Font("Sitka Text", Font.PLAIN, 50));
		lblNewLabel_2_1.setBounds(536, 526, 444, 64);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("Dados para Login");
		lblNewLabel_3.setFont(new Font("Sitka Text", Font.BOLD, 30));
		lblNewLabel_3.setBounds(19, 350, 308, 42);
		contentPane.add(lblNewLabel_3);
		
		btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setFont(new Font("Sitka Text", Font.BOLD, 13));
		btnConfirmar.setBounds(251, 527, 104, 80);
		contentPane.add(btnConfirmar);
		
		voltarButton = new JButton("Voltar");
		voltarButton.setFont(new Font("Sitka Text", Font.BOLD, 13));
		voltarButton.setBounds(137, 527, 104, 80);
		contentPane.add(voltarButton);
		
		sairButton = new JButton("");
		sairButton.setIcon(new ImageIcon(TelaCadastro.class.getResource("/com/sun/javafx/scene/control/skin/modena/dialog-error.png")));
		sairButton.setBounds(979, 11, 35, 31);
		contentPane.add(sairButton);
		
		confirmarTF = new JPasswordField();
		confirmarTF.setFont(new Font("Sitka Text", Font.BOLD, 15));
		confirmarTF.setBounds(195, 478, 273, 26);
		contentPane.add(confirmarTF);
		
		senhaTF = new JPasswordField();
		senhaTF.setFont(new Font("Sitka Text", Font.BOLD, 15));
		senhaTF.setBounds(195, 441, 273, 26);
		contentPane.add(senhaTF);
		
		setLocationRelativeTo(null);
		setUndecorated(true);
//		setVisible(true);
	}

	public JTextField getNomeTF() {
		return nomeTF;
	}

	public void setNomeTF(JTextField nomeTF) {
		this.nomeTF = nomeTF;
	}

	public JTextField getSobrenomeTF() {
		return sobrenomeTF;
	}

	public void setSobrenomeTF(JTextField sobrenomeTF) {
		this.sobrenomeTF = sobrenomeTF;
	}

	public JTextField getCpfTF() {
		return cpfTF;
	}

	public void setCpfTF(JTextField cpfTF) {
		this.cpfTF = cpfTF;
	}

	public JTextField getRgTF() {
		return rgTF;
	}

	public void setRgTF(JTextField rgTF) {
		this.rgTF = rgTF;
	}

	public JTextField getLoginTF() {
		return loginTF;
	}

	public void setLoginTF(JTextField loginTF) {
		this.loginTF = loginTF;
	}

	public JTextField getSenhaTF() {
		return senhaTF;
	}

	public JTextField getConfirmarTF() {
		return confirmarTF;
	}
	
	public JButton getSairButton() {
		return sairButton;
	}

	public void setBtnVoltar(JButton btnVoltar) {
		this.voltarButton = btnVoltar;
	}

	public JButton getBtnConfirmar() {
		return btnConfirmar;
	}

	public void setBtnConfirmar(JButton btnConfirmar) {
		this.btnConfirmar = btnConfirmar;
	}

	public JButton getVoltarButton() {
		return voltarButton;
	}

	public void setVoltarButton(JButton voltarButton) {
		this.voltarButton = voltarButton;
	}

	public void setSairButton(JButton sairButton) {
		this.sairButton = sairButton;
	}

	public void setConfirmarTF(JPasswordField confirmarTF) {
		this.confirmarTF = confirmarTF;
	}

	public void setSenhaTF(JPasswordField senhaTF) {
		this.senhaTF = senhaTF;
	}
}
