package com.cli.cricupdates.objectmapper;

import org.springframework.stereotype.Component;

import com.cli.cricupdates.dto.SeriesDetailsList;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class SeriesDetailsListObjMapper {
	
	// method call returns maps criccAPi JSON data with SeriesDetailsList bean  
	public SeriesDetailsList getAllSeriesInfo(String jsonData) {
		
		ObjectMapper objMapper = new ObjectMapper();
		
		// Configure ObjectMapper to ignore unknown properties
		objMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		
		SeriesDetailsList seriesDetailsList = null;;
		try {
			seriesDetailsList = objMapper.reader().
					forType(SeriesDetailsList.class).
					readValue(jsonData);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return seriesDetailsList; 
	}
}
