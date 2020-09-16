package br.com.calcmoney;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Component;
import javax.swing.Box;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import br.com.calcmoney.operacoes.*;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class frmMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmMenu frame = new frmMenu();
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
	public frmMenu() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\pclgf\\Desktop\\Arquivos\\Java_Programns\\calculosMenu\\assets\\img\\logo.png"));
		setResizable(false);
		setTitle("Calc Money - Opera\u00E7\u00F5es");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 462, 390);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		getContentPane().add(panel);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelFrms = new JPanel();
		panelFrms.setBounds(0, 21, 456, 350);
		contentPane.add(panelFrms);
		panelFrms.setLayout(null);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBorder(null);
		toolBar.setBackground(Color.LIGHT_GRAY);
		toolBar.setBounds(0, 0, 456, 41);
		panelFrms.add(toolBar);
		
		Component space1 = Box.createHorizontalStrut(20);
		toolBar.add(space1);
		
		JButton btnSomar = new JButton("");
		btnSomar.setBorder(null);
		btnSomar.setIcon(new ImageIcon("C:\\Users\\pclgf\\Desktop\\Arquivos\\Java_Programns\\calculosMenu\\assets\\img\\somar1.png"));
		btnSomar.setBackground(Color.LIGHT_GRAY);
		btnSomar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmSomar frmOp = new frmSomar();
				frmOp.setVisible(true);
				panelFrms.add(frmOp);
			}
		});
		toolBar.add(btnSomar);
		
		Component space2 = Box.createHorizontalStrut(20);
		toolBar.add(space2);
		
		JButton btnSubtrair = new JButton("");
		btnSubtrair.setBorder(null);
		btnSubtrair.setIcon(new ImageIcon("C:\\Users\\pclgf\\Desktop\\Arquivos\\Java_Programns\\calculosMenu\\assets\\img\\subtrair.png"));
		btnSubtrair.setBackground(Color.LIGHT_GRAY);
		btnSubtrair.addActionListener(new ActionListener() {
			public void  actionPerformed(ActionEvent e) {
				frmSubtrair frmOp = new frmSubtrair();
				frmOp.setVisible(true);
				panelFrms.add(frmOp);
			}
		});
		toolBar.add(btnSubtrair);
		
		Component space3 = Box.createHorizontalStrut(20);
		toolBar.add(space3);
		
		JButton btnMultiplicar = new JButton("");
		btnMultiplicar.setBorder(null);
		btnMultiplicar.setIcon(new ImageIcon("C:\\Users\\pclgf\\Desktop\\Arquivos\\Java_Programns\\calculosMenu\\assets\\img\\multiplicar.png"));
		btnMultiplicar.setBackground(Color.LIGHT_GRAY);
		btnMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMultiplicar frmOp = new frmMultiplicar();
				frmOp.setVisible(true);
				panelFrms.add(frmOp);
			}
		});
		toolBar.add(btnMultiplicar);
		
		Component space4 = Box.createHorizontalStrut(20);
		toolBar.add(space4);
		
		JButton btnDividir = new JButton("");
		btnDividir.setBorder(null);
		btnDividir.setIcon(new ImageIcon("C:\\Users\\pclgf\\Desktop\\Arquivos\\Java_Programns\\calculosMenu\\assets\\img\\dividir.png"));
		btnDividir.setBackground(Color.LIGHT_GRAY);
		btnDividir.addActionListener(new ActionListener() {
			public void  actionPerformed(ActionEvent e) {
				frmDividir frmOp = new frmDividir();
				frmOp.setVisible(true);
				panelFrms.add(frmOp);
			}
		});
		toolBar.add(btnDividir);
		
		Component space5 = Box.createHorizontalStrut(20);
		toolBar.add(space5);
		
		JButton btnSair = new JButton("");
		btnSair.setBorder(null);
		btnSair.setIcon(new ImageIcon("C:\\Users\\pclgf\\Desktop\\Arquivos\\Java_Programns\\calculosMenu\\assets\\img\\sair1.png"));
		btnSair.setBackground(Color.LIGHT_GRAY);
		btnSair.addActionListener(new ActionListener() {
			public void  actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		toolBar.add(btnSair);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 494, 22);
		contentPane.add(menuBar);
		
		JMenu mnOperacoes = new JMenu("Opera\u00E7\u00F5es");
		menuBar.add(mnOperacoes);
		
		JMenuItem mntmOpSomar = new JMenuItem("Somar");
		mntmOpSomar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmSomar frmOp = new frmSomar();
				frmOp.setVisible(true);
				panelFrms.add(frmOp);
			}
		});
		mnOperacoes.add(mntmOpSomar);
		
		JMenuItem mntmOpSubtrair = new JMenuItem("Subtrair");
		mntmOpSubtrair.addActionListener(new ActionListener() {
			public void  actionPerformed(ActionEvent e) {
				frmSubtrair frmOp = new frmSubtrair();
				frmOp.setVisible(true);
				panelFrms.add(frmOp);
			}
		});
		mnOperacoes.add(mntmOpSubtrair);
		
		JMenuItem mntmOpMultiplicar = new JMenuItem("Multiplicar");
		mntmOpMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMultiplicar frmOp = new frmMultiplicar();
				frmOp.setVisible(true);
				panelFrms.add(frmOp);
			}
		});
		mnOperacoes.add(mntmOpMultiplicar);
		
		JMenuItem mntmOpDividir = new JMenuItem("Dividir");
		mntmOpDividir.addActionListener(new ActionListener() {
			public void  actionPerformed(ActionEvent e) {
				frmDividir frmOp = new frmDividir();
				frmOp.setVisible(true);
				panelFrms.add(frmOp);
			}
		});
		mnOperacoes.add(mntmOpDividir);
		
		JMenu mnSobre = new JMenu("Sobre");
		menuBar.add(mnSobre);
		
		JMenuItem mntmCreditos = new JMenuItem("Cr\u00E9ditos");
		mntmCreditos.addActionListener(new ActionListener() {
			public void  actionPerformed(ActionEvent e) {
				frmCreditos frmSobre = new frmCreditos();
				frmSobre.setVisible(true);
				panelFrms.add(frmSobre);
			}
		});
		mnSobre.add(mntmCreditos);
		
		JMenu mnSair = new JMenu("Sair");
		menuBar.add(mnSair);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.addActionListener(new ActionListener() {
			public void  actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnSair.add(mntmSair);
		
		
		
		
		
	}
}
