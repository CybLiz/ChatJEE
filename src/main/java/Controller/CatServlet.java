package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


@WebServlet("/cats")
public class CatServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("/WEB-INF/Views/CatList.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String breed = req.getParameter("breed");
        String favoriteMeal = req.getParameter("favoriteMeal");
        String birthDate = req.getParameter("birthDate");

        System.out.println("name: " + name);
        System.out.println("breed: " + breed);
        System.out.println("favorite Meal: " + favoriteMeal);
        System.out.println("birth Date: " + birthDate);

        resp.sendRedirect(getServletContext().getContextPath());
    }
}
