package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import br.senai.sp.jandira.model.Tabuada;

public class FrameTabuada {
	
	public String titulo;
	public int largura;
	public int altura;
	public Color corDeFundo;
	public Font fonteDosLabels;
	public Color corDoButton;
	public Color corButton;
	public Font fonteDoTitulo;
	public Font fonteDoSubtitulo;
	
	public void criarTela() {
		
		JFrame tela = new JFrame();
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		
		
		Container painel = tela.getContentPane();
		painel.setBackground(corDeFundo);
		
		ImageIcon imagens = new ImageIcon(getClass().getResource("calculadora-icon.png"));
		JLabel labelimagens = new JLabel(imagens);
		//labelimagens.setBounds(10, 30, 80, 80);
		
		Image icon = new ImageIcon(this.getClass().getResource("calculadora-icon.png")).getImage();
		//painel.add(labelimagens);
		tela.setIconImage(icon);
		
		JLabel labelTitulo = new JLabel();
		labelTitulo.setText("Tabuada");
		labelTitulo.setBounds(30, 30, 250, 30);
		labelTitulo.setFont(fonteDoTitulo);
		
		JLabel labelSubtitulo = new JLabel();
		labelSubtitulo.setText("Com essa tabuada seus problemas acabaram!!");
		labelSubtitulo.setBounds(15, 60, 600, 30);
		labelSubtitulo.setFont(fonteDoSubtitulo);
		
		JLabel labelSubtitulo2 = new JLabel();
		labelSubtitulo2.setText("Calcule a tabuada que desejar em segundos.");
		labelSubtitulo2.setBounds(15, 75, 600, 30);
		labelSubtitulo2.setFont(fonteDoSubtitulo);
		
		
		JLabel labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando:");
		labelMultiplicando.setBounds(80, 150, 250, 30);
		labelMultiplicando.setFont(fonteDosLabels);
		
		JTextField textMultiplicando = new JTextField();
		textMultiplicando.setBounds(200, 150, 150, 30);
		
		JLabel labelMinimoMultiplicador = new JLabel();
		labelMinimoMultiplicador.setText("Mínimo Multiplicador:");
		labelMinimoMultiplicador.setBounds(30, 200, 250, 30);
		labelMinimoMultiplicador.setFont(fonteDosLabels);
		
		JTextField textMinimoMultiplicador = new JTextField();
		textMinimoMultiplicador.setBounds(200, 200, 150, 30);
		
		JLabel labelMaximoMultiplicador = new JLabel();
		labelMaximoMultiplicador.setText("Máximo Multiplicador:");
		labelMaximoMultiplicador.setBounds(30, 250, 250, 30);
		labelMaximoMultiplicador.setFont(fonteDosLabels);
		
		JTextField textMaximoMultiplicador = new JTextField();
		textMaximoMultiplicador.setBounds(200, 250, 150, 30);
		
		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(30, 300, 150, 30);
		buttonCalcular.setBackground(corDoButton);
		
		JButton buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBounds(200, 300, 150, 30);
		buttonLimpar.setBackground(corButton);
		
		JList<String> listResultados = new JList<String>();
		JScrollPane scroll =  new JScrollPane(listResultados);
		
		scroll.setBounds(30, 350, 320, 140);
		painel.add(scroll);
		
		buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Tabuada tabuada = new Tabuada();
				
				if(textMaximoMultiplicador.getText().isEmpty() || textMinimoMultiplicador.getText().isEmpty() || textMultiplicando.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Todos os valores são obrigatórios!");
				} else if (Integer.parseInt(textMaximoMultiplicador.getText()) < Integer.parseInt(textMinimoMultiplicador.getText())) {
					JOptionPane.showMessageDialog(null, "O máximo multiplicador deve ser maior do que o mínimo multiplicador!");
				}else {
					tabuada.multiplicando = Integer.parseInt(textMultiplicando.getText());
					tabuada.minimoMultiplicador = Integer.parseInt(textMinimoMultiplicador.getText());
					tabuada.maximoMultiplicador = Integer.parseInt(textMaximoMultiplicador.getText());
					String[] resultados = tabuada.getTabuada();
					listResultados.setListData(resultados);
					scroll.setVisible(true);
				}

				
			}
		});
		
		buttonLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				textMultiplicando.setText("");
				textMinimoMultiplicador.setText("");
				textMaximoMultiplicador.setText("");
				scroll.setVisible(false);
				
			}
		});
		
		painel.add(labelTitulo);
		painel.add(labelSubtitulo);
		painel.add(labelSubtitulo2);
		painel.add(labelMultiplicando);
		painel.add(textMultiplicando);
		painel.add(labelMinimoMultiplicador);
		painel.add(textMinimoMultiplicador);
		painel.add(labelMaximoMultiplicador);
		painel.add(textMaximoMultiplicador);
		painel.add(scroll);
		painel.add(buttonCalcular);
		painel.add(buttonLimpar);
		
		tela.setVisible(true);
		
		
		
	}

}
