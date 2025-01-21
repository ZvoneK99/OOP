package Zadatak10;

import java.util.ArrayList;
import java.util.Random;

public class Main {
	public static void main(String[]args) {
		Random random = new Random();
		ArrayList<TransportnoSredstvo> transportnaSredstva = new ArrayList<>();
		
		for(int i=0; i<15; i++) {
			if(random.nextBoolean()) {
				int ID = random.nextInt(30);
				String naziv = "Kamion "+i; 
				double nosivost = random.nextDouble(50000)+500;
				double tezinaTereta = random.nextDouble(4000)+10000;
				transportnaSredstva.add(new Kamion(ID, naziv, nosivost, tezinaTereta));
			}
			else {
				int ID = random.nextInt(10)+40;
				String naziv = "Autobus "+i;
				int brojPutnika = random.nextInt(50)+40;
				double tezinaPutnika = random.nextDouble(300)+60;
				transportnaSredstva.add(new Autobus(ID, naziv, brojPutnika, tezinaPutnika));
			}
		}
		System.out.println("Transportna sredstva:");
		for(TransportnoSredstvo ts : transportnaSredstva) {
			System.out.println(ts);
		}
		System.out.println("Transportna sredstva cija je tezina veca od 20 000");
		for(TransportnoSredstvo ts : transportnaSredstva) {
			if (ts.izracunajUkupnuTezinu() > 20000) {
				System.out.println(ts);
			}
		}
		System.out.println("Transportno sredstvo sa najvecom tezinom: "); {
			TransportnoSredstvo maxTezina = transportnaSredstva.get(0);
			for(TransportnoSredstvo ts : transportnaSredstva) {
				if(ts.izracunajUkupnuTezinu() > maxTezina.izracunajUkupnuTezinu()) {
					maxTezina = ts;
				}
			}
			System.out.println(maxTezina);
		}
	}
}
