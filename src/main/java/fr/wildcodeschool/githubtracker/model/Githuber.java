package fr.wildcodeschool.githubtracker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Githuber {

    private int id;
    private int github_id;
    private String login;
    private String name;
    private String email;
    private String url;
    private String location;
    private String bio;
    private String avatar_url;

}
