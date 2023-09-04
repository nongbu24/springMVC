package ch04_pjt_exam01.ems.member.service;

import ch04_pjt_exam01.ems.member.Member;
import ch04_pjt_exam01.ems.member.dao.MemberDAO;

public class MemberModifyService {
	private MemberDAO memberDao;
	
	public MemberModifyService(MemberDAO memberDao) {
		this.memberDao = memberDao;
	}
	
	public void modify(Member member) {
		if(verify(member.getmNum())) {
			memberDao.update(member);
		} else {
		System.out.println("Member Information is unavailable");
		}
	}
	
	public boolean verify(String mNum) {
		Member member = memberDao.select(mNum);
		return member != null ? true : false;
	}
}