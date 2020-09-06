package com.learnspring.springproject.coach;

public class BaseBallCoach implements Coach {
    private final FortuneService fortuneService;

    public BaseBallCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 mins on batting practise.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
