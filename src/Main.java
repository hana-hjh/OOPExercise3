import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Bday date = new Bday(1, 9, 2003);
		Person p1 = new Person("Hannah", date);
		
		System.out.println("Name & Birthdate: " + p1.Name() + " " + p1.Day());
	}
}
