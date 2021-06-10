package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	private String firstName;

	private String lastName;
	private String country;
	private LinkedHashMap<String, String> countryOptions;
	private String faveriteLanguage;
	private LinkedHashMap<String, String> faveriteLanguageOptions;
	private String[] operatingSystems;

	public Student() {
		// populate country options: used IOS country code
		countryOptions = new LinkedHashMap<String, String>();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("IN", "India");
		countryOptions.put("US", "United States of America");

		faveriteLanguageOptions = new LinkedHashMap<String, String>();
		faveriteLanguageOptions.put("Java", "Java");
		faveriteLanguageOptions.put("C#", "C#");
		faveriteLanguageOptions.put("PHP", "Java");
		faveriteLanguageOptions.put("Ruby", "Ruby");

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	
	public LinkedHashMap<String, String> getFaveriteLanguageOptions() {
		return faveriteLanguageOptions;
	}

	public String getFaveriteLanguage() {
		return faveriteLanguage;
	}

	public void setFaveriteLanguage(String faveriteLanguage) {
		this.faveriteLanguage = faveriteLanguage;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	

}
