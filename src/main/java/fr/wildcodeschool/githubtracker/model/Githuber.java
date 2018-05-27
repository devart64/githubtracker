package fr.wildcodeschool.githubtracker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Githuber {

    int id;
    private String login;
    private String name;
    private String email;
    private String bio;
    private String avatar_url;
}
