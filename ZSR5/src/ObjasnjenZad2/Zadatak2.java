package ObjasnjenZad2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* Program kreira GUI s dva tekstualna okvira za unos cijelih brojeva, gumbom za potvrdu i labelom.
   Nakon unosa brojeva i pritiska na gumb, program ispisuje sve proste brojeve između manjeg i većeg broja. */

public class Zadatak2 {
    public static void main(String[] args) {
        // Kreira glavni prozor (okvir) aplikacije.
        JFrame okvir = new JFrame();
        okvir.setSize(700, 700); // Postavlja dimenzije okvira (700x700 piksela).

        // Kreira tekstualne okvire za unos brojeva.
        JTextField a = new JTextField();
        JTextField b = new JTextField();

        // Kreira gumb za potvrdu.
        JButton potvrdi = new JButton("Potvrdi");

        // Kreira labelu za prikaz rezultata.
        JLabel ispis = new JLabel();

        // Postavlja vertikalni raspored elemenata unutar okvira.
        okvir.setLayout(new BoxLayout(okvir.getContentPane(), BoxLayout.Y_AXIS));

        // Dodaje komponente u okvir.
        okvir.add(new JLabel("Prvi broj:")); // Labela za prvi broj.
        okvir.add(a); // Tekstualni okvir za prvi broj.
        okvir.add(new JLabel("Drugi broj:")); // Labela za drugi broj.
        okvir.add(b); // Tekstualni okvir za drugi broj.
        okvir.add(potvrdi); // Gumb za potvrdu.
        okvir.add(ispis); // Labela za ispis rezultata.

        // Dodaje slušač događaja za gumb.
        potvrdi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Preuzima unesene brojeve iz tekstualnih okvira.
                int prvi = Integer.valueOf(a.getText());
                int drugi = Integer.valueOf(b.getText());

                // Određuje manji i veći broj pomoću Math.min i Math.max.
                int manjiBroj = Math.min(prvi, drugi);
                int veciBroj = Math.max(prvi, drugi);

                // StringBuilder za kreiranje rezultata.
                StringBuilder rezultat = new StringBuilder();
                rezultat.append("Prosti brojevi između ").append(manjiBroj).append(" i ").append(veciBroj).append(" su: ");

                // Iterira kroz brojeve između manjeg i većeg.
                for (int i = manjiBroj; i <= veciBroj; i++) {
                    if (prost(i)) { // Provjerava je li broj prost.
                        rezultat.append(i).append(","); // Dodaje broj u rezultat.
                    }
                }

                // Uklanja zadnji zarez i dodaje točku na kraj.
                rezultat.deleteCharAt(rezultat.length() - 1);
                rezultat.append(".");

                // Postavlja rezultat u labelu za ispis.
                ispis.setText(rezultat.toString());
            }
        });

        // Čini okvir vidljivim korisniku.
        okvir.setVisible(true);

        // Postavlja ponašanje okvira pri zatvaranju (zatvara aplikaciju).
        okvir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Metoda za provjeru je li broj prost.
    private static boolean prost(int broj) {
        if (broj < 2) {
            return false; // Brojevi manji od 2 nisu prosti.
        }

        // Provjera dijelitelja od 2 do (broj - 1).
        for (int i = 2; i < broj; i++) {
            if (broj % i == 0) {
                return false; // Ako je djeljiv, nije prost.
            }
        }

        return true; // Ako nije pronađen nijedan djelitelj, broj je prost.
    }
}
