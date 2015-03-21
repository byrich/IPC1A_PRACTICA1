import java.util.Scanner;


public class cuatro {

	static void shi() {
		float x=0;
		String res;
		Scanner so= new Scanner(System.in);
		System.out.println("que figura desea operar?");
		System.out.println("");
		System.out.println("'C' para circulo");
		System.out.println("'U' para cuadrado");
		System.out.println("'T' para tiangulo");
		res=so.next();
		switch (res){
		case "c":
			System.out.println("CIRCULO");
			System.out.println("ingrese radio: ");
			x=so.nextFloat();
			System.out.println("area: " + (3.1416*x*x));
			System.out.println("perimetro: " + (3.1416*2*x));
			break;
		case "u":
			System.out.println("CUADRADO");
			System.out.println("ingrese lado: ");
			x=so.nextFloat();
			System.out.println("area: " + (x*x));
			System.out.println("perimetro: " + (4*x));
			break;
		case "t":
			System.out.println("TRIANGULO");
			System.out.println("ingrese lado: ");
			x=so.nextFloat();
			System.out.println("altura: " + (x*0.866));
			System.out.println("area: " + ((x*x*0.866))/2);
			System.out.println("perimetro: " + (3*x));
			
			break;
			default:
			System.out.println("");
				break;
		}
		pregunta.bankai();
	}

}
