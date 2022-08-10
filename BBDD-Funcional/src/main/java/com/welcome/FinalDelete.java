package com.welcome;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FinalDelete
 */
@WebServlet("/FinalDelete")
public class FinalDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FinalDelete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		
        try {
            Class.forName(DButil.CONTROLADOR);
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found " + e);
        }
        try {
            Connection conn = DriverManager.getConnection(DButil.URL, DButil.USUARIO, DButil.CLAVE);
            System.out.println("connection successful");
            PreparedStatement st = conn.prepareStatement("delete from usuarios where stuid=?");
  
            st.setInt(1, Integer.valueOf(request.getParameter("id")));
  
            st.executeUpdate();
  
            st.close();
            conn.close();
  
            response.sendRedirect("Success.jsp?msg=Delete");
  
        } catch (Exception e) {
            e.printStackTrace();
        }
        
	}

}
