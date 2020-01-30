package Api;

/* 
 *  1. Inicializadas
 *  2. no debe estar vacio
 */ 

public interface ConjuntoTDA {
	void InicializarConjunto();
	void Agregar(int x); // 1
	void Sacar(int x); // 1
	int Elegir(); // 2
	boolean ConjuntoVacio(); // 1
	boolean Pertenece(int x); // 1

}
