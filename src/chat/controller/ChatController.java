package chat.controller;

import javax.swing.JOptionPane;

import chat.model.Chatbot;
import chat.model.UserConstructor;
import java.util.ArrayList;


public class ChatController
{
	//Data member declaration section
	private UserConstructor user;
	private Chatbot bot;
	
	
	
	//-------------------------------------------------------------
	public ChatController()
	{
		//instances of constructors, data member initialization 
		user = new UserConstructor();
		bot = new Chatbot("my chatbot");
	}
	
	
	
	//-------------------------------------------------------------
	public void start()
	{
		/*
		String userInput = "";
		//loops until userInput is "quit"
		while(!userInput.equals("quit"))
		{
			userInput = interactWithChatbot(userInput);
		}
		*/
		
		
		
	}
	
	//-------------------------------------------------------------
	//Methods
	
	
	
	public String interactWithChatbot(String text)
	{
		/*
		if(text == null)
		{
			return "you entered null";
		}
		else 
		{
			text = JOptionPane.showInputDialog("What is your name?");
			if(!text.equals("quit"))
			{
				user.setUserName(userInput);
				JOptionPane.showMessageDialog(null, bot.processText(userInput));
			}
			else if(text.equals("quit"))
			{
				JOptionPane.showMessageDialog(null, "Goodbye " + user.getUserName());
			}
			
			return text;
		}
		*/
		
		String output = "";
		output += bot.processText(text);
		return output;
		
	}
	
	
	
	public Chatbot getChatbot()
	{
		return bot;
	}
	
	public ArrayList<String> useChatbotCheckers(String word)
	{
		return bot.getSpookyList();
	}
	
	
	
}
