package ch04_pjt_exam01.ems.member.service;

import ch04_pjt_exam01.ems.member.Member;
import ch04_pjt_exam01.ems.member.dao.MemberDAO;

public class MemberDeleteService {
	private MemberDAO memberDao;
	
	public MemberDeleteService(MemberDAO memberDao) {
		this.memberDao = memberDao;
	}
	
	public void delete(String mNum) {
		if(verify(mNum)) {
			memberDao.delete(mNum);
		} else {
			System.out.println("Member Information is unavailable");
		}
	}
	
	public boolean verify(String mNum) {
		Member member = memberDao.select(mNum);
		return member != null ? true : false;
	}
}