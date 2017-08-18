package org.game.unitTest;

import org.game.baseball.Game;
import org.game.common.Vaild;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

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
		} catch (Exception e) {
		}
	}

	@Test
	public void endGame() {
		game.strike = 3;
		game.ball = 0;
		
		Assert.assertThat(game.isSucess(), is(true));
		Assert.assertThat(game.strike, is(3));
		Assert.assertThat(game.ball, is(0));
	}

}
