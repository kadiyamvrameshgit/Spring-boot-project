package com.connectors.main_application.javaprograms;

import com.connectors.main_application.Question;

public class QuestionsService {

    Question[] questions = new Question[5];
    public QuestionsService()
    {
        questions[0] = new Question(1, "what is the best programing language", "Java", "Cpp","Python","c++");
        questions[1] = new Question(2, "what is the best programing language", "Java", "Cpp","Python","c++");
        questions[2] = new Question(3, "what is the best programing language", "Java", "Cpp","Python","c++");
        questions[3] = new Question(4, "what is the best programing language", "Java", "Cpp","Python","c++");
        questions[4] = new Question(5, "what is the best programing language", "Java", "Cpp","Python","c++");
    }

    public void playQuiz()
    {
        for (Question q : questions) {

            System.out.println(q.getQuestion());

        }
    }








}
