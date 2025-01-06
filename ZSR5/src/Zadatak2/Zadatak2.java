package Zadatak2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*Napisati program koji prikazuje formu sa dva tekstualna okvira za unos podataka, gumbom za potvrdu i labelom. U dva tekstualna okvira se unose
proizvoljni cijeli brojevi. Pritiskom na gumb za potvrdu određuje se koji je od dva broj manji, a koji veći. Labeli se dodjeljuje sadržaj:
"Prosti brojevi između <manji od dva unesena broja> i <veći od dva unesena broja> su <svi prosti brojevi između unesenih brojeva>. */

public class Zadatak2
{
    public static void main(String[] args)
    {
        JFrame okvir = new JFrame();
        okvir.setSize(700, 700);
        JTextField a= new JTextField();
        JTextField b = new JTextField();
        JButton potvrdi = new JButton("Potvrdi");
        JLabel ispis = new JLabel();

        okvir.setLayout(new BoxLayout(okvir.getContentPane(), BoxLayout.Y_AXIS));
        okvir.add(new JLabel("Prvi broj:"));
        okvir.add(a);
        okvir.add(new JLabel("Drugi broj:"));
        okvir.add(b);
        okvir.add(potvrdi);
        okvir.add(ispis);

        potvrdi.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                    int prvi = Integer.valueOf(a.getText());
                    int drugi = Integer.valueOf(b.getText());

                    int manjiBroj = Math.min(prvi, drugi);
                    int veciBroj = Math.max(prvi, drugi);

                    StringBuilder rezultat = new StringBuilder();
                    rezultat.append("Prosti brojevi između ").append(manjiBroj).append(" i ").append(veciBroj).append(" su: ");
                for (int i=manjiBroj; i <= veciBroj; i++)
                {
                    if (prost(i))
                    {
                        rezultat.append(i).append(",");
                    }
                }
                rezultat.deleteCharAt(rezultat.length() - 1);
                rezultat.append(".");
                ispis.setText(rezultat.toString());
            }
        });

        okvir.setVisible(true);
        okvir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private static boolean prost(int broj)
    {
        int brojac=0;
        for (int i=2; i<broj; i++)
        {
            if (broj % i == 0)
            {
                brojac++;
            }
        }
       if(brojac != 0)
       {
           return false;
       }
       return true;
    }
}
