package ejercicios;

public class Ejercicio_ch3 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		suma(5,7,8);
		System.out.println(suma(5,7,8));
		Coche micoche = new Coche();
		micoche.aumentar_puertas(1);
		System.out.println(micoche.puertas);		
	}
	
	public static int suma (int a, int b, int c) {
		int resultado = a + b + c;
		return resultado;
		
	}
	
	public static class Coche{
		int puertas=2;
		public void aumentar_puertas(int n) {
			puertas=puertas+n;
		}
	}

}
