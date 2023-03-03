package Easy;

import java.util.ArrayList;
import java.util.List;

public class Fizzbuzz {

	public static void main(String[] args) {
		fizzBuzz(5);
	}
		public static void fizzBuzz(int n) {
	        
	        List<String> res= new ArrayList<>();
	        for(int i=1;i<=n;i++)
	        {
	            if((i%3==0) && (i%5==0))
	            {
	                res.add("FizzBuzz");
	            }
	            else if(i%3==0){
	            res.add("Fizz");}
	            else if(i%5==0)
	            {
	                res.add("Buzz");
	            }
	            else{
	            res.add(String.valueOf(i));
	            }
	          
	        }
	       System.out.println(res);
	    } 
	    

	}


