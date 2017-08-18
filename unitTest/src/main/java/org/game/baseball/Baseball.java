package org.game.baseball;

import java.util.Random;
import java.util.Scanner;

public class Baseball {

	private int[] pointBall;
	private static int GAME_ROUNT = 0;
	private final static Scanner scan = new Scanner(System.in);
	private int strike =0;
	private int ball = 0;
	private int[] insertNum;
	
	public void initGame() {
		Random random = new Random();
		pointBall = new int[4];
		for(int i =0; i<4; ++i) {
			pointBall[i] = random.nextInt(9)+1;
		}
		
		for(int i =0; i<4 ; ++i) {
			System.out.println(pointBall[i]);
		}
	}

	public void inputNumber() {
		insertNum = new int[4];
		for(int i =0; i<4; ++i) {
			System.out.print("숫자를 입력해 주세요 ::");
			insertNum[i] = scan.nextInt();
		}
	}

	public boolean confirm() {
		strike  = 0;
		ball = 0 ;
		for(int i =0; i<4; ++i) {
			for(int j=0; j<4; ++j){
				if(pointBall[i] == insertNum[j]) {
					if(i == j) {
						strike ++;
					}else {
						ball ++;
					}
				}
			}
		}
		GAME_ROUNT++;
		System.out.println("strike :: " + strike);
		System.out.println("ball :: "+ ball);
		
		return strike == 4 || GAME_ROUNT==9;
	}

	public void printScore() {
		if(strike == 4) {
			System.out.println(GAME_ROUNT +"회  성공 !! ");
		}else {
			System.out.println("Game Out ! ");
		}
	}
}
