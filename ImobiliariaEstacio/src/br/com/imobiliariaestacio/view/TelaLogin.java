package br.com.imobiliariaestacio.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.MatteBorder;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField loginTF;
	private JButton entrarButton;
	private JButton cadastrarButton;
	private JButton sairButton;
	private JPasswordField senhaField;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;

	public TelaLogin() {
		setResizable(false);
		setTitle("ImobiliariaEst\u00E1cio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(135, 206, 235)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login:");
		lblNewLabel.setFont(new Font("Sitka Text", Font.BOLD, 30));
		lblNewLabel.setBounds(467, 494, 109, 39);
		contentPane.add(lblNewLabel);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Sitka Text", Font.BOLD, 30));
		lblSenha.setBounds(467, 580, 109, 39);
		contentPane.add(lblSenha);
		
		loginTF = new JTextField();
		loginTF.setFont(new Font("Sitka Text", Font.BOLD, 30));
		loginTF.setToolTipText("Digite o login");
		loginTF.setBounds(332, 542, 377, 39);
		contentPane.add(loginTF);
		loginTF.setColumns(10);
		
		entrarButton = new JButton("Entrar");
		entrarButton.setFont(new Font("Sitka Text", Font.BOLD, 13));
		entrarButton.setBounds(739, 576, 97, 80);
		contentPane.add(entrarButton);
		
		cadastrarButton = new JButton("Cadastrar");
		cadastrarButton.setFont(new Font("Sitka Text", Font.BOLD, 13));
		cadastrarButton.setBounds(853, 576, 97, 80);
		contentPane.add(cadastrarButton);
		
		sairButton = new JButton("");
		sairButton.setIcon(new ImageIcon(TelaLogin.class.getResource("/com/sun/javafx/scene/control/skin/modena/dialog-error.png")));
		sairButton.setBounds(977, 13, 35, 31);
		contentPane.add(sairButton);
		
		senhaField = new JPasswordField();
		senhaField.setFont(new Font("Sitka Text", Font.BOLD, 30));
		senhaField.setBounds(332, 617, 377, 39);
		contentPane.add(senhaField);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("res/imagemMaior.png"));
		lblNewLabel_1.setBounds(251, 13, 543, 415);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Imobili\u00E1ria Est\u00E1cio");
		lblNewLabel_2.setFont(new Font("Sitka Text", Font.PLAIN, 70));
		lblNewLabel_2.setBounds(212, 417, 631, 88);
		contentPane.add(lblNewLabel_2);
		setLocationRelativeTo(null);
		setUndecorated(true);
		setVisible(true);
	}

	public JTextField getLoginTF() {
		return loginTF;
	}

	public void setLoginTF(JTextField loginTF) {
		this.loginTF = loginTF;
	}

	public JButton getEntrarButton() {
		return entrarButton;
	}

	public void setEntrarButton(JButton entrarButton) {
		this.entrarButton = entrarButton;
	}

	public JButton getCadastrarButton() {
		return cadastrarButton;
	}

	public void setCadastrarButton(JButton cadastrarButton) {
		this.cadastrarButton = cadastrarButton;
	}

	public JButton getSairButton() {
		return sairButton;
	}

	public void setSairButton(JButton sairButton) {
		this.sairButton = sairButton;
	}

	public JPasswordField getSenhaField() {
		return senhaField;
	}

	public void setSenhaField(JPasswordField senhaField) {
		this.senhaField = senhaField;
	}
	
	
}
