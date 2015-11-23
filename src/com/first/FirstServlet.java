package com.first;

import java.io.IOException;


import javax.servlet.http.*;

@SuppressWarnings("serial")
public class FirstServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
	
		String var1 = req.getParameter("var1");
		int a = Integer.parseInt(var1);
		
		String var2 = req.getParameter("var2");
		int b = Integer.parseInt(var2);
		
		String var3 = req.getParameter("var3");
		int c = Integer.parseInt(var3);	
	//System.out.println(a+" "+b+" "+c);
	//	resp.getWriter().println(c);
			
		float x1=0;
		float x2=0;
		float d=0f;
		d=(float) Math.pow(b,2)-4*a*c;
		//System.out.println("Дискрименант ="+d);
		if(d>0){
			x1=(float) (-b+Math.sqrt(d))/(2*a);
			x2=(float) (-b-Math.sqrt(d))/(2*a);	
			resp.getWriter().println("x1="+x1+" "+"x2="+x2);
		}
		 else if(d==0){
				x1=x2=(float) (-b+Math.sqrt(d))/(2*a);
				resp.getWriter().println("x1=x2="+x1);
			} else resp.getWriter().println("Корней нет");
	//System.out.println(d+" "+x2);
		
	}
}

