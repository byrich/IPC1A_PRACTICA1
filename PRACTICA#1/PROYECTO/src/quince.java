import java.util.Scanner;


public class quince {
	static void jugo(){
		int a=0,b=0;
		String alfa="";
		Scanner so= new Scanner(System.in);
		System.out.print("Ingrese numero: ");
		a=so.nextInt();
		for (int aa=1; aa<=a; aa++){
			for (int aaa=1; aaa<=aa; aaa++){
					if ((aa%aaa)==0){
					b++;
				}
			}
			if (b==2){
				alfa= alfa + aa + " "; 
			}
			b=0;
		}
		System.out.println("");
		System.out.println("lista de numeros primos:");
		System.out.println("");
		System.out.println(alfa);
		pregunta.bankai();
	}

}
