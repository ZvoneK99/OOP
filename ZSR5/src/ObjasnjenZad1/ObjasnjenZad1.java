package ObjasnjenZad1; 

import javax.swing.*; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;

/* Napisati program koji prikazuje formu sa tekstualnim okvirom za unos podataka, gumbom za potvrdu i tekstualnim područjem.
   U tekstualni okvir se unosi proizvoljni tekst. Pritiskom na gumb za potvrdu, tekst se dodaje kao novi redak u tekstualno područje,
   ali tako da se sva velika slova zamijene malima i obratno. */

public class ObjasnjenZad1 { 
    public static void main(String[] args) {
    	
        // Kreira prozor (JFrame) za GUI aplikaciju
        JFrame okvir = new JFrame();
        okvir.setSize(400, 300); // Postavlja dimenzije prozora

        // Kreira tekstualni okvir (JTextField) za unos teksta
        JTextField tekstOkvir = new JTextField();

        // Kreira gumb (JButton) s natpisom "Izmjeni"
        JButton gumb = new JButton("Izmjeni");

        // Kreira tekstualno područje (JTextArea) za prikaz izmijenjenog teksta
        JTextArea tekstPodrucje = new JTextArea();

        // Postavlja raspored komponenti u prozoru kao okomiti BoxLayout
        okvir.setLayout(new BoxLayout(okvir.getContentPane(), BoxLayout.Y_AXIS));

        // Dodaje komponente u prozor
        okvir.add(tekstOkvir); // Dodaje polje za unos teksta
        okvir.add(gumb); // Dodaje gumb za izmjenu teksta
        okvir.add(tekstPodrucje); // Dodaje područje za prikaz rezultata

        // Dodaje funkcionalnost gumbu pomoću ActionListener-a
        gumb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { // Metoda koja se poziva kada se gumb klikne
                // Dohvaća uneseni tekst iz tekstualnog okvira
                String unosTeksta = tekstOkvir.getText();
                
                // Poziva metodu pretvoriTekst koja zamjenjuje velika i mala slova
                String novitekst = pretvoriTekst(unosTeksta);

                // Dodaje novi redak s izmijenjenim tekstom u JTextArea
                tekstPodrucje.append("\n" + novitekst);
            }
        });

        // Prikazuje prozor korisniku
        okvir.setVisible(true);

        // Postavlja da se program zatvori kada korisnik zatvori prozor
        okvir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Metoda koja zamjenjuje velika slova malima i obrnuto
    private static String pretvoriTekst(String tekst) {
        String novitekst = ""; // Kreira prazan string za pohranu rezultata
        char[] znakovi = tekst.toCharArray(); // Pretvara string u niz znakova

        // Prolazi kroz svaki znak u nizu
        for (int i = 0; i < znakovi.length; i++) {
            char znak = znakovi[i];

            // Ako je znak veliko slovo, pretvara ga u malo
            if (Character.isUpperCase(znak)) {
                novitekst += Character.toLowerCase(znak);
            } 
            // Ako je znak malo slovo, pretvara ga u veliko
            else if (Character.isLowerCase(znak)) {
                novitekst += Character.toUpperCase(znak);
            } 
            // Ako znak nije slovo (npr. broj ili simbol), ostavlja ga nepromijenjenog
            else {
                novitekst += znak;
            }
        }
        return novitekst; // Vraća novi tekst s izmijenjenim slovima
    }
}
