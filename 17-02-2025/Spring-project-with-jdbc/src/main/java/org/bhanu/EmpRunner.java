package org.bhanu;
import java.util.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class EmpRunner {
	public static void main(String arg[]) {
		ApplicationContext a=new ClassPathXmlApplicationContext("config.xml");
		EmpDao ed=(EmpDao)a.getBean("edao");
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("1.Insert\n2.Update\n3.Delete\n4.Exit");
			System.out.print("Enter your choice: ");
			int status=0;
			switch(sc.nextInt()) {
			case 1:{
				try{
					status=ed.saveEmployee(new Empdetails(2,"Bhanu",6055));
					System.out.println("Rows inserted successfully "+status);
				}
				catch(Exception e) {
					System.out.println("A person  with that ID already exists");
				}
				finally {
					break;
				}
			}
			case 2:{
				status=ed.updateEmployee(new Empdetails(4,"Gopi",6564));
				if(status>0) {
					System.out.println("Rows updated successfully "+status);
				}
				else {
					System.out.println("Row doesn't exist");
				}
				break;
			}
			case 3:{
				status=ed.deleteEmployee(new Empdetails(2));
				if(status>0) {
					System.out.println("Rows deleted successfully "+status);
				}
				else {
					System.out.println("Row doesn't exist with id 2");
				}
				break;
			}
			case 4:{
				return;
			}
			
			}
		}while(true);
		
	}
}
