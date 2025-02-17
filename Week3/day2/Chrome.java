package Week3.day2;

public class Chrome extends Browser{
	
	public Chrome(float browserVersion) {
		super ("Chrome",browserVersion);
		// TODO Auto-generated constructor stub
	}
	public void openIncongnito() {
		System.out.println("Chrome is opening in Incognito mode");
	}
	public void clearCache() {
		System.out.println("Chrome is clearing the cache.");
	}
}
