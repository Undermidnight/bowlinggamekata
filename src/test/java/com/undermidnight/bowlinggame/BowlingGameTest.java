package com.undermidnight.bowlinggame;

import junit.framework.TestCase;

public class BowlingGameTest extends TestCase {
	public void testGutterGame() throws Exception {
		Game g = new Game();
		g.roll(0);
		assertEquals(0, g.score());
	}
}
