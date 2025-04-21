package Pservlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pBeans.Offres;
import pBeans.Paiement;
import pDAO.OffreDAOimp;
import pDAO.PaiementDAOimp;

/**
 * Servlet implementation class paiementS
 */
@WebServlet("/paiementS")
public class paiementS extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public paiementS() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Paiement p=new Paiement();
		p.setIdp("000000");
		p.setNcinC(request.getParameter("cinC"));
		p.setNomC(request.getParameter("nom"));
		p.setPrenomC(request.getParameter("prenom"));
		p.setDemande(request.getParameter("demande"));
		p.setPrix(request.getParameter("prix"));
		PaiementDAOimp tableNOMS = new PaiementDAOimp();
		try {
			tableNOMS.ajouter(p);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			request.setAttribute("paiements", tableNOMS.lister());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.getServletContext().getRequestDispatcher("/GererPaiement.jsp").forward(request, response);		
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
