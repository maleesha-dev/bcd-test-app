package lk.novasphere.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.io.IOException;

@WebServlet("/test")
public class Test extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            InitialContext ic = new InitialContext();
            Object lookup = ic.lookup("java:global/bcd-webapp/Cal");
            System.out.println(lookup);

        } catch (NamingException e) {
            throw new RuntimeException(e);
        }
    }
}
