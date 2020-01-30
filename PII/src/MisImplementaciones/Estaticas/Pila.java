package MisImplementaciones.Estaticas;

import Api.pilaTDA;

public class Pila implements pilaTDA {

	int [] vector;
	int tam;
	
	public void InicializarPila() {
		vector = new int[100];
		tam = 0;
	}

	public void Apilar(int x) {
		vector[tam] = x;
		tam++;

	}

	public void Desapilar() {
		tam--;
	}

	public int Tope() {
		return vector[tam-1];
	}

	public boolean PilaVacia() {
		return tam==0;
	}

}
