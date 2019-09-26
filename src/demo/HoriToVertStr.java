package demo;

import java.util.Scanner;

public class HoriToVertStr {

	public static void main(String[] args) {
	       
	        String input = "shubham";
	        
	        for(int j=0;j<input.length();j++)
	        {
	        	char input1=input.charAt(j);
	             System.out.print(input1);	
	        }
	        
	   System.out.println(" ");
	       

	        for(int i = 0; i < input.length(); i++) 
	        {
	            char letter = input.charAt(i);
	         
	            System.out.println(letter);
	        }
	    }

}
