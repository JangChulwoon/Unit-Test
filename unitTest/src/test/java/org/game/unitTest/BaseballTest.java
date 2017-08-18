package org.game.unitTest;

import org.game.baseball.Game;
import org.game.common.Vaild;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class BaseballTest {
	Game game;

	@Before
	public void setUp() {
		game = new Game();
	}

	@Test
	public void CheckVaild() {
		try {
			Vaild.checkVaild(null);
			Vaild.checkVaild("1a2");
			Vaild.checkVaild("112");
			Assert.fail();
		}catch (Exception e) {
		}
	}
	

}
