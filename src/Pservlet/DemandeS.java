package Pservlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pBeans.Demande;
import pDAO.DemandeDAOimp;

/**
 * Servlet implementation class DemandeS
 */
@WebServlet("/DemandeS")
public class DemandeS extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemandeS() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Demande d = new Demande();
		response.setContentType("text/html:charset=UTF-8");
		String numD =request.getParameter("numD");
		String cin = request.getParameter("cin");
		String name = request.getParameter("name");
		String prenom = request.getParameter("prenom");
		String numtel = request.getParameter("numtel");
		String numoffres = request.getParameter("numoffres");
		String demande1 = request.getParameter("demande");
		String date = request.getParameter("planning");
		d.setNumD(numD);
		d.setCinclient(cin);
		d.setNomclient(name);
		d.setPrenomclient(prenom);
		d.setNumtelClient(numtel);
		d.setNumoffresclient(numoffres);
		d.setDemande(demande1);
		d.setRendezvous(date);
		DemandeDAOimp tableNOMS = new DemandeDAOimp();
		try {
			tableNOMS.ajouter(d);
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.getServletContext().getRequestDispatcher("/aprés.jsp").forward(request, response);		
	}
	/**

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
