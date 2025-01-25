package com.cli.cricupdates.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SeriesDetails {

	private String id;
	private String name;
	private String startDate;
	private String endDate;
	private Integer odi;
	private Integer t20;
	private Integer test;
	private Integer matches;
	
	@Override
	public String toString() {
		return getName() + "\n" 
				+ "StartDate: " + getStartDate() + "\t" + "endDate: " + getEndDate() +"\n"
				+ "odi: " + getOdi() + "\t" + "test: " + getTest() + "\t"
				+ "T20I: " + getT20();
	}
	
	
}
