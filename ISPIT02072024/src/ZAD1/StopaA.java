package ZAD1;

//Izvedeni razred StopaA
public class StopaA extends PoreznaStopa {
 private char stopa;
 private double visina;

 // Konstruktor
 public StopaA() {
     super(); // Poziva konstruktor nadklase
     char[] stope = getStope(); // Dohvati niz poreznih stopa iz nadklase
     double[] visineStopa = getVisineStopa(); // Dohvati niz visina iz nadklase
     
     // Postavi vrijednosti za ovu poreznu stopu (pretpostavljamo da je 'A' prvi element)
     this.stopa = stope[0]; // 'A' je na indeksu 0
     this.visina = visineStopa[0]; // 0.0 je visina za 'A'
 }

 // Implementacija metode resetirajVisineStopa
 @Override
 public void resetirajVisineStopa() {
     this.visina = 0.0; // Postavlja visinu stope na početnu vrijednost
 }

 // Implementacija metode promjeniVisinuStope
 @Override
 public void promjeniVisinuStope(char stopa, double novaVisina) {
     if (this.stopa == stopa) {
         this.visina = novaVisina;
     }
 }

 // Nadjačana metoda toString
 @Override
 public String toString() {
     return "Stopa: " + stopa + ", Visina: " + visina;
 }

@Override
public void resetirajVisinuStope() {
	// TODO Auto-generated method stub
	
}
}
