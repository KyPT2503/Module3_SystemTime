import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@WebServlet(name = "SystemTime", value = "/home")
public class SystemTime extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer=response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Hello word</h1>");
        writer.println("<p>"+ new Date() +"</p>");
        writer.println("</html>");
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
