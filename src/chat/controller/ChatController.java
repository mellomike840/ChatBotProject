package chat.controller;

import javax.swing.JOptionPane;

import chat.model.Chatbot;
import chat.model.UserConstructor;


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
		bot = new Chatbot();
	}
	
	
	
	//-------------------------------------------------------------
	public void start()
	{
		String userInput = "";
		//loops until userInput is "quit"
		while(!userInput.equals("quit"))
		{
			userInput = interactWithChatbot(userInput);
		}
		
	}
	
	//-------------------------------------------------------------
	//Methods
	
	
	
	public String interactWithChatbot(String userInput)
	{
		userInput = JOptionPane.showInputDialog("What is your name?");
		if(!userInput.equals("quit"))
		{
			user.setUserName(userInput);
			JOptionPane.showMessageDialog(null, bot.processText(userInput));
		}
		else if(userInput.equals("quit"))
		{
			JOptionPane.showMessageDialog(null, "Goodbye " + user.getUserName());
		}
		
		return userInput;
	}
	
	
	
	
	
	
	
	
	
	public Chatbot getChatbot()
	{
		return bot;
	}
	
	
	public String useChatbotCheckers(String ListNameSubString)
	{
		//returns the list with the passed subString 
		
		String list = "";
		//String list = bot.spookyList.get(bot.spookyList.size());
		
		for(int i = 0; i < bot.spookyList.size(); i++)
		{
			list = list + bot.spookyList.get(i);
		}
		
		return list;
		
	}
}
