package fr.wildcodeschool.githubtracker.controller;

import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

@WebServlet("/githubers")
public class GithubersServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/githubers.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List l = new LinkedList();
        Githuber stephen = new Githuber(1, "Stephen", "stephendupre64@gmail.com","devart","https://github.com/devart64/githubtracker/blob/development/web/Assets/img/IMG_0093.JPG");
        l.add(stephen);
        Githuber walter = new Githuber(2, "Walter White","walter@gmail.com","WW","https://github.com/devart64/githubtracker/blob/development/web/Assets/img/team-leader-pic1.jpg");
        l.add(walter);
        Githuber pinkman = new Githuber(3, "Jesse Pinkman", "pinkman@gmail.com", "JP", "https://github.com/devart64/githubtracker/blob/development/web/Assets/img/team-leader-pic2.jpg");
        l.add(pinkman);
        Githuber skyler = new Githuber(4, "Skyler White", "skyler@gmail.com", "SW", "https://github.com/devart64/githubtracker/blob/development/web/Assets/img/team-leader-pic3.jpg");
        l.add(skyler);
        Githuber gitFacker = new Githuber(5, "Git Facker", "gitfacker@gmail.com", "gf", "https://github.com/devart64/githubtracker/blob/development/web/Assets/img/p.jpg");
        l.add(gitFacker);
    }


}
