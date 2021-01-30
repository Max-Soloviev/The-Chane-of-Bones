package com.example.thechaneofbones;

public class Page {
    String titleText;
    int mainText;
    int buttonOneAction;
    int buttonTwoAction;
    int buttonThreeAction;
    int buttonFourAction;
    int buttonFiveAction;
    int id;

    Page(String titleText, int mainText, int buttonOneAction, int buttonTwoAction, int buttonThreeAction, int buttonFourAction, int buttonFiveAction, int id){
        this.titleText = titleText;
        this.mainText = mainText;
        this.buttonOneAction = buttonOneAction;
        this.buttonTwoAction = buttonTwoAction;
        this.buttonThreeAction = buttonThreeAction;
        this.buttonFourAction = buttonFourAction;
        this.buttonFiveAction = buttonFiveAction;
        this.id = id;

    }

}
