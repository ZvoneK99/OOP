package ZAD1;

import java.util.ArrayList;
import java.util.Random;

class Zadatak {
    public static void main(String[] args) {
        // Popunjavanje liste studenata
        ArrayList<Student> studenti = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 50; i++) {
            studenti.add(new Student(1000 + i, "Student " + (i + 1), random.nextInt(5) + 1));
        }

        // Kreiranje PismeniIspit
        PismeniIspit pismeniIspit = new PismeniIspit("Matematika", "Prof. Marko", "20.01.2025 10:00", studenti, "Učionica 1");
        System.out.println(pismeniIspit);

        // Kreiranje UsmeniIspit
        UsmeniIspit usmeniIspit = new UsmeniIspit("Fizika", "Prof. Ana", "21.01.2025 12:00", studenti, "Učionica 2");
        System.out.println(usmeniIspit);
    }
}
