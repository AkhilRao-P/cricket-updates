package com.cli.cricupdates.dao;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import org.springframework.stereotype.Component;

@Component
public class CricApiDaoImpl implements CriccApiDao {
	
	//method call return API Json data in String format
	public  String getAPIJsonData(String url) {

		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(url))
				.GET()
				.build();
		
		HttpResponse<String> response = null;
		
		try {
			response = HttpClient.newHttpClient().send(request, BodyHandlers.ofString());
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return response.body();
	}
}
