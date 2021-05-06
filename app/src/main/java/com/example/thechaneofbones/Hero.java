package com.example.thechaneofbones;

import java.util.ArrayList;

public class Hero {
    int maxStrength;
    int realStrength;
    int maxDexterity;
    int realDexterity;
    int maxIntelligence;
    int realIntelligence;
    int startMoney;
    int realMoney;
    ArrayList<String> heroBag;

    Hero(int maxStrength, int maxDexterity, int maxIntelligence, int startMoney, ArrayList<String> heroBag) {
        this.maxStrength = maxStrength;
        this.realStrength = maxStrength;
        this.maxDexterity = maxDexterity;
        this.realDexterity = maxDexterity;
        this.maxIntelligence = maxIntelligence;
        this.realIntelligence = maxIntelligence;
        this.startMoney = startMoney;
        this.realMoney = startMoney;
        this.heroBag = heroBag;
    }
}
