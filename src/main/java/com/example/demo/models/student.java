package com.example.demo.models;

import jakarta.persistence.*;

@Entity
public class student {
    @Id
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "nbAbs", nullable = true)
    private int nbAbs = 0;

    @Column(name = "note", nullable = false)
    private int note = 0;


    // Ajoutez les constructeurs, les getters et les setters selon vos besoins

    // Exemple de constructeur par défaut
    public student() {
        // Constructeur par défaut nécessaire pour JPA
    }

    // Exemple de constructeur avec tous les champs
    public student(Long id, String name, int nbAbs, int note) {
        this.id = id;
        this.name = name;
        this.nbAbs = nbAbs;
        this.note = note;
    }

    // Ajoutez les getters et setters pour tous les champs

    // Exemple de getter pour l'id
    public Long getId() {
        return id;
    }

    // Exemple de setter pour l'id
    public void setId(Long id) {
        this.id = id;
    }

    // Ajoutez les getters et setters pour les autres champs

    // Exemple de getter pour le nom
    public String getName() {
        return name;
    }

    // Exemple de setter pour le nom
    public void setName(String name) {
        this.name = name;
    }

    // Ajoutez les getters et setters pour les autres champs

    // Exemple de getter pour le nombre d'absences
    public int getNbAbs() {
        return nbAbs;
    }

    // Exemple de setter pour le nombre d'absences
    public void setNbAbs(int nbAbs) {
        this.nbAbs = nbAbs;
    }

    // Ajoutez les getters et setters pour les autres champs

    // Exemple de getter pour la note
    public int getNote() {
        return note;
    }

    // Exemple de setter pour la note
    public void setNote(int note) {
        this.note = note;
    }

}
