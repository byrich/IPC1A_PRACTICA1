import java.util.Scanner;
public class doce {
	static void juni() {
		String a;
		Scanner so= new Scanner(System.in);
		System.out.print("Ingrese palabra:      ");
		a=so.next();
		System.out.println("");
		System.out.print("Cadena de asteriscos: ");
		for (int aste=0; aste<a.length(); aste++){
			System.out.print("*");
		}
		System.out.println("");
		pregunta.bankai();	
	}
}
