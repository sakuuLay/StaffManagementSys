package loginServlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SLogServlet
 */
@WebServlet("/SLogServlet")
public class SLogServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public SLogServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		try {
			List<Member> memberAcc = MemberDButil.validateM(username, password); //capture the list returned from DButil 
			
			
			if(memberAcc.isEmpty()) {
				throw new Exception();
			}else {
				request.setAttribute("AccDetails", memberAcc);
				RequestDispatcher dis = request.getRequestDispatcher("SMaccount.jsp");
				dis.forward(request, response);
			}
			
			

		}catch(Exception e) {
			System.out.println("Error caught SLogSV : " + e.getMessage());
		}
		
		
		
	}

}
