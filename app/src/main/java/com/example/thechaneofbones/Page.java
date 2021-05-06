package com.example.thechaneofbones;

public class Page {
    String titleText;
    int mainText;
    int buttonOneAction;
    int buttonTwoAction;
    int buttonThreeAction;
    int buttonFourAction;
    int buttonFiveAction;
    int buttonRollDiceAction;
    int id;
    int enemyMaxStrength;

    public class ButtonAction {
        int buttonText;
        int pageId;
    }

    Page(String titleText, int mainText, int buttonOneAction, int buttonTwoAction, int buttonThreeAction, int buttonFourAction, int buttonFiveAction, int id, int buttonRollDiceAction, int enemyMaxStrength){
        this.titleText = titleText;
        this.mainText = mainText;
        this.buttonOneAction = buttonOneAction;
        this.buttonTwoAction = buttonTwoAction;
        this.buttonThreeAction = buttonThreeAction;
        this.buttonFourAction = buttonFourAction;
        this.buttonFiveAction = buttonFiveAction;
        this.id = id;
        this.buttonRollDiceAction = buttonRollDiceAction;
        this.enemyMaxStrength = enemyMaxStrength;
    }
}

