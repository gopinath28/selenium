package pom;

public class executable extends BaseClass {

	public static void main(String[] args) {
		
		launchBrowser("https://www.facebook.com/");
		Locator l=new Locator();
		type(l.getUsertxt(),"gopi");
		
	}
	
}
