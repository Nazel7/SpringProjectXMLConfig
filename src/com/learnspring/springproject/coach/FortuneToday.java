package com.learnspring.springproject.coach;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FortuneToday implements FortuneService {
    List<String> fortunes= new ArrayList<>();
    private Random randomSevicce;

    @Override
    public String getFortune() {
        randomSevicce = new Random();
        fortunes.add("It is great win today, rejoice!!!");
        fortunes.add("It is win loose today, never loose focus");
        fortunes.add("Hurray! victory at last, it is win today");
        fortunes.add("Win hard, it is a great day for the team");
        fortunes.add("What a lost course today!");
        int index= randomSevicce.nextInt(fortunes.size());
        return fortunes.get(index);
    }
}
