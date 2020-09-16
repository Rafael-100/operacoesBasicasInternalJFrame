package br.com.calcmoney.operacoes;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class frmDividir extends JInternalFrame {
	private JTextField txbVal1;
	private JTextField txbVal2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmDividir frame = new frmDividir();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public String dividir(double val1, double val2) {
		return Double.toString(val1 / val2);
	}

	/**
	 * Create the frame.
	 */
	public frmDividir() {
		setBorder(null);
		setFrameIcon(null);
		setTitle("Dividir");
		setBounds(0, 41, 450, 300);
		
		JLabel lblTitulo = new JLabel("\\ Dividir /");
		lblTitulo.setBounds(179, 11, 85, 24);
		lblTitulo.setFont(new Font("Arial", Font.BOLD, 20));
		
		JLabel lbSolicitacao = new JLabel("Digite os n\u00FAmeros que deseja dividir");
		lbSolicitacao.setBounds(104, 68, 235, 18);
		lbSolicitacao.setFont(new Font("Arial", Font.PLAIN, 15));
		
		txbVal1 = new JTextField();
		txbVal1.setHorizontalAlignment(SwingConstants.CENTER);
		txbVal1.setBounds(102, 109, 58, 38);
		txbVal1.setFont(new Font("Verdana", Font.PLAIN, 20));
		txbVal1.setColumns(10);
		
		txbVal2 = new JTextField();
		txbVal2.setHorizontalAlignment(SwingConstants.CENTER);
		txbVal2.setBounds(284, 109, 58, 38);
		txbVal2.setFont(new Font("Verdana", Font.PLAIN, 20));
		txbVal2.setColumns(10);
		
		JLabel lblOperacao = new JLabel("/");
		lblOperacao.setBounds(216, 125, 12, 18);
		lblOperacao.setFont(new Font("Arial", Font.BOLD, 20));
		getContentPane().setLayout(null);
		getContentPane().add(lblTitulo);
		getContentPane().add(lbSolicitacao);
		getContentPane().add(txbVal1);
		getContentPane().add(txbVal2);
		getContentPane().add(lblOperacao);
		
		JLabel lblResult = new JLabel("");
		lblResult.setHorizontalAlignment(SwingConstants.CENTER);
		lblResult.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblResult.setBounds(174, 228, 96, 31);
		getContentPane().add(lblResult);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double val1 = Double.parseDouble(txbVal1.getText()),
					   val2 = Double.parseDouble(txbVal2.getText());
				
				lblResult.setText(dividir(val1, val2));
			}
		});
		btnCalcular.setFont(new Font("Arial", Font.PLAIN, 15));
		btnCalcular.setBounds(258, 172, 96, 38);
		getContentPane().add(btnCalcular);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnVoltar.setFont(new Font("Arial", Font.PLAIN, 15));
		btnVoltar.setBounds(94, 172, 96, 38);
		getContentPane().add(btnVoltar);

	}
}
