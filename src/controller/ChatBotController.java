package controller;

import javax.swing.JOptionPane;
import model.UserConstructor;


public class ChatBotController
{
	//Data member declaration section
	private UserConstructor user;
	
	//-------------------------------------------------------------
	public ChatBotController()
	{
		//instances of constructors, data member initialization 
		user = new UserConstructor();
	}
	
	
	
	//-------------------------------------------------------------
	public void start()
	{
		String userInput = "";
		//loops until userInput is "quit"
		while(!userInput.equals("quit"))
		{
			userInput = JOptionPane.showInputDialog("What is your name?");
			if(!userInput.equals("quit"))
			{
				user.setUserName(userInput);
				respond(user.getUserName());
			}
			else if(userInput.equals("quit"))
			{
				JOptionPane.showMessageDialog(null, "Goodbye " + user.getUserName());
			}
			
		}
		
	}
	
	//-------------------------------------------------------------
	//Methods
	
	/**
	 * Method Stub
	 * @param returnString
	 * @return
	 */
	public String respond(String userInput)
	{
		
		if(userInput.equals( user.getUserName() ))
		{
			JOptionPane.showMessageDialog(null, "Hello " + user.getUserName());
		}
		
		
		
		
		
		return null;
	}
	
	
	
	
	
	
}
