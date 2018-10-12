package model;

public class UserConstructor
{
	private String userName;
	private String userAge;
	
	
	//-----------------------------------------------------------------------------
	
	
	public UserConstructor()
	{
		//default constructor
	}
	
	
	public UserConstructor(String userName, String userAge)
	{
		this.userName = userName;
		this.userName = userAge;
	}
	
	public String getUserName()
	{
		return userName;
	}
	
	public String getUserAge()
	{
		return userAge;
	}
	
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	
	public void setUserAge(String userAge)
	{
		this.userAge = userAge;
	}
	
}
