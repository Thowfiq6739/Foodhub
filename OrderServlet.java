
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/order")
public class OrderServlet extends HttpServlet {
 protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
   res.getWriter().print("Order Placed Successfully");
 }
}
