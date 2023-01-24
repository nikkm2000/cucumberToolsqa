package cucumber;


import managers.BrowserManager;
import managers.PageObjectManager;

public class TestContext {
	
	private BrowserManager browserManager;
	private PageObjectManager pageObjectManager;
	
	public TestContext(){
		browserManager = new BrowserManager();
		pageObjectManager = new PageObjectManager(browserManager.getDriver());
	}
	
	public BrowserManager getBrowserManager() {
		return browserManager;
	}
	
	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}

}
