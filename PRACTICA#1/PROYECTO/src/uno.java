import java.util.Scanner;


public class uno {

	static void ichi() {
		for (int a=1; a<6 ; a++){
			for (int b=6-a ; b>1 ; b--)
				System.out.print(" ");
			for (int b=0 ; b<(2*a-1) ; b++)
			System.out.print("*");
			System.out.println("");
			
		}
		for (int a=4; a>0 ; a--){
			for (int b=5-a ; b>0 ; b--)
				System.out.print(" ");
			for (int b=0 ; b<(2*a-1) ; b++)
				System.out.print("*");
			System.out.println("");
			
		}
		pregunta.bankai();
	}

}
