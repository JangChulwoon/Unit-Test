package org.game.unitTest;

import org.game.baseball.Baseball;
import org.game.ramdom.Random;
import org.junit.Test;

import junit.framework.Assert;

public class BaseballTest {
	
	/**
	 * Baseball Game 
	 * 1. 임의의 숫자 4개를 생성한다.
	 * 2. 사용자는 임의  4개를 입력한다.
	 * 2-1 만약 공통된 부분이 있다면  strike ( 개수 )
	 * 2-2 공통됬지만 위치가 다르다면 ball 
	 * 2-3 공통된 수가 없으면 out 
	 * 3. 기회는 9번
	 * 4. 모두다 맞으면 게임은 끝난다.  
	 */
/*	@Test
	public void shouldBaseballTest() {
		// 필요한 함수.
		// 1. 숫자를 생성하는 함수.
		// 2. 수를 입력받는 함수.
		// 3. 확인하는 함수. 
		Baseball baseball = new Baseball();
		
		baseball.initGame();
		do {
			baseball.inputNumber();
		}while(!baseball.confirm());
		baseball.printScore();
		
		// 문제점 1. 단위가 맞는지 모호함.
		// 문제점 2. 개발하면서 계속 이렇게 짜는게 맞나 ? 라는 생각이 듬 .
	}
*/
	@Test
	public void shouldNotSameRandom() {
		// 1. Random 한 걸 어떻게 증명하지 ?
		Random.notSameRandom(4);
	}

	
}
