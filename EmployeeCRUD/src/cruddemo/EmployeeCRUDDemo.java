package cruddemo;

import java.util.Scanner;

/**
 * Author :Jeedipalli.Reddy
 * Date   :7 Nov 2024
 * Time   :5:17:18 pm
 * Email  :Jeedipalli.Reddy@gmail.com
 */

public class EmployeeCRUDDemo {

	public static void main(String[] args) throws Exception {
		
		Employee e=new Employee();
		String city=null,name=null,contactno=null,email=null;
		int cid=0;;
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("************** Global Tech Solutions **************");
			System.out.println("----------- Employee Management System ----------");
			
			while(true)
			{
				System.out.println("Press 1 for New Employee \t Press 2 to Display Employees");
				System.out.println("Press 3 for Update Employee \t Press 4 to Delete Employee");
				System.out.println("Press 5 to update email using result set \t press 6 to exit");
				

				
				//System.out.println("ENter ur choicw");
				int option=s.nextInt();
				
				
					//e.getConnection();
					
					switch(option)
					{
					case 1: System.out.println("Enter Customer Name, City & Contact no :");
					name=s.next();
					city=s.next();
					contactno=s.next();
					//System.out.println("888888");
					//System.out.println(name);
					e.insertEmployee(name, city, contactno);
						break;

					case 2: e.getEmployee();
					break;

					case 3: System.out.println("Enter Employee Id & City to be Updated:");
					cid=s.nextInt();city=s.next();
					e.updateEmployee(cid,city);
					break;

					case 4: System.out.println("Enter Employee Id  to be Deleted:");
					cid=s.nextInt();
					e.deleteEmployee(cid);
					break;
					case 5: System.out.println("enter employee id,email to be updated");
					cid=s.nextInt();
					email=s.next();
					e.updateMail(cid, email);
					break;
					case 6:System.out.println("Program Terminated");
					System.exit(0);
					default: System.out.println("Invalid Selection");
					break;

					}
					
			}
		}
	}
}
