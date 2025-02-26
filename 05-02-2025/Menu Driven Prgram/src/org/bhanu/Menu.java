package org.bhanu;
import java.sql.*;
import java.util.*;
import java.util.Scanner;
public class Menu {
	public static void main(String arg[]) throws SQLException,Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techm?autoReconnect=true&useSSL=false","root","Vbhanu@2003");
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Operations that can be performed on the database are:");
			System.out.println("1.Insert a new row\n2.Update a row\n3.Delete a row\n4.Select the row\n5.Exit\n");
			switch(sc.nextInt()) {
			case 1:{
				PreparedStatement ps=con.prepareStatement("insert into emp values(?,?,?)");
				System.out.print("Enter Employee ID: ");
				ps.setInt(1, sc.nextInt());
				System.out.print("Enter Employee name: ");
				ps.setString(2, sc.next());
				System.out.print("Enter department ID of employee:");
				ps.setInt(3, sc.nextInt());
				System.out.println(ps.executeUpdate()+" rows are inserted");
				break;
			}
			case 2:{
				PreparedStatement ps1=con.prepareStatement("update into emp set ename=? where empid=?");
				System.out.print("Enter the Employee ID to be updated: ");
				int empid=sc.nextInt();
				System.out.print("Enter updated name of employee: ");
				String s=sc.next();
				ps1.setString(1, s);
				ps1.setInt(2, empid);
				System.out.println(ps1.executeUpdate()+" rows are updated");
				break;
			}
			case 3:{
				PreparedStatement ps2=con.prepareStatement("delete from emp where empid=?");
				System.out.print("Enter Employee ID of the employee whose data to be deleted: ");
				ps2.setInt(1, sc.nextInt());
				System.out.println(ps2.executeUpdate()+" rows are deleted");
				break;
			}
			case 4:{
				PreparedStatement ps3=con.prepareStatement("select * from emp");
				ResultSet rs=ps3.executeQuery();
				while(rs.next()) {
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
				}
				break;
			}
			case 5:{
				System.out.println("Thank You");
				return;
			}
			default:{
				System.out.println("You have chosen invalid option\nPlease choose correct optiuon");
				break;
			}
			}
		}while(true);
	}
}
