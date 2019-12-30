package assignment1;

class CompareTwo
	{
	void compare(int x,int y)
	{
		System.out.println("\t"+x+"!="+y);
		System.out.println("\t"+x+"<"+y);
		System.out.println("\t"+x+"<="+y);
	}
	
	}

public class Compare 
{

	public static void main(String[] args) 
	{
		CompareTwo boat=new CompareTwo();
		boat.compare(25,39);

	}

}
