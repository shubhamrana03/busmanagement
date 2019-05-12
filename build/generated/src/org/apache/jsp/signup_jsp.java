package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Sign Up</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"cs1.css\">\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <style>\n");
      out.write("               \n");
      out.write("            .loginbox {\n");
      out.write("                width: 320px;\n");
      out.write("                height: 420px;\n");
      out.write("                background: #C1D1D3;\n");
      out.write("                color: #fff;\n");
      out.write("                top: 50%;\n");
      out.write("                left: 50%;\n");
      out.write("                position: absolute;\n");
      out.write("                transform: translate(-50%,-50%);\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                padding: 70px 30px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            h1{\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0 0 20px;\n");
      out.write("                text-align: center;\n");
      out.write("                font-size: 22px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .loginbox{\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .loginbox input{\n");
      out.write("                width: 95%;\n");
      out.write("                margin-bottom: 20px;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("           \n");
      out.write("            \n");
      out.write("            .loginbox input[type=\"submit\"]{\n");
      out.write("                border: none;\n");
      out.write("                outline: none;\n");
      out.write("                height: 40px;\n");
      out.write("                background: #fb2525;\n");
      out.write("                color: #fff;\n");
      out.write("                font-size: 18px;\n");
      out.write("                border-radius: 20px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .loginbox input[type=\"submit\"]:hover\n");
      out.write("            {\n");
      out.write("                cursor: pointer;\n");
      out.write("                background: #ffc107;\n");
      out.write("                color: #000;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .loginbox a{\n");
      out.write("                text-decoration: none;\n");
      out.write("                font-size: 12px;\n");
      out.write("                line-height: 20px;\n");
      out.write("                color: aquamarine;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .loginbox a:hover{\n");
      out.write("                color: #f44336\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("        <script type = \"text/javascript\">\n");
      out.write("    \n");
      out.write("    function func1()\n");
      out.write("    {\n");
      out.write("        var x=document.getElementById(\"n1\").value;\n");
      out.write("        \n");
      out.write("        if(x.length === 0)\n");
      out.write("        {\n");
      out.write("            alert(\"Please fill credentials\");\n");
      out.write("        }\n");
      out.write("        else\n");
      out.write("        {\n");
      out.write("            confirm(\"Are you sure?\");\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body background=\"image1/snap1.jpg\">\n");
      out.write("        <div class=\"loginbox\">\n");
      out.write("        <h1>Sign Up for new bus service-</h1>\n");
      out.write("        <form action=\"signup\" method=\"POST\">\n");
      out.write("            <p> Enter Username:</p><br>\n");
      out.write("            <input type=\"text\" name=\"name\" placeholder=\"Enter Username\" id=\"n1\">\n");
      out.write("            <p>Enter Password:</p><br>\n");
      out.write("            <input type=\"password\" name=\"pass\" id=\"n1\" placeholder=\"Enter Password\">\n");
      out.write("            <label for=\"psw-repeat\"><b>Repeat Password:</b></label>\n");
      out.write("          <input type=\"password\" placeholder=\"Repeat Password\" name=\"psw-repeat\" required>\n");
      out.write("            <br><br><br>\n");
      out.write("            \n");
      out.write("            <input type=\"submit\" value=\"Submit\" onclick=\"func1()\"><p>\n");
      out.write("<!--                <a href=\"#\"> Lost Your Password?</a><br>\n");
      out.write("                <a href=\"signup1.jsp\"> Don't Have an account?</a><br>\n");
      out.write("                              -->\n");
      out.write("        </form>\n");
      out.write("    \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
