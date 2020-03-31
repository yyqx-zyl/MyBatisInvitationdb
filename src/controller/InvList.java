package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pojo.Invitation;
import service.InvitationService;
import service.impl.InvitationServiceImpl;

/**
 * Servlet implementation class InvList
 */
@WebServlet("/InvList")
public class InvList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       //创建一个业务层接口对象
	private InvitationService ins=new InvitationServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InvList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<Invitation> list =ins.getInvList();
		request.getSession().setAttribute("list", list);
		response.sendRedirect("index.jsp");
		
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
