package com.uca.entity;

public class UserEntity {
    private String nom;
    private String prenom;
    private int id;
    private String email;
    private String mdp;

    public UserEntity() {
        //Ignored !
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getMotDePasse() { return mdp; }

    public void setMotDePasse(String mdp) { this.mdp = mdp; }

}


