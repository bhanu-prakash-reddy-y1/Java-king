package finalAssesment;

import java.util.Scanner;

public class ContactsInfo {

	public static void main(String[] args) {
		Scanner scn  = new Scanner(System.in);
		ContactOperations co = new ContactOperations();
		Contacts bhanu = co.createContact("bhanu", 76750898, "family");
		Contacts prakash = co.createContact("prakash", 123456789, "friends");
		Contacts reddy = co.createContact("reddy", 87654321, "college");
		
		co.addContact("bhanu",bhanu);
		co.addContact("prakash",prakash);
		co.addContact("reddy",reddy);
		
		System.out.println("Enter 1 to show Contacts 2 to Search for Contacts or 3 to Operate on contact");
		
		int i = scn.nextInt();
		if(i == 1) {
			co.showContact();
		}else if(i == 2) {
			System.out.println("Enter name to search to contact");
			String name  = scn.next();
			
			co.searchHere(name);
			System.out.println("Enter 1 to call or 2 to Massage or 3 to show main menu");
			int l = scn.nextInt();
			if( l == 1) {
				System.out.println("Calling to "+name);
				System.out.println("Enter 1 to end call");
				if(scn.nextInt() == 1) {
					System.out.println("Call ended.....!");
				}
				
			}else if(l == 2) {
				System.out.println("Enter your massage ");
				String msg = scn.next();
				System.out.println("Sending your massage to "+name+" and massage is "+ msg);
			}else if(l == 3) {
				System.out.println("Going back to main menu");
			}
			
		}else if(i == 3) {
			System.out.println("Enter 1 to add or 2 to delete or 3 to update Contact");
			int n = scn.nextInt();
			if (n == 1) {
				System.out.println("Enter name");
				String name = scn.next();
				System.out.println("Enter number");
				long number = scn.nextLong();
				System.out.println("Enter Group");
				String group = scn.next();
				Contacts c4 = co.createContact(name, number, group);
				co.addContact(name,c4 );
				co.showContact();
				System.out.println(name+" contact added successfull...!");
			}else if(n == 2) {
				System.out.println("Enter Object to Delete Contact");
				String m = scn.next();
				co.removeContact(co.searchHere(m));
				co.showContact();
			}else if(n == 3) {
				System.out.println("Enter Object to edit ");
				Contacts edit = co.searchHere(scn.next());
				System.out.print("Enter name :");
				edit.setName(scn.next());
				System.out.print("Enter number to edit :");
				edit.setNumber(scn.nextLong());
				System.out.print("Enter group to edit :");
				edit.setGroup(scn.next());
				co.showContact();
			}
			
		}		
	}

}
