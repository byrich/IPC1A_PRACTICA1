import java.util.Scanner;


public class nueve {
	static void kyu(){
		final String b[] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
		final String c[] = {"","X","XX","XX","XL","L","LX","LXX","LXXX","XC"};
		final String d[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
		final String e[] = {"","M","MM","MMM"};
		String a;
		int ra=0;
		Scanner so= new Scanner(System.in);
		System.out.print("Ingrese numero a convertir:      ");
		a=so.next();
		System.out.println("");
		if (Integer.parseInt(a)>3999){
			System.out.print("Este numero esta fuera del rango!");
		}
		else{
		if (a.length()==4){
			System.out.print(e[Integer.parseInt(a.charAt(0) + "")]);
			System.out.print(d[Integer.parseInt(a.charAt(1) + "")]);
			System.out.print(c[Integer.parseInt(a.charAt(2) + "")]);
			System.out.println(b[Integer.parseInt(a.charAt(3) + "")]);
		}
		else if (a.length()==3){
			System.out.print(d[Integer.parseInt(a.charAt(0) + "")]);
			System.out.print(c[Integer.parseInt(a.charAt(1) + "")]);
			System.out.println(b[Integer.parseInt(a.charAt(2) + "")]);
		}
		else if (a.length()==2){
			System.out.print(c[Integer.parseInt(a.charAt(0) + "")]);
			System.out.println(b[Integer.parseInt(a.charAt(1) + "")]);
		}
		else{
			System.out.println(b[Integer.parseInt(a.charAt(0) + "")]);
		}
		}
		pregunta.bankai();
	}
}
