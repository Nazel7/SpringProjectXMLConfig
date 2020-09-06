package com.learnspring.springproject.coach;

public class CricketCoach implements Coach {
    private FortuneService fortuneService;
    private String email;
    private String teamName;

    public CricketCoach() {
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @Override
    public String getDailyWorkout() {
        return "30 mins hard plank";
    }

    @Override
    public String getDailyFortune() {
        return "Take a move, "+ fortuneService.getFortune();
    }
}
