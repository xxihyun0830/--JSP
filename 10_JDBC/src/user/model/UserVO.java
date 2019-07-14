package user.model;

public class UserVO {
	
	/*VO Ŭ�������� DB �÷����� �ڹ� ������ ����*/
	private String name;
	private String id;
	private String pw;
	private String phone1;
	private String phone2;
	private String phone3;
	private String gender;
	
	/*�ڹ� �� Ŭ������ �⺻ �����ڿ� ��� ��� ���� �ʱ�ȭ�ϴ� ������ ����*/
	public UserVO() { }
	
	
	public UserVO(String name, String id, String pw, String phone1, String phone2, String phone3, String gender) {
		super();
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.phone3 = phone3;
		this.gender = gender;
	}


	/*ĸ��ȭ�� �ʵ忡 �����ϱ� ���� getter/setter �ۼ�*/
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getPhone1() {
		return phone1;
	}
	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}
	public String getPhone2() {
		return phone2;
	}
	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}
	public String getPhone3() {
		return phone3;
	}
	public void setPhone3(String phone3) {
		this.phone3 = phone3;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}
