package ch05_pjt_01.contact.service;

import ch05_pjt_01.contact.ContactSet;
import ch05_pjt_01.contact.dao.ContactDAO;

public class ContactSearchService {
	private ContactDAO contactDao;
	
	public ContactSearchService(ContactDAO contactDao) {
		this.contactDao = contactDao;
	}
	
	public ContactSet searchContact(String name) {
		if(verify(name)) {
			return contactDao.select(name);
		} else {
			System.out.println("Contact information is no available.");
		}
		
		return null;
	}
	
	public boolean verify(String name) {
		ContactSet contactSet = contactDao.select(name);
		return contactSet != null ? true : false;
	}
	
	public void setContactDAO(ContactDAO contactDao) {
		this.contactDao = contactDao;
	}
	
}