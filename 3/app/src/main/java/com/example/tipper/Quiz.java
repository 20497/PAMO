package com.example.tipper;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Quiz {
    private List<Question> questions;
    private int currentQuestionIndex;
    private int correctAnswers;

    public Quiz() {
        questions = new ArrayList<>();
        currentQuestionIndex = 0;
        correctAnswers = 0;
        // Dodaj pytania do listy
        addQuestions();
    }

    private void addQuestions() {
        // Dodaj pytania do listy
        questions.add(new Question("W którym roku wyszedł wiedźmin 1?", "2011", "2007", "2008", "2010", 2));
        questions.add(new Question("Ile jest ras w grze Warcraft 3 w trybie multiplayer?", "1", "2", "3", "4", 4));
        questions.add(new Question("Na jakie dwie frakcje dzielimy się w grze world of warcraft?", "Orkowie i ludzie", "Elfy i ludzie", "Horda i przymierze", "Orkowie i przymierze", 3));
        questions.add(new Question("W jakim mieście dzieje się fabuła gry Vampyr?", "Londyn", "Gdańsk", "Berlin", "Ząbkowice Śląskie", 1));
        questions.add(new Question("Jak nazywał się wyspiarski kontynent w grze Wiedźmin 3?", "Kłomnica", "Skellige", "Velen", "Oxenfurt", 2));
        questions.add(new Question("Jak nazywana jest rasa ludzi w grze Starcraft 2?", "Zergowie", "Protossi", "Troglodyci", "Terranie", 4));
    }

    public Question getCurrentQuestion() {
        return questions.get(currentQuestionIndex);
    }

    public void answerQuestion(int selectedOption) {
        if (selectedOption == getCurrentQuestion().getCorrectOption()) {
            correctAnswers++;
        }
        currentQuestionIndex++;
    }

    public boolean isQuizFinished() {
        return currentQuestionIndex == questions.size();
    }

    public int getCorrectAnswers() {
        return correctAnswers;
    }

    public int getTotalQuestions() {
        return questions.size();
    }

    public double getQuizPercentage() {
        return (double) correctAnswers / questions.size() * 100;
    }}
