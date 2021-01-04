package com.example.thechaneofbones;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class PageActivity extends AppCompatActivity {
    private int selectedPage = 0;
    private Button buttonOne;
    private Button buttonTwo;
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

        pagesOfTheBook = Book.createBook();

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
    }

    private void showPage() {
        pageTitle.setText(pagesOfTheBook.get(selectedPage).titleText);
        pageText.setText(getString(pagesOfTheBook.get(selectedPage).mainText));
    }

    private void setSelectedPage(int page) {
        selectedPage = page;

    }
}