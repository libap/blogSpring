package com.ipi.blogrecette.pojos;

public class Ingredient {
    private int id;
    private int idRecette;
    private String nom;
    private int quantite;
    private String unit;

    public Ingredient(int idRecette, String nom, int quantite, String unit) {
        this.idRecette = idRecette;
        this.nom = nom;
        this.quantite = quantite;
        this.unit = unit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdRecette() {
        return idRecette;
    }

    public void setIdRecette(int idRecette) {
        this.idRecette = idRecette;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "id=" + id +
                ", idRecette=" + idRecette +
                ", nom='" + nom + '\'' +
                ", quantite=" + quantite +
                ", unit='" + unit + '\'' +
                '}';
    }
}
