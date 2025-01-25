package com.cli.cricupdates.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonSetter;

import lombok.Data;

@Data
@JsonIgnoreType()
public class SeriesDetailsList {
	
	@JsonSetter("data")
	private List<SeriesDetails> SeriesDetailsList;
}
