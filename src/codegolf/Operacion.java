package codegolf;

public class Operacion {
	
	public int sumar_1(int n){
		return n+1;
	}
	
	public int multiplicar_por_2(int n) {
		return n*2;
	}
	
	public int operaciones(int n) {
		int operaciones=1;
		int comparador=1;
		while(n/comparador>1) {
			comparador = multiplicar_por_2(comparador);
			operaciones++;
		}
		while(n%comparador!=0) {
			comparador = sumar_1(comparador);
			operaciones++;
		}
		return operaciones;
	}
}
