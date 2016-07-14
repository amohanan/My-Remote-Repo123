package com.flp.ems.view;
import java.util.*;

public class BootClass {
UserInteraction ui = new UserInteraction();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BootClass bc = new BootClass();
		bc.menuSelection();
	}
void menuSelection()
{
	while(true){
	System.out.println("Select\n1 - add employee\n2 - Edit employee information\n3 - Remove employee\n4 - Search employee\n5 - View Employee\n6 - Exit ");
Scanner sc = new Scanner(System.in);
int i = sc.nextInt();
	switch(i){
	case 1: ui.AddEmployee();
	break;
	/*case 2: ui.ModifyEmployee();
	break;
	case 3: ui.RemoveEmployee();
	break;
	case 4: ui.SearchEmployee();
	break;
	case 5: ui.getAllEmployee();
	break;*/
	case 6: return;

	default: break;
	}

	}

}	
}

