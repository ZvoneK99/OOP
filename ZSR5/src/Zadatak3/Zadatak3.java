package Zadatak3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zadatak3
{
    private static JTextField tekst;
    private static double prvi_broj, drugi_broj, rezultat;
    private static char operacija;

    public static void main(String[] args)
    {
        JFrame okvir = new JFrame();
        okvir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okvir.setSize(350, 350);

        tekst = new JTextField();
        tekst.setFont(new Font("Arial", Font.PLAIN, 20));
        okvir.add(tekst, BorderLayout.NORTH);

        JPanel tablica = new JPanel(new GridLayout(4, 4));

        String[] buttoni = {
                "1", "2", "3", "+",
                "4", "5", "6", "-",
                "7", "8", "9", "*",
                "C","=", "0", "/"   };

        for (int i=0; i<buttoni.length; i++)
        {
            JButton button = new JButton(buttoni[i]);
            button.addActionListener(new ButtonClickListener());
            button.setFont(new Font("Arial", Font.PLAIN, 20));
            tablica.add(button);
        }
        okvir.add(tablica, BorderLayout.CENTER);
        okvir.setVisible(true);
    }
    private static class ButtonClickListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            JButton source = (JButton) e.getSource();
            klik(source.getText());
        }
    }
    private static void klik(String znak)
    {
        switch (znak)
        {
            case "C":
                tekst.setText("");
                break;
            case "=":
                {
                    drugi_broj = Double.parseDouble(tekst.getText());
                    izracunaj();
                    tekst.setText(String.valueOf(rezultat));
                }
                break;
            case "+":
            case "-":
            case "*":
            case "/":
                {
                    prvi_broj = Double.parseDouble(tekst.getText());
                    operacija = znak.charAt(0);
                    tekst.setText("");
                }
                break;
            default:
                tekst.setText(tekst.getText() + znak);
                break;
        }
    }
    private static void izracunaj()
    {
        switch (operacija)
        {
            case '+':
                rezultat = prvi_broj + drugi_broj;
                break;
            case '-':
                rezultat = prvi_broj - drugi_broj;
                break;
            case '*':
                rezultat = prvi_broj * drugi_broj;
                break;
            case '/':
                rezultat = prvi_broj / drugi_broj;
                break;
        }
    }
}
