
import java.util.Scanner;
 class Main {
	public static double Area (double Base, double Altura) {
		return Base * Altura;
	}
	 public static double Perimetro (double Base, double Altura) {
		 return 2*Base + 2*Altura;
	 }
	 
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in); 
		
		System.out.println("Informe a base: ");
		double Base = sc.nextDouble();
		System.out.println("Informe a altura: ");
		double Altura = sc.nextDouble();
		sc.close();
		
		double vlarea = Area (Base, Altura);
		double vlperimetro = Perimetro (Base, Altura);
		
		System.out.println("Area: " + vlarea);
		System.out.println("Perimetro: "+ vlperimetro);
		

		

	}

}