import java.util.Scanner;


public class once {
	static void juichi() {
		int a=0,b=0,c=0,i=0,e=0,d=0,min=0;
		final String u[] = {"","i","v","x","l","c"};
		final int uu[] = {0,1,5,10,50,100};
		String[] _unidades ={ "cero","uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve" };
		  
		String[] _decena1 = { "","once","doce","trece","catorce","quince","dieci" };
		
		String[] _decenas ={ "","","","treinta","cuarenta","cincuenta",
			      "sesenta","setenta","ochenta","noventa"};
		String z,y;
		Scanner so= new Scanner(System.in);
			do {
			System.out.print("Ingrese numero romano: ");
			z=so.next();
			if (z.equals("ya")!=true){
			for(int la=z.length()-1;la>=0;la--){
				y=z.charAt(la)+"";
				
				while (u[i].equals(y)!=true){
					i++;
				}
				
				if (uu[i]<c)
					b=b-uu[i];
				else
					b=b+uu[i];
				c=uu[i];
				i=0;
			}
			if (min==0)
				min=b;
			if (b>a) 
			a=b;
			if (min>b)
				min=b;
			System.out.println(b);
			b=0;
			c=0;
			}
			else{}
			} while(z.equals("ya")!=true);
			System.out.println("");
			if(a == 100)
				System.out.println("el numero romano mayor es: cien");
			else if (a<100 && a>29){
				d=a/10;
				e=a%10;
				if (e!=0)
				System.out.println("el numero romano mayor es: " + _decenas[d] + " y " + _unidades[e]);
				else
					System.out.println("el numero romano mayor es: " + _decenas[d]);
			}
			else if (a<=29 && a>=20){
				e=a%10;
				if (e!=0)
				System.out.println("el numero romano mayor es:  veinti" + _unidades[e]);
				else
					System.out.println("el numero romano mayor es: veinte");
			}
			else if (a<20 && a>9){
				e=a%10;
				if (e!=0){
					if (e>0 && e<6)
				System.out.println("el numero romano mayor es:  " + _decena1[e]);
				else
					System.out.println("el numero romano mayor es:  " + _unidades[6] + " y " + _unidades[e]);
				}	
				else{
					System.out.println("el numero romano mayor es: diez");
				}
			}
			else {
				System.out.println("el numero romano mayor es: " + _unidades[a]);					
			}
			System.out.println(min);			
			if(min == 100)
				System.out.println("el numero romano menor es: cien");
			else if (min<100 && min>29){
				d=min/10;
				e=min%10;
				if (e!=0)
				System.out.println("el numero romano menor es: " + _decenas[d] + " y " + _unidades[e]);
				else
					System.out.println("el numero romano menor es: " + _decenas[d]);
			}
			else if (min<=29 && min>=20){
				e=min%10;
				if (e!=0)
				System.out.println("el numero romano menor es:  veinti" + _unidades[e]);
				else
					System.out.println("el numero romano menor es: veinte");
			}
			else if (min<20 && min>9){
				e=min%10;
				if (e!=0){
					if (e>0 && e<6)
				System.out.println("el numero romano menor es:  " + _decena1[e]);
				else
					System.out.println("el numero romano menor es:  " + _unidades[6] + " y " + _unidades[e]);
				}	
				else{
					System.out.println("el numero romano menor es: diez");
				}
			}
			else {
				System.out.println("el numero romano menor es: " + _unidades[min]);					
			}
		pregunta.bankai();
	}
}
