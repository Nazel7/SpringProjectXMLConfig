package com.learnspring.springproject.coach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpringCoach {
    public static void main(String[] args) {
//        Create a spring container (Application context)
        ClassPathXmlApplicationContext context= new
                ClassPathXmlApplicationContext("applicationContext.xml");

//        Retrieve spring bean (java Object) from the container
        Coach coach= context.getBean("myBaseBallCoach", Coach.class);
         CricketCoach cricketCoach= context.getBean("myCricketCoach", CricketCoach.class);
//        Call function on the spring bean
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());
        System.out.println(cricketCoach.getDailyFortune());
        System.out.println(cricketCoach.getEmail());
        System.out.println(cricketCoach.getTeamName());

//        Close the Spring context
        context.close();
    }
}
