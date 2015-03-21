import java.util.Scanner;


public class trece {
	static void jusan() {
		String z="";
		int i=0,fa=0,sol=0;
		final String abc[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z"};
		System.out.println("ingrese letra para iniciar juego: ");
		Scanner so= new Scanner(System.in);
		z=so.next();
		for (int c=0; c<40; c++){
			System.out.println("");
		}
		
		while (abc[i].equals(z)!=true){
			i++;
		}
		fa=i;
		System.out.println("Cual es la letra?");
		do {
			sol=0;
			System.out.print("ingrese posibilidad: ");
			z=so.next();
			System.out.println(" ");
			while (abc[sol].equals(z)!=true){
				sol++;
			}	
			if (sol>fa)
				System.out.println("Antes");
			else if (sol<fa)
				System.out.println("Despues");
			else
					System.out.println("");
			
		}while (fa!=sol);
		System.out.println("FELICIDADES ACERTASTE!!!!");
		System.out.println("");
		pregunta.bankai();
	}
}
