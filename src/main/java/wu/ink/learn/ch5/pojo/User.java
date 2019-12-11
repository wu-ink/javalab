package wu.ink.learn.ch5.pojo;

import wu.ink.learn.ch5.enumeration.SexEnum;

public class User {
	private Long id = null;
	private String userName = null;
	private SexEnum sex = null;
	private String note = null;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public SexEnum getSex() {
		return sex;
	}
	public void setSex(SexEnum sex) {
		this.sex = sex;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
}
