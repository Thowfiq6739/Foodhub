
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
 protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
   String email=req.getParameter("email");
   String pass=req.getParameter("password");
   if(email.equals("test@gmail.com") && pass.equals("1234")){
     res.sendRedirect("menu.jsp");
   } else {
     res.getWriter().print("Invalid Login");
   }
 }
}
