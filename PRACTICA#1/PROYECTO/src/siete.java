import java.util.Scanner;


public class siete {
	static void shichi() {
		int tabla=0;
		Scanner cla= new Scanner(System.in);
		System.out.println("que tabla desea calcular?");
		tabla=cla.nextInt();
		for (int a=10; a>0; a--){
			System.out.println(tabla + " * " + a + " = " + (tabla*a));
		}
		pregunta.bankai();
	}

}
