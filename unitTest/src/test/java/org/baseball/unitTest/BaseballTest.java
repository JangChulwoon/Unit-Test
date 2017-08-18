package org.baseball.unitTest;

import org.junit.Test;

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
	@Test
	public void shouldBaseballTest() {
		// 필요한 함수.
		// 1. 숫자를 생성하는 함수.
		// 2. 수를 입력받는 함수.
		// 3. 확인하는 함수. 
		
		Baseball baseball = new Baseball();
		
		baseball.initGame();
		do {
			baseball.inputNumber();
		}while(baseball.confirm());
		baseball.printScore();
	}

}
