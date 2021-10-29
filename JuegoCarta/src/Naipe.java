
import java.lang.IllegalArgumentException;
public class Naipe {
	static public final int OROS = 1;
	static public final int BASTOS = 2;
	static public final int COPAS = 3;
	static public final int ESPADAS = 4;
	
	static public final int AS = 1;
	static public final int SOTA = 10;
	static public final int CABALLO = 11;
	static public final int REY = 12;
	
	private int n;
	private int p;
	
	public Naipe(int num, int pal) {
		if(pal < 1 || pal > 4) {throw new IllegalArgumentException("palo no valido");}
		if(num < 1 || num == 8 || num == 9 || num > 12) {throw new IllegalArgumentException("Numero Carta no valido");}
		
		n = num;
		p = pal;
		
	}
	
	public int getCarta() {
		return n ;
	}
	
	public int getPalo() {
		return p;
	}
	
	public int puntCarta() {
		if(n == 1) {return 11;}
		else if (n == 3) {return 10;}
		else if (n == 12) {return 4;}
		else if (n == 11) {return 3;}
		else if (n == 10) {return 2;}
		else {return 0;}
	}
	
	public String toString() {
		String f = "[";
		switch (n) {
		case AS: f+= "AS"; 
		break;
		case  SOTA: f+= "SOTA";
		break;
		case CABALLO: f+= "CABALLO";
		break;
		case REY: f+= "REY"; 
		break;
		default: f+= n;
		}
		
		switch (p){
		case OROS: f+= " de OROS]";
		break;
		case BASTOS: f+= " de BASTOS]";
		break;
		case COPAS: f+= " de COPAS]";
		break;
		case ESPADAS: f+= " de ESPADAS]";
		break;
		}
		return f;
		
		
	}
	
}

