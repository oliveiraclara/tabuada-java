package br.senai.sp.jandira;

import java.awt.Color;
import java.awt.Font;

import br.senai.sp.jandira.gui.FrameTabuada;
import br.senai.sp.jandira.model.Tabuada;

public class AppTabuada {

	public static void main(String[] args) {

		Tabuada tabuada = new Tabuada();
		tabuada.multiplicando = 139;
 		tabuada.minimoMultiplicador = 120;
		tabuada.maximoMultiplicador = 1000;

		String[] resultado = tabuada.getTabuada();

		int contador = 0;
		
		while (contador < resultado.length) {
			System.out.println(resultado[contador]);
			contador++;
		}
		
		FrameTabuada tela = new FrameTabuada();
		tela.titulo = "Tabuada";
		tela.largura = 405;
		tela.altura = 550;
		tela.corDeFundo = new Color (250, 250, 250);
		tela.fonteDosLabels = new Font ("BankGothic Md BT", Font.ITALIC, 20);
		tela.corDoButton = new Color (255, 165, 0);
		
		tela.criarTela();

	}

}