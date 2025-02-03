package ObjasnjenZad2; 

import javax.swing.*; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* Napisati program koji prikazuje formu sa dva tekstualna okvira za unos podataka, gumbom za potvrdu i labelom. 
   U dva tekstualna okvira se unose proizvoljni cijeli brojevi. 
   Pritiskom na gumb za potvrdu određuje se koji je od dva broja manji, a koji veći.
   Labeli se dodjeljuje sadržaj:
   "Prosti brojevi između <manji> i <veći> su: <lista prostih brojeva>". */

public class ObjasnjenZad2 {
    public static void main(String[] args) { 
        // Kreira prozor (JFrame) za GUI aplikaciju
        JFrame okvir = new JFrame();
        okvir.setSize(350, 350); // Postavlja dimenzije prozora

        // Kreira dva tekstualna polja (JTextField) za unos brojeva
        JTextField prviBroj = new JTextField();
        JTextField drugiBroj = new JTextField();

        // Kreira gumb (JButton) s natpisom "Provjeri"
        JButton button = new JButton("Provjeri");

        // Kreira labelu (JLabel) za prikaz rezultata
        JLabel ispis = new JLabel();

        // Postavlja raspored komponenti u prozoru kao okomiti BoxLayout
        okvir.setLayout(new BoxLayout(okvir.getContentPane(), BoxLayout.Y_AXIS));

        // Dodaje labelu i prvo tekstualno polje u prozor
        okvir.add(new JLabel("Prvi broj:"));
        okvir.add(prviBroj);

        // Dodaje labelu i drugo tekstualno polje u prozor
        okvir.add(new JLabel("Drugi broj:"));
        okvir.add(drugiBroj);

        // Dodaje gumb za potvrdu u prozor
        okvir.add(button);

        // Dodaje labelu u koju će se ispisivati rezultat
        okvir.add(ispis);

        // Dodaje funkcionalnost gumbu pomoću ActionListener-a
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { // Metoda koja se poziva kada se gumb klikne
                // Dohvaća unesene brojeve iz tekstualnih polja i pretvara ih u int
                int prvi = Integer.parseInt(prviBroj.getText());
                int drugi = Integer.parseInt(drugiBroj.getText());

                // Određuje koji je broj manji, a koji veći
                int manjiBroj = Math.min(prvi, drugi);
                int veciBroj = Math.max(prvi, drugi);

                // Kreira StringBuilder za formiranje ispisa rezultata
                StringBuilder rezultat = new StringBuilder();
                rezultat.append("Prosti brojevi između ").append(manjiBroj).append(" i ").append(veciBroj).append(": ");

                boolean prviDodani = false; // Promjenjiva za kontrolu dodavanja zareza

                // Petlja koja prolazi kroz sve brojeve između manjiBroj i veciBroj
                for (int i = manjiBroj; i <= veciBroj; i++) {
                    if (jeLiProst(i)) { // Ako je broj prost, dodaj ga u rezultat
                        if (prviDodani) {
                            rezultat.append(", "); // Dodaje zarez samo nakon prvog broja
                        }
                        rezultat.append(i); // Dodaje prost broj u rezultat
                        prviDodani = true; // Postavlja oznaku da je prvi broj dodan
                    }
                }

                // Postavlja konačni rezultat u JLabel
                ispis.setText(rezultat.toString());
            }
        });

        // Prikazuje prozor korisniku
        okvir.setVisible(true);

        // Postavlja da se program zatvori kada korisnik zatvori prozor
        okvir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Metoda koja provjerava je li broj prost
    private static boolean jeLiProst(int broj) {
        if (broj < 2) { // Ako je broj manji od 2, nije prost
            return false;
        }

        // Petlja prolazi kroz brojeve od 2 do sqrt(broj) radi brže provjere
        for (int i = 2; i <= Math.sqrt(broj); i++) {
            if (broj % i == 0) { // Ako je broj djeljiv s nekim brojem osim 1 i sebe, nije prost
                return false;
            }
        }

        return true; // Ako nije pronađen nijedan djelitelj, broj je prost
    }
}
