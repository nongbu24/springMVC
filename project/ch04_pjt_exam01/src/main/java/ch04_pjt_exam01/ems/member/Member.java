package ch04_pjt_exam01.ems.member;

import java.util.Date;

public class Member {
	private String mNum;
	private String mId;
	private String mPw;
	private String mHp;
	private String mEmail;
	private Date newDate;
	private Date lastDate;
	
	public Member(String mNum, String mId, String mPw, String mHp, String mEmail, Date newDate, Date lastDate) {
		super();
		this.mNum = mNum;
		this.mId = mId;
		this.mPw = mPw;
		this.mHp = mHp;
		this.mEmail = mEmail;
		this.newDate = newDate;
		this.lastDate = lastDate;
	}

	public String getmNum() {
		return mNum;
	}

	public void setmNum(String mNum) {
		this.mNum = mNum;
	}

	public String getmId() {
		return mId;
	}

	public void setmId(String mId) {
		this.mId = mId;
	}

	public String getmPw() {
		return mPw;
	}

	public void setmPw(String mPw) {
		this.mPw = mPw;
	}

	public String getmHp() {
		return mHp;
	}

	public void setmHp(String mHp) {
		this.mHp = mHp;
	}

	public String getmEmail() {
		return mEmail;
	}

	public void setmEmail(String mEmail) {
		this.mEmail = mEmail;
	}

	public Date getNewDate() {
		return newDate;
	}

	public void setNewDate(Date newDate) {
		this.newDate = newDate;
	}

	public Date getLastDate() {
		return lastDate;
	}

	public void setLastDate(Date lastDate) {
		this.lastDate = lastDate;
	}

}