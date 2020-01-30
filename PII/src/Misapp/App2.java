package Misapp;

import Api.pilaTDA;
import Api.ColaConPrioridad;
import Api.ColaTDA;
import MisImplementaciones.Estaticas.*;
public class App2 {

	public static void main(String[] args) {
		ej2();
	}
	
	public static void ej1() 
	{
		// TODO Auto-generated method stub
		pilaTDA A = new Pila();
		A.InicializarPila();
		A.Apilar(1);
		A.Apilar(3);
		A.Apilar(2);
		while (!A.PilaVacia()) {
			System.out.println(A.Tope());
			A.Desapilar();
		}
	}
	
	public static void ej2()
	{
		ColaConPrioridad A = new ColaPrioridad();
		A.InicializarCola();
		A.AcolarPrioridad(1, 1);
		A.AcolarPrioridad(2, 2);
		A.AcolarPrioridad(3, 11);
		A.AcolarPrioridad(5, 5);
		A.AcolarPrioridad(1, 3);
		A.AcolarPrioridad(2, 6);
		A.AcolarPrioridad(10, 10);

		
		while (!A.ColaVacia()) {
			System.out.println(A.Primero() + " " +  A.Prioridad());
			A.Desacolar();

		}
	}
	

}
