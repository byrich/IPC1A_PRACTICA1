import java.util.Scanner;


public class ocho {
	static void hachi() {
		String[] _unidades ={ "cero","uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve" };
			  
		String[] _decena1 = { "","once","doce","trece","catorce","quince","dieci" };
		
		String[] _decenas ={ "","","","treinta","cuarenta","cincuenta",
			      "sesenta","setenta","ochenta","noventa"};

		int a,c,d,e,zz;
		
		Scanner so= new Scanner(System.in);
		System.out.print("ingrese limite inferior: ");
		a=so.nextInt();
		System.out.print("ingrese limite superior: ");
		zz=so.nextInt();
         
		if (zz>100)
			System.out.println("limite fuera de  rango!");
			else{
				do {
					c=(int)(Math.random()*zz);
				}while (c<a);
				System.out.println("");
				if(c == 100)
					System.out.println("Numero obtenido: cien");
				else if (c<100 && c>29){
					d=c/10;
					e=c%10;
					if (e!=0)
					System.out.println("Numero obtenido: " + _decenas[d] + " y " + _unidades[e]);
					else
						System.out.println("Numero obtenido: " + _decenas[d]);
				}
				else if (c<=29 && c>=20){
					e=c%10;
					if (e!=0)
					System.out.println("Numero obtenido: veinti" + _unidades[e]);
					else
						System.out.println("Numero obtenido: veinte");
				}
				else if (c<20 && c>9){
					e=c%10;
					if (e!=0){
						if (e>0 && e<6)
					System.out.println("Numero obtenido: " + _decena1[e]);
					else
						System.out.println("Numero obtenido: " + _unidades[6] + " y " + _unidades[e]);
					}	
					else{
						System.out.println("Numero obtenido: diez");
					}
				}
				else {
					System.out.println("Numero obtenido: " + _unidades[c]);					
				}
				
					
				}
		pregunta.bankai();	
			}		
}
		

		
	
				



