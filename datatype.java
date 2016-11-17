import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);  
        int inputint = scan.nextInt(); 
        double resd= scan.nextDouble();
        String str  ;
        while( (str = scan.nextLine()).equals("") ); 
       
        
	System.out.println(inputint+i);
        
	System.out.println(resd+resd);
         
	System.out.println(s+str);   
        scan.close();
    }
}