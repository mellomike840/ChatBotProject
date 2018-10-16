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
		
		
		spookyList.add("We are the Knights who say Nee!");
		spookyList.add("McDonalds");
		
	}
	
	
	
	
	
	
	
}
