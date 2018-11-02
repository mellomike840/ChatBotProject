package chat.model;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

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
		this.content = "some content ";
	}
	
	
	public Chatbot(String content)
	{
		this.joke = new String("What did the elephant say to the chicken?");
		this.content = new String(content);
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
		responseList.add("k");
		responseList.add("dang");
		responseList.add("Jacob needs to shut his mouth");
		responseList.add("yo thats pretty coool");
		responseList.add("this is a reponse out of a list");
		responseList.add("this is a reponse out of a list");
		
		/*
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
		spookyList.add("Halloween");
		*/
		
		
		spookyList.add("Halloween");
		spookyList.add("Halloween");
		spookyList.add("Halloween");
		spookyList.add("Halloween");
		spookyList.add("Halloween");
		spookyList.add("Halloween");
		spookyList.add("Halloween");
		spookyList.add("Halloween");
		spookyList.add("Halloween");
		spookyList.add("Halloween");
		spookyList.add("Halloween");
		spookyList.add("Halloween");
		
	}
	

	
	public String processText(String userInput)
	{
	
		String answer = "You said: " + userInput + "\n" + "Chatbot says: ";
		
		if(userInput == null)
		{
			answer = "You said: " + userInput + "\n" + "Chatbot says: ";
		}
		else if(userInput.equals(getContent()))
		{
			answer = answer + "You said the special words";
		}
		
		
			return answer;
		

	}
	
	
	public String getContent()
	{
		return content;
	}
	
	public ArrayList<String> getSpookyList()
	{
		return spookyList;
	}
	
	public ArrayList<String> getResponseList()
	{
		return responseList;
	}
	
	public String getCurrentUser()
	{
		return currentUser;
	}
	
	
	public boolean legitimacyChecker(String test)
	{
		boolean legit = true;
		
		if(test == null)
		{
			legit = false;
		}
		else if(test.length() <= 1)
		{
			legit = false;
		}
		else if(test.contains("asdf") || test.contains("jkl") || test.contains("cvb"))
		{
			legit = false;
		}
		else
		{
			legit = true;
		}
		
		return legit;
		
	}
	

	public boolean spookyChecker(String word)
	{
		if(word.contains("Easter"))
		{
			return false;
		}
		else
			return true;
	}


	public boolean contentChecker(String contentCheck)
	{
		
		//or if(contentCheck.equals("text" + getContent() + "text") || contentCheck.equals("text" + getContent()) || contentCheck.equals(getContent() + "text") )
		if(contentCheck.contains("text"))
		{
			return false;
		}
		else
			return true;
		
		
		
		
	}
	
	
}
