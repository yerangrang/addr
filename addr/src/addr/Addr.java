package addr;

public class Addr {

	// 이름, 전화번호, 이메일, 주소 필드

	private String name;
	private String number;
	private String email;
	private String address;
	private String group;

	// 생성자(데이터 초기화하는)

	public Addr(String name, String number, String email, String address, String group) {
		this.name = name;
		this.number = number;
		this.email = email;
		this.address = address;
		this.group = group;
	}

	// 출력하는 기능

	public void printInfo() {
		System.out.println("이름: " + name);
		System.out.println("번호: " + number);
		System.out.println("이메일: " + email);
		System.out.println("주소: " + address);
		System.out.println("그룹(친구/가족)" + group);
	}

	// 변수 캡슐화.. , 변수의 값을 얻을 수 있는 메소드 getter, 변수의 값을 저장할 수 있는 메소드 setter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

}
