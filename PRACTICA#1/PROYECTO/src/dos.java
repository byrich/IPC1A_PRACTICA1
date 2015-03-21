import java.util.Scanner;
public class dos {

	static void ni() {
		int a=0, c=0;
		float e=0;
		Scanner so= new Scanner(System.in);
		for (int b=0; b<6; b++){
			System.out.print("Ingrese nota" +(b+1)+ ": ");
		a=so.nextInt();
		c=c+a;
		}
		System.out.println("");
		e=c/6;
		if (e>90){
			System.out.print("Media: " + e);
			System.out.print("     Nivel: A");
		}
		else if (e<90 && e>=80){
			System.out.print("Media: " + e);
			System.out.print("     Nivel: B");
		}
		else if (e<80 && e>=70){
			System.out.print("Media: " + e);
			System.out.print("     Nivel: C");
		}
		else if (e<70 && e>=60){
			System.out.print("Media: " + e);
			System.out.print("     Nivel: D");
		}
		else {
			System.out.print("Media: " + e);
			System.out.print("     Nivel: E");
		}
		pregunta.bankai();
	}
}
