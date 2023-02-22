package com.bridgelab;

import java.util.Random;

public class SnakeandLadder {
	static int startposition=0;
	int snakeoption=2;
	int ladderoption=1;

	public static void main(String[] args) {
		System.out.println("Welcome to snake and ladder program");
		Random ran = new Random();
		int dice = ran.nextInt(6 + 1);
		int pos=startposition;
		int dieNumber, option;
		 dieNumber=ran.nextInt(3);
		 option=ran.nextInt(7);
		System.out.println("dice position at starting " + dice);
		switch(option) {
		case 1:
			System.out.println("ladder position");
			pos+=dice;
			break;
		case 2:
			System.out.println("snake position");
			if(pos<0) {
				System.out.println("of Ladder the player moves ahead by the snake "+dice);
				pos=0;
			}else {
				System.out.println("player bitten by snake ");
			}
				break;
				default:
					System.out.println("there is no option");
					break;
				
				
			}
		}
			
			
			
		
		
	}


