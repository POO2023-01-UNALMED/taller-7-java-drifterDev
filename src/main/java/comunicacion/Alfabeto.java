package comunicacion;

public class Alfabeto extends Pictograma{
	private String[] letras;
	private String interpretacion;
	
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.letras=letras;
		this.interpretacion=interpretacion;
	}
	
	public String[] getLetras() {
		return this.letras;
	}
	public void setLetras(String[] letras) {
		this.letras = letras;
	}
	public String interpretacion() {
		return this.interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	public String toString() {
		String retu="";
		for (int i=0;i<this.letras.length;i++) {
			if (i==this.letras.length-1) {
				retu+=this.letras[i];
			} else {
				retu+=this.letras[i]+", ";
			}
		}
		return retu;
	}
	
	public int cantidadLetras() {
		return this.letras.length;
	}

}
