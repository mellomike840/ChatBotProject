package model;

import java.util.ArrayList;

public class Chatbot
{

	private ArrayList<String> spookyList;
	private ArrayList<String> responseList;
	
	private String content;
	private String joke;
	private String currentUser;
	
		
	public Chatbot()
	{
		this.joke = "What did the elephant say to the chicken?";
		this.content = new String("boring content");
		this.currentUser = new String("This is the default user ");
		
		this.responseList = new ArrayList<String>();
		this.spookyList = new ArrayList<String>();
		
		buildTheLists();
	}
	
	
	//helper methods are private
	private void buildTheLists()
	{
		
		responseList.add("Hello! How are you?");
		responseList.add("Ay whats poppin b");
		responseList.add("Yeet");
		responseList.add("Hi");
		responseList.add("Hello");
		responseList.add("WOW");
		responseList.add("OKay");
		responseList.add("...");
		responseList.add("YOu are Dumb");
		responseList.add("How Boring");
		
		spookyList.add("We are the Knights who say Nee!");
		spookyList.add("McDonalds");
		spookyList.add("Boo");
		spookyList.add("Danny Elfman");
		spookyList.add("You are living a lie");
		spookyList.add("Nobody loves you");
		spookyList.add("Obama is gone");
		spookyList.add("1 Spider");
		spookyList.add("...         AHHHHHHHHH!");
		spookyList.add("YOu are getting deported");
		
	}
	
	
	
	public String processText(String userText)
	{
		String answer = "";
		
		answer = "You said your name is " + userText;
		
		return answer;
	}
	
	
	
}
