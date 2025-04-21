package Pservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pBeans.Demande;
import pDAO.DemandeDAOimp;

/**
 * Servlet implementation class DemandeT
 */
@WebServlet("/DemandeT")
public class DemandeT extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemandeT() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		DemandeDAOimp tableNOMS = new DemandeDAOimp();
		request.setAttribute("demande", tableNOMS.lister());
		
		String id1=request.getParameter("b");
		String page = "delete";
		if(page.equals("delete")) {
		try {
			tableNOMS.supprimer(id1);
		} catch (ClassNotFoundException k) {
			// TODO Auto-generated catch block
			k.printStackTrace();
		}
			this.getServletContext().getRequestDispatcher("/DemandeTraiter.jsp").forward(request, response);		
		}
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
