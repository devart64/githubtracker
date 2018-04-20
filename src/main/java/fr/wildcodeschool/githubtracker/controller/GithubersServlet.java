package fr.wildcodeschool.githubtracker.controller;

import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/GithubersServlet")
public class GithubersServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Githuber> githubersList = new ArrayList<>();
        Githuber stephen = new Githuber(1, "Stephen", "stephendupre64@gmail.com","devart","Assets/img/IMG_0093.JPG");
        githubersList.add(stephen);
        Githuber walter = new Githuber(2, "Walter White","walter@gmail.com","WW","Assets/img/team-leader-pic1.jpg");
        githubersList.add(walter);
        Githuber pinkman = new Githuber(3, "Jesse Pinkman", "pinkman@gmail.com", "JP", "Assets/img/team-leader-pic2.jpg");
        githubersList.add(pinkman);
        Githuber skyler = new Githuber(4, "Skyler White", "skyler@gmail.com", "SW", "Assets/img/team-leader-pic3.jpg");
        githubersList.add(skyler);
        Githuber gitFacker = new Githuber(5, "Git Facker", "gitfacker@gmail.com", "gf", "Assets/img/p.jpg");
        githubersList.add(gitFacker);

        request.setAttribute("gitHuberList", githubersList);
        getServletContext().getRequestDispatcher("/githubers.jsp").forward(request, response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }


}
