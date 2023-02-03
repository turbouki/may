package demo.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ParamServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = this.getServletContext();

        String co_name = context.getInitParameter("co_name");
        String co_tel = context.getInitParameter("co_tel");
        String email = context.getInitParameter("email");

        resp.setContentType("text/html;charset=euc-kr");
        PrintWriter out = resp.getWriter();
        out.println("<html><head>");
        out.println("<style type='text/css'>");
        out.println(".n_bo { border:none }");
        out.println("</style>");
        out.println("</head><body><center>");
        out.println("회사상호 : ");
        out.println("<input type='text' class='n_bo' value='" + co_name + "'/><br/>");
        out.println("회사전번 : ");
        out.println("<input type='text' class='n_bo' value='" + co_tel + "'/><br/>");
        out.println("대표메일 : ");
        out.println("<input type='text' class='n_bo' value='" + email + "'/><br/>");
        out.println("</center></body></html>");
    }
}
