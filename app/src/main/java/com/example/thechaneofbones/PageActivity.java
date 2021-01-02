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

public class PageActivity extends AppCompatActivity {
    private int selectedPage = 0;
    private Button buttonOne;
    private Button buttonTwo;
    private TextView pageText;
    private TextView pageTitle;
    Page[] pagesOfTheBook;

    private void showPage() {
        pageTitle.setText(pagesOfTheBook[selectedPage].titleText);
        pageText.setText(pagesOfTheBook[selectedPage].mainText);
    }

    private void setSelectedPage(int page) {
        selectedPage = page;
        showPage();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page);

        pageText = findViewById(R.id.pageText);
        pageTitle = findViewById(R.id.pageTitle);
        buttonOne = findViewById(R.id.selectButtonOne);
        buttonTwo = findViewById(R.id.selectButtonTwo);
        pagesOfTheBook[0] = new Page("Всупление 1", "Основной текст 1", 0, 2);
        pagesOfTheBook[1] = new Page("Всупление 2", "Основной текст 2", 1, 1);
        pagesOfTheBook[2] = new Page("Всупление 3", "Основной текст 3", 2, 0);
        // pagesOfTheBook = Book.createBook();

        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSelectedPage(pagesOfTheBook[selectedPage].buttonOneAction);

            }
        });

        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSelectedPage(pagesOfTheBook[selectedPage].buttonTwoAction);

            }
        });

    }
}