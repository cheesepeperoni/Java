package 클래스;

public class Member {
	String name;
	String id;
	String password;
	int age;

	Member() {
	}

	Member(String name, String id, String password, int age) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;

	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", id=" + id + ", password=" + password + ", age=" + age + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Member m2 = ((Member) obj);
		return m2.name.equals(this.name) && m2.id.equals(this.id);
	}
	
	
	

}
