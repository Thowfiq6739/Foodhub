
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
 protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
   res.sendRedirect("login.jsp");
 }
}
