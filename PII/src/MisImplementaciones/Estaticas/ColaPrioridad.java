package MisImplementaciones.Estaticas;

import Api.ColaConPrioridad;

public class ColaPrioridad implements ColaConPrioridad {
	
	class info{
		int prioridad;
		int d;
	}
	
	info vector[]; 
	int tam;
	
	public void InicializarCola() {
		vector = new info[100];
		tam=0;
	}

	public void AcolarPrioridad(int x, int y) {
		int pos = tam-1;	
		if (!this.ColaVacia()) 
			{
				while(pos >=0 && y < vector[pos].prioridad) 
					pos--;			

			if (pos == tam-1) // el nuevo elemento tiene una prioridad mayor por lo tanto se inserta en la posicion tam
			{
				vector[tam] = new info();
				vector[tam].prioridad = y;
				vector[tam].d = x;
				tam++;
			}
			
			else if (pos == -1) // en el caso que no haya ninguna prioridad menor hay que insertarlo en la primera posicion [0] 
			{
				
				int i = tam;

				
				while (i>0)
				{
					vector[i]=vector[i-1]; 
					i--;
				}
				
				vector[i] = new info();
				vector[i].prioridad = y;
				vector[i].d = x;	
				tam++;
			}
			else 
			{

				int i = tam;
				while (i > pos)
				{
					vector[i]=vector[i-1]; 
					i--;
				}
				
				vector[i] = new info();
				vector[i].prioridad = y;
				vector[i].d = x;	
				tam++;

			}
			
		}	
		
		else 
		
			{
				vector[tam] = new info();
				vector[tam].prioridad = y;
				vector[tam].d = x;
				tam++;
			
			}
		
	}
	
	public void Desacolar() {
		tam--;
	}

	public int Primero() {
		return vector[tam-1].d;
	}

	public int Prioridad() {
		return vector[tam-1].prioridad;
	}

	public boolean ColaVacia() {
		return tam==0;
	}

}
