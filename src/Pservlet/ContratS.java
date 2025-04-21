package Pservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pBeans.Contrat;
import pBeans.Paiement;
import pDAO.ContratDAOimp;
import pDAO.PaiementDAOimp;

/**
 * Servlet implementation class ContratS
 */
@WebServlet("/ContratS")
public class ContratS extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContratS() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Contrat p=new Contrat();
		p.setIdcontrat(request.getParameter("id"));
		p.setContrat("./image/Contrat/"+request.getParameter("contrat"));
		ContratDAOimp tableNOMS = new ContratDAOimp();
		try {
			tableNOMS.ajouter(p);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			request.setAttribute("Contrats", tableNOMS.lister());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.getServletContext().getRequestDispatcher("/GérerContrat.jsp").forward(request, response);		
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
