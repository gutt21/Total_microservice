package javaxdemo_servelt.javax;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
public class javax_servelt implements Servlet {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	PrintWriter	wri=res.getWriter();
		wri.println("<h1> hello inside the java <h1>");
	}

}
