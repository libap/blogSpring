package com.ipi.blogrecette.pojos;

import jakarta.validation.constraints.NotBlank;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Recette {
    private int id;

    private Membre membre;

    private String titre;

    private String description;

    private String photo;

    private Date dateCreation;

    private List<Ingredient> ingredients = new ArrayList<Ingredient>();

    public Recette(Membre membre, String titre, String description, String photo, Date dateCreation) {
        this.membre = membre;
        this.titre = titre;
        this.description = description;
        this.photo = photo;
        this.dateCreation = dateCreation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Membre getMembre() {
        return membre;
    }

    public void setMembre(Membre membre) {
        this.membre = membre;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Recette{" +
                "id=" + id +
                ", membre=" + membre +
                ", titre='" + titre + '\'' +
                ", description='" + description + '\'' +
                ", photo='" + photo + '\'' +
                ", dateCreation=" + dateCreation +
                ", ingredients=" + ingredients +
                '}';
    }
}
