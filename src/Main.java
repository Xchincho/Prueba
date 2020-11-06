import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
//        //Ejercicio 1
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Introduzca los grados Fahrenheit: ");
//		float far = scan.nextFloat();
//		float cel = ((far-32)*(5)/9);
//		System.out.println("El valor en grados Celsius es: " + cel);
//		scan.close();
	

	
		//Ejercicio 2
//		
//	Scanner scan2 = new Scanner(System.in);
//	System.out.println("Introduce el valor del radio: ");
//	float r = scan2.nextFloat();
//	final float PI = 3.14f;
//	float area = 4*PI*r*r;
//	System.out.println("El area es " +  area);
//	System.out.println("El volumen es " + ((area * r)/3));
//	scan2.close();
//	
	
//	    //Ejercicio 3
//		Scanner scan3 = new Scanner(System.in);
//		System.out.println("Introduzca una nota entre 0 y 10: ");
//		int nota = scan3.nextInt();
//		
//		if(nota < 5) {System.out.println("Suspenso");}
//	
//		else if(nota < 7){System.out.println("Aprobado");}
//	
//		else if(nota < 9){System.out.println("Notable");}
//		
//		else {System.out.println("¡Sobresaliente!");}
//		
//		//Ejercicio 4
//		Scanner scan4 = new Scanner(System.in)
//		int a = 0, e = 0, i = 0, o = 0, u = 0;
//		String entrada = "Hola";
//		for(int x = 0; x < 20; x++) {
//		System.out.println("Introduzca un caracter");
//		entrada = scan.nextLine();
//		switch(entrada) {
//		case "a": a++;
//		break;
//		case "e": e++;
//		break;
//		case "i": i++;
//		break;
//		case "o": o++;
//		break;
//		case "u": u++;
//		break;
//		default;
//		break;
//		}
//		}
//		System.out.println("Número de a" + a + "\n");
//		System.out.println("Número de e" + e + "\n");
//		System.out.println("Número de i" + i + "\n");
//		System.out.println("Número de o" + o + "\n");
//		System.out.println("Número de u" + u + "\n");
//			
//		scan4.close(); 
//		}
//			
//	}
		
//	//Ejercicio 5
//		
// Scanner scan5 = new Scanner(System.in);
//	int n1, n2;
//	String ch = "";
//	
//	while(!ch.equals("0"))
//	
//	
//		System.out.println("Introduce el primer número");
//	    n1 = scan5.nextInt();
//	    System.out.println("Introduce el segundo número");
//	    n2 = scan5.nextInt();
//	    System.out.println("Seleccione una operación (+, -, *, /, %" + "Pulse 0 para salir");
//	    ch = scan5.next();
//	
//    switch (ch)
//	{ 
//		case "+":
//		System.out.println("El resultado de la suma es" + (n1 + n2));
//		break;
//		case "-":
//		System.out.println("El resultado de la resta es" + (n1 - n2));
//		break;
//		case "*": 
//		System.out.println("El resultado de la multiplicación es" + (n1 * n2));
//		break;
//		case "/":   
//		System.out.println("El resultado de la división es" + (n1 / n2));
//		break;
//		case "%":
//		System.out.println("El resultado es" + (n1 % n2));
//		break;
//		case "0":
//		System.out.println("Fin del programa");
//		break;
//		default:
//		System.out.println("ERROR: Operando incorrecto");
//		break;
//		
//	    }
//	}
		
		  //Ejercicio 6
// Scanner scan6 = new Scanner(System.in);
// float num, sum = 0;
// for(int i = 0; i<20; i++) {
//	 System.out.println("Introduzca un valor");
//	 num = scan6.nextFloat();
//	 sum += num;
//	 
// }
// System.out.println("El resultado es " + (sum/20));
// scan6.close();
//

         //Ejercicio 7
//		
//		 Scanner scan7 = new Scanner(System.in);
//		 int n = 0, fac = 0;
//		 System.out.println("Introduzca el valor de n: ");
//		 n = scan7.nextInt();
//		 for(int i = 1; i<=n; i++) {
//			 
//			 fac = fac*i;
//			 System.out.println("El factorial de " + n + " es: " + fac);
//			 scan7.close();
		
		
//		 //Ejercicio 8
//		Scanner scan8 = new Scanner(System.in);
//		int n, sum = 0;
//		System.out.println("Introduzca el nº de impares ");
//		n = scan8.nextInt();
//		n = n*2;
//		for (int i= 1; i<n; i++) {
//			 sum += i;
//			 n++; }
//		
//			scan8.close();
//			System.out.println("El resultado es " + sum);
		
		
//		  //Ejercicio 9
//		int res = 0;
//		for(int i=0; i<=500; i++);
//		{
//		if((i%5)== 0 && i%7==0));
//		res = res + i;
//		System.out.println("El resultado es " + res);
//		
//	}
//		

		
//	          //Ejercicio 10
//				/*
//				Scanner scan = new Scanner(System.in);
//				String twit;
//				System.out.println("Introduzca el texto a evaluar: \n");
//				twit = scan.next();
//				if(twit.length()<281){
//					System.out.println("El texto es tuiteable. \n");
//				} else {
//					System.out.println("El texto no es tuiteable. \n");
//				}
//				scan.close();

		
		
		
		
