package br.com.calcmoney;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmCreditos extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmCreditos frame = new frmCreditos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmCreditos() {
		setBorder(null);
		setTitle("Cr\u00E9ditos");
		setFrameIcon(null);
		setBounds(0, 41, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblCreditos = new JLabel("Cr\u00E9ditos");
		lblCreditos.setFont(new Font("Arial", Font.BOLD, 20));
		lblCreditos.setBounds(185, 11, 80, 24);
		getContentPane().add(lblCreditos);
		
		JLabel lblInfo = new JLabel("<html>\r\n\t<center>\r\n\tEste projeto foi desenvolvido por<br>\r\n\t<i>Gustavo Herrero Nunes</i>, atual (2020)<br>\r\n\testudante de Desenvolvimento de Sistemas pela<br>\r\n\tEtec Zona Leste\r\n\t<center>\r\n</html>");
		lblInfo.setFont(new Font("Arial", Font.PLAIN, 17));
		lblInfo.setBounds(51, 71, 348, 109);
		getContentPane().add(lblInfo);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnVoltar.setFont(new Font("Arial", Font.PLAIN, 15));
		btnVoltar.setBounds(177, 217, 96, 38);
		getContentPane().add(btnVoltar);

	}
}
