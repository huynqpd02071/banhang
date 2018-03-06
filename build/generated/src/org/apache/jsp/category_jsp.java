package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modal.Category;
import DAOIMPL.cateIMPL;

public final class category_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"cateServlet\" method=\"Get\" style=\"margin: auto; width: 600px;height: auto \">          \n");
      out.write("            <div class=\"form-group\" style=\"margin: auto; width: 600px;height: auto \">\n");
      out.write("                <label for=\"pwd\">Name</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"name\" id=\"pwd\">\n");
      out.write("            </div>        \n");
      out.write("            <button type=\"submit\" value=\"add\" name=\"action\"  class=\"btn btn-default\">Submit</button>\n");
      out.write("             <h2>Danh sách </h2>\n");
      out.write("        </form>\n");
      out.write("       \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <table class=\"table table-striped\" style=\"margin: auto; width: 600px;height: auto \">\n");
      out.write("                ");
 cateIMPL ca=new cateIMPL(); 
      out.write("\n");
      out.write("                <tr style=\"width: 50%\">\n");
      out.write("                    <th>id</th>\n");
      out.write("                    <th>name</th>\n");
      out.write("                    <th>Action</th>\n");
      out.write("                </tr>\n");
      out.write("                <thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");
 for (Category x : ca.findall()) {
                                
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <th>");
      out.print(x.getCategoryId() );
      out.write(" </th>\n");
      out.write("                        <th>");
      out.print(x.getCategoryName() );
      out.write("</th>\n");
      out.write("                        <th> \n");
      out.write("                            <a href=\"cateServlet?action=delete&id=");
      out.print( x.getCategoryId());
      out.write("\">DEL </a>\n");
      out.write("                            <a href=\"\"></a>\n");
      out.write("                        </th>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("                </thead>\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("   \n");
      out.write("\n");
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
