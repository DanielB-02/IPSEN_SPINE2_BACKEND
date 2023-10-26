package com.ipsen.spine.model;

import jakarta.persistence.*;

@Entity
@Table(name = "answer")

public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String textAnswer;
    @ManyToOne
    private Question question;



    public Long getId() {
        return id;
    }

    public String getTextAnswer() {
        return textAnswer;
    }

    public void setTextAnswer(String textAnswer) {
        this.textAnswer = textAnswer;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
//    public Question getQuestion() {
//        return question;
//    }

//    public void setQuestion(Question question) {
//        this.question = question;
//    }



}
