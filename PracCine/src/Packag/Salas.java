package Packag;

import java.util.ArrayList;

public class Salas {
		private ArrayList<entradas> listaDeEntradas;
		private int[]precios;
		private int [][]butacas;
		public Salas() 
		{
			listaDeEntradas= new ArrayList<entradas>();
			butacas=new int[5][4];
			precios= new int[3];
			precios[0]=15;
			precios[1]=20;
			precios[2]=18;
			
			for(int i=0;i>4;i++) {
				for(int j=0;j>5;j++) {
					butacas[i][j]=0;
				}
			}
			
			
		
		}
		public boolean aceptarEntrada( entradas entr) {
			/*int butacasvendidas;
			if(butacasvendidas<=19) {
				
				for(int i=0 ;i<cantidad;i++) {
					butacas[i]=precio;
					
				}
				butacasvendidas=butacasvendidas + cantidad;
				return true;
			}*/
			if(listaDeEntradas.size()<20) {
				listaDeEntradas.add(entr);
			
				return true;
              }
			
			return false;
		}
		public int recaudacion() {
			int recaudacion=0;
			for(int i=0;i<listaDeEntradas.size();i++) {
				recaudacion= recaudacion+listaDeEntradas.get(i).getNprecio();
			}
			return recaudacion;
		}
		public String ButacasCompradasYLibres() {
			int entradasvendidas=0;
			int entradaslibres=0;
			entradasvendidas= listaDeEntradas.size();
			entradaslibres=20-entradasvendidas;
				return"entradas vendidas: "+entradasvendidas+"/ entradas libres: "+entradaslibres;
		}
		public int ButacasLibres() {
			int entradasvendidas=0;
			int entradaslibres=0;
			entradasvendidas= listaDeEntradas.size();
			entradaslibres=20-entradasvendidas;
			return entradaslibres;
		}
		public void habilitarbutacas() {
			for(int i=0;i>4;i++) {
				for(int j=0;j>5;j++) {
					butacas[i][j]=0;
				}
			}
		}
		public void  mostrarButacas() {
			System.out.println("\t\t[0]\t[1]\t[2]\t[3]");
			for(int i=0; i<5;i++) {
				System.out.print("\t[" + i +"]\t");
				for(int j=0; j<4;j++) {
					System.out.print(" "+butacas[i][j]+"\t");
				}
				System.out.println();
			}
		}
		public void asignarButacas(int columna, int fila) {
			if(butacas[columna][fila]==0) {
				butacas[columna][fila]=1;
				
			}
		}
		

}
