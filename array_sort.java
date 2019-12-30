package assignment1;

class array_sort
{
	void asc()
		{
		  int [] arr = new int [] {50, -20 , 0, 30, 40, 60, 10};     
	        int temp = 0;  
	        System.out.println("Elements of original array: ");    
	        for (int i = 0; i < arr.length; i++)
	        {     
	            System.out.print(arr[i] + " ");    
	        }    
	            
	        //Sort the array in ascending order    
	        for (int i = 0; i < arr.length; i++)
	        {     
	            for (int j = i+1; j < arr.length; j++) 
	            {     
	               if(arr[i] > arr[j]) 
	               {    
	                   temp = arr[i];    
	                   arr[i] = arr[j];    
	                   arr[j] = temp;    
	               }     
	            }
	        }
		}
}
