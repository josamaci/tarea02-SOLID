
import java.util.Scanner;

public class Brisca {
	
	BarajaSpain b;
	Naipe [] jugador1;
	Naipe [] jugador2;
	int punJu1;
	int punJu2;
	Naipe muestra;
	int turno;
	
	
	public Brisca() {
		
		b = new BarajaSpain();
		jugador1 = new Naipe [3];
		jugador2 = new Naipe [3];
		punJu1=0;
		punJu2=0;
		b.barajar();
		for(int i = 0; i < 3 ; i++) {
			jugador1[i] = b.sacaCarta();
			jugador2[i] = b.sacaCarta();
		}
		muestra = b.dimeCarta(0);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Brisca partida = new Brisca();
		int carta1;
		int carta2;
		int turno= (int)(Math.random()*2);
		while(partida.quedaMano()) {
			
			if(turno == 1) {//turno jug1
				System.out.println("Carta de muestra :"+ partida.muestra);
				System.out.println("Tu mano: "+ partida.jugador1[0] +" / "+ partida.jugador1[1] +" / "+ partida.jugador1[2]);
				do {carta1 = sc.nextInt();} while(partida.jugador1[carta1-1] == null);
				if(carta1 > 3 && carta1 == 0) {
					System.out.println("Numero de carta no valido");
				} else {
					do {carta2= (int)(Math.random()*3);} while (partida.jugador2[carta2] == null);
					Naipe jug2= partida.jugador2[carta2];
					Naipe jug1= partida.jugador1[carta1-1];
					System.out.println();
					System.out.println("Carta de muestra :"+ partida.muestra);
					System.out.println("Carta jugador1: "+ jug1);
					System.out.println("Carta jugador2: "+ jug2);
					if(jug2.getPalo() == jug1.getPalo()) {
						if(jug2.puntCarta() > jug1.puntCarta()) {
							System.out.println();
							System.out.println("Gana jugador2");
							System.out.println();
							System.out.println("------------------------");
							partida.punJu2 = partida.punJu2 + jug2.puntCarta() + jug1.puntCarta();
							turno = 2;
							if(partida.b.quedanCartas()) {
								partida.jugador2[carta2] = partida.b.sacaCarta();
								if(partida.b.quedanCartas()) {
									partida.jugador1[carta1-1] = partida.b.sacaCarta();
									}else {
										partida.jugador1[carta1-1] = null;
									}
								
							} else {
								partida.jugador2[carta2] = null;
								partida.jugador1[carta1-1] = null;
							}
						}else {
							System.out.println();
							System.out.println("Gana jugador1");
							System.out.println();
							System.out.println("------------------------");
							partida.punJu1 = partida.punJu2 + jug2.puntCarta() + jug1.puntCarta();
							turno = 1;
							if(partida.b.quedanCartas()==true) {
								partida.jugador1[carta1-1] = partida.b.sacaCarta();
								if(partida.b.quedanCartas()==true) {
									partida.jugador2[carta2] = partida.b.sacaCarta();
								}else {
									partida.jugador2[carta2] = null;
								}
								
							} else {
								partida.jugador1[carta1-1] = null;
								partida.jugador2[carta2] = null;
							}
						}
					} else if(jug2.getPalo() == (partida.muestra.getPalo())) {
						System.out.println();
						System.out.println("Gana jugador2");
						System.out.println();
						System.out.println("------------------------");
						partida.punJu2 = partida.punJu2 + jug2.puntCarta() + jug1.puntCarta();
						turno = 2;
						if(partida.b.quedanCartas()) {
							partida.jugador2[carta2] = partida.b.sacaCarta();
							if(partida.b.quedanCartas()) {
								partida.jugador1[carta1-1] = partida.b.sacaCarta();
								}else {
									partida.jugador1[carta1-1] = null;
								}
							
						} else {
							partida.jugador2[carta2] = null;
							partida.jugador1[carta1-1] = null;
						}
					} else {
						System.out.println();
						System.out.println("Gana jugador1");
						System.out.println();
						System.out.println("------------------------");
						partida.punJu1 = partida.punJu2 + jug2.puntCarta() + jug1.puntCarta();
						turno = 1;
						if(partida.b.quedanCartas()) {
							partida.jugador1[carta1-1] = partida.b.sacaCarta();
							if(partida.b.quedanCartas()) {
								partida.jugador2[carta2] = partida.b.sacaCarta();
							}else {
								partida.jugador2[carta2] = null;
							}
						} else {
							partida.jugador1[carta1-1] = null;
							partida.jugador2[carta2] = null;
						}
					}
					
				}
			} else {//turno jug2
				do {carta2= (int)(Math.random()*3);} while (partida.jugador2[carta2] == null);
				System.out.println("Carta de muestra :"+ partida.muestra);
				System.out.println("Carta jugador2 :"+ partida.jugador2[carta2]);
				System.out.println();
				System.out.println("Tu mano: "+ partida.jugador1[0] +" / "+ partida.jugador1[1] +" / "+ partida.jugador1[2]);
				do {carta1 = sc.nextInt();} while(partida.jugador1[carta1-1] == null);
				if(carta1 > 3 || carta1 == 0) {
					System.out.println("Numero de carta no valido");
				} else {
					
					Naipe jug2= partida.jugador2[carta2];
					Naipe jug1= partida.jugador1[carta1-1];
					System.out.println();
					System.out.println("Carta de muestra :"+ partida.muestra);
					System.out.println("Carta jugador1: "+ jug1);
					System.out.println("Carta jugador2: "+ jug2);
					if(jug1.getPalo() == jug2.getPalo()) {
						if(jug1.puntCarta() > jug2.puntCarta()) {
							System.out.println();
							System.out.println("Gana jugador1");
							System.out.println();
							System.out.println("------------------------");
							partida.punJu1 = partida.punJu1 + jug1.puntCarta() + jug2.puntCarta();
							turno = 1;
							if(partida.b.quedanCartas()==true) {
								partida.jugador1[carta1-1] = partida.b.sacaCarta();
								if(partida.b.quedanCartas()==true) {
									partida.jugador2[carta2] = partida.b.sacaCarta();
								}else {
									partida.jugador2[carta2] = null;
								}
								
							} else {
								partida.jugador1[carta1-1] = null;
								partida.jugador2[carta2] = null;
							}
						}else {
							System.out.println();
							System.out.println("Gana jugador2");
							System.out.println();
							System.out.println("------------------------");
							
							partida.punJu2 = partida.punJu2 + jug2.puntCarta() + jug1.puntCarta();
							turno = 2;
							if(partida.b.quedanCartas()==true) {
								partida.jugador2[carta2] = partida.b.sacaCarta();
								if(partida.b.quedanCartas()==true) {
									partida.jugador1[carta1-1] = partida.b.sacaCarta();
								}else {
									partida.jugador1[carta1-1] = null;
								}
								
							} else {
								partida.jugador1[carta1-1] = null;
								partida.jugador2[carta2] = null;
							}
						}
					} else if(jug1.getPalo() == (partida.muestra.getPalo())) {
						System.out.println();
						System.out.println("Gana jugador1");
						System.out.println();
						System.out.println("------------------------");
						partida.punJu1 = partida.punJu1 + jug1.puntCarta() + jug2.puntCarta();
						turno = 1;
						if(partida.b.quedanCartas()) {
							partida.jugador1[carta1-1] = partida.b.sacaCarta();
							if(partida.b.quedanCartas()) {
								partida.jugador2[carta2] = partida.b.sacaCarta();
							}else {
								partida.jugador2[carta2] = null;
							}
						} else {
							partida.jugador1[carta1-1] = null;
							partida.jugador2[carta2] = null;
						}
					} else {
						System.out.println();
						System.out.println("Gana jugador2");
						System.out.println();
						System.out.println("------------------------");
						partida.punJu2 = partida.punJu2 + jug2.puntCarta() + jug1.puntCarta();
						turno = 2;
						if(partida.b.quedanCartas()) {
							partida.jugador2[carta2] = partida.b.sacaCarta();
							if(partida.b.quedanCartas()) {
								partida.jugador1[carta1-1] = partida.b.sacaCarta();
								}else {
									partida.jugador1[carta1-1] = null;
								}
							
						} else {
							partida.jugador2[carta2] = null;
							partida.jugador1[carta1-1] = null;
						}
			
					}	
				}
			}
		}
		System.out.println("Puntuacion de Jugador1: "+ partida.punJu1 +" / Puntuacion de Jugador2: "+ partida.punJu2);
		if(partida.punJu1 > partida.punJu2) {
			System.out.println("El ganador es Jugador1");
		} else {
			System.out.println("El ganador es Jugador2");
		}

	}
	
	public boolean quedaMano() {
		if((jugador1[0] == null && jugador1[1] == null && jugador1[2] == null) && (jugador2[0] == null && jugador2[1] == null && jugador2[2] == null)) {
			return false;
		} else {
			return true;
		}
		
	}

}
