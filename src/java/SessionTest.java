
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 *
 * @author shahaz
 */
@WebServlet(urlPatterns = {"/test"})
public class SessionTest extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = null;

        System.out.println("Before Instantiating Session: " + session);

        session = request.getSession();

        System.out.println("After getting the session: " + session);

        session.setAttribute("name", "Shahaz");

        String name = (String) session.getAttribute("name");

        System.out.println("After setting an arrtibute value from session: " + session);

        System.out.println("Getting an arrtibute from session: " + name);

        System.out.println("Session ID: " + session.getId());

        System.out.println("Session belongs to this session context: " + session.getServletContext());

    }

}
