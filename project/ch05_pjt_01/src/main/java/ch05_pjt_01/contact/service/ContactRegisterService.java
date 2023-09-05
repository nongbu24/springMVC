package ch05_pjt_01.contact.service;

import ch05_pjt_01.contact.ContactSet;
import ch05_pjt_01.contact.dao.ContactDAO;

public class ContactRegisterService {
	
	private ContactDAO contactDao;
	
	public ContactRegisterService(ContactDAO contactDao) {
		this.contactDao = contactDao;
	}
	
	public void register(ContactSet contactSet) {
		String name = contactSet.getName();
		
		if(verify(name)) {
			contactDao.insert(contactSet);
		} else {
			System.out.println("The name has already been registered");
		}
	}
	
	public boolean verify(String name) {
		ContactSet contactSet = contactDao.select(name);
		return contactSet == null ? true : false;
	}
	
	public void setWordDao(ContactDAO contactDao) {
		this.contactDao = contactDao;
	}
	
}