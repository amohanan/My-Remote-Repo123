package com.flp.ems.util;

import com.flp.ems.domain.Employee;

public class Validate {
 static Employee e = new Employee();
public static boolean isVname(){
	return e.getName().matches("[A-Za-z0-9]");
}
public static boolean isValidDate(String date){
	if(date.matches("\\d{2}-\\d{2}-\\d{4}}")){
		
		return true;
		}
		else
		{
		return false;	
	}
	}
}

