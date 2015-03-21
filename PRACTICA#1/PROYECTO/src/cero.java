import java.util.Scanner;


public class cero {
	static void uno() {
		int si=0;
		Scanner cla= new Scanner(System.in);
		
		System.out.println("----PRACTICA #1----");
		System.out.println("");
		System.out.println("                               MENU");
		System.out.println("");
		System.out.println("Ejercicios de nivel 1:                     Ejercicios de nivel 2");
		System.out.println("");
		System.out.println("1)Figura                                   6)Calculadora simple");
		System.out.println("2)Puntuacion                               7)Tablas de multiplicar del 1 al 10");
		System.out.println("3)Formato de hora                          8)Nombre de numero aleatorio");
		System.out.println("4)Circulo, cuadrato y tirangulo            9)Transformar a numeros romanos");
		System.out.println("5)Dias entre fechas                        10)Piramide de numeros");
		System.out.println("                                           11)Romanos el mayor y menor");
		System.out.println("                                           12)Cadena de texto");
		System.out.println("                                           13)Juego del abecedario");
		System.out.println("                                           14)Cuadrado de lado 'n'");
		System.out.println("                                           15)Lista de numeros primos");					
		System.out.println("0) Salir");
		System.out.println("");
		
		System.out.println("ingrese numero de ejercicio:");
		si=cla.nextInt();
		switch(si){
		case 1:
			uno.ichi();
			break;
		case 2:
			dos.ni();
			break;
		case 3:
			Tres.san();
			break;
		case 4:
			cuatro.shi();
			break;
		case 5:
			cinco.go();
			break;
		case 6:
			seis.roku();
			break;
		case 7:
			siete.shichi();
			break;
		case 8:
			ocho.hachi();
			break;
		case 9:
			nueve.kyu();
			break;
		case 10:
			diez.ju();
			break;
		case 11:
			once.juichi();
			break;
		case 12:
			doce.juni();
			break;
		case 13:
			trece.jusan();
			break;
		case 14:
			catorce.jushi();
			break;
		case 15:
			quince.jugo();
			break;
		default:
			System.out.println("Fin del programa");
			break;
		}
		
			
	}
	
	public static void main(String[] args) {
		cero.uno();
		
	}

}
