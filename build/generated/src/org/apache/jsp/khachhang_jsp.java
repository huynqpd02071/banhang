package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modal.Khachhang;
import DAOIMPL.khachHangIMPL;

public final class khachhang_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css\" integrity=\"sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js\" integrity=\"sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"contai\" style=\"width: 100%;height: 700px;\">\n");
      out.write("            <div class=\"f1\" style=\"float: left;width: 40%\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <form action=\"khachhangSeverlet\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"exampleInputEmail1\">Họ</label>\n");
      out.write("                            <input type=\"text\" name=\"fistname\" required=\"\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" placeholder=\"Enter fist name\">                    \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"exampleInputEmail1\">Tên</label>\n");
      out.write("                            <input type=\"text\" min=\"0\" name=\"lastname\"required=\"\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" placeholder=\"Enter last name\">                  \n");
      out.write("                        </div>          \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"exampleInputEmail1\">Họ và tên</label>\n");
      out.write("                            <input type=\"text\" min=\"0\" name=\"fullname\"required=\"\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" placeholder=\"Enter full name\">                  \n");
      out.write("                        </div> \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"exampleInputEmail1\">Giới tính</label><br>\n");
      out.write("                            <input type=\"radio\" name=\"sex\" value=\"true\"> Nam<br>\n");
      out.write("                            <input type=\"radio\" name=\"sex\" value=\"false\" checked> Nữ<br>\n");
      out.write("                        </div> \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"exampleInputEmail1\">Số điện thoại</label>\n");
      out.write("                            <input type=\"number\" min=\"0\" name=\"phone\"required=\"\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" placeholder=\"Enter phone\">                  \n");
      out.write("                        </div> \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"exampleInputEmail1\">Gmail</label>\n");
      out.write("                            <input type=\"text\" min=\"0\" name=\"gmail\"required=\"\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" placeholder=\"Enter gmail\">                  \n");
      out.write("                        </div> \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"exampleInputEmail1\">Địa chỉ</label>\n");
      out.write("                            <input type=\"text\" min=\"0\" name=\"address\"required=\"\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" placeholder=\"Enter address\">                  \n");
      out.write("                        </div> \n");
      out.write("                        <button type=\"submit\" name=\"action\" value=\"add\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"f2\" style=\"float: right;width: 57%;height: 90%;margin-top: 30px;margin-right: 3%;\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <table class=\"table table-striped\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>fname</th>\n");
      out.write("                                <th>lname</th>\n");
      out.write("                                <th>Full Name</th>\n");
      out.write("                                <th>Sex</th>\n");
      out.write("                                <th>phone</th>\n");
      out.write("                                <th>email</th>\n");
      out.write("                                <th>adress</th>\n");
      out.write("                                <th>Action</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            ");
 
                            khachHangIMPL kh=new khachHangIMPL();
                            Khachhang k=new Khachhang();
                            
      out.write("\n");
      out.write("                            ");
 for (Khachhang x: kh.findall()) {                                                             
                            
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <th scope=\"row\">");
      out.print(x.getFname() );
      out.write("</th>\n");
      out.write("                                <td>");
      out.print(x.getLname() );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(x.getFullname() );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(x.getSex() );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(x.getPhone() );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(x.getEmail() );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(x.getAdress() );
      out.write("</td>\n");
      out.write("                                <td>\n");
      out.write("                                    <a href=\"khachhangSeverlet?action=delete&&id=");
      out.print( x.getId() );
      out.write("\">DEL|</a>\n");
      out.write("                                </td>\n");
      out.write("                                \n");
      out.write("                            </tr>\n");
      out.write("                       ");
 }
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
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
