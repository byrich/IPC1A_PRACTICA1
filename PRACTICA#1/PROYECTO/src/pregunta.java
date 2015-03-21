import java.util.Scanner;


public class pregunta {
	static void bankai() {
		String siclo;
		Scanner cla= new Scanner(System.in);
		System.out.println("");
			System.out.println("Desea realizar otro ejercicio?");
			siclo= cla.next();
			if (siclo.equals("si"))
				cero.uno();
			else
				System.out.println("Programa finalizado");
	}
}
