package Aplicacao;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Programa extends JFrame {

	private static final long serialVersionUID = 1L;

	ImageIcon iconeBackground = new ImageIcon(getClass().getResource("/Icones/Background.jpg"));
	ImageIcon iconeFogueteGif = new ImageIcon(getClass().getResource("/Icones/foguete.gif"));

	JLabel lblBackground = new JLabel(iconeBackground);
	JLabel lblFoguete = new JLabel(iconeFogueteGif);

	int posicaoFogueteX = 300;
	int posicaoFogueteY = 300;
	
	MouseEvent eventoMouse;

	public Programa() {
		editarJanela();
		editarComponentes();
		adicionarMovimento();
	}

	private void adicionarMovimento() {
		// TODO Escutar o Teclado.
		addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {

			}

			@Override
			public void keyReleased(KeyEvent e) {
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == 38) {
					posicaoFogueteY -= 10;
				}
				if (e.getKeyCode() == 40) {
					posicaoFogueteY += 10;
				}
				if (e.getKeyCode() == 37) {
					posicaoFogueteX -= 10;
				}
				if (e.getKeyCode() == 39) {
					posicaoFogueteX += 10;
				}
				lblFoguete.setBounds(posicaoFogueteX, posicaoFogueteY, 103, 202);
			}
		});
	}

	private void editarComponentes() {
		lblBackground.setBounds(0, 0, 800, 700);
		lblFoguete.setBounds(posicaoFogueteX, posicaoFogueteY, 103, 202);
	}

	private void editarJanela() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Testando Propriedades do Teclado.");
		setSize(800, 700);
		setLocationRelativeTo(null);
		setVisible(true);
		setLayout(null);
		setResizable(false);
		add(lblFoguete);
		add(lblBackground);
	}

	public static void main(String[] args) {
		new Programa();
	}

}