package com.karthik.docker_jenkin;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        for(int i=1; i<6; i++){
        	for (int j=1; j<=i; j++){
            	System.out.print(" * ");
            	}
            	System.out.println();
               }
     }
}
