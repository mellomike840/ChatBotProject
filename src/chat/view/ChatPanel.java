package chat.view;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import chat.controller.ChatController;
import java.awt.Dimension;
import chat.controller.IOController;

public class ChatPanel extends JPanel
{	
	private ChatController appController;
	private SpringLayout appLayout;
	private JButton saveButton;
	private JButton loadButton;
	private JButton chatButton;
	private JButton checkerButton;
	private JTextField chatField;
	private JTextArea chatArea;
	private JScrollPane chatPane;
	private JButton resetButton;
	
	public ChatPanel(ChatController appController)
	{
		super();
		this.appController = appController;
		appLayout = new SpringLayout();
		
		
		saveButton = new JButton("Save");
		loadButton = new JButton("Load");
		chatButton = new JButton("Chat");
		checkerButton = new JButton("Check Text");
		chatField = new JTextField("Talk to bot here", 50);
		chatArea = new JTextArea("Chat Area", 20, 50);
		chatPane = new JScrollPane();
		resetButton = new JButton("Reset");
		
		
		setupScrollPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	
	private void setupScrollPane()
	{
		chatArea.setEditable(false);
		chatArea.setLineWrap(true);
		chatArea.setWrapStyleWord(true);
		
		chatPane.setViewportView(chatArea);
		chatPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		chatPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	}
	
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.setPreferredSize(new Dimension(800, 600));
		this.setBackground(Color.BLACK);
		this.add(chatPane);
		this.add(chatButton);
		this.add(resetButton);
		this.add(saveButton);
		this.add(loadButton);
		this.add(checkerButton);
		this.add(chatField);
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, chatPane, 50, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, chatPane, 50, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, chatPane, -50, SpringLayout.EAST, this);
		
		appLayout.putConstraint(SpringLayout.NORTH, chatField, 30, SpringLayout.SOUTH, chatPane);
		appLayout.putConstraint(SpringLayout.WEST, chatField, 0, SpringLayout.WEST, chatPane);
		appLayout.putConstraint(SpringLayout.EAST, chatField, 0, SpringLayout.EAST, chatPane);
		appLayout.putConstraint(SpringLayout.NORTH, checkerButton, 0, SpringLayout.NORTH, chatButton);
		
		appLayout.putConstraint(SpringLayout.NORTH, chatButton, 62, SpringLayout.SOUTH, chatField);
		appLayout.putConstraint(SpringLayout.WEST, checkerButton, 0, SpringLayout.WEST, chatPane);
		appLayout.putConstraint(SpringLayout.EAST, chatButton, 0, SpringLayout.EAST, chatPane);
		
		appLayout.putConstraint(SpringLayout.NORTH, saveButton, 0, SpringLayout.NORTH, chatButton);
		
		appLayout.putConstraint(SpringLayout.NORTH, loadButton, 0, SpringLayout.NORTH, chatButton);
		
		appLayout.putConstraint(SpringLayout.WEST, saveButton, 78, SpringLayout.EAST, resetButton);
		appLayout.putConstraint(SpringLayout.WEST, resetButton, 365, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, loadButton, -61, SpringLayout.WEST, resetButton);
		appLayout.putConstraint(SpringLayout.NORTH, resetButton, 0, SpringLayout.NORTH, chatButton);
	}
	
	private void setupListeners()
	{
		
		chatButton.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent click)
			{
				String input = chatField.getText();
				String output = "";
				output = appController.interactWithChatbot(input);
				chatArea.append(output);
				chatField.setText("");
				chatArea.setCaretPosition(chatArea.getDocument().getLength());
			}
				});
		
		
		resetButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				chatArea.setText("");
			}
		});
		
		saveButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String chatText = chatArea.getText();
				String path = ".";
				IOController.saveText(appController, path, chatText);
				chatArea.setText("Chat saved!");
				
			}
		});
		
		
	}
	
	

}
