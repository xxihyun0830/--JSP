package members.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import members.model.MemberDAO;
import members.model.MemberVO;

public class MembersAllService {
	
	public void getMembersAll(HttpServletRequest request, HttpServletResponse response) {
		MemberDAO dao = MemberDAO.getInstance();
		ArrayList<MemberVO> list = dao.membersAll();
		request.setAttribute("member_list", list);
		
	}
}
