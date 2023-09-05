package ch05_pjt_01.contact.dao;

import java.util.HashMap;
import java.util.Map;

import ch05_pjt_01.contact.ContactSet;

public class ContactDAO {
	//데이터베이스에 직접 접속하지 않고 해쉬맵을 통해 접근할 것이다
	private Map<String, ContactSet> contactDB = new HashMap<String, ContactSet>();
	
	public void insert(ContactSet contactSet) {
		contactDB.put(contactSet.getName(), contactSet);
	}
	
	public ContactSet select(String name) {
		return contactDB.get(name);
	}
	
	public Map<String, ContactSet> getContactDB() {
		return contactDB;
	}
	
}