package Api;
/* 
 *  1. Inicializadas
 *  2. no debe estar vacia
 */ 

public interface pilaTDA {
	void InicializarPila();   
	void Apilar(int x); // 1
	void Desapilar();  // 2
	int Tope();  // 2 
	boolean PilaVacia(); // 1
}
