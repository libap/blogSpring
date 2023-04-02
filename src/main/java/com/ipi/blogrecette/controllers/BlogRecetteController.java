package com.ipi.blogrecette.controllers;

import com.ipi.blogrecette.pojos.Membre;
import com.ipi.blogrecette.pojos.Recette;
import com.ipi.blogrecette.services.RecetteService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Date;
import java.util.List;

@Controller
public class BlogRecetteController {
    @Autowired
    private HttpSession session;

    @Autowired
    private RecetteService recetteService;

    // page d'acceuil
    @GetMapping(path = {"/", "/index"})
    public String index(Model model) {

        // récupère la liste des articles
        List<Recette> recettes = recetteService.getRecettes();

        System.out.println(recettes);

        // met la liste d'articles  dans le model
        model.addAttribute("recettes", recettes);

        return "index";
    }

    @GetMapping("recette/{id}")
    public String article(Model model, @PathVariable int id) {

        Recette recette = recetteService.getRecetteFromId(id);

        model.addAttribute("recette", recette);

        return "recette";
    }

    @GetMapping("inscription")
    public String inscription(@ModelAttribute Membre membre) {

        return "inscription";
    }

    @PostMapping("inscription")
    public String inscription(@Validated @ModelAttribute Membre membre, BindingResult bindingResult) {

        // test si il y a des erreurs dans les données du formulaire
        if (bindingResult.hasErrors()) {
            // réaffiche le formulaire
            return "inscription";
        }

        // renseigne la date d'inscription
        membre.setDateInscription(new Date());

        // ajoute dans la session le user
        session.setAttribute("membre", membre);

        // redirige sur la page /index
        return "redirect:/";
    }
}
