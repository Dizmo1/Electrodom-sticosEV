package com.cursoceat.controller;
import java.util.Scanner;

import com.cursoceat.model.Lavadora;



public class Controller {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Indica el tipo de electrodoméstico");
		String tipo=entrada.nextLine();
	    System.out.println("Indica la marca: ");
	    String marca=entrada.nextLine();
	    System.out.println("Indica la potencia en kw: ");
	    double potencia=entrada.nextDouble();
	    System.out.println("Indica el precio: ");
	    double precio=entrada.nextDouble();
	    boolean aguaCaliente=false;
	    System.out.println("Indica las horas de funcionamiento: ");
	    int horas=entrada.nextInt();
	    final double  COSTEHORA=0.132;
	    Lavadora miLavadora=new Lavadora(marca, precio, potencia, aguaCaliente);
	    System.out.println("Consumo por horas:"+ miLavadora.getConsumo(horas));
	    System.out.println("Coste por horas:"+ miLavadora.getCosteConsumo(horas, COSTEHORA));
	    System.out.println(miLavadora.toString());
	    
	    
        
	}

}
