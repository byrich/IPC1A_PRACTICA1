import java.util.Scanner;


public class catorce {
	static void jushi() {
		int cuadro=0;
		Scanner cla= new Scanner(System.in);
		System.out.println("ingrese un numero: ");
		cuadro=cla.nextInt();
		for (int a=1; a<=cuadro; a++){
			System.out.print("* ");
		}
		System.out.println("");
		for (int a=1; a<=(cuadro-2); a++){
			System.out.print("*");
			for (int z=1; z<=((2*cuadro)-3); z++){
				System.out.print(" ");
			}	
			System.out.println("*");
		}
		
		for (int a=1; a<=cuadro; a++){
			System.out.print("* ");
		}
		pregunta.bankai();
	}
}
