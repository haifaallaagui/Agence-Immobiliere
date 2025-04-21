package Pservlet;

import java.io.IOException;

import pBeans.Client;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import pDAO.ClientDAOimp;

/**
 * Servlet implementation class ClientS
 */
@WebServlet("/ClientS")
public class ClientS extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientS() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Client C= new Client();
		C.setCinC(request.getParameter("cin"));
		C.setNom(request.getParameter("nom"));
		C.setPrenom(request.getParameter("prenom"));
		C.setDatenaissance(request.getParameter("date_naissance"));
		C.setNumtel(request.getParameter("numtel"));
		C.setAdresse(request.getParameter("adresse"));
		C.setDemande(request.getParameter("d"));
		C.setImage("./image/Client/"+request.getParameter("image"));
		ClientDAOimp tableNOMS = new ClientDAOimp();
		try {
			tableNOMS.ajouter(C);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			request.setAttribute("Clients", tableNOMS.lister());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String page = "delete";
		String id=request.getParameter("cin2");
		if(page.equals("delete")) {
			try {
				tableNOMS.supprimer(id);
			} catch (ClassNotFoundException k) {
				// TODO Auto-generated catch block
				k.printStackTrace();
				}
			}
		
		this.getServletContext().getRequestDispatcher("/AjoutClient.jsp").forward(request, response);	
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
}
