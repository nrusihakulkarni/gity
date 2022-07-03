package stepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hoks {
	
	
	@Before ("@Mobile")
	public void beforMethod () {
		System.out.println("**********************************");
		System.out.println("Befor Mobile Hock");
	} 
	
	@After ("@Mobile")
	public void afteMethod () {
		System.out.println("***************************************");
		System.out.println("After Mobile Method");
	}

}
