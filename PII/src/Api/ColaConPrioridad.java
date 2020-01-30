package Api;

public interface ColaConPrioridad {
	void InicializarCola();
	void AcolarPrioridad(int x, int y);
	void Desacolar();
	int Primero();
	int Prioridad();
	boolean ColaVacia();
}
