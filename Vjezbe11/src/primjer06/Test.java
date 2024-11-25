package primjer06;

import java.util.ArrayList;

public class Test {
	public static void main(String[]args) {
		ArrayList<MultimedijskaDatoteka> datoteke = new ArrayList<>();
		
		MultimedijskaDatoteka m1 = new MultimedijskaDatoteka();
		MultimedijskaDatoteka m2 = new MultimedijskaDatoteka("File.mp4", 700);
		
		VideoDatoteka v1 = new VideoDatoteka();
		VideoDatoteka v2 = new VideoDatoteka("Film.mp4", 1500, "3840x2160", 120);
		
		AudioDatoteka a1 = new AudioDatoteka();
		AudioDatoteka a2 = new AudioDatoteka("Pjesma.mp3", 5, 320, 3.5);
		
		datoteke.add(m1);
		datoteke.add(m2);
		datoteke.add(v1);
		datoteke.add(v2);
		datoteke.add(a1);
		datoteke.add(a2);
		
		for(MultimedijskaDatoteka d : datoteke) {
			d.ispisiDetalje();
			System.out.println("--------------------------------");
		}
		
		int brojVideoDatoteka = 0;
        int brojAudioDatoteka = 0;
		for(MultimedijskaDatoteka datoteka : datoteke) {
			if(datoteka instanceof AudioDatoteka) {
				brojAudioDatoteka++;
			}
		}
		for(MultimedijskaDatoteka datoteka : datoteke) {
			if(datoteka instanceof VideoDatoteka) {
				brojVideoDatoteka++;
			}
		}
		System.out.println("Broj Audio Datoteka: "+brojAudioDatoteka);
		System.out.println("Broj Video Datoteka: "+brojVideoDatoteka);
		System.out.println("Ukupan broj kreiranih datoteka: "+MultimedijskaDatoteka.brojKreiranihDatoteka());
	}
}
