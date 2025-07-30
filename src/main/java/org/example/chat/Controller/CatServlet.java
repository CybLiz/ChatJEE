package org.example.chat.Controller;

import org.example.chat.Entity.Cat;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@WebServlet("/cats")
public class CatServlet extends HttpServlet {
    public List<Cat> cats;

    @Override
    public void init() throws ServletException {
        cats = new ArrayList<>();
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("cats", cats);
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

        cats.add(new Cat(name, breed, favoriteMeal, birthDate));
        req.setAttribute("cats", cats);
        resp.sendRedirect(req.getContextPath() + "/cats");
    }
}
