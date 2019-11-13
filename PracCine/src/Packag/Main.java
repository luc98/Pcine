package Packag;

import java.util.Scanner;

public class Main 
{

	/*
	 * cine: 3 salas 3 precios(20,15,18) capacidad de la sala 20 butacas leva la
	 * cuenta de butacas libres/vendidas lleva la cuenta de lo recaudado venta:por
	 * consola NO vender entradas de mas
	 */

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		Salas elBromas= new Salas();
		Salas Batman= new Salas();
		Salas johnWick= new Salas();
		elBromas.habilitarbutacas();
		/*entradas n1= new entradas(15);
		entradas n2= new entradas(20);
		s1.aceptarEntrada(n1);
		s1.aceptarEntrada(n2);
		System.out.println(s1.ButacasCompradasYLibres());
		System.out.println(s1.recaudacion());
		Forma DE pago, tarjeta(%5 de interes) o efectivo
		
		*/
		
		
		System.out.println("bienvenido/s!! cuantas entradas vas a comprar?");
		int cantidadDeEntradas= sc.nextInt();
		
		//elBromas.mostrarButacas();
		
		for(int i=0; i <cantidadDeEntradas;i++) {
		elBromas.mostrarButacas();
		System.out.println("que fila?");
		int fila= sc.nextInt();
		
		System.out.println("butaca?");
		int butaca= sc.nextInt();
		
		elBromas.asignarButacas(fila,butaca);
		}
		
		
		
		if((elBromas.ButacasLibres()-cantidadDeEntradas)<20) 
		{
			System.out.println("Perfecto!! que edad tiene/n?");
			int edad=sc.nextInt();
			sc.close();
			if (edad<18) 
			{
				for(int i=0;i<cantidadDeEntradas;i++) 
				{
					entradas n1= new entradas(15);
					elBromas.aceptarEntrada(n1);
				}
				System.out.println("Listo! has comprado"+cantidadDeEntradas+" entradas al precio de 15pe");
			}else if(edad>=18) 
				{
						for(int i=0;i<cantidadDeEntradas;i++) 
						{
							entradas n1= new entradas(20);
							elBromas.aceptarEntrada(n1);
						}
						System.out.println("Listo! has comprado"+cantidadDeEntradas+"entradas al precio de 20pe");
				}else if(edad<65) 
						{
							for(int i=0;i<cantidadDeEntradas;i++) 
							{
									entradas n1= new entradas(18);
									elBromas.aceptarEntrada(n1);
							}
							System.out.println("Listo! has comprado"+cantidadDeEntradas+"entradas al precio de 18pe");
						}
		
		
		
		}
		System.out.println("  "+elBromas.ButacasCompradasYLibres());
		System.out.println("butacas libres"+elBromas.ButacasLibres());
		elBromas.mostrarButacas();
		

	}
}