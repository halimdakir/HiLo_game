package com.company;

import java.util.Scanner;

/*
  Made by Halim Dakir
 */
public class HiLo {
	
			public static int playGame(int maxNumber) {
						int answer = (int)(Math.random() * maxNumber) + 1;
						return answer;
			}
			
			public static int customPlayGame(int minNumber, int maxNumber) {
						int answer =(int) ((Math.random() * ((maxNumber - minNumber) + 1)) + minNumber);
						return answer;
			}
	
			public static void giveResponse(int answer, int guess) {
					boolean status = false;
				
						if (guess > answer )
					 	 {
						   System.out.println ("Gissning var för hög!");
						}
						if (guess < answer )
						 {
						  System.out.println ("Gissning var för låg!");
						}
						if (guess == answer )
						{
						System.out.println ("Helt rätt!");
						}
			}
			
	public static void main(String[] args) {
		int maxNumber = 0;
		int minNumber = 0;
		int tryTimes = 0;
		int tryLeft = 0;
		int answer = 0;
		int guess=0 ;
				
			
				System.out.println (" ||  Välkomen till HiLo !  ||");
				System.out.println (" ");
				System.out.println (" Vilken svårighetsgrad ? ");
				System.out.println (" 1.  Lätt (1-10)");
				System.out.println (" 2.  Mellan (1-100)");
				System.out.println (" 3.  Svårt (1-1000) ");
				System.out.println (" 4.  Anpassa mitt spel ");
				
				Scanner scanner1 = new Scanner(System.in);
				int gameLevel = scanner1.nextInt();
				 
						if (gameLevel == 1)                     										 // sv�righetsgrad L�tt (1-10)
							{
									maxNumber= 10;
									answer= playGame(maxNumber);
									
							 }else if (gameLevel ==2)                                                 // sv�righetsgrad Mellan (1-100)
								        {
										      maxNumber =100;
										      answer= playGame(maxNumber);
										      
								        }else if (gameLevel == 3)                                    // sv�righetsgrad Sv�rt (1-1000)
									                {
											             maxNumber =1000;
											             answer= playGame(maxNumber);
											             
									                 }else if (gameLevel == 4)                        // sv�righetsgrad Anpassa mitt spel
										                       {
										    	                System.out.println ("Mata in minsta talet");
										    	                Scanner scanner2 = new Scanner(System.in);
										    	                minNumber = scanner2.nextInt();
												                System.out.println ("Mata in högsta talet");
												                Scanner scanner3 = new Scanner(System.in);
												                maxNumber = scanner3.nextInt();
												                answer= customPlayGame(minNumber, maxNumber);												               
										                       }
						
				         if(gameLevel == 4)                                                            //Anpassa mitt spel 
				         {           
						         System.out.println ("Mata in högsta antal försök");
						         Scanner scanner4 = new Scanner(System.in);
						         tryLeft = scanner4.nextInt();
						         System.out.println (" Now let's play!");
						    
							        do
								    {
									    	 
									    	 System.out.println ("Gissa på ett tal mellan"+" " +minNumber+" "+"och"+" "+maxNumber);
									    	 System.out.println ("("+tryLeft+" "+"försök kvar)");
									    	 Scanner scanner5 = new Scanner(System.in);
										     guess = scanner5.nextInt();
									         giveResponse(answer, guess);		        
									         tryTimes=tryTimes+1;
									         tryLeft = tryLeft-1;
									    }while(tryLeft != 0 && answer !=guess);
				                        if(tryLeft == 0) {
				                        	System.out.println ("Inga försök kvar. Lycka till nästa gång!");
				                        }else if (answer ==guess) {
				                        	System.out.println ("Du lyckades på"+" "+tryTimes+" "+"försök");
				                        }
					    
					         }else {							                                                   // sv�righetsgrad L�tt, Mellan, och Sv�rt
					        	 
							    while (guess != answer )
									      {
								    	   System.out.println ("Gissa på ett tal mellan 1 och"+" "+maxNumber);
								    	   Scanner scanner2 = new Scanner(System.in);
									       guess = scanner2.nextInt();
								           giveResponse(answer, guess);		        
								           tryTimes=tryTimes+1;
									       }
							      System.out.println ("Du lyckades på"+" "+tryTimes+" "+"försök");
					 	     }
		    		    
	    }

}