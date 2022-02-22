package br_com_projeto_atv1;

import java.util.Random;

public class Materia {
	
	private String nome;
	private String nomes;
	public String getNomes() {
		return nomes;
	}



	public void setNomes(String nomes) {
		this.nomes = nomes;
	}

	private int codigomateria;
	Random     n1 = new Random();
	
		public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
		
	}



	public int getCodigo() {
		return codigomateria = n1.nextInt(999999);
	}



	public void setCodigo(int codigomateria) {
		this.codigomateria = codigomateria;
	}
	
	public void Printar() {
		System.out.println("");
	}
	

	}


