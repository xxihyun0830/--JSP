package controller;

public class User { //빈 클래스에는 기본 생성자와 모든 파라미터를 받는 생성자를 2개 작성함

	private String name; //private: 이 클래스 내부에서만 접근 가능
	private String pw;
	private String id;
	private String email;
	
	public User() { //ctrl+스페이스 -> User로 자동 생성
		// TODO Auto-generated constructor stub
	}

	public User(String name, String pw, String id, String email) { //마우스 우클릭 ->  Source -> Generate Constructor Using Fields
		super();
		this.name = name;
		this.pw = pw;
		this.id = id;
		this.email = email;
	}

	
	//해당 변수들에 접근할 getter/setter 설정
	
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
