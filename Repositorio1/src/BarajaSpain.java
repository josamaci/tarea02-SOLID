import java.util.Arrays;

public class BarajaSpain {
	Naipe [] baraja;
	int cont = 40;
	public BarajaSpain() {
		
		int cont = 0;
		baraja = new Naipe[40];
		for(int i = 1; i <= 4; i++) {
			for(int u = 1; u <= 12; u++) {
				if(u != 8 && u != 9) {
					baraja[cont] = new Naipe(u, i);
					cont++;
				}//else
			}//for	
		}//for
		
	}//constructor barajaSpain
	
	
	public void barajar() {
		for(int u = 0; u <= 200; u++) {
			int p1 =(int) (Math.random()*40);
			int p2 =(int) (Math.random()*40);
			Naipe tem = baraja[p1];
			baraja[p1] = baraja[p2];
			baraja[p2] = tem;
		}
		
	}
	
	public String toString() {
		
		return "["+Arrays.toString(baraja)+"]";
	}
	
	public boolean quedanCartas() {
		if(cont==0) {return false;}
		else {return true;}
	}
	
	public Naipe sacaCarta() {
		cont--;
		if(cont < 0) {
			throw new IllegalArgumentException("no quedan cartas que devolver");
		}
		return baraja[cont];
		
	}
	
	public Naipe dimeCarta(int i) {
		if(i > cont && cont == 0) {
			return null;
		}
		return baraja[i];
	}
	
	
}//Clase BarajaSpain

