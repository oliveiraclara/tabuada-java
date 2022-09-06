package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameTabuada {
	
	public String titulo;
	public int largura;
	public int altura;
	public Color corDeFundo;
	public Font fonteDosLabels;
	public Color corDoButton;
	
	public void criarTela() {
		
		JFrame tela = new JFrame();
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		
		Container painel = tela.getContentPane();
		painel.setBackground(corDeFundo);
		
		JLabel labelTitulo = new JLabel();
		labelTitulo.setText("Tabuada");
		labelTitulo.setBounds(30, 30, 250, 90);
		painel.add(labelTitulo);
		labelTitulo.setFont(fonteDosLabels);
		labelTitulo.setForeground(corDeFundo);
		
		tela.setVisible(true);
		
		
	}

}