//		  //Ejercicio 11
//       Scanner scan11 = new Scanner (System.in);
//       int min, h = 0, d;
//       System.out.println("Introduzca el nº de minutos a evaluar ");
//       min=scan11.nextInt();
//       d=(min/60)/24;
//       h = h-(d*24);
//       min = min - (h*60) - (d*24*60);
//       System.out.println(d + " día(s) " + h + " hora(s)" + min + " minuto(s). \n");
//       scan11.close();
       
       
//		  //Ejercicio 12  
//	Scanner scan12 = new Scanner(System.in);
//	int n1, n2, n3 ;
//	System.out.println("Introduzca el primer número ");
//	n1 = scan11.nextInt();
//	System.out.println("Introduzca el segundo número ");
//	n2 = scan11.nextInt();
//	System.out.println("Introduzca el tercer número ");
//	n3 = scan11.nextInt();
//	if (n1%2 == 0 && n2%2 == 0);
//	(n2%2 == 0 && n3%2 == 0); 
//    (n1%2 == 0 && n3%2 == 0);
//		
//	System.out.println("Al menos dos son pares.");
//	} else {
//		System.out.println("No hay dos o más números pares.");
//	}
//	
//	scan12.close();
//			
//			                 
	
//		   //Ejercicio 13
//		Scanner scan13 = new Scanner(System.in);
//		int n1, n2;
//		System.out.println("Introduce el primer factor: ");
//		n1 = scan13.nextInt();
//		System.out.println("Introduce el segundo factor: ");
//		n2 = scan13.nextInt();
//		 if ((n1 == 0) || (n2 == 0));
//			{ System.out.println("El producto es nulo.");
//		} else if (((n1 > 0 && n2 > 0) || (n1 < 0 && n2 < 0))) {
//		System.out.println("El producto es positivo.");
//		} else {
//	System.out.println("El producto es positivo.");
//	}
//	   scan13.close();

		
		
//           //Ejercicio 14
//		Scanner scan14 = new Scanner(System.in);
//		int x, y, res; 
//		System.out.println("Introduce el numero: ");
//		x = scan14.nextInt();
//		System.out.println("Introduce la potencia: ");
//		y = scan14.nextInt();
//		for (int i = 0; i < y; i++) (res* = x); 
//		System.out.println("El resultado de " + x + " elevado a " + y + " es: " + res);
//	   } else { 
//		System.out.println("Los números deben ser positivos.");
//		
//        }
//	    scan14.close();

//		    //Ejercicio 15
//		Scanner scan15 = new Scanner(System.in);
//		float min, max, entrada; 
//		System.out.println("Introduce un valor:");
//	    min = max = entrada = scan15.nextFloat();
//	    for(int i=1; i<19; i++) {
//	    	System.out.println("Introduzca el" + (i+1) + "valor");
//	    }
		
//		    //Ejercicio 16
//		
//		Scanner scan16 = new Scanner(System.in);
//		int x = 0;
//		while(x <= 0 || x >= 10){
//			System.out.println("Introduzca un número del 1 al 9: ");
//			x = scan16.nextInt();
//		}
//		//Primos del 1 al 9: 1,2,3,5,7
//		if(x == 4 || x == 6 || x > 7) {
//			System.out.println(x + " no es un número primo.\n");
//		} else {
//			System.out.println(x + " es un número primo.\n");
//		}
//		scan16.close();
		
		
		
//		   //Ejercicio 17
//		Scanner scan = new Scanner(System.in);
//		int x = -1, max = 0;
//		do {
//			do {
//				System.out.println("Escribe un número positivo: \nPulse 0 para salir.");
//				x = scan.nextInt();
//			} while(x < 0);
//			
//			if(x > 0){
//				if(x > max) {
//					System.out.println(x + " es mayor que el anterior");
//					max = x;
//				} else {
//					max = x;
//				}
//			}
//		} while( x!= 0);
//		System.out.println("Bye!");
//		scan.close();
		
//           //Ejercicio 18
//		Scanner scan = new Scanner(System.in);
//		int numPar = 0, sumPar = 0, aux, sumImpar = 0;
//		float mediaImpar;
//		for(int i = 0; i < 10; i++){
//			System.out.println("Introduzca el entero " + (i+1) + " de la lista.");
//			aux = scan.nextInt();
//			if(aux%2 == 0){
//				numPar++;
//				sumPar = sumPar + aux;
//			} else {
//				sumImpar = sumImpar + aux;
//			}
//		}
//		mediaImpar = sumImpar/(10 - numPar);
//		System.out.println("Resultados:\n"
//				+ "Sumatorio de los pares de la lista: " + sumPar + "\n"
//				+ "Número de pares: " + numPar + "\n"
//				+ "Media aritmética de los impares: " + mediaImpar + "\n");
//		scan.close();
//		*/
		
//		     //Ejercicio 20
//		Scanner scan = new Scanner(System.in);
//		int n, SumPares = 0, resto;
//		System.out.println("Introduzca el valor: ");
//		n = scan.nextInt();
//		while (n == 0) {
//			resto = n% 10; 
//			if (resto % 2 == 0) {
//			 SumPares = resto;
//		}
//			n = n/10;
//			System.out.println("resto");
//		}
//		System.out.println("La suma de los pares es " + SumPares);
//		scan.close();
			
		
		
		
			}
			
		
	}
	    
		 
	
	
	
		 
		 
	
	
