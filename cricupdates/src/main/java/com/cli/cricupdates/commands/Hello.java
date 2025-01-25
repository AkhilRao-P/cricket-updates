package com.cli.cricupdates.commands;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class Hello {
	
	@ShellMethod(key = "hello" , value="I will say hello")
	public String sayHello(@ShellOption() String name) {
		return "Hello " + name;
		
	}
}
