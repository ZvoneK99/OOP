package ObjasnjenZad3; 

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ObjasnjenZad3 { 

    // Deklaracija GUI komponenti i varijabli za rad s brojevima i operacijama
    private static JTextField tekst; // Polje za unos i prikaz rezultata
    private static double prviBroj, drugiBroj, rezultat; // Pohranjuju unesene brojeve i rezultat
    private static char operacija; // Pohranjuje odabranu operaciju (+, -, *, /)

    public static void main(String[] args) {
        JFrame okvir = new JFrame(); // Kreira prozor (JFrame)
        okvir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Postavlja da se aplikacija zatvori klikom na "X"
        okvir.setSize(350, 350); // Postavlja veličinu prozora

        tekst = new JTextField(); // Kreira polje za unos brojeva i prikaz rezultata
        tekst.setFont(new Font("Arial", Font.PLAIN, 17)); // Postavlja veličinu fonta u polju za unos
        okvir.add(tekst, BorderLayout.NORTH); // Dodaje polje za unos na vrh prozora

        JPanel tablica = new JPanel(new GridLayout(4, 4)); // Kreira panel sa mrežnim rasporedom 4x4 za dugmad kalkulatora

        // Niz koji sadrži sve oznake gumba kalkulatora
        String[] gumbi = {
                "1", "2", "3", "+", 
                "4", "5", "6", "-", 
                "7", "8", "9", "*", 
                "C", "=", "0", "/"
        };

        // Petlja koja kreira gumbe i dodaje ih u panel "tablica"
        for (int i = 0; i < gumbi.length; i++) {
            JButton button = new JButton(gumbi[i]); // Kreira novi gumb s oznakom iz niza
            button.addActionListener(new ButtonClickListener()); // Dodaje slušača događaja na gumb
            button.setFont(new Font("Arial", Font.PLAIN, 17)); // Postavlja veličinu fonta gumba
            tablica.add(button); // Dodaje gumb u panel "tablica"
        }

        okvir.add(tablica, BorderLayout.CENTER); // Dodaje panel s gumbima u središte prozora
        okvir.setVisible(true); // Prikazuje prozor aplikacije
    }

    // Unutarnja klasa koja sluša klikove gumba i poziva metodu klik()
    private static class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) { // Metoda se poziva kada korisnik klikne na gumb
            JButton source = (JButton) e.getSource(); // Dohvaća gumb koji je kliknut
            klik(source.getText()); // Poziva metodu klik() s oznakom pritisnutog gumba
        }
    }

    // Metoda koja obrađuje unos korisnika i izvodi odgovarajuće akcije
    private static void klik(String znak) {
        if (znak.equals("C")) { // Ako je kliknut "C", briše se unos
            tekst.setText("");
        } 
        else if (znak.equals("=")) { // Ako je kliknut "=", provodi se izračun
            drugiBroj = Double.parseDouble(tekst.getText()); // Dohvaća drugi broj iz polja za unos
            izracunaj(); // Poziva metodu za izračun
            tekst.setText(String.valueOf(rezultat)); // Prikazuje rezultat u polju za unos
        } 
        else if (znak.equals("+") || znak.equals("-") || znak.equals("*") || znak.equals("/")) { // Ako je pritisnut operator
            prviBroj = Double.parseDouble(tekst.getText()); // Sprema prvi broj
            operacija = znak.charAt(0); // Sprema operator koji će se koristiti
            tekst.setText(""); // Briše ekran kako bi korisnik unio drugi broj
        } 
        else { // Ako korisnik pritisne broj (0-9), dodaje ga u unos
            tekst.setText(tekst.getText() + znak);
        }
    }

    // Metoda koja provodi izračun na temelju spremljene operacije
    private static void izracunaj() {
        if (operacija == '+') { // Ako je operacija zbrajanje
            rezultat = prviBroj + drugiBroj;
        } 
        else if (operacija == '-') { // Ako je operacija oduzimanje
            rezultat = prviBroj - drugiBroj;
        } 
        else if (operacija == '*') { // Ako je operacija množenje
            rezultat = prviBroj * drugiBroj;
        } 
        else if (operacija == '/') { // Ako je operacija dijeljenje
            rezultat = prviBroj / drugiBroj;
        }
    }
}
