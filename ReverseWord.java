package assignment1;



class Reverse
{
	void rev(String x)
	{
		System.out.println("Input a Word:\t"+x);
		String reverse = "";
		
		int length = x.length();
		for (int i = length - 1 ; i >= 0 ; i--)
		      reverse = reverse + x.charAt(i);

		    System.out.println("Reverse Word:\t " +reverse);

	}
}


public class ReverseWord 
{

	public static void main(String[] args) 
	{
		Reverse doke=new Reverse();
		doke.rev("dsaf");

	}
}

