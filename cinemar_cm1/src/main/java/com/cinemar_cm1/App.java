package com.cinemar_cm1;

import static spark.Spark.*;

public class App {
	
	public static void main(String[] args) {
		
		get("/buenas",(request,response) -> "Muy buenas gente!!!");
		get("/saludar",(request,response) -> "Muy buenos dias");
		
	}

}
