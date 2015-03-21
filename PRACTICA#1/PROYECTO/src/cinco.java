import java.util.Scanner;


public class cinco {
	static void go(){
		String d,m;
		int a=0,b=0,c=0,g=0,e=0,f=0;
		Scanner so= new Scanner(System.in);
		System.out.print("ingresa fecha mayor (dd/mm/yy):");
		d=so.next();
		System.out.print("ingresa fecha menor (dd/mm/yy):");
		m=so.next();
		System.out.println("");
		if (m.length()<10 || d.length()<10)
			System.out.println("datos mal ingresados");
		else{
		a=Integer.parseInt(d.charAt(0) + "" + d.charAt(1));
		b=Integer.parseInt(d.charAt(3) + "" + d.charAt(4));
		c=Integer.parseInt(d.charAt(6) + "" + d.charAt(7)+ "" + d.charAt(8)+ "" + d.charAt(9));
			
			g=Integer.parseInt(m.charAt(0) + "" + m.charAt(1));
			e=Integer.parseInt(m.charAt(3) + "" + m.charAt(4));
			f=Integer.parseInt(m.charAt(6) + "" + m.charAt(7)+ "" + m.charAt(8)+ "" + m.charAt(9));
		
		
			System.out.println("diferencia de dias: " + ((a-g)+(b-e)*30+(c-f)*360));
	}
		pregunta.bankai();
	}
}
