package MisImplementaciones.Estaticas;

import Api.ColaTDA;

public class Cola implements ColaTDA {
	
	int vector[];
	int tam;

	public void inicializarCola() {
		vector = new int[100];
		tam = 0;
	}

	public void acolar(int x) {
		vector[tam]=x;
		tam++;
		
	}

	public void desacolar() {
		for(int i=0; i< tam-1;i++)
			vector[i] = vector[i+1];
		tam--;
	}

	public int primero() {
		return vector[0];
	}

	public boolean ColaVacia() {
		return false;
	}

}
