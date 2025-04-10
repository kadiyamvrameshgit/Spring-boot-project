package com.connectors.main_application;

import com.connectors.main_application.javaprograms.QuestionsService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {//SpringApplication.run(MainApplication.class, args);

		QuestionsService service = new QuestionsService();
		//Question obj1 = new Question();

		service.playQuiz();


	}

}
