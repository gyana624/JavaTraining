package assignment1;

class Sum
{
void add(int x,int y)
{
	System.out.println("First number is:"+x);
	System.out.println("Second number is:"+y);
	int z=x/y;
	System.out.println("Division of\t"+x+"+"+y+"="+z);

}

}

public class SumOfTwoNumber
{

	public static void main(String[] args) 
	{
		Sum ab=new Sum();
		ab.add(74, 36);

	}

}
