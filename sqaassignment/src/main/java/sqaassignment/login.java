package sqaassignment;

import java.util.ArrayList;

public class login {
	
	ArrayList<user> userList;
	int maxId = 1;

	public int registerUser(String username, String password)
	{
		int result = 0;
		if(username != "" & password !="")
		{
			user _usr = new user(maxId, username, password);
			maxId+=1;
			result = _usr.userId;
		}
		
		return result;
	}
	
	public int authenticateUse(String username, String password)
	{
		int result = 0;
		if(username != "" & password !="")
		{
			for (user _usr : userList) {
				if(_usr.username == username && _usr.password == password )
				{
					result = _usr.userId;
				}
			}
		}
		
		return result;
	}
	

}
