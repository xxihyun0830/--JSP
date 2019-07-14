package pancake;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/* 웹 어플리케이션 전체 생명 주기를 관리하는 리스너클래스 생성 방법: ServletContextListener라는 인터페이스를 구현받음
 * 그 다음에 해당 클래스가 우리 웹 어플리케이션의 리스너라는 것을 웹 서버에게 알려 주기 위해 아노테이션을 사용함
 */

@WebListener

public class ContextListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("리스너 destroy 호출!");
		System.out.println("프로그램이 종료됨과 동시에 기술할 로직이 있다면 이곳에 작성합니다.");
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("리스너 init 호출!");
		System.out.println("프로그램이 실행됨과 동시에 기술할 로직이 있다면 이곳에 작성합니다.");
	}	
}
