package com.cli.cricupdates.service;

import java.util.HashMap;
import java.util.Map;

public class CountryNameUtility {
		
		private static Map<String, String> createMap() {
		    Map<String,String> countryMap = new HashMap<String,String>();
		    countryMap.put("IND", "India");
		    countryMap.put("ENG", "England");
		    countryMap.put("RSA", "South Africa");
		    countryMap.put("WI", "West Indies");
		    countryMap.put("NZ", "New Zealand");
		    countryMap.put("SL", "Sri Lanka");
		    countryMap.put("AFG", "Afganisthan");
		    countryMap.put("BAN", "Bangladesh");
		    countryMap.put("IRE","Ireland");
		    return countryMap;
		}
		
		public static String getCountryName(String shortName) {
			String countryName = null;
			Map<String,String> countryMap = createMap();
			if(countryMap.containsKey(shortName)) {
				countryName = countryMap.get(shortName);
			}	
			return countryName;			
		}
		
	}
