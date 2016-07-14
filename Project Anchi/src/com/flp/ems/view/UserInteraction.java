package com.flp.ems.view;
import com.flp.ems.service.EmployeeServiceImpl;
import com.flp.ems.util.Validate;
import java.util.*;

public class UserInteraction {
	// Employee e = new Employee();
	EmployeeServiceImpl esi = new EmployeeServiceImpl();
	private String name;
	private String kinid;
	private String emailid;
	private String phoneno;
	private String address;
	private String dob;
	private String doj;
	private String department;
	private String project;
	private String role;
	private String departmentid;
	private String projectid;
	

	int i=0;
	char j=0;
	Scanner sc = new Scanner(System.in);
	//Validate v = new Validate();
	HashMap<String, String> emap = new HashMap<String, String>();
	void AddEmployee() {
		
		System.out.println("Enter name of employee");
		name = sc.next();
		System.out.println("Enter emailid of employee");
		emailid = sc.next();
		System.out.println("Enter phone number of employee");
		phoneno = sc.next();
		System.out.println("Enter date of birth of employee");
		dob = sc.next();
		System.out.println("Enter date of joining of employee");
		doj = sc.next();
		System.out.println(
				"Select Department of employee\nPress:\n\t1 : Financial department\n\t2 : Non Financial department");
		i = sc.nextInt();
		switch (i) {
		case 1:
			department = "Financial Department";
			departmentid=String.valueOf(i);
			System.out.println("~" + department + "~");
			System.out.println(
					"Select the type of your project\nPress : \n\ta : Banking Project\n\tb : Share Market Project");
			j = sc.next().charAt(0);

			switch (j) {
			case 'a':
				project = "Banking Project";
				System.out.println("It is " + project);
				System.out.println("Enter the role of employee");
				role = sc.next();
				break;

			case 'b':
				project = "Share Market Project";
				System.out.println("It is " + project);
				System.out.println("Enter the role of employee");
				role = sc.next();
				break;
			}
			break;

		case 2:
			department = "Non Financial Department";
			departmentid=String.valueOf(i);
			System.out.println("~" + department + "~");
			System.out.println(
					"Select the type of your project\nPress : \n\t1 : Development Project\n\t2 : Support Project");
			j = sc.next().charAt(0);
			switch (j) {
			case 'a':
				project = "Development Project";
				System.out.println("It is " + project);
				System.out.println("Enter the role of employee");
				role = sc.next();
				break;

			case 'b':
				project = "Support Project";
				System.out.println("It is " + project);
				System.out.println("Enter the role of employee");
				role = sc.next();
				break;
			}
			break;

		}
Validate.isValidDate(doj);
Validate.isValidDate(dob);
		emap.put("Name", name);
		emap.put("Email id", emailid);
		emap.put("Phone number", phoneno);
		emap.put("Date of Birth", dob);
		emap.put("Date of Joining", doj);
		emap.put("Department id", departmentid);
		emap.put("Department name", department);
		emap.put("Project name", project);
		emap.put("Role", role);
		System.out.println(emap);
		esi.AddEmployee(emap);
		
	}

}
