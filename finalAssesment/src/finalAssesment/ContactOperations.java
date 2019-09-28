package finalAssesment;

import java.util.HashMap;
import java.util.HashSet;

public class ContactOperations {
	
	HashSet<Contacts> hs = new HashSet<Contacts>();
	
	HashMap<String , Contacts> hm = new HashMap<String, Contacts>();
	
	public Contacts createContact(String name,long number,String group) {
		Contacts c = new Contacts();
		c.setName(name);
		c.setNumber(number);
		c.setGroup(group);
		return c;
	}
	
	public void addContact(String key , Contacts c) {
		hs.add(c);
		hm.put(key, c);
	}
	
	public void showContact() {
		for (Contacts cont : hs) {
			System.out.println(cont);
		}
	}
	
	public Contacts searchHere(String key) {
//		System.out.println(hm.get(key));
		return hm.get(key);
	}
	
	public void removeContact(Contacts c) {
//		hm.remove(key);
		hs.remove(c);
		
		showContact();
		
	}

}
