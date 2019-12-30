package assignment1;


class Product
{
	void cal(int x,int y) 
	{
		System.out.println("First number is:\t"+x);
		System.out.println("Second number is:\t"+y);
int p=x*y;
System.out.println("Product of two numers:\t" +x+"*"+y+"="+p);
	}
	

}

public class ProductOfTwoNumber 
{

	public static void main(String[] args)
	{
		Product a1=new Product();
		a1.cal(25, 5);
	}

}
