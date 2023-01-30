package com.xworkz.message.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/person")
public class FavPersonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public FavPersonServlet() {
        System.out.println("created favorite person");
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    String fname=req.getParameter("fname");
	    String lname=req.getParameter("lname");
	    String gender=req.getParameter("gen");
	    String adress=req.getParameter("address");
	    String reason=req.getParameter("reason");
	    
	    req.setAttribute("fname", fname);
	    req.setAttribute("lname", lname);
	    req.setAttribute("gender", gender);
	    req.setAttribute("addr", adress);
	    req.setAttribute("reason", reason);
	    
	    RequestDispatcher dispatcher=req.getRequestDispatcher("display.jsp");
	    dispatcher.forward(req, resp);



   
    } 
    
    
    

}
