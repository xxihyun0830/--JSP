package pancake;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/* �� ���ø����̼� ��ü ���� �ֱ⸦ �����ϴ� ������Ŭ���� ���� ���: ServletContextListener��� �������̽��� ��������
 * �� ������ �ش� Ŭ������ �츮 �� ���ø����̼��� �����ʶ�� ���� �� �������� �˷� �ֱ� ���� �Ƴ����̼��� �����
 */

@WebListener

public class ContextListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("������ destroy ȣ��!");
		System.out.println("���α׷��� ����ʰ� ���ÿ� ����� ������ �ִٸ� �̰��� �ۼ��մϴ�.");
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("������ init ȣ��!");
		System.out.println("���α׷��� ����ʰ� ���ÿ� ����� ������ �ִٸ� �̰��� �ۼ��մϴ�.");
	}	
}
