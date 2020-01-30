package MisImplementaciones.Estaticas;

import Api.ConjuntoTDA;

public class Conjunto implements ConjuntoTDA {
	int vector[];
	int tam;
	int pertenece_pos;
	
	public void InicializarConjunto() {
	
	vector = new int[100];
	tam=0;
	}

	public void Agregar(int x) {
		
		if(!this.Pertenece(x)) {
			vector[tam] = x;
			tam++;
		}
		
		
	}

	public void Sacar(int x) {
		if (this.Pertenece(x)) {
			vector[pertenece_pos]=vector[tam];
			tam--;
		}
	}

	public int Elegir() {
		return vector[tam-1];
	}

	public boolean ConjuntoVacio() {
		return tam==0;
	}

	public boolean Pertenece(int x) {
		boolean per = false;
		for(int i=0;i<(tam-1) && per==false;i++){
			if (vector[i]==x) {
				per=true;
				pertenece_pos=i;
			}
		}
		return per;
	}

}
