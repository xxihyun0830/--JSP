package controller;

public class User { //�� Ŭ�������� �⺻ �����ڿ� ��� �Ķ���͸� �޴� �����ڸ� 2�� �ۼ���

	private String name; //private: �� Ŭ���� ���ο����� ���� ����
	private String pw;
	private String id;
	private String email;
	
	public User() { //ctrl+�����̽� -> User�� �ڵ� ����
		// TODO Auto-generated constructor stub
	}

	public User(String name, String pw, String id, String email) { //���콺 ��Ŭ�� ->  Source -> Generate Constructor Using Fields
		super();
		this.name = name;
		this.pw = pw;
		this.id = id;
		this.email = email;
	}

	
	//�ش� �����鿡 ������ getter/setter ����
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
