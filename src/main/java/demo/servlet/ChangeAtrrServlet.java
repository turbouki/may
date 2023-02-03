package demo.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ChangeAtrrServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=euc-kr");
        PrintWriter out = resp.getWriter();
        out.println("<html><body><center>");
        out.println("<form method=post>");
        out.println("<input type='submit' value='Context 값 할당 하기'/>");
        out.println("</form></center></body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = this.getServletContext();
        context.setAttribute("my_name", "사자");
        context.setAttribute("my_name", "호랑이");
        context.removeAttribute("my_name");

        resp.setContentType("text/html;charset=euc-kr");
        PrintWriter out = resp.getWriter();
        out.println("<html><body><center>");
        out.println("Context 값 추가, 삭제, 변경 성공!");
        out.println("</center></body></html>");
    }
}
