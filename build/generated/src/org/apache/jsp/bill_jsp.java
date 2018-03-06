package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bill_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css\" integrity=\"sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js\" integrity=\"sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                    <form action=\"khachhangSeverlet\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"exampleInputEmail1\">Tổng giá</label>\n");
      out.write("                            <input type=\"text\" name=\"payment\" required=\"\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" >                    \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"exampleInputEmail1\">Cách thanh toán</label>\n");
      out.write("                            <input type=\"text\" min=\"0\" name=\"payment\"required=\"\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" >                  \n");
      out.write("                        </div> \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"exampleInputEmail1\">Địa chỉ</label>\n");
      out.write("                            <input type=\"text\" min=\"0\" name=\"address\"required=\"\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" >                  \n");
      out.write("                        </div>  \n");
      out.write("                         <div class=\"form-group\">\n");
      out.write("                            <label for=\"exampleInputEmail1\">Ngày</label>\n");
      out.write("                            <input type=\"date\" min=\"0\" name=\"date\"required=\"\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" >                  \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"exampleInputEmail1\">Thông tin khách hàng</label>\n");
      out.write("                            <input type=\"text\" min=\"0\" name=\"id_khachHang\"required=\"\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" >                  \n");
      out.write("                        </div>\n");
      out.write("                     \n");
      out.write("                        <button type=\"submit\" name=\"action\" value=\"add\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
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
