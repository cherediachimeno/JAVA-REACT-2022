package com.welcome;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MiServlet
 */
@WebServlet("/MiServlet")
public class MiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MiServlet() {
        super();
    }
    
    protected void processRequest(HttpServletRequest req, HttpServletResponse res)
    		throws ServletException, IOException{
    	
    	//COMO RESPUESTA A LA PETICIÓN DEL CLIENTE, UTILIZAREMOS... TEXTO/HTML
    	res.setContentType("text/html; charset=UTF-8");
    	PrintWriter out = res.getWriter();
    	
    	
    	//OBTENEMOS LOS PARÁMETROS DE LA PETICIÓN
    	try {
    		String nombre = req.getParameter("nombre");
    		String tInicial = req.getParameter("inicial");
    		String tFinal = req.getParameter("final");
    		String distancia = req.getParameter("distancia");
    		
    		Double velocidad;
    		Double tiempo;
    		
    		Calculo calculo = new Calculo(nombre, tInicial, tFinal, distancia);
    	
    		calculo.velocidad();
    		
    		velocidad = calculo.getVelocidad();
    		
    		calculo.tiempoTotal();
    		
    		tiempo = calculo.getTiempoTotal();
    		
    		//GUARDAMOS ESOS PARÁMETROS PARA PODERLOS ENVIAR
    		// A LA VISTA
    		
    		req.setAttribute("datosEnviados", calculo);
    		
    		//FALTARÁ INDICARLE EL DESTINO
    		
    		req.getRequestDispatcher("/paginaDestino.jsp").forward(req, res);
    		
    		
    	} finally {
    		out.close();
    	}
    	
    }
    	
    	
    	protected void doGet(HttpServletRequest req, HttpServletResponse res) 
    			throws ServletException, IOException {
    	    
    	}
    
    	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
    			throws ServletException, IOException {
    		
    	    processRequest(request, response);
    	}

	
}
