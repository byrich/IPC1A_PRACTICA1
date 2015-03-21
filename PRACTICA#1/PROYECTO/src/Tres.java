import java.util.Scanner;
public class Tres {

	static void san() {
		String h;
		int m=0;
		Scanner so= new Scanner(System.in);
		System.out.print("ingrese hora (hh:mm): ");
		h=so.next();
		if (h.length()==5){
			if (Integer.parseInt(h.charAt(0) + "" + h.charAt(1))>12){
				m= Integer.parseInt(h.charAt(0) + "" + h.charAt(1)) - 12;
				System.out.print(m + ":" + h.charAt(3) + h.charAt(4) +" PM");
			}
				else {
					System.out.println(h + " AM");
				}
		}
			else {
				System.out.println("La hora ingresada no coincide con el formato!");
			}
		pregunta.bankai();
	}
	
}
