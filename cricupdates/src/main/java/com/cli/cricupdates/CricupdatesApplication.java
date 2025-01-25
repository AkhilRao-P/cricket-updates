package com.cli.cricupdates;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.shell.command.annotation.CommandScan;

@SpringBootApplication
@PropertySource("criccapi.properties")
@CommandScan
public class CricupdatesApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(CricupdatesApplication.class, args);
	}

}
