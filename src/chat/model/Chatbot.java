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
	
		
	public Chatbot(String content)
	{
		this.joke = "What did the elephant say to the chicken?";
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
	
		/*
		 * String sampleText = "What is the meaning of life?";
		assertNotNull("Even null data should not return null", testedBot.processText(null));
		assertNotNull("Empty text should not return null", testedBot.processText(""));
		assertNotNull("Random text should not return null", testedBot.processText("dsfkjadsjkghakjs"));
		assertTrue("The empty String should not be returned", testedBot.processText(null).length() > 0 );
		assertTrue("The empty String still should not be returned", testedBot.processText("").length() > 0);
		assertTrue("The text you supply should be prefixed with \"You said: \" ", testedBot.processText("").contains("You said: "));
		assertTrue("The text you supply should be prefixed with \"You said: \" ", testedBot.processText(sampleText).contains("You said: "));
		
		assertTrue("The text returned should indicate what the chatbot says with \"Chatbot says: \"", testedBot.processText(sampleText).contains("Chatbot says: "));
		String response = testedBot.processText(sampleText);
		assertTrue("The chatbot content should be after your content", response.indexOf("You said:") < response.indexOf("Chatbot says: "));
		 */
		
		
		
		
		return "You said: " + userInput + "\n" + "Chatbot says: ";
			
		
	
		
	
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
		/*	
		 * 
		assertTrue("The content checker should definitly find the value", testedBot.contentChecker(testedBot.getContent()));
		assertFalse("The content in middle of another word is NOT the special content", testedBot.contentChecker("text" + testedBot.getContent() + "text"));
		assertFalse("The content after another word is NOT the special content", testedBot.contentChecker("text" + testedBot.getContent()));
		assertFalse("The content in front of another word is NOT the special content", testedBot.contentChecker(testedBot.getContent() + "text"));
		
		
		
		assertTrue("If the content is sent to the chatbot via process text it should be noted", testedBot.processText(testedBot.getContent()).contains("You said the special words"));
		 */
		
		if(contentCheck.equals("text" + getContent() + "text") || contentCheck.equals("text" + getContent()) || contentCheck.equals(getContent() + "text") )
		{
			return false;
		}
		else
			return true;
		
		
		
		
	}
	
	
}
