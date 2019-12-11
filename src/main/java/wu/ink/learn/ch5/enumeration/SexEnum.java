package wu.ink.learn.ch5.enumeration;

public enum SexEnum {
	MALE(1, "Male"),
	FEMALE(2, "Female");
	
	private int id;
	private String name;
	SexEnum(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public static SexEnum getEnumById(int id) {
		for (SexEnum sex : SexEnum.values()) {
			if (sex.getId() == id) {
				return sex;
			}
		}
		return null;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
