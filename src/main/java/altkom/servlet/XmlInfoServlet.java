package altkom.servlet;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class XmlInfoServlet
 */
// @WebServlet("/xmlinfo")
public class XmlInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletContext sc;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		sc = config.getServletContext();
		sc.log("################### XML init() #################"); 
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		sc.log("++++++++++++++ XML doGet() ++++++++++++++++++"); 		response.getWriter().append("XML servlet: ").append(request.getContextPath());
	}

}
