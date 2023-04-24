package com.uca.entity;
public class Pokemon {
    private int id_pokemon;
    private int idAPI;
    private int niveau;
    private String surnom;

    // Constructor
    public Pokemon(int id_pokemon, int idAPI, int niveau, String surnom) {
        this.id_pokemon = id_pokemon;
        this.idAPI = idAPI;
        this.niveau = niveau;
        this.surnom = surnom;
    }

    // Getters and setters
    public int getId_pokemon() {
        return id_pokemon;
    }

    public void setId_pokemon(int id_pokemon) {
        this.id_pokemon = id_pokemon;
    }

    public int getIdAPI() {
        return idAPI;
    }

    public void setIdAPI(int idAPI) {
        this.idAPI = idAPI;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public String getSurnom() {
        return surnom;
    }

    public void setSurnom(String surnom) {
        this.surnom = surnom;
    }
}

