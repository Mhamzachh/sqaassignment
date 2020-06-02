package sqaassignment;

import java.util.Date;

public class session {
	int userId;
	Date expiry;
	
	public session(int userId, Date expiry)
	{
		this.userId = userId;
		this.expiry = expiry;
	}
}
