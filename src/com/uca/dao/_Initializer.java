package com.uca.dao;

import java.sql.*;

public class _Initializer {

    public static void Init(){
        Connection connection = _Connector.getInstance();

        try {
            PreparedStatement statement;


            //Init articles table

            statement = connection.prepareStatement("DROP TABLE IF EXISTS users CASCADE;");
            statement.executeUpdate();


            statement = connection.prepareStatement("CREATE TABLE IF NOT EXISTS users (id int primary key auto_increment, nom varchar(255), prenom varchar(255), email varchar(255), pwd varchar(255)); ");
            statement.executeUpdate();

            statement = connection.prepareStatement("CREATE TABLE IF NOT EXISTS pokedex (idAPI int primary key, nom varchar(255)); ");
            statement.executeUpdate();

            statement = connection.prepareStatement("CREATE TABLE IF NOT EXISTS pokemons (id_pokemon int primary key, idAPI int, niveau int, surnom varchar(255), foreign key (idAPI) REFERENCES pokedex(idAPI)); ");
            statement.executeUpdate();

            statement = connection.prepareStatement("CREATE TABLE IF NOT EXISTS users_pokemon (id_pokemon_utilisateur int primary key, id_utilisateur int, id_pokemon int, foreign key (id_utilisateur) REFERENCES users(id), foreign key (id_pokemon) REFERENCES pokemons(id_pokemon));");
            statement.executeUpdate();






            //Todo Remove me !
            statement = connection.prepareStatement("INSERT INTO users(nom, prenom, email, pwd) VALUES(?, ?, ?, ?);");
            statement.setString(1, "NomUserA");
            statement.setString(2, "PrenomUserA");
            statement.setString(3,"UserA@gmail.com");
            statement.setString(4,"TestPasswordUserA");
            statement.executeUpdate();

            statement = connection.prepareStatement("INSERT INTO users(nom, prenom, email, pwd) VALUES(?, ?, ?, ?);");
            statement.setString(1, "NomUserB");
            statement.setString(2, "PrenomUserB");
            statement.setString(3,"UserB@gmail.com");
            statement.setString(4,"TestPasswordUserB");
            statement.executeUpdate();




        } catch (Exception e){
            System.out.println(e.toString());
            throw new RuntimeException("could not create database !");
        }
    }
}
