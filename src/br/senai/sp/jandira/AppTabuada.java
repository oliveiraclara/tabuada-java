package br.senai.sp.jandira;

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

	}

}