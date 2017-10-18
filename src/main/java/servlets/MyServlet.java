package servlets;

import model.Weather;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * This class is servlet that processes request to /russianWeather path
 *
 * @author Filipp Zaripov
 * @version 0.1
 */

@WebServlet("/russianWeather")
public class MyServlet extends HttpServlet {

    /**
     * This method processes GET requests from server and give the answer as weather for current city.
     * Business logic for getting weather for current city is here:
     * @see Weather
     *
     * @param req - overridden from HttpServlet class
     * @param resp - overridden from HttpServlet class
     * @throws ServletException
     * @throws IOException
     * @see HttpServlet
     *
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String city = req.getParameter("City");
        String weather = Weather.getCurrentWeather(city);
        req.setAttribute("city", weather);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/index.jsp");
        requestDispatcher.forward(req,resp);
    }

    /**
     * This method calls doGet() method
     *
     * @param req - overridden from HttpServlet class
     * @param resp - overridden from HttpServlet class
     * @throws ServletException
     * @throws IOException
     * @see HttpServlet
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }


}
