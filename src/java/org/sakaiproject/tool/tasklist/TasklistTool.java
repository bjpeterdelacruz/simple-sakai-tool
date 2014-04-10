package org.sakaiproject.tool.tasklist;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TasklistTool extends HttpServlet {
  /**
   * Respond to navigation / access requests.
   * 
   * @param req The servlet request.
   * @param res The servlet response.
   * @throws ServletException.
   * @throws IOException.
   */
  protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,
      IOException {
    res.setContentType("text/html; charset=UTF-8");
    PrintWriter out = res.getWriter();

    out.println("<h1>Sakai Tasktool</h1>");
    out.println("Hello, " + req.getRemoteAddr());
  }
}
