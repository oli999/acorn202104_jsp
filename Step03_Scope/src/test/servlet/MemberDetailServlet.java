package test.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.member.dto.MemberDto;

@WebServlet("/member/detail")
public class MemberDetailServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//DB 에서 불러온 회원정보라고 가장하자
		MemberDto dto=new MemberDto();
		dto.setNum(1);
		dto.setName("김구라");
		dto.setAddr("노량진");
		//request 에 "dto" 라는 키값으로 MemberDto type 담기
		req.setAttribute("dto", dto);
		// /member/detail.jsp 페이지로 forward 이동해서 응답하기
		RequestDispatcher rd=req.getRequestDispatcher("/member/detail.jsp");
		rd.forward(req, resp);
	}
}










