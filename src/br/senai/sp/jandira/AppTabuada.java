package br.senai.sp.jandira;

import java.awt.Color;
import java.awt.Font;

import br.senai.sp.jandira.gui.FrameTabuada;
import br.senai.sp.jandira.model.Tabuada;

public class AppTabuada {

	public static void main(String[] args) {

		FrameTabuada tela = new FrameTabuada();
		tela.titulo = "Tabuada";
		tela.largura = 405;
		tela.altura = 550;
		tela.corDeFundo = new Color (255, 255, 255);
		tela.fonteDosLabels = new Font ("Bahnschrift", Font.BOLD, 14);
		tela.fonteDoTitulo = new Font ("Bahnschrift", Font.BOLD, 20);
		tela.fonteDoSubtitulo = new Font ("Bahnschrift", Font.BOLD, 16);
		tela.corDoButton = new Color (60, 240, 87);
		tela.corButton = new Color (255, 107, 9);
		tela.corTitulo = new Color (163, 73, 164);
		tela.corSubtitulo = new Color (112, 146, 190);
		tela.criarTela();

	}

}