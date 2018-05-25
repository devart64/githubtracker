package fr.wildcodeschool.githubtracker.model;

import fr.wildcodeschool.githubtracker.dao.GithuberDAO;
import fr.wildcodeschool.githubtracker.dao.InMemory;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@Dependent
public class GithubersService {

    private GithuberDAO githuberDAO;

    @Inject
    public GithubersService(@InMemory GithuberDAO githuberDAO) {
        this.githuberDAO = githuberDAO;
    }

 public List<Githuber> getAllGithubers(){
     return  githuberDAO.getGithubers();
 }


 public Githuber getGithuber(String login) {
     Githuber wantedGithuber = getAllGithubers()
             .stream()
             .filter(githuber -> login.equals(githuber.getName()))
             .collect(Collectors.toList())
             .get(0);

     return wantedGithuber == null ? null : wantedGithuber;
 }

 public void track(String login) {
     //TODO
 }


}
