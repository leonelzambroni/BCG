package com.sticks.sticks;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int sticks = 21;
		Scanner s = new Scanner(System.in);                
                String player = "";
                int con = 0;
                System.out.println("Player 1's turn. 21 sticks remaining");
		while (sticks >=1){
			System.out.println("Take 1 or 2 sticks");
			int input = 0;
                        while (true)
                        {
                            if (s.hasNextInt())
                            {
                            	try 
                            	{
                            	input = s.nextInt(); 
                            	}
                            	catch(InputMismatchException e) 
                            	{
                            		System.out.println("That is not a number! ");

                            	}
                            	if (input == 1  || input ==2)
                            	{                          
                            		break;                        
                            	}
                            	else
                            	{
                            		System.out.println("Enter only 1 or 2");  
                                

                            	}
                            	
                            }   

                        }
			sticks = sticks -input;
                        if(con%2==0)
                        {
                            player = "Player 2";
                        }
                        else
                        {
                            player = "Player 1";
                        }
                        if(sticks==-1)
                        {
                            sticks =0;
                        }
			System.out.println(player + "'s turn. " +sticks + " sticks remaining");
                        con++;
			
		}
                
                if(con%2==0)
                {
                    player = "Player 1";
                }
                else
                {
                    player = "Player 2";
                }
		System.out.println (player + " won!");
        
    
    }
}
