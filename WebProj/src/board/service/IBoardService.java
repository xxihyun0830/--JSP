package board.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface IBoardService { //��� service �ϳ��� ���� �ִ� �������̽�
	
	//Controller�� ��û ������ ó���ϴ� �޼ҵ�
	void executeService(HttpServletRequest request, HttpServletResponse response); //�߻� �޼ҵ� -> override �ʿ�
	
}
