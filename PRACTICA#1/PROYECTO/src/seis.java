import java.util.Scanner;


public class seis {
	static void roku() {
		int si=0, no=0;
		String a;
		Scanner cla= new Scanner(System.in);
		System.out.print("numero 1: ");
		si= cla.nextInt();
		System.out.print("numero 2:");
		no= cla.nextInt();
		System.out.println("para dividir precione 'd', para multiplicar 'm' y para sumar 's'");
		a=cla.next();
		if (a.equals("d"))
			System.out.println(si + " / " + no + " = " + (si/no));
		else if (a.equals("m"))
			System.out.println(si + " * " + no + " = " + (si*no));
		else
			System.out.println(si + " + " + no + " = " + (si+no));
		pregunta.bankai();
	}
}
