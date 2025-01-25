package com.cli.cricupdates.commands;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.command.annotation.Command;
import com.cli.cricupdates.service.TeamSeriesInfoProvider;

@Command(command = "series")
public class fetchSeriesInfo {	
	
	@Autowired
	TeamSeriesInfoProvider seriesDetails;
	
	@Command(command = "-m")
	public void seriesMen(String countryName) 
	{	 
		seriesDetails.displayMenTeamSeries(countryName);
	}
	
	@Command(command = "-w")
	public void seriesWomen(String countryName) 
	{	 
		seriesDetails.displayWomenTeamSeries(countryName);
	}
}
