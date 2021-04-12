//!/bin/java

import java.util.*;
public class hand_cricket
{
	public static void main (String args[])
	{
		Scanner in = new Scanner(System.in);
		
		
		//Switch declaration
		int sh=0;
		
		System.out.println("Enter 1 for single player");
		System.out.println("Enter 2 for two players");
		sh=in.nextInt();
		switch(sh)
		{
			//For single player
			case 1:
			{
				int toss, u_toss, comp_runs, comp_ball=0, u_ball, t_runs=0, c_run=0, tar, c_ball;
				toss=(int)(Math.random()*(3-0)+0);
				System.out.println("Toss");
				System.out.println("Enter 0 for HEADS and 1 for TAILS");
				u_toss=in.nextInt();
				if(u_toss==toss)
				{
					System.out.println("You will bat");
					comp_runs=(int)(Math.random()*(50-15+1)+15);
					tar=comp_runs+1;
					System.out.println("Keep scoring runs until you get out!\nComputer scored: "+comp_runs);
					System.out.println("Score "+tar+" to win!");
			 		for(int i=1; i>0; i++)
					{
						c_run= in.nextInt();
						if(c_run >=0 && c_run <7)
						{
	 						comp_ball= (int)(Math.random()*7);
							if(comp_ball==c_run)
							{
								System.out.println();
								System.out.println("You're OUT");
								System.out.println("Your score: "+t_runs);
								break;
							}
							else
							{
								t_runs=t_runs+c_run;
								System.out.println("current score: "+t_runs);
								if(t_runs>comp_runs)
								{
									break;
								}
							}
						}
					}
					if(t_runs>comp_runs)
					{
						System.out.println("You won!");
					}					
					if(t_runs==comp_runs)
					{
						System.out.println("The match tied :/");
					}
					if(t_runs<comp_runs)
					{
						System.out.println("You lost :(");
					}
				}
				if(u_toss!=toss)
				{
					comp_runs=0;
					System.out.println("You will bowl");
					t_runs=(int)(Math.random()*(65-25+1)+25);
					tar=t_runs+1;
					System.out.println("You scored "+t_runs+" runs");
					System.out.println("Out computer before he scores "+tar+" runs");
					System.out.println();
					System.out.println("Now bowl!");
					for(int i=1; i>0; i++)
					{
						c_ball=in.nextInt();
						c_run=(int)(Math.random()*(6-0+1)+0);
						if(c_ball==c_run)
						{
							System.out.println("You bowled the computer");
							System.out.println("You won");
							break;	
						}
						else
						{
							System.out.println("Computer scored: "+c_run);
							comp_runs=comp_runs+c_run;
							System.out.println("Current run: "+comp_runs);
							if(comp_runs>t_runs)
							{
								System.out.println("You lost as you failed to out the computer");
								break;
							}
						}
					}
					if(comp_runs==t_runs)
						{
							System.out.println("The match was tied");
						}
				}
			}
			//For 2 players
			case 2:	
			{
				Scanner s = new Scanner(System.in);
				String name1, name2;
				System.out.println("Enter the name of Player 1");
				name1=s.nextLine();
				System.out.println("Enter the name of Player 2");
				name2=s.nextLine();
				System.out.println();
				int p1_runs=0, p2_runs=0, p1_crun, p2_crun, comp_ball, toss, comp_toss, tar;
				comp_toss=(int)(Math.random()*(3-0)+0);
				System.out.println("Toss\nEnter 0 for HEADS and 1 for TAILS");
				toss=in.nextInt();
				if(comp_toss==toss)
				{
					System.out.println(name1+" will bat");
					System.out.println("Score as many runs as you can");
					for(int i=1; i>0; i++)
					{
						comp_ball=(int)(Math.random()*7);
						p1_crun=in.nextInt();
						if(p1_crun >=0 && p1_crun <7 && p1_crun!=comp_ball)
						{
							p1_runs=p1_runs+p1_crun;
							System.out.println("Current run: "+p1_runs);
						}
						if(p1_crun==comp_ball)
						{
							System.out.println("You got OUT!\nYou scored "+p1_runs+" runs");
							break; 
						}
					}
					System.out.println();
					tar=p1_runs+1;
					System.out.println(name2+" needs "+tar+" runs to win\nNow score runs!");
					for(int j=1; j>0; j++)
					{
						comp_ball=(int)(Math.random()*7);
						p2_crun=in.nextInt();
						if(p2_crun >=0 && p2_crun <7 && p2_crun!=comp_ball)
						{
							p2_runs=p2_runs+p2_crun;
							System.out.println("Current run: "+p2_runs);
							if(p2_runs>=tar)
							{
								System.out.println(name2+" wins!");
								break;
							}
						}
						if(p2_crun==comp_ball)
						{
							System.out.println("You got OUT!\n"+name1+" wins\n"+name2+" loses");
							break; 
						}
						
					}
					if(p1_runs==p2_runs)
						{
							System.out.println("The match tied!");						
						}
				}
				else
				{
					System.out.println(name2+" will bat");
					System.out.println("Score as many runs as you can");
					for(int i=1; i>0; i++)
					{
						comp_ball=(int)(Math.random()*7);
						p2_crun=in.nextInt();
						if(p2_crun >=0 && p2_crun <7 && p2_crun!=comp_ball)
						{
							p2_runs=p2_runs+p2_crun;
							System.out.println("Current run: "+p2_runs);
						}
						if(p2_crun==comp_ball)
						{
							System.out.println("You got OUT!\nYou scored "+p2_runs+" runs");
							break; 
						}
					}
					System.out.println();
					tar=p2_runs+1;
					System.out.println(name1+" needs "+tar+" runs to win\nNow score runs!");
					for(int j=1; j>0; j++)
					{
						comp_ball=(int)(Math.random()*7);
						p1_crun=in.nextInt();
						if(p1_crun >=0 && p1_crun <7 && p1_crun!=comp_ball)
						{
							p1_runs=p1_runs+p1_crun;
							System.out.println("Current run: "+p1_runs);
							if(p1_runs>=tar)
							{
								System.out.println(name1+" wins!");
								break;
							}
						}
						if(p1_crun==comp_ball)
						{
							System.out.println("You failed to score "+tar+", you lost");
							break; 
						}
						if(p1_runs==p2_runs)
						{
							System.out.println("The match tied!");						
						}
					}	
				}
			}
		}
	}
}
