package ch04_pjt_exam01.ems.view;

import ch04_pjt_exam01.ems.member.Member;

public class MemberViewer {
	public void showMessage(String line) {
		System.out.println(line);
	}
	
	public void showMember(Member member) {
		this.showMessage(member.getId());
		this.showMessage(member.getPassword());
		this.showMessage(member.getContact());
		this.showMessage(member.getEmail());
		this.showMessage(member.getRegisteredDate());
		this.showMessage(member.getModifiedDate());
	}
	
	public void showAllMembers(Map<String, Member> members) {
		Set<String> keys = members.keySet();
		Iterator<String> 
	}
}