package br.com.imobiliariaestacio.view;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

import com.sun.media.jfxmedia.events.NewFrameEvent;

public class Mensagem extends JOptionPane{

	public static boolean mensagemSair() {


		if (showConfirmDialog(null, "Deseja sair?", "Sair", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
			return true;
		return false;
	}
	
	public static void mensagemInserida(String a, int i) {
		if (i == 1) { //ERROR
			showMessageDialog(null, a, "erro", ERROR_MESSAGE);
		}
		if (i==2) {
			
			showMessageDialog(null, a);
		}
	}
	
}
