package Zadatak1;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*Napisati program koji prikazuje formu sa tekstualnim okvirom za unos podataka, gumbom za potvrdu i tekstualnim područjem.
 U tekstualni okvir se unosi proizvoljni tekst. Pritiskom na gumb za potvrdu, tekst se dodaje kao novi redak u tekstualno područje,
  ali tako da se sva velika slova zamijene malima i obratno.*/

public class Zadatak1
{
    public static void main(String[] args)
    {
        JFrame okvir = new JFrame();
        okvir.setSize(400, 300);
        JTextField tekstOkvir = new JTextField();
        JButton gumb = new JButton("Izmjeni");
        JTextArea tekstPodrucje = new JTextArea();

        okvir.setLayout(new BoxLayout(okvir.getContentPane(), BoxLayout.Y_AXIS));
        
        okvir.add(tekstOkvir);
        okvir.add(gumb);
        okvir.add(tekstPodrucje);

        gumb.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String unosTeksta = tekstOkvir.getText();
                String novitekst = pretvoriTekst(unosTeksta);
                tekstPodrucje.append("\n"+ novitekst);
            }
        });

        okvir.setVisible(true);
        okvir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private static String pretvoriTekst(String tekst) {
        String novitekst = ""; 
        char[] znakovi = tekst.toCharArray();

        for (int i = 0; i < znakovi.length; i++) {
            char znak = znakovi[i];
            if (Character.isUpperCase(znak)) {
                novitekst += Character.toLowerCase(znak);
            } 
            else if (Character.isLowerCase(znak)) {
                novitekst += Character.toUpperCase(znak);
            } 
            else {
                novitekst += znak;
            }
        }
        return novitekst;
    }

}
