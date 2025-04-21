package  Pservlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pBeans.Profile;
import pDAO.login_secr;



/**
 * Servlet implementation class login_serv
 */
@WebServlet("/login_serv")
public class login_serv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login_serv() {
        super();
        // TODO Auto-generated constructor stub
    }
    private pDAO.login_admin_dao login_admin_dao;
    	private pDAO.login_secr login_secr;

    
   	 
    
    
    
    public void init() {
    	login_admin_dao = new pDAO.login_admin_dao();
    	login_secr = new pDAO.login_secr();;
    
    }


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
	
		Profile admin  = new Profile();
		Profile secretaire =new Profile();
		admin.setUsername(username);
		admin.setPassword(password);
		secretaire.setUsername(username);
		secretaire.setPassword(password);

		try {
			
			if(login_admin_dao.validate(admin)) {

				this.getServletContext().getRequestDispatcher("/agent.jsp").forward(request, response);
				
			}
			
			else if(login_secr.validate(secretaire)) {

				this.getServletContext().getRequestDispatcher("/Secrétaire.jsp").forward(request, response);
				
			}

			else {
				HttpSession session = request.getSession();
				session.setAttribute("username", username);
				response.sendRedirect("S'authentifier.jsp");
				
			}
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
	
	
	}
}
		
		
		
		
	

