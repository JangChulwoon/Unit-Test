package org.game.baseball;

public class Game {
	public int ball =0;
	public int strike = 0;
	
	public boolean isSucess() {
		if(ball == 0 && strike ==3) {
			return true;
		}
		return false;
	}
	
	public int[] makeNumber() {
		return new int[] {1,2,3,4};
	}
	
}
