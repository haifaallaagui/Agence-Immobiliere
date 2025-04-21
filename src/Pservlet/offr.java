package Pservlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pBeans.Offres;
import pDAO.OffreDAOimp;

/**
 * Servlet implementation class offr
 */
@WebServlet("/offr")
public class offr extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public offr() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Offres offre=new Offres();
		offre.setIdoffres(request.getParameter("nom"));
		offre.setPrix(request.getParameter("prix"));
		offre.setLocalisation(request.getParameter("localisation"));
		offre.setType(request.getParameter("type"));
		offre.setImage("./images/"+request.getParameter("image"));
		OffreDAOimp tableNOMS = new OffreDAOimp();
		try {
			tableNOMS.ajouter(offre);
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			request.setAttribute("Offres", tableNOMS.lister());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String page = "edit";
		String id1=request.getParameter("k");
		if(page.equals("edit")) {
			try {
				tableNOMS.supprimer(id1);
			} catch (ClassNotFoundException k) {
				// TODO Auto-generated catch block
				k.printStackTrace();
			} 
		}
		this.getServletContext().getRequestDispatcher("/AjoutOffre.jsp").forward(request, response);		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
