package ch04_pjt_exam01.ems.utils;

import java.time.LocalDateTime;

public class InitSampleData {
	private String[] ids;
	private String[] passwords;
	private String[] contacts;
	private String[] emails;
	private LocalDateTime[] registeredDates;
	private LocalDateTime[] modifiedDates;
	
	public String[] getIds() {
		return ids;
	}
	
	public void setIds(String[] ids) {
		this.ids = ids;
	}
	
	public String[] getPasswords() {
		return passwords;
	}
	
	public void setPasswords(String[] passwords) {
		this.passwords = passwords;
	}
	
	public String[] getContacts() {
		return contacts;
	}
	
	public void setContacts(String[] contacts) {
		this.contacts = contacts;
	}
	
	public String[] getEmails() {
		return emails;
	}
	
	public void setEmails(String[] emails) {
		this.emails = emails;
	}
	
	public LocalDateTime[] getRegisteredDates() {
		return registeredDates;
	}
	
	public void setRegisteredDates(LocalDateTime[] registeredDates) {
		this.registeredDates = registeredDates;
	}
	
	public LocalDateTime[] getModifiedDates() {
		return modifiedDates;
	}
	
	public void setModifiedDates(LocalDateTime[] modifiedDates) {
		this.modifiedDates = modifiedDates;
	}
	
}