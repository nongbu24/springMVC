package ch04_pjt_exam01.ems.member.service;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import ch04_pjt_exam01.ems.member.Member;

public class PrintMemberInformationService {
	MemberAllSelectService allSelectService;
	
	public PrintMemberInformationService(MemberAllSelectService allSelectService) {
		this.allSelectService = allSelectService;
	}
	
	public void printMemberInfo() {
		Map<String, Member> allMember = allSelectService.allSelect();
		Set<String> keys = allMember.keySet();
		Iterator<String> iterator = keys.iterator();
		System.out.println("MEMBER LIST STARTS");
		
		while(iterator.hasNext()) {
			String key = iterator.next();
			Member member = allMember.get(key);
			System.out.println("mNum : " + member.getmNum() + "\t");
			System.out.println(" | mId : " + member.getmId() + "\t");
			System.out.println(" | mPw : " + member.getmPw() + "\t");
			System.out.println(" | mHp : " + member.getmHp() + "\t");
			System.out.println(" | mEmail : " + member.getmEmail() + "\t");
			System.out.println(" | newDate : " + member.getNewDate() + "\t");
			System.out.println(" | lastDate : " + member.getLastDate() + "\t");
		}
		System.out.println("END");
	}
}