package javaxdemo_servelt.javax;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class second_javax extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		  PrintWriter	wri=res.getWriter();
			wri.println("<h1> hello inside the java sdeconds <h1>");
		
	}

}
