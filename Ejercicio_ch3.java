package ejercicios;

public class Ejercicio_ch3 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		suma(5,7,8);
		System.out.println(suma(5,7,8));
		Coche micoche = new Coche();
		aumentar_puertas(1);.
		//no he conseguido definir la función.
		
	}
	public static int suma (int a, int b, int c) {
		int resultado = a + b + c;
		return resultado;
		
	}
	
	public class Coche{
		int puertas=2;
		public void aumentar_puertas(int n) {
			puertas=puertas+n;
		}
	}

}
