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
            Githuber stephen =new Githuber( "Stephen", "stephendupre64@gmail.com","Assets/img/IMG_0093.JPG","D�veloppeur fou, qui pense en java. Un passionn� qui a d�cid� de faire de sa passion sa r�alit�. Vous avez une id�e, un projet ou envie de discuter, contactez moi je suis ouvert et � l'�coute ;) !!");
            Githuber walter =new Githuber( "Walter White","walter@gmail.com","Assets/img/walt.png", "Heisenberg. Bien s�r on aurait pu le placer en premi�re position, mais il est un tel m�lange de tra�trise, de l�chet�, et de grosenfoir�debatarderie qu?on finit surtout par d�tester ce FDP de premi�re cat�gorie. Chaque saison est pour lui l?occasion d?illustrer un peu mieux l?aspect vile de sa personnalit�, pour aboutir � un grand final ignoble (� J?ai regard� Jane mourir. Je l?ai regard� faire son overdose et �touffer. J?aurais pu la sauver mais je n?ai rien fait � POPOPOOOOO DROP THE MIC). Il a beau avoir un sursaut de conscience sur le dernier �pisode pour sauver Jesse, mais bon le gars a �t� tortur�, et on a but� sa meuf donc techniquement il est pas non plus ultra chaud pour dire � Merci tonton Walter �.");
            Githuber jesse = new Githuber( "Jesse Pinkman", "pinkman@gmail.com",  "Assets/img/jp.jpeg", "Imagine un peu : tu te drogues parce que tes parents en ont rien � foutre de ta gueule, ton prof de chimie vient te voir pour te proposer de fabriquer de la drogue avec lui, tu te retrouves avec deux gars morts chez toi, ta baignoire du 1er traverse ton plafond, tes parents te foutent � la rue, ta meuf meurt d?une overdose � c�t� de toi, tu butes quelqu?un d?innocent d?une balle dans la t�te, on �gorge quelqu?un devant toi, le fils de ta nouvelle meuf est empoisonn�, tu d�cides de te retirer du business et on te file pas ta tune, tu d�couvres que ton partenaire est la principale cause de toutes tes merdes, il te vend � des nazis, tu es tortur�, tu tentes de t?�chapper et pour te punir on bute ta meuf d?une balle dans la t�te. Non franchement, on peut comprendre que le gars fasse un l�ger burn-out.");
            Githuber skyler = new Githuber( "Skyler White", "skyler@gmail.com",  "Assets/img/sw.jpg", "Bizarrement c?est un des personnages les plus d�test�s par les fans de la s�rie. On sait pas trop pourquoi parce que finalement Skyler est plut�t excellente. D?abord en rupture avec Walter quand elle d�couvre son biz, elle finit par se faire sa complice jusqu?� s?opposer � Hank et sa propre s?ur quand ces derniers ont la preuve que Walter est Heinsenberg. Question stress, elle g�re pas mal. La vraie question c?est de savoir ce que nous aurions fait � sa place � part d�velopper une addiction au pinard ?");
            Githuber git = new Githuber( "Git Facker", "gitfacker@gmail.com",  "Assets/img/f.jpg", "OK le gars a pas du trop gal�rer � apprendre son code �tant donn� qu\n?il ne l�che pas une variable de toute la formation. Mais peu importe, sa ma�trise faciale de l?expression de la haine est sans �gal, tout est objets et m�thodes.");

githubers = Arrays.asList(stephen, walter, jesse, skyler,git);
    return githubers;
}

    public void saveGithuber(Githuber githuber) throws UnsupportedOperationException {
        githubers.add(githuber);
    }

}
