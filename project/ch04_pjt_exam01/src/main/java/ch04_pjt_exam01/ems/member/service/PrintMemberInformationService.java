package ch04_pjt_exam01.ems.member.service;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import ch04_pjt_exam01.ems.member.dao.MemberDO;

public class PrintMemberInformationService {
	MemberAllSelectService allSelectService;
	
	public PrintMemberInformationService(MemberAllSelectService allSelectService) {
		this.allSelectService = allSelectService;
	}
	
	public void printMemberInfo() {
		Map<String, MemberDO> allMember = allSelectService.allSelect();
		Set<String> keys = allMember.keySet();
		Iterator<String> iterator = keys.iterator();
		System.out.println("MEMBER LIST STARTS" + "\n");
		
		while(iterator.hasNext()) {
			String key = iterator.next();
			MemberDO memberDo = allMember.get(key);
			System.out.println(" | Id : " + memberDo.getId() + "\t");
			System.out.println(" | password : " + memberDo.getPassword() + "\t");
			System.out.println(" | contact : " + memberDo.getContact() + "\t");
			System.out.println(" | Email : " + memberDo.getEmail() + "\t");
			System.out.println(" | RegisteredDate : " + memberDo.getRegisteredDate() + "\t");
			System.out.println(" | modifiedDate : " + memberDo.getModifiedDate() + "\t");
		}
		
		System.out.println("END");
	}
	
}