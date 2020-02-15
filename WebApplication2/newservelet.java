/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newservlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class NewServlet extends HttpServlet 
{
  private String titolo, saluti;

  private static final String PAGE_TOP = ""
    + "<html>"
    + "<head>"
    + "<title> Passaggio parametri da una form HTML - GET </title>"
    + "</head>"
    + "<body>"
   ;

  private static final String PAGE_BOTTOM = ""
    + "</body>"
    + "</html>"
  ;

  // icone per visualizzare codice o ritornare al menu'
//  private static final String ICONE = ""
//    + "<a href=\"../Form1.html\">"
//    + "<img src=\"../images/code.gif\" height=24 "
//    + "width=24 align=right border=0 alt=\"view code\"></a>"
//    + "<a href=\"../index.html\">"
//    + "<img src=\"../images/return.gif\" height=24 " 
//    + "width=24 align=right border=0 alt=\"return\"></a> "
//  ;   
  public void doGet(HttpServletRequest request,HttpServletResponse response)
  throws IOException, ServletException
  {
    doPost(request, response);
  }  
   
  public void doPost(HttpServletRequest request, HttpServletResponse response)
  throws IOException, ServletException
  {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter(); // get writer
   
    // i parametri nome e cognome vengono passati dal browser
    String nome = request.getParameter("nome");
    String cognome = request.getParameter("cognome");
  
    // crea una pagina HTML e la invia al client 
    out.println(PAGE_TOP);
//    out.println(ICONE);
  
    // contenuto della pagina html 
    out.println("Ciao "+nome+" "+cognome+"!</p>");
    out.println("<b>La data di oggi e'': " + new java.util.Date()+    "</b></p>");

    // chiusura pagina HTML
    out.println(PAGE_BOTTOM);
  }

  
}