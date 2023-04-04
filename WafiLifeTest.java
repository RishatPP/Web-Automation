package testcases;

import pages.WafiLifeHomePage;
import utilities.BaseDriverSetup;

public class WafiLifeTest extends BaseDriverSetup{
	
	WafiLifeHomePage wafiLifeHomePageObj = new WafiLifeHomePage();
	
	public void visitWafiLife() {
		getDriver().get(wasiLifeHomePageObj.WASILIFE_URL);
	}

}
