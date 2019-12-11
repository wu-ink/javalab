package wu.ink.learn.ch5.pojo;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import wu.ink.learn.ch5.converter.SexConverter;
import wu.ink.learn.ch5.enumeration.SexEnum;

@Entity(name = "user")
@Table(name = "t_user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id = null;
	@Column(name = "user_name")
	private String userName = null;
	@Convert(converter = SexConverter.class)
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
