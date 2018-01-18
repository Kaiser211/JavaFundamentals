package com.assignmentsfunjava;
import java.util.HashMap;

public class Hashmatique {
	public static void main(String[] args) {
		
		HashMap<String, String> trackList = new HashMap<>();
		
		trackList.put("Kashaer", "I LOVE YOU");
		trackList.put("Guns and Rose", "DON'T CRY");
		trackList.put("Eagles", "HOTEL CALIFORNIA");
		trackList.put("Guns and Rose1", "NOVEMBER RAIN");
		
		String lyrics = trackList.get("Guns and Rose");
		
		System.out.println(lyrics);
		
	for (String key : trackList.keySet()) {
    		System.out.println(key + ": " + trackList.get(key));
		}
	}
}
