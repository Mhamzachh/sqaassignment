package sqaassignment;

import java.util.ArrayList;
import java.util.Date;

public class sessionManager {
	
	ArrayList<session> sessionList = new ArrayList<session>();
	
	public int createSession(int userId, int hours)
	{
		Date date = new Date();
		int _chours = date.getHours();
		int _fhours = _chours + hours;
		if(_fhours >=24 )
		{
			date.setDate(date.getDate() + 1);
			date.setHours(24 - hours);
		}
		else
		{
			date.setHours(hours);
		}
		
		if(this.findSession(userId) == null)
		{
			session _sess = new session(userId, date);
			this.sessionList.add(_sess);
			return 1;
		}
		
		return 0;
	}
	
	public int checkStatus(int userId)
	{
		session _sess = this.findSession(userId);
		if(_sess !=null)
		{
			if (new Date().before(_sess.expiry))
			{
				return 1;
			}
		}
		else
		{
			return 2;
		}
		
		return 0;
	}
	public session findSession(int userId)
	{
		for(session s : sessionList)
		{
			if(s.userId == userId)
			{
				return s;
			}
		}
		
		return null;
	}

}
