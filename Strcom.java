import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Strcom
{
public static void main(String[] args)
{
	String s1=null,s2 =null; //intialize string s1 and s2 to null
	boolean same=true;
	try
	{
	System.out.println(" Enter S1 string");
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in)); //to read user input of s1 string
	s1=br.readLine();
	
	System.out.println(" Enter S2 String");
	BufferedReader br1= new BufferedReader(new InputStreamReader(System.in)); //to read user input of s2 string
	s2=br1.readLine();
	
	}

	catch(IOException e) //to catch exception
	{
	System.out.println("Exception occured");
	}
	if (s1.equals(s2)) //to check whether both the string contents are same or not
	{ 
	System.out.println(same);
	}
	else {
	same= false;
	System.out.println(same);
	}
}
}