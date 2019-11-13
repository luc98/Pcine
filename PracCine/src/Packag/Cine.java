package Packag;

public class Cine {

	private Salas s1;
	private Salas s2;
	private Salas s3;

		public Cine() {
			s1=new Salas();
			s2=new Salas();
			s3=new Salas();
		}
	public String RecaudacionTotal() {
		int recaudacionTotal=0;
		recaudacionTotal= s1.recaudacion()+s2.recaudacion()+s3.recaudacion();
		return "la recaudacion del cine:"+recaudacionTotal;
	}
}
