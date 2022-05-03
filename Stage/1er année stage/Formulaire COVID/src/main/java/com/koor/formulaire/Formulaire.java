package com.koor.formulaire;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Formulaire
 */
@WebServlet("/formulaire")
public class Formulaire extends HttpServlet 

	{
		private static final long serialVersionUID = 1L;
	       
	    /**
	     * @see HttpServlet#HttpServlet()
	     */
	    public Formulaire() 
	    {
	        super();
	        // TODO Auto-generated constructor stub
	    }
	
		/**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
		{
			System.out.println("in the doget");
			String login = request.getParameter("txtLogin");
			String password = request.getParameter("txtPassword");
			String name = request.getParameter("txtName");
			String lastname = request.getParameter("txtLastName");
			boolean bolean = true;
			
		
			
			
			HttpSession session = request.getSession( );
			session.setAttribute("login", login);
			session.setAttribute("password", password);
			session.setAttribute("name", name);
			session.setAttribute("lastname", lastname);
			System.out.println("in the doGet2");
			
			if (bolean == true)
			{
				
				System.out.println("in the doGet1");
				request.getRequestDispatcher("/Login.jsp").forward(request, response);
				System.out.println("in the doGet0");
				request.getRequestDispatcher("/Welcome.jsp").forward(request, response);
			}
			
		}
	
		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response) 
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
		{
	
			String login = request.getParameter("txtLogin");
			String password = request.getParameter("txtPassword");
			String name = request.getParameter("txtName");
			String lastname = request.getParameter("txtLastName");
							
			HttpSession session = request.getSession();
			session.setAttribute("login", login);
			session.setAttribute("password", password);
			session.setAttribute("name", name);
			session.setAttribute("lastname", lastname);
			
		
			System.out.println(login);
			System.out.println("in the doPost");
			
			if (login.equals("bond") && password.equals("007")) 
			{
				request.getRequestDispatcher("/Welcome.jsp").forward(request, response);
				session.setAttribute("isConnected", true);
			
				
			}
			else 
			{
				request.getRequestDispatcher("/Login.jsp").forward(request, response);
				session.setAttribute("isConnected", false);

		    }
			if (name.equals("Jean") && lastname.equals("duJardin")) 
			{
		 		request.getRequestDispatcher("/Identification.jsp").forward(request, response);
		 		System.out.println("dans une autre");
				System.out.println(login);
				System.out.println(password);
		 		
			}
			else	
			{
				request.getRequestDispatcher("/Welcome.jsp").forward(request, response);
			
			}
		
		
			
	
		}
	}

