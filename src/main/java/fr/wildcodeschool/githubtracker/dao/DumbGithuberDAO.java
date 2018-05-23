package fr.wildcodeschool.githubtracker.dao;

import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Alternative;
import java.util.Arrays;
import java.util.List;

@Dependent
public class DumbGithuberDAO implements GithuberDAO{

    private List<Githuber> githubers;

   public List<Githuber> getGithubers() {
            Githuber stephen =new Githuber( "Stephen", "stephendupre64@gmail.com","Assets/img/IMG_0093.JPG","Développeur fou, qui pense en java. Un passionné qui a décidé de faire de sa passion sa réalité. Vous avez une idée, un projet ou envie de discuter, contactez moi je suis ouvert et à l'écoute ;) !!");
            Githuber walter =new Githuber( "Walter White","walter@gmail.com","Assets/img/walt.png", "Heisenberg. Bien sûr on aurait pu le placer en première position, mais il est un tel mélange de traîtrise, de lâcheté, et de grosenfoirédebatarderie qu?on finit surtout par détester ce FDP de première catégorie. Chaque saison est pour lui l?occasion d?illustrer un peu mieux l?aspect vile de sa personnalité, pour aboutir à un grand final ignoble (« J?ai regardé Jane mourir. Je l?ai regardé faire son overdose et étouffer. J?aurais pu la sauver mais je n?ai rien fait » POPOPOOOOO DROP THE MIC). Il a beau avoir un sursaut de conscience sur le dernier épisode pour sauver Jesse, mais bon le gars a été torturé, et on a buté sa meuf donc techniquement il est pas non plus ultra chaud pour dire « Merci tonton Walter ».");
            Githuber jesse = new Githuber( "Jesse Pinkman", "pinkman@gmail.com",  "Assets/img/jp.jpeg", "Imagine un peu : tu te drogues parce que tes parents en ont rien à foutre de ta gueule, ton prof de chimie vient te voir pour te proposer de fabriquer de la drogue avec lui, tu te retrouves avec deux gars morts chez toi, ta baignoire du 1er traverse ton plafond, tes parents te foutent à la rue, ta meuf meurt d?une overdose à côté de toi, tu butes quelqu?un d?innocent d?une balle dans la tête, on égorge quelqu?un devant toi, le fils de ta nouvelle meuf est empoisonné, tu décides de te retirer du business et on te file pas ta tune, tu découvres que ton partenaire est la principale cause de toutes tes merdes, il te vend à des nazis, tu es torturé, tu tentes de t?échapper et pour te punir on bute ta meuf d?une balle dans la tête. Non franchement, on peut comprendre que le gars fasse un léger burn-out.");
            Githuber skyler = new Githuber( "Skyler White", "skyler@gmail.com",  "Assets/img/sw.jpg", "Bizarrement c?est un des personnages les plus détestés par les fans de la série. On sait pas trop pourquoi parce que finalement Skyler est plutôt excellente. D?abord en rupture avec Walter quand elle découvre son biz, elle finit par se faire sa complice jusqu?à s?opposer à Hank et sa propre s?ur quand ces derniers ont la preuve que Walter est Heinsenberg. Question stress, elle gère pas mal. La vraie question c?est de savoir ce que nous aurions fait à sa place à part développer une addiction au pinard ?");
            Githuber git = new Githuber( "Git Facker", "gitfacker@gmail.com",  "Assets/img/f.jpg", "OK le gars a pas du trop galérer à apprendre son code étant donné qu\n?il ne lâche pas une variable de toute la formation. Mais peu importe, sa maîtrise faciale de l?expression de la haine est sans égal, tout est objets et méthodes.");

githubers = Arrays.asList(stephen, walter, jesse, skyler,git);
    return githubers;
}

    public void saveGithuber(Githuber githuber) throws UnsupportedOperationException {
        githubers.add(githuber);
    }

}
