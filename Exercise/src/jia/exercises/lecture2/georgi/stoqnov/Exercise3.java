/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jia.exercises.lecture2.georgi.stoqnov;

/**
 *
 * @author Georgi Styanov
 */
public class Exercise3 {
  public static void main(String[] args){
	
			Double result = 1.00;
		int n = 100;
		for (int i = 1; i <= n; i++) { 
			result = result * i; } 
		System.out.println(result);
	    int sum=0;
	    while(result !=0){
	    	double c = result%10.00;
	        sum += c;
	        result /= 10;
	     }
	     System.out.printf("%d\n", sum);

	    	
	    }

}
