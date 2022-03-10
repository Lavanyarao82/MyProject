package TestNG;
import TestNG.Basemethods;

public class loginERP {
     static Basemethods base;
	public static void main(String[] args) 
	{
		base=new Basemethods();
		base.openbrowser();
		base.launchERP();
		base.LoginERP();

	}

}
