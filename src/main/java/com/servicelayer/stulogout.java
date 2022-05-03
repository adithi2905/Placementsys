package com.servicelayer;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/stulog")
public class stulogout extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		HttpSession ses=req.getSession();
		ses.removeAttribute("id");
		ses.invalidate();
		res.sendRedirect("stulogin.jsp");
	}

}
