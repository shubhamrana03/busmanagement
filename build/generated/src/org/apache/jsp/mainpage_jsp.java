package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mainpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>AdminDash</title>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<link href=\"//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script src=\"//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"css/css1.css\">\n");
      out.write("<script type = \"text/javascript\" src= \"js/dashboard.js\" ></script> \n");
      out.write("<link rel=\"stylesheet\" href=\"css/css2.css\">\n");
      out.write("\t<script src=\"https://use.fontawesome.com/07b0ce5d10.js\"></script>\n");
      out.write("  \n");
      out.write("    <style>\n");
      out.write("    p{\n");
      out.write("    color:#c23616;\n");
      out.write("    }\n");
      out.write("    h4\n");
      out.write("\t\t{\n");
      out.write("\t\t\tfloat: right;\n");
      out.write("\t\t\tcolor: crimson;\n");
      out.write("\t\t\tfont-family: Segoe Print;\n");
      out.write("\t\t\tbackground-color: white;\n");
      out.write("\t\t\tborder-radius: 20px;\n");
      out.write("\t\t\tpadding: 10px;\n");
      out.write("\t\t}\n");
      out.write("    h4:hover\n");
      out.write("\t\t{\n");
      out.write("\t\t\tcolor: black;\n");
      out.write("\t\t\tcursor: default;\n");
      out.write("\t\t}\n");
      out.write("    </style>\n");
      out.write("    </head>\n");
      out.write("   \n");
      out.write("\n");
      out.write("    \n");
      out.write("    \t\n");
      out.write("            \t\n");
      out.write("    <div class=\"page-topbar\">\n");
      out.write("       \t\n");
      out.write("       \t\n");
      out.write("       <div class=\"logo-area\">   \n");
      out.write("        <img src=\"image1/d1.jpg\" length=\"70\" width=\"70\">\n");
      out.write("       </div> \n");
      out.write(" \n");
      out.write("        <div class=\"quick-area\">\n");
      out.write("        \n");
      out.write("            \t\n");
      out.write("        <ul class=\"pull-left info-menu  user-notify\">\n");
      out.write("       \n");
      out.write("         \n");
      out.write("         <li><a href=\"messages.html\"> <i class=\"fa fa-envelope\"></i> <span class=\"badge\"></span></a></li>\n");
      out.write("         <li><a href=\"notify.html\"> <i class=\"fa fa-bell\"></i> <span class=\"badge\"></span></a></li>  \n");
      out.write("         \n");
      out.write("       \n");
      out.write("              </ul>\n");
      out.write("         \n");
      out.write("           \n");
      out.write("       <ul class=\"pull-right info-menu user-info\">\n");
      out.write("      \n");
      out.write("         <li class=\"profile\">\n");
      out.write("<!--             <a href=\"#\" data-toggle=\"dropdown\" class=\"toggle\" aria-expanded=\"false\">-->\n");
      out.write("<!--                 <img src=\"images/lock.png\" class=\"img-circle img-inline\">-->\n");
      out.write("                 ");
 String name = (String)request.getAttribute("uname"); 
      out.write("\n");
      out.write("<!--    <p align=\"right\">Welcome ! -->\n");
      out.write("<!--                 <span>");
      out.print(name);
      out.write("!<i class=\"fa fa-angle-down\"></i></span>-->\n");
      out.write("<a href=\"index.html\"><input type=\"button\" value=\"Logout\"></a>\n");
      out.write("             </a>\n");
      out.write("            \n");
      out.write("<!--             <ul class=\"dropdown-menu profile fadeIn \">\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"setting.html\">\n");
      out.write("                                <i class=\"fa fa-wrench\"></i>\n");
      out.write("                                Settings\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"profile.html\">\n");
      out.write("                                <i class=\"fa fa-user\"></i>\n");
      out.write("                                Profile\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        \n");
      out.write("                        <li class=\"last\">\n");
      out.write("                            <a href=\"logout.jsp\">\n");
      out.write("                                <i class=\"fa fa-lock\"></i>\n");
      out.write("                                Sign Out\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("           -->\n");
      out.write("            \n");
      out.write("           </li>\n");
      out.write("         </ul>\n");
      out.write("            \n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("   \n");
      out.write("    <div class=\"page-sidebar expandit\">\n");
      out.write("      <div class=\"sidebar-inner\" id=\"main-menu-wrapper\">\n");
      out.write("         <div class=\"profile-info row \">\n");
      out.write("           <div class=\"profile-image \">\n");
      out.write("                <a href=\"ui-profile.html\">\n");
      out.write("                    <img alt=\"\" src=\"image1/snap1.jpg\" length=\"20\" width=\"20\" class=\"img-circle img-inline\" class=\"img-responsive img-circle\">\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("             <div class=\"profile-details\">\n");
      out.write("                <h3>\n");
      out.write("                    <a href=\"ui-profile.html\"><h4>");
      out.print(name);
      out.write("!</h4></a> \n");
      out.write("                </h3>\n");
      out.write("                \n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("          <ul class=\"wraplist\" style=\"height: auto;\">\t\n");
      out.write("<!--          <li class=\"menusection\">Main</li>-->\n");
      out.write("          <li><a href=\"mainpage.jsp\"> <span class=\"sidebar-icon\"><i class=\"fa fa-dashboard\"></i></span> <span class=\"menu-title\">Dashboard</span></a></li>\n");
      out.write("          <li><a href=\"routes.jsp\"><span class=\"sidebar-icon\"><i class=\"fa fa-vcard\"></i></span> <span class=\"menu-title\">Routes</span></a></li>\n");
      out.write("\n");
      out.write("          \n");
      out.write("           <li><a href=\"businfo.jsp\"><span class=\"sidebar-icon\"><i class=\"fa fa-cutlery\"></i></span> <span class=\"menu-title\">Bus Information</span></a></li>\n");
      out.write("         \n");
      out.write("         \n");
      out.write("          \n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("      <section id=\"main-content\">\n");
      out.write("     <section class=\"wrapper main-wrapper row\">        \n");
      out.write("          <div class=\"col-md-30\">              \n");
      out.write("              <section class=\"box\">\n");
      out.write("    \n");
      out.write("    \n");
      out.write("                \n");
      out.write("                  <br>\n");
      out.write("                  <br>\n");
      out.write("                  <br>\n");
      out.write("                  <h1>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbspWelcome to Chitkara Bus Portal</h1>\n");
      out.write("                  <h3>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbspHere you check all the information regarding bus routes and details</h3>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("   \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("         </div>\n");
      out.write("<!--          <div class=\"col-md-4\"> \n");
      out.write("                       \n");
      out.write("               <section class=\"box\" style=\"border: 4px dotted red\";>  \n");
      out.write("               <h1 style=\"color:#EA2027 ; text-align:center\";>Alerts</h1>           \n");
      out.write("               <div class=\"alert alert-info\">\n");
      out.write("    <strong>Info!</strong> This alert box will tell your Attendance,Fees and other related info!\n");
      out.write("  </div>  </section>-->\n");
      out.write("              \n");
      out.write("         \n");
      out.write("     \n");
      out.write("        </section>\n");
      out.write("    </section>\n");
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
