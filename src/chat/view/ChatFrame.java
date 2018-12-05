package chat.view;

import javax.swing.JFrame;
import chat.controller.ChatController;

public class ChatFrame extends JFrame
{
	private ChatController appController;
	private ChatPanel appPanel;
	
	public ChatFrame(ChatController appController)
	{
		super();
		
		this.appController = appController;
		this.appPanel = new ChatPanel(appController);
		
		setupFrame();
	}
	
	public void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(420,420);
		this.setTitle("This is a frame");
		this.setResizable(true);
		this.setVisible(true);
	}
	

}
