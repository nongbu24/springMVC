package ch04_pjt_exam01.ems.member.service;

import ch04_pjt_exam01.ems.member.Member;
import ch04_pjt_exam01.ems.member.dao.MemberDAO;

public class MemberSelectService {
	private MemberDAO memberDao;
	
	public MemberSelectService(MemberDAO memberDao) {
		this.memberDao = memberDao;
	}
	
	public Member select(String mNum) {
		if(verify(mNum)) {
			return memberDao.select(mNum);
		} else {
			System.out.println("Member Information is available.");
			return null;
		}
	}
	
	public boolean verify(String mNum) {
		Member member = memberDao.select(mNum);
		return member != null ? true : false;
	}
}
