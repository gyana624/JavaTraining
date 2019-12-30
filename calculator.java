package assignment1;

//import java.util.Scanner;

class Display
	{
	int a;
	void cal(int x,int y)
	{
	System.out.println("Input First Number:\t"+x);
//	Scanner ant =new Scanner(System.in);
//	int a = ant.nextInt();
	System.out.println("Input First Number:\t"+y+"\n");
//	int b = ant.nextInt();
	System.out.println("\t"+x+"+"+y+"="+(x+y));
	System.out.println("\t"+x+"-"+y+"="+(x-y));
	System.out.println("\t"+x+"*"+y+"="+(x*y));
	System.out.println("\t"+x+"/"+y+"="+(x/y));
	System.out.println("\t"+x+" mod "+y+"="+(x%y));
	}
	
	
	}


public class OperatorOPeration
{
int a,b;
	public static void main(String[] args) 
	{
	Display a1=new Display();
	a1.cal(125,24);
	}

}
