package fr.eni.jee;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TraitementChiFouMi
 */
@WebServlet("/traitementChiFouMi")
public class traitementChiFouMi extends HttpServlet {
	int choixPC;
    String result ; 
   	
	/**
	  
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("choix du joueur traitement : " + request.getParameter("choix"));
		String ordiChoix = null;
		result = ""; //par défaut échec
		switch (choixPC) {
		case 0 :
			ordiChoix = "pierre";
		break;
		case 1 : 
			ordiChoix = "feuille";
		break;
		case 2 : 
			 ordiChoix = "ciseaux";
		break;
		}
		
		if(request.getParameter("choix").equalsIgnoreCase(ordiChoix)) {
			result = "Egalité";
		}
		else if((request.getParameter("choix").equalsIgnoreCase("feuille") && ordiChoix.equalsIgnoreCase("pierre")) || (request.getParameter("choix").equalsIgnoreCase("ciseaux") && ordiChoix.equalsIgnoreCase("feuille")) || (request.getParameter("choix").equalsIgnoreCase("pierre") && ordiChoix.equalsIgnoreCase("ciseaux"))       ) {
			result = "VICTOIRE";
		}
		else  {
			result = "défaite";
		}
		request.setAttribute("ordiChoix", ordiChoix);
		System.out.println("choix du pc traitement : " + ordiChoix);
		request.setAttribute("choix",request.getParameter("choix") );
		request.setAttribute("result", result);
		request.getRequestDispatcher("./WEB-INF/resultat.jsp").forward(request, response);
		init();
	}


	@Override
	public void init() throws ServletException {
		Random rd = new Random();
		 choixPC = rd.nextInt(3);//entre 0 et 2
		
		
	}

}
