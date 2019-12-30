package assignment1;

class math
{
void table(int x)
{
		System.out.println("Enter a Number:\t"+x);
		for(int i=1;i<=10;i++)
		{
			System.out.println(x+"x"+i+"="+(x*i));
		}
		
	
}

}



public class Table 
{

public static void main(String[] args)
{
math dude=new math();	
dude.table(8);

}

}
