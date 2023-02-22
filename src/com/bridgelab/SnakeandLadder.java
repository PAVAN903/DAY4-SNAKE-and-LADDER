package com.bridgelab;

import java.util.Random;

public class SnakeandLadder {

	public static void main(String[] args) {
		System.out.println("Welcome to snake and ladder program");
		Random ran = new Random();
		int dice = ran.nextInt(6+1);
		System.out.println("dice position at starting " + dice);

	}

}
