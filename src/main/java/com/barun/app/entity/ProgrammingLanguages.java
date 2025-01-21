package com.barun.app.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "programmingLanguage")
public class ProgrammingLanguages {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "programming_language")
    private String programmingLanguage;
    @Column(name = "language_creator")
    private String creatorOfLanguage;
    @Column(name = "invented_in")
    private String inventedIn;
    @Column(name = "language_details")
    private String languageDetailsAndUserFor;


    public ProgrammingLanguages() {}

    public ProgrammingLanguages(Long id,
                                String programmingLanguage,
                                String creatorOfLanguage,
                                String inventedIn,
                                String languageDetailsAndUserFor) {
        this.id = id;
        this.programmingLanguage = programmingLanguage;
        this.creatorOfLanguage = creatorOfLanguage;
        this.inventedIn = inventedIn;
        this.languageDetailsAndUserFor = languageDetailsAndUserFor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public String getCreatorOfLanguage() {
        return creatorOfLanguage;
    }

    public void setCreatorOfLanguage(String creatorOfLanguage) {
        this.creatorOfLanguage = creatorOfLanguage;
    }

    public String getInventedIn() {
        return inventedIn;
    }

    public void setInventedIn(String inventedIn) {
        this.inventedIn = inventedIn;
    }

    public String getLanguageDetailsAndUserFor() {
        return languageDetailsAndUserFor;
    }

    public void setLanguageDetailsAndUserFor(String languageDetailsAndUserFor) {
        this.languageDetailsAndUserFor = languageDetailsAndUserFor;
    }
}

