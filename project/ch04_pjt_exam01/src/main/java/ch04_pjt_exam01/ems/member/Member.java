package ch04_pjt_exam01.ems.member;

public class Member {
	private String id;
	private String password;
	private String contact;
	private String email;
	private String registeredDate;
	private String modifiedDate;
	
	public Member(String id, String password, String contact, String email, String registeredDate, String modifiedDate) {
		this.id = id;
		this.password = password;
		this.contact = contact;
		this.email = email;
		this.registeredDate = registeredDate;
		this.modifiedDate = modifiedDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRegisteredDate() {
		return registeredDate;
	}

	public void setRegisteredDate(String registeredDate) {
		this.registeredDate = registeredDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	
}


//package ch04_pjt_exam01.ems.member;
//
//import java.util.Date;
//
//public class Member {
//	private String mNum;
//	private String mId;
//	private String mPw;
//	private String mHp;
//	private String mEmail;
//	private String newDate;
//	private String lastDate;
//	
//	public Member(String mNum, String mId, String mPw, String mHp, String mEmail, String newDate, String lastDate) {
//		super();
//		this.mNum = mNum;
//		this.mId = mId;
//		this.mPw = mPw;
//		this.mHp = mHp;
//		this.mEmail = mEmail;
//		this.newDate = newDate;
//		this.lastDate = lastDate;
//	}
//
//	public String getmNum() {
//		return mNum;
//	}
//
//	public void setmNum(String mNum) {
//		this.mNum = mNum;
//	}
//
//	public String getmId() {
//		return mId;
//	}
//
//	public void setmId(String mId) {
//		this.mId = mId;
//	}
//
//	public String getmPw() {
//		return mPw;
//	}
//
//	public void setmPw(String mPw) {
//		this.mPw = mPw;
//	}
//
//	public String getmHp() {
//		return mHp;
//	}
//
//	public void setmHp(String mHp) {
//		this.mHp = mHp;
//	}
//
//	public String getmEmail() {
//		return mEmail;
//	}
//
//	public void setmEmail(String mEmail) {
//		this.mEmail = mEmail;
//	}
//
//	public String getNewDate() {
//		return newDate;
//	}
//
//	public void setNewDate(String newDate) {
//		this.newDate = newDate;
//	}
//
//	public String getLastDate() {
//		return lastDate;
//	}
//
//	public void setLastDate(String lastDate) {
//		this.lastDate = lastDate;
//	}
//
//}