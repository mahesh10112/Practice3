package com.qa.util;

import java.util.Random;

import com.github.javafaker.Faker;

import enums.Values;

public class DataGenerator {

	Faker faker=new Faker();
	
	
	public String getMarketValue() {
	 Long val=	faker.number().numberBetween(Values.MIN, Values.MAX);
		return  val.toString();
	}
	public String getCarpetValue() {
		Long l=Values.carpetValue;
		return (l.toString());
	}
	
	public String getPincode() {
		
		Long pcode=faker.number().numberBetween(99999l, 999999l);
		return pcode.toString();
	}
	
	public String getFullName()
	{
		return faker.name().fullName();
	}
	
	public String getEmail()
	{
		String s= faker.internet().emailAddress();
	     s= s.replaceFirst("\\.", "");
	     return s;
	}
	
	public String getNumber()
	{      
		String ph=faker.number().digits(10);
		

		ph=ph.substring(0, 10);
		Character ch=ph.charAt(0);
		ph=ph.replace(String.valueOf(ch),"9");

		return ph;
	}
	public String getPassword()
	{
		return faker.internet().password(8, 15)+"U@1";
	}
	
	public  String generateFakePan() {
        // Generate random characters for the PAN number
        StringBuilder panNumber = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            // Generate a random uppercase letter
            char randomChar = (char) (random.nextInt(26) + 'A');
            panNumber.append(randomChar);
        }
        // Generate random digits for the PAN number
        for (int i = 0; i < 4; i++) {
            // Generate a random digit between 0 and 9
            int randomDigit = random.nextInt(10);
            panNumber.append(randomDigit);
        }
        // Generate a random uppercase letter for the last character of the PAN number
        char lastChar = (char) (random.nextInt(26) + 'A');
        panNumber.append(lastChar);
        return panNumber.toString();
    }	

	
}
