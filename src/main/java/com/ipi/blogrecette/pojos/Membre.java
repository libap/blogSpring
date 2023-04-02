package com.ipi.blogrecette.pojos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.Date;

public class Membre {

    private int id;

    @NotBlank(message = "Le non n'est pas renseigné")
    private String nom;

    @NotBlank(message = "Le pseudo n'est pas renseigné")
    private String pseudo;

    @NotBlank(message = "Le mail n'est pas renseigné")
    @Email(message = "Le mail n'est pas correct")
    private String email;

    @NotBlank(message = "Le password n'est pas renseigné")
    @Size(min = 6, message = "Le password doit avoir au moins 6 caractères")
    private String password;

    private Date dateInscription;

    public Membre() {
    }

    public Membre(String nom, String pseudo, String email, String password, Date dateInscription) {
        this.nom = nom;
        this.pseudo = pseudo;
        this.email = email;
        this.password = password;
        this.dateInscription = dateInscription;
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

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDateInscription() {
        return dateInscription;
    }

    public void setDateInscription(Date dateInscription) {
        this.dateInscription = dateInscription;
    }

    @Override
    public String toString() {
        return "Membre{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", pseudo='" + pseudo + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", dateInscription=" + dateInscription +
                '}';
    }

}
