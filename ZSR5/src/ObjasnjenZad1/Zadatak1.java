package ObjasnjenZad1;

// Uvozi potrebne biblioteke za GUI (Swing) i obradu događaja.
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* Program kreira GUI s tekstualnim okvirom, gumbom i tekstualnim područjem.
   Klikom na gumb, tekst unesen u okvir se transformira zamjenom velikih i malih slova,
   a zatim dodaje kao novi redak u tekstualno područje. */

public class Zadatak1 {
    public static void main(String[] args) {
        // Kreira glavni prozor (okvir) aplikacije.
        JFrame okvir = new JFrame();
        okvir.setSize(600, 600); // Postavlja dimenzije okvira (600x600 piksela).

        // Kreira tekstualni okvir za unos podataka.
        JTextField tekstualniOkvir = new JTextField();

        // Kreira gumb s natpisom "Potvrdi".
        JButton gumb = new JButton("Potvrdi");

        // Kreira tekstualno područje za prikaz obrađenog teksta.
        JTextArea tekstualnoPodrucje = new JTextArea();

        // Postavlja vertikalni raspored elemenata unutar okvira.
        okvir.setLayout(new BoxLayout(okvir.getContentPane(), BoxLayout.Y_AXIS));

        // Dodaje komponente (tekstualni okvir, gumb i tekstualno područje) u okvir.
        okvir.add(tekstualniOkvir);
        okvir.add(gumb);
        okvir.add(tekstualnoPodrucje);

        // Dodaje slušač događaja za gumb.
        gumb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Preuzima tekst unesen u tekstualni okvir.
                String unosTeksta = tekstualniOkvir.getText();

                // Poziva metodu za zamjenu velikih i malih slova.
                String novitekst = pretvori_tekst(unosTeksta);

                // Dodaje obrađeni tekst kao novi redak u tekstualno područje.
                tekstualnoPodrucje.append("\n" + novitekst);
            }
        });

        // Čini okvir vidljivim korisniku.
        okvir.setVisible(true);

        // Postavlja ponašanje okvira pri zatvaranju (zatvara aplikaciju).
        okvir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Metoda za zamjenu velikih slova malima i obrnuto.
    private static String pretvori_tekst(String tekst) {
        StringBuilder novitekst = new StringBuilder(); // Inicijalizira StringBuilder za gradnju novog teksta.
        char[] znakovi = tekst.toCharArray(); // Pretvara uneseni tekst u niz znakova.

        // Iterira kroz svaki znak u nizu.
        for (int i = 0; i < znakovi.length; i++) {
            char znak = znakovi[i]; // Dohvaća trenutni znak.

            // Provjerava je li znak veliko slovo.
            if (Character.isUpperCase(znak)) {
                novitekst.append(Character.toLowerCase(znak)); // Dodaje malo slovo.
            }
            // Provjerava je li znak malo slovo.
            else if (Character.isLowerCase(znak)) {
                novitekst.append(Character.toUpperCase(znak)); // Dodaje veliko slovo.
            }
            // Ako nije ni veliko ni malo slovo, dodaje znak bez promjene.
            else {
                novitekst.append(znak);
            }
        }

        // Vraća obrađeni tekst kao String.
        return novitekst.toString();
    }
}
