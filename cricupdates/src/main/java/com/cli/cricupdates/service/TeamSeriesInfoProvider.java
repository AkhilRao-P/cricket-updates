package com.cli.cricupdates.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.cli.cricupdates.dao.CriccApiDao;
import com.cli.cricupdates.dto.SeriesDetails;
import com.cli.cricupdates.dto.SeriesDetailsList;
import com.cli.cricupdates.objectmapper.SeriesDetailsListObjMapper;

@Service
public class TeamSeriesInfoProvider {

	@Value("${criccapi.url}")
	private String url;

	@Autowired
	private SeriesDetailsListObjMapper objMapper;

	@Autowired
	private CriccApiDao criccApi;

	// below method call return Men series Details
	public void displayMenTeamSeries(String option) {
		Integer seriesCount = 0;
		if (option.length() <= 3 && option.length() >= 1) {

			SeriesDetailsList seriesDetailsList = objMapper.getAllSeriesInfo(criccApi.getAPIJsonData(url));
			
			//below method returns full Country Name from the available Map object in CountryNameUtility class 
			String team = CountryNameUtility.getCountryName(option);
			if (team != null) {
				for (SeriesDetails series : seriesDetailsList.getSeriesDetailsList()) {
					if (series.getName().contains(team) && !series.getName().contains("Women")) {
						System.out.println("----------------------------------------------------------------");
						System.out.println("sereis: " + (++seriesCount));
						System.out.println(series.toString());
					}
				}

			}
			
		} else {
			System.out.println("No series are available for the Team " + option);
		}

		if (seriesCount == 0) {
			System.out.println("No series are available for the Team " + option);
		}
	}

	// below method call return Women series Details

	public void displayWomenTeamSeries(String option) {

		Integer seriesCount = 0;
		if (option.length() <= 3 && option.length() > 1) {

			SeriesDetailsList seriesDetailsList = objMapper.getAllSeriesInfo(criccApi.getAPIJsonData(url));
			
			//below method returns full Country Name from the available Map object in CountryNameUtility class 
			String team = CountryNameUtility.getCountryName(option);
			
			if (team != null) {
				for (SeriesDetails series : seriesDetailsList.getSeriesDetailsList()) {
					if (series.getName().contains(team) && series.getName().contains("Women")) {
						System.out.println("----------------------------------------------------------------");
						System.out.println("sereis: " + (++seriesCount));
						System.out.println(series.toString());
					}
				}

			}
		} else {
			System.out.println("No series are available for the Team " + option);
		}
		if (seriesCount == 0) {
			System.out.println("No series are available for the Team " + option);
		}
	}
}
