package fr.wildcodeschool.githubtracker.model;

public class Githuber {

    private String name;
    private String email;
    private String description;
    private String avatarUrl;

  public Githuber() {
  }
    public Githuber( String name, String email, String avatarUrl, String description) {
        this.name = name;
        this.email = email;
        this.description = description;
        this.avatarUrl = avatarUrl;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }


}
