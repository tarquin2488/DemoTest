package webDriver;

import java.util.Random;

public class CommonMethod {
	
	/**
	 * Method To Generate Random UserName
	 * @return UserName
	 */
	
	public static String generateUsername()
	{
		 String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		 Random rnd = new Random();
		 int len=10;
		 
		   StringBuilder sb = new StringBuilder(len);
		   for(int i = 0; i < len; i++)
		      sb.append(AB.charAt(rnd.nextInt(AB.length())));
		   return sb.toString();
		
	}
	
	

}
