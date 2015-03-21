import java.util.Scanner;


public class diez {
	static void ju() {
		int tri=0;
		Scanner so= new Scanner(System.in);
		System.out.print("ingrese numero: ");
		tri=so.nextInt();
		if (tri>=10){
			for (int a=tri; a>10 ; a--){
				for (int b=0 ; b<(tri+1)-a ; b++)
					System.out.print(" ");
								for (int b=0 ; b<a-10 ; b++)
					System.out.print((tri+11)-a + "  ");
				System.out.println("");
				for (int b=0 ; b<(tri+1)-a ; b++)
					System.out.print(" ");
			}
		}
		else{
		for (int a=tri; a>0 ; a--){
			for (int b=(tri+1)-a ; b>0 ; b--)
				System.out.print(" ");
			for (int b=0 ; b<a ; b++)
				System.out.print((tri+1)-a + " ");
			System.out.println("");
			
		}
		}
		pregunta.bankai();	
	}
}

