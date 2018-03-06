package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DAOIMPL.cateIMPL;
import modal.Product;
import modal.Category;
import DAOIMPL.productIMPL;

public final class product_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css\" integrity=\"sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js\" integrity=\"sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 productIMPL p = new productIMPL();
            cateIMPL ct = new cateIMPL();
        
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <form action=\"productServlet\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"exampleInputEmail1\">Tên sản phẩm</label>\n");
      out.write("                    <input type=\"text\" name=\"name\" required=\"\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" placeholder=\"Enter name\">                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"exampleInputEmail1\">Giá bán</label>\n");
      out.write("                    <input type=\"number\" min=\"0\" name=\"price\"required=\"\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" placeholder=\"Enter price\">                  \n");
      out.write("                </div>          \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"exampleSelect1\">Danh mục</label>\n");
      out.write("                    <select class=\"form-control\" name=\"danhmuc\" id=\"exampleSelect1\" >\n");
      out.write("                        ");
 for (Category v : ct.findall()) {
                        
      out.write("\n");
      out.write("                        <option value=\"");
      out.print(v.getCategoryId());
      out.write('"');
      out.write('>');
      out.print(v.getCategoryName());
      out.write("</option>   \n");
      out.write("                        ");
 }
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"exampleInputFile\">Image</label>\n");
      out.write("                    <input type=\"file\" class=\"form-control-file\" id=\"exampleInputFile\" aria-describedby=\"fileHelp\">                 \n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"exampleTextarea\">Mô tả sản phẩm</label>\n");
      out.write("                    <textarea class=\"form-control\" name=\"mota\" required=\"\" id=\"exampleTextarea\" rows=\"3\"></textarea>\n");
      out.write("                </div>\n");
      out.write("                <button type=\"submit\" name=\"action\" value=\"add\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <table class=\"table table-inverse\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Name</th>\n");
      out.write("                        <th>Giá bán</th>\n");
      out.write("                        <th>Thông tin</th>\n");
      out.write("                        <th>Image</th>\n");
      out.write("                        <th>Danh mục</th>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");
 for (Product z:p.findall()) {
                                                   
                    
      out.write("\n");
      out.write("                    <tr>                                              \n");
      out.write("                        <td>");
      out.print( z.getProductName() );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( z.getProductPrice() );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( z.getProductDescription() );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( z.getProductImage() );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( z.getCategory().getCategoryName() );
      out.write("</td>\n");
      out.write("                      \n");
      out.write("                    </tr>\n");
      out.write("                    ");
 }
      out.write("\n");
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("\n");
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
