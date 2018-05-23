package fr.wildcodeschool.githubtracker.dao;

import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import java.util.*;

@ApplicationScoped @InMemory
public class MemoryGithuberDAO implements GithuberDAO{


    private Map<String, Githuber> githuberMap = new HashMap<>();
    List<String> initialPopulation;


    @Inject
    GithubUtils githubUtils;
    @Override
    public List<Githuber> getGithubers() {
        List<Githuber> githubers = new ArrayList<>();
        for (Map.Entry<String, Githuber> entry : githuberMap.entrySet()) {
            githubers.add(entry.getValue());
        }
        return githubers;
    }

    @Override
    public void saveGithuber(Githuber githuber) {
        if (githuber != null) {
            githuberMap.put(githuber.getName(), githuber);
        }
    }

    @PostConstruct
    private void init() {
        initialPopulation = Arrays.asList("devart64", "walter", "jesse", "skyler","git");
        for (String login: initialPopulation) {
            saveGithuber( githubUtils.parseGithuber(login));
        }
    }




}
