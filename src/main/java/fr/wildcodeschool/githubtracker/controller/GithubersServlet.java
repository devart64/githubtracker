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
        Githuber stephen = new Githuber(1, "Stephen", "stephendupre64@gmail.com","devart","Assets/img/IMG_0093.JPG","D�veloppeur fou, qui pense en java. Un passionn� qui a d�cid� de faire de sa passion sa r�alit�. Vous avez une id�e, un projet ou envie de discuter, contactez moi je suis ouvert et � l'�coute ;) !!");
        githubersList.add(stephen);
        Githuber walter = new Githuber(2, "Walter White","walter@gmail.com","WW","Assets/img/walt.png", "Heisenberg. Bien s�r on aurait pu le placer en premi�re position, mais il est un tel m�lange de tra�trise, de l�chet�, et de grosenfoir�debatarderie qu?on finit surtout par d�tester ce FDP de premi�re cat�gorie. Chaque saison est pour lui l?occasion d?illustrer un peu mieux l?aspect vile de sa personnalit�, pour aboutir � un grand final ignoble (� J?ai regard� Jane mourir. Je l?ai regard� faire son overdose et �touffer. J?aurais pu la sauver mais je n?ai rien fait � POPOPOOOOO DROP THE MIC). Il a beau avoir un sursaut de conscience sur le dernier �pisode pour sauver Jesse, mais bon le gars a �t� tortur�, et on a but� sa meuf donc techniquement il est pas non plus ultra chaud pour dire � Merci tonton Walter �.");
        githubersList.add(walter);
        Githuber pinkman = new Githuber(3, "Jesse Pinkman", "pinkman@gmail.com", "JP", "Assets/img/jp.jpeg", "Imagine un peu : tu te drogues parce que tes parents en ont rien � foutre de ta gueule, ton prof de chimie vient te voir pour te proposer de fabriquer de la drogue avec lui, tu te retrouves avec deux gars morts chez toi, ta baignoire du 1er traverse ton plafond, tes parents te foutent � la rue, ta meuf meurt d?une overdose � c�t� de toi, tu butes quelqu?un d?innocent d?une balle dans la t�te, on �gorge quelqu?un devant toi, le fils de ta nouvelle meuf est empoisonn�, tu d�cides de te retirer du business et on te file pas ta tune, tu d�couvres que ton partenaire est la principale cause de toutes tes merdes, il te vend � des nazis, tu es tortur�, tu tentes de t?�chapper et pour te punir on bute ta meuf d?une balle dans la t�te. Non franchement, on peut comprendre que le gars fasse un l�ger burn-out.");
        githubersList.add(pinkman);
        Githuber skyler = new Githuber(4, "Skyler White", "skyler@gmail.com", "SW", "Assets/img/sw.jpg", "Bizarrement c?est un des personnages les plus d�test�s par les fans de la s�rie. On sait pas trop pourquoi parce que finalement Skyler est plut�t excellente. D?abord en rupture avec Walter quand elle d�couvre son biz, elle finit par se faire sa complice jusqu?� s?opposer � Hank et sa propre s?ur quand ces derniers ont la preuve que Walter est Heinsenberg. Question stress, elle g�re pas mal. La vraie question c?est de savoir ce que nous aurions fait � sa place � part d�velopper une addiction au pinard ?");
        githubersList.add(skyler);
        Githuber gitFacker = new Githuber(5, "Git Facker", "gitfacker@gmail.com", "gf", "Assets/img/f.jpg", "OK le gars a pas du trop gal�rer � apprendre son code �tant donn� qu\n?il ne l�che pas une variable de toute la formation. Mais peu importe, sa ma�trise faciale de l?expression de la haine est sans �gal, tout est objets et m�thodes.");
        githubersList.add(gitFacker);

        request.setAttribute("gitHuberList", githubersList);
        getServletContext().getRequestDispatcher("/githubers.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       // String name = request.getParameter("name");


    }


}
