package io.github.dejw.Notatnik.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "notes")// notes - nazwa tabeli
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank(message = "Title must not be empty")
    private String title;
    private String text;

    Note() {
    }

    public int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    void setText(String text) {
        this.text = text;
    }
}
