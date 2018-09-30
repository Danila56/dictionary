package com.model;

import javax.persistence.*;

@Entity
@Table(name = "words", schema = "dictionary", catalog = "")
public class WordsEntity {
    private int id;
    private String word;
    private String translation;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "word", nullable = false, length = 20)
    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Basic
    @Column(name = "translation", nullable = false, length = 45)
    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WordsEntity that = (WordsEntity) o;

        if (id != that.id) return false;
        if (word != null ? !word.equals(that.word) : that.word != null) return false;
        if (translation != null ? !translation.equals(that.translation) : that.translation != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (word != null ? word.hashCode() : 0);
        result = 31 * result + (translation != null ? translation.hashCode() : 0);
        return result;
    }
}
