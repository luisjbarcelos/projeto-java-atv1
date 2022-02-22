package br_com_projeto_atv1;

import java.util.Random;

public class Professor {
	private String nome;
	private String nomes;
	
	public String getNomes() {
		return nomes;
	}
	public void setNomes(String nomes) {
		this.nomes = nomes;
	}
	private Integer codigo;
	private int idade;
	private Materia materia;
	Random     n1 = new Random();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getCodigo() {
		return codigo = n1.nextInt(999999);
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Professor(){
		
		this.materia = new Materia();
	}
	
	public Materia getMateria() {
		return materia;
	}
	public void setMateria(Materia materia) {
		this.materia = materia;
	}
	
	

}
