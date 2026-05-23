package ApplyLeave;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/upReqServlet")
public class upReqServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public upReqServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
int ReqID = Integer.parseInt(request.getParameter("update"));
		
		try {
			List<fRequest> Req = LRequestDButil.ViewReq(ReqID); //capture the list returned from DButil 
			
			
			if(Req.isEmpty()) {
				throw new Exception("No object retrieved");
			}else {
				request.setAttribute("Req",Req);
				RequestDispatcher dis = request.getRequestDispatcher("updtReq.jsp");
				dis.forward(request, response);
			}
		}catch(Exception e) {
			System.out.println("Error caught reqVsvlt : " + e.getMessage());
		}
		
	}

}
