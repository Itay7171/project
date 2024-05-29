package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.Toast;

public class project_main extends AppCompatActivity {

    boolean is0Turn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        boolean is0Turn = false;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_main);
        Intent intent = getIntent();
    }

    public void onClickButton(View view)
    {
        Button btn = (Button)view;

        if(!is0Turn)
        {
            is0Turn=true;
            String text = "O";
            onConnectFourButtonClick(view,text);
        }
        else
        {
            is0Turn=false;
            String text = "0";
            onConnectFourButtonClick(view,text);
        }



    }

    public void onConnectFourButtonClick(View view, String text) {
        Button b = (Button) view;
        GridLayout gridLayout = (GridLayout) findViewById(R.id.connectFourGridLayout);
        int position = gridLayout.indexOfChild(view);
        int colum = position% gridLayout.getColumnCount();
        for(int i=0; i< gridLayout.getRowCount();i++)
        {
            int position2 = (gridLayout.getRowCount() - i - 1) * gridLayout.getRowCount() + colum;
            Button pos = (Button) gridLayout.getChildAt(position2);
            if(pos.getText().equals(""))
            {
                pos.setText(text);
                return;
            }

        }
    }




}