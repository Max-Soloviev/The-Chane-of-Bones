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

import java.util.ArrayList;

public class PageActivity extends AppCompatActivity {
    private int selectedPage = 0;
    private Button buttonOne;
    private Button buttonTwo;
    private Button buttonThree;
    private Button buttonFour;
    private Button buttonFive;
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

        pagesOfTheBook = Book.createBook();
        showPage();
        pageText.setMovementMethod(new ScrollingMovementMethod());


        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSelectedPage(pagesOfTheBook.get(selectedPage).buttonOneAction);
                showPage();

            }
        });

        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSelectedPage(pagesOfTheBook.get(selectedPage).buttonTwoAction);
                showPage();

            }
        });

        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSelectedPage(pagesOfTheBook.get(selectedPage).buttonThreeAction);
                showPage();

            }
        });

        buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSelectedPage(pagesOfTheBook.get(selectedPage).buttonFourAction);
                showPage();

            }
        });

        buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSelectedPage(pagesOfTheBook.get(selectedPage).buttonFiveAction);
                showPage();

            }
        });
    }

    private void showPage() {
        pageTitle.setText(pagesOfTheBook.get(selectedPage).titleText);
        pageText.setText(getString(pagesOfTheBook.get(selectedPage).mainText));

        if (pagesOfTheBook.get(selectedPage).buttonOneAction == -1) {
            buttonOne.setVisibility(View.GONE);
        } else {
            buttonOne.setVisibility(View.VISIBLE);
        }

        if (pagesOfTheBook.get(selectedPage).buttonTwoAction == -1) {
            buttonTwo.setVisibility(View.GONE);
        } else {
            buttonTwo.setVisibility(View.VISIBLE);
        }

        if (pagesOfTheBook.get(selectedPage).buttonThreeAction == -1) {
            buttonThree.setVisibility(View.GONE);
        } else {
            buttonThree.setVisibility(View.VISIBLE);
        }

        if (pagesOfTheBook.get(selectedPage).buttonFourAction == -1) {
            buttonFour.setVisibility(View.GONE);
        } else {
            buttonFour.setVisibility(View.VISIBLE);
        }

        if (pagesOfTheBook.get(selectedPage).buttonFiveAction == -1) {
            buttonFive.setVisibility(View.GONE);
        } else {
            buttonFive.setVisibility(View.VISIBLE);
        }

        private void setSelectedPage (int page) {
            selectedPage = page;
        }
    }

    Page findPageById(int id) {

        Page pageInformation;

        for (Page page : pagesOfTheBook) {
            if (page.id == id); {
                pageInformation = page;
            }
            return pageInformation;
        }
    }
}