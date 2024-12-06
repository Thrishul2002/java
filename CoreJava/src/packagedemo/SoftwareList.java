package packagedemo;
import com.coforge.training.microsoft.OperatingSystem;
import com.coforge.training.oracle.*;

/**
* Author :Jeedipalli.Reddy
* Date   :4 Nov 2024
* Time   :3:13:24 pm
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class SoftwareList {

	public static void main(String[] args) {
		Database db1=new Database();
		OperatingSystem os1=new OperatingSystem();
		System.out.println("***** Database Software *****");
		db1.printSoftware();
		System.out.println("***** Operating System *****");
		os1.listSoftware();

	}

}
