package ApplyLeave;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateRServlet
 */
@WebServlet("/UpdateRServlet")
public class UpdateRServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		int Rid = Integer.parseInt(request.getParameter("rid"));
		int Eid = Integer.parseInt(request.getParameter("eid"));
		String name = request.getParameter("name");
		String Did = request.getParameter("did");
		String type = request.getParameter("type");
		String date = request.getParameter("date");
		String des = request.getParameter("des");
		
		boolean isTrue;
		String msg ="";
		
		isTrue = LRequestDButil.updateRequest(Rid, Eid, name, Did, type, date, des);
		
		if(isTrue == true) {
			 msg = "Successfully Updated. ReqID: " + LRequestDButil.getReqID();
		}else {
			 msg = "Action failed. Please try again.";
		}
		request.setAttribute("msg", msg);
		RequestDispatcher dis = request.getRequestDispatcher("SMaccount.jsp");
		dis.forward(request, response);
		
	}

	}


