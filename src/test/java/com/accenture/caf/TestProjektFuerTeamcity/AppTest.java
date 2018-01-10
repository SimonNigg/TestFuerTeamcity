package com.accenture.caf.TestProjektFuerTeamcity;

import junit.framework.Assert;
import junit.framework.TestCase;

public class AppTest extends TestCase {

	public void testApp() {
		App app = new App();
		String ergebnis = "Hallo Kevin";
		Assert.assertEquals(ergebnis, app.hallo());
	}
}
