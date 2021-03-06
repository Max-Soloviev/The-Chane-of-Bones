package com.example.thechaneofbones;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class PageActivity extends AppCompatActivity {
    private int selectedPage = 302;
    private Button buttonOne;
    private Button buttonTwo;
    private Button buttonThree;
    private Button buttonFour;
    private Button buttonFive;
    private Button buttonRollDice;
    private Button buttonStartCombat;
    private TextView pageText;
    private TextView pageTitle;
    ArrayList<Page> pagesOfTheBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page);

        pageText = findViewById(R.id.pageText);
        pageTitle = findViewById(R.id.pageTitle);
        buttonOne = findViewById(R.id.selectButtonOne);
        buttonTwo = findViewById(R.id.selectButtonTwo);
        buttonThree = findViewById(R.id.selectButtonThree);
        buttonFour = findViewById(R.id.selectButtonFour);
        buttonFive = findViewById(R.id.selectButtonFive);
        buttonRollDice = findViewById(R.id.selectButtonRollDice);
        buttonStartCombat = findViewById(R.id.selectButtonStartCombat);

        pagesOfTheBook = Book.createBook();
        showPage();
        pageText.setMovementMethod(new ScrollingMovementMethod());


        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSelectedPage(findPageById(selectedPage).buttonOneAction);
                showPage();

            }
        });

        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSelectedPage(findPageById(selectedPage).buttonTwoAction);
                showPage();

            }
        });

        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSelectedPage(findPageById(selectedPage).buttonThreeAction);
                showPage();

            }
        });

        buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSelectedPage(findPageById(selectedPage).buttonFourAction);
                showPage();

            }
        });

        buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSelectedPage(findPageById(selectedPage).buttonFiveAction);
                showPage();

            }
        });

            buttonRollDice.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            rollDice ();
        }
    });

        buttonStartCombat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StartCombat ();
            }
        });
    }

    public void showButton (Button button, int buttonAction) {
        if (buttonAction == -1) {
            button.setVisibility(View.GONE);
        } else {
            button.setVisibility(View.VISIBLE);
            button.setText(String.valueOf(buttonAction));
            button.postInvalidate();
        }
    }
    private void showPage() {
        Page page = findPageById(selectedPage);

        pageTitle.setText(findPageById(selectedPage).titleText);
        pageText.setText(getString(findPageById(selectedPage).mainText));

        showButton(buttonOne, page.buttonOneAction);
        showButton(buttonTwo, page.buttonTwoAction);
        showButton(buttonThree, page.buttonThreeAction);
        showButton(buttonFour, page.buttonFourAction);
        showButton(buttonFive, page.buttonFiveAction);
        showButton(buttonRollDice, page.buttonRollDiceAction);

        if (page.enemyMaxStrength > 0) {
            buttonStartCombat.setVisibility(View.VISIBLE);
        } else {
            buttonStartCombat.setVisibility(View.GONE);
        }
    }

    private void createHero () {
        Hero hero = new Hero(20, 4, 3, 30, new ArrayList<>()); // дописать метод создания героя и создать кнопку

    }

    private void rollDice () {
        Toast.makeText(getApplicationContext(), "Бросок кубика", Toast.LENGTH_SHORT).show();
    }

    private void StartCombat () {
        Toast.makeText(getApplicationContext(), "Начать бой", Toast.LENGTH_SHORT).show();
    }

    private void setSelectedPage (int pageId) {

        selectedPage = pageId;
    }

    Page findPageById(int id) {

        Page pageInformation = null;

        for (Page page : pagesOfTheBook) {
            if (page.id == id) {
                pageInformation = page;
            }
        }
        return pageInformation;
    }

}