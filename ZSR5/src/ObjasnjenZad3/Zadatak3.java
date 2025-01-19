package ObjasnjenZad3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* Program prikazuje GUI koji predstavlja jednostavni kalkulator s tipkama za znamenke (0-9),
   osnovne operacije (+, -, *, /), resetiranje unosa (C), provođenje operacije (=) i gašenje aplikacije (X). */

public class Zadatak3 {
    // Globalne varijable za tekstualni okvir, operande, rezultat i odabranu operaciju.
    private static JTextField tekst;
    private static double prvi_broj, drugi_broj, rezultat;
    private static char operacija;

    public static void main(String[] args) {
        // Kreira glavni okvir (prozor) aplikacije.
        JFrame okvir = new JFrame();
        okvir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Postavlja ponašanje pri zatvaranju.
        okvir.setSize(600, 600); // Dimenzije prozora.

        // Kreira tekstualni okvir za prikaz unesenih podataka i rezultata.
        tekst = new JTextField();
        tekst.setFont(new Font("Arial", Font.PLAIN, 24)); // Postavlja veličinu i font teksta.
        okvir.add(tekst, BorderLayout.NORTH); // Dodaje tekstualni okvir na vrh prozora.

        // Kreira panel s mrežnim rasporedom (4x4) za gumbe.
        JPanel tablica = new JPanel(new GridLayout(4, 4));

        // Niz koji sadrži sve gumbe.
        String[] buttoni = {
                "1", "2", "3", "+",
                "4", "5", "6", "-",
                "7", "8", "9", "*",
                "C", "=", "0", "/"
        };

        // Kreira gumbe iz niza i dodaje ih u panel.
        for (int i = 0; i < buttoni.length; i++) {
            JButton button = new JButton(buttoni[i]); // Kreira novi gumb.
            button.addActionListener(new ButtonClickListener()); // Dodaje slušač događaja.
            button.setFont(new Font("Arial", Font.PLAIN, 18)); // Postavlja veličinu fonta gumba.
            tablica.add(button); // Dodaje gumb u panel.
        }

        // Dodaje panel s gumbima u prozor.
        okvir.add(tablica, BorderLayout.CENTER);

        // Čini prozor vidljivim.
        okvir.setVisible(true);
    }

    // Klasa za rukovanje događajima gumba.
    private static class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource(); // Dohvaća izvor događaja (gumb).
            klik(source.getText()); // Prosljeđuje tekst gumba metodi `klik`.
        }
    }

    // Metoda za obradu unosa gumba.
    private static void klik(String znak) {
        switch (znak) {
            case "C": // Resetira unos.
                tekst.setText(""); // Briše sadržaj tekstualnog okvira.
                break;
            case "=": { // Provođenje računske operacije.
                drugi_broj = Double.parseDouble(tekst.getText()); // Dohvaća drugi operand.
                izracunaj(); // Izračunava rezultat.
                tekst.setText(String.valueOf(rezultat)); // Prikazuje rezultat u tekstualnom okviru.
                break;
            }
            case "+": // Postavljanje operacije zbrajanja.
            case "-": // Postavljanje operacije oduzimanja.
            case "*": // Postavljanje operacije množenja.
            case "/": { // Postavljanje operacije dijeljenja.
                prvi_broj = Double.parseDouble(tekst.getText()); // Pohranjuje prvi operand.
                operacija = znak.charAt(0); // Pohranjuje odabranu operaciju.
                tekst.setText(""); // Briše tekstualni okvir za unos drugog operanda.
                break;
            }
            default: // Unos znamenki.
                tekst.setText(tekst.getText() + znak); // Dodaje unesenu znamenku u tekstualni okvir.
                break;
        }
    }

    // Metoda za izvođenje računske operacije.
    private static void izracunaj() {
        switch (operacija) {
            case '+': // Zbrajanje.
                rezultat = prvi_broj + drugi_broj;
                break;
            case '-': // Oduzimanje.
                rezultat = prvi_broj - drugi_broj;
                break;
            case '*': // Množenje.
                rezultat = prvi_broj * drugi_broj;
                break;
            case '/': // Dijeljenje.
                rezultat = prvi_broj / drugi_broj;
                break;
        }
    }
}
