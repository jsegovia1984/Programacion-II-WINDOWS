package Misherramientas;

import Api.pilaTDA;
import MisImplementaciones.Estaticas.Pila;

public class Tp1{
	public void pasarPilaPila(pilaTDA d, pilaTDA o) {
		while(!o.PilaVacia()) {
			d.Apilar(o.Tope());
			o.Desapilar();
		}
	}
	
	public void copiarPilaPila(pilaTDA d, pilaTDA o) {
		pilaTDA aux;
		aux = new Pila();
		aux.InicializarPila();
		this.pasarPilaPila(aux, o);
		while(!aux.PilaVacia()) {
			d.Apilar(aux.Tope());
			o.Apilar(aux.Tope());
			aux.Desapilar();
		}
	}

}
