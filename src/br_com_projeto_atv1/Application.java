package br_com_projeto_atv1;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
	Professor primeiro = new Professor();
	Professor segundo = new Professor();
	Professor numeroIns = new Professor();
	Professor segundamateria = new Professor();
	Professor primeiromateria = new Professor();
	primeiromateria.getMateria().getNome(); // Get Matéria From Class Professor
	segundamateria.getMateria().getNome();
		
	Scanner scan = new Scanner(System.in);
	
	// First Turn
	
	System.out.println("--------------------------------------------------------------");
	System.out.println(" Nome do Professor? ");
	System.out.println("--------------------------------------------------------------");
	
	// Get a name from keypad
	primeiro.setNome(scan.nextLine());
	
	System.out.println("--------------------------------------------------------------");
	System.out.println(" Nome da Matéria? ");
	System.out.println("--------------------------------------------------------------");
	// Get a content from keypad
	primeiromateria.getMateria().setNome(scan.nextLine());
	
	// Show the informations
	System.out.println("O nome do Primeiro Professor é " + primeiro.getNome() + " e o Numero de Inscrição: " + numeroIns.getCodigo());
	System.out.println("--------------------------------------------------------------");
	System.out.println("O nome da Primeira MAtéria é " + primeiromateria.getMateria().getNome() + " e o Codigo: " + primeiromateria.getMateria().getCodigo());

	// End First Turn
	
	// Second Turn
	
	System.out.println("--------------------------------------------------------------");
	System.out.println(" Nome do Professor? ");
	System.out.println("--------------------------------------------------------------");
	
	// Get a name from keypad
	segundo.setNomes(scan.nextLine());
	
	System.out.println("--------------------------------------------------------------");
	System.out.println(" Nome da Matéria? ");
	System.out.println("--------------------------------------------------------------");
	// Get a content from keypad
	segundamateria.getMateria().setNomes(scan.nextLine());
	
	//Show the Information
	
	System.out.println("O nome do Segundo Professor é " + segundo.getNomes() + " e o Numero de Inscrição: " + numeroIns.getCodigo());
	System.out.println("--------------------------------------------------------------");
	System.out.println("O nome da Segunda Matéria é " + segundamateria.getMateria().getNomes() + " e o Codigo: " + segundamateria.getMateria().getCodigo());
	System.out.println("--------------------------------------------------------------");
	// Finish
	
	System.out.println(segundo.getNomes());
	System.out.println("--------------------------------------------------------------");
	System.out.println(primeiro.getNome());
	}

}
