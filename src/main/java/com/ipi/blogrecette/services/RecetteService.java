package com.ipi.blogrecette.services;

import com.ipi.blogrecette.pojos.Ingredient;
import com.ipi.blogrecette.pojos.Membre;
import com.ipi.blogrecette.pojos.Recette;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class RecetteService {
    Hashtable<Integer, Recette> recettesDict = new Hashtable<Integer, Recette>();

    Hashtable<Integer, Membre> membresDict = new Hashtable<Integer, Membre>();

    public RecetteService() {
        // Création du membre qui a créer les recettes
        Membre membre = new Membre("Chevalier", "nicolas", "nicolas.chevalier@epsi.fr", "12345", new Date("2019/11/13"));
        membre.setId(1);

        // ajoute le membre au dictionnaire
        membresDict.put(1, membre);

        // Création de la recette tartiflette
        Recette tartiflette = new Recette(membre,
                "Tartiflette",
                "La tartiflette savoyarde est un gratin de pommes de terre avec du Reblochon fondu dessus",
                "tartiflette.jpg",
                new Date("2022/11/13"));
        tartiflette.setId(1);

        // Ajoute les ingrédients à la recette
        tartiflette.setIngredients(new ArrayList<Ingredient>() {
            {
                Ingredient ingredient = new Ingredient(tartiflette.getId(), "Pommes de  terre", 750, "g");
                ingredient.setId(1);
                add(ingredient);
                ingredient = new Ingredient(tartiflette.getId(), "Reblochon", 1, "u");
                add(ingredient);
                ingredient.setId(2);
                ingredient = new Ingredient(tartiflette.getId(), "Lardons", 200, "g");
                add(ingredient);
                ingredient.setId(3);
                ingredient = new Ingredient(tartiflette.getId(), "Crème fraîche épaisse", 3, "cs");
                add(ingredient);
                ingredient.setId(4);
                ingredient = new Ingredient(tartiflette.getId(), "Oignons", 2, "u");
                add(ingredient);
                ingredient.setId(5);
                ingredient = new Ingredient(tartiflette.getId(), "Beurre", 20, "g");
                add(ingredient);
                ingredient.setId(6);
                ingredient = new Ingredient(tartiflette.getId(), "Sel", 1, "cc");
                add(ingredient);
                ingredient.setId(7);
                ingredient = new Ingredient(tartiflette.getId(), "Poivre", 1, "p");
                add(ingredient);
                ingredient.setId(8);
            }
        });

        // Ajoute la recette au dictionnaire
        recettesDict.put(1, tartiflette);

        // Création de la recette velouter de carotte
        Recette velouterCarotte = new Recette(membre,
                "Velouté de carottes au cumin",
                "Un velouté de carotte au cumin",
                "veloute-de-carotte-au-cumin.jpg",
                new Date("2022/11/13"));
        velouterCarotte.setId(2);

        // Ajoute les ingrédients à la recette
        velouterCarotte.setIngredients(new ArrayList<Ingredient>() {
            {
                Ingredient ingredient = new Ingredient(velouterCarotte.getId(), "Carottes", 800, "g");
                add(ingredient);
                ingredient.setId(9);
                ingredient = new Ingredient(velouterCarotte.getId(), "Oignon", 1, "u");
                add(ingredient);
                ingredient.setId(10);
                ingredient = new Ingredient(velouterCarotte.getId(), "Bouillon de volaille", 1, "l");
                add(ingredient);
                ingredient.setId(11);
                ingredient = new Ingredient(velouterCarotte.getId(), "Cumin", 1, "cs");
                add(ingredient);
                ingredient.setId(12);
                ingredient = new Ingredient(velouterCarotte.getId(), "Crème fraîche épaisse", 2, "cs");
                add(ingredient);
                ingredient.setId(13);
                ingredient = new Ingredient(velouterCarotte.getId(), "Huile d’olive", 2, "cs");
                add(ingredient);
                ingredient.setId(14);
                ingredient = new Ingredient(velouterCarotte.getId(), "Sel", 1, "cc");
                add(ingredient);
                ingredient.setId(15);
                ingredient = new Ingredient(velouterCarotte.getId(), "Poivre", 1, "p");
                add(ingredient);
                ingredient.setId(16);
            }
        });

        // Ajoute la recette au dictionnaire
        recettesDict.put(2, velouterCarotte);
    }

    // Récupère la liste des recettes
    public List<Recette> getRecettes() {

        List<Recette> recettes = new ArrayList<Recette>();

        for(Map.Entry<Integer, Recette> pair : recettesDict.entrySet()) {
            recettes.add(pair.getValue());
        }

        return recettes;
    }

    // Récupère une recette à partir de son id
    public Recette getRecetteFromId(int id) {

        return recettesDict.get(id);

    }

    // Récupère un membre à partir de son id
    public Membre getMembreFromId(int id) {

        return membresDict.get(id);
    }

    public Membre ajoutMembre(Membre membre) {

        // génère l'id du membre
        membre.setId(membresDict.size() + 1);

        // ajoute le membre dans le dictionnaire
        membresDict.put(membre.getId(), membre);

        return membre;
    }
}
