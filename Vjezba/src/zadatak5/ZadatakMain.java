package zadatak5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZadatakMain {
	public static void main(String[]args) {
		ArrayList<Student> studenti = new ArrayList<>();
		
		 studenti.add(new Student("Ana", "Anić", "Računarstvo", 1, "12345"));
	     studenti.add(new Student("Marko", "Marić", "Elektrotehnika", 2, "23456"));
	     studenti.add(new Student("Ivana", "Ivić", "Računarstvo", 3, "34567"));
	     studenti.add(new Student("Petar", "Petrović", "Elektrotehnika", 1, "45678"));
	     studenti.add(new Student("Lana", "Lanić", "Strojarstvo", 2, "56789"));
	     studenti.add(new Student("Nikola", "Nikolić", "Računarstvo", 1, "67890"));
	     studenti.add(new Student("Maja", "Majić", "Elektrotehnika", 3, "78901"));
	     studenti.add(new Student("Ivan", "Ivanković", "Strojarstvo", 1, "89012"));
	     studenti.add(new Student("Lucija", "Lucić", "Računarstvo", 2, "90123"));
	     studenti.add(new Student("Karlo", "Karlić", "Ekonomija", 3, "01234"));
	     
	     Map<String, List<Student>> studentiPoStudiju = new HashMap<>();
	     
	   //Sortiranje studenata
	     studenti.sort(Comparator.comparing(Student::getGodinaStudija));
	    
	     for(Student s : studenti) {
	    	 studentiPoStudiju.computeIfAbsent(s.getStudij(), k->new ArrayList<>()).add(s);
	     }
	     for(Map.Entry<String, List<Student>> entry : studentiPoStudiju.entrySet()) {
	    	 System.out.println(entry.getKey()+":");
	    	 for(Student s : entry.getValue()) {
	    		 System.out.println(" "+ s);
	    	 }
	     }
	}
}
