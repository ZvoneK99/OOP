package Zadatak03;

import java.util.HashMap;

public class TelefonskiImenik {
	public static void main(String[]args) {
		HashMap<String, String> imenik = new HashMap<>();
		imenik.put("Zvone", "063-355-595");
		imenik.put("Gabi", "063-954-894");
		
		System.out.println("Zvonin broj "+imenik.get("Zvone"));
	}
}
