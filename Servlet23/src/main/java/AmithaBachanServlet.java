

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 3,urlPatterns = "/bacchan")
public class AmithaBachanServlet extends HttpServlet {
	
		public AmithaBachanServlet() {
		System.out.println("Hello Bacchan sir");
		}
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("This is Bacchan Sir");
		}


}
