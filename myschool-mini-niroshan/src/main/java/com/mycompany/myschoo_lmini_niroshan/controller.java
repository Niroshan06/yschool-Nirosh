/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myschoo_lmini_niroshan;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Niroshan
 */
@WebServlet(name = "controller", urlPatterns = {"/controller"})
public class controller extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /*
             * TODO output your page here. You may use following sample code.
             */
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet controller</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet controller at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String TstudentName;
        String Tgrade;
        String Tsubject;
        int Tmarks;
        String Smarks;

        TstudentName = request.getParameter("stuName");
        Tgrade = request.getParameter("grade");
        Tsubject = request.getParameter("subject");
        Smarks = request.getParameter("marks");

        if (Smarks == "" || Tsubject == "") {
            getServletContext().getRequestDispatcher("/emptyField.jsp").forward(request, response);
        } else {
            Tmarks = Integer.parseInt(Smarks);
            StudentDetails modelBean = new StudentDetails();
            modelBean.setStuName(TstudentName);
            modelBean.setGrade(Tgrade);
            modelBean.setSubject(Tsubject);
            modelBean.setMarks(Tmarks);
            
            if(Tmarks<0 || Tmarks>100)
                getServletContext().getRequestDispatcher("/out_of_range.jsp").forward(request, response);
            else{
            request.setAttribute("modelBean", modelBean);
            getServletContext().getRequestDispatcher("/response.jsp").forward(request, response);
        }
    }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
