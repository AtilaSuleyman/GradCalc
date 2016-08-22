package com.armanisuleyman.android.gradecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class DataInputActivity extends AppCompatActivity {

    //Define all the mark fields in java from XML
    private EditText markField1 = (EditText)findViewById(R.id.mark1);
    private EditText markField2 = (EditText)findViewById(R.id.mark2);
    private EditText markField3 = (EditText)findViewById(R.id.mark3);
    private EditText markField4 = (EditText)findViewById(R.id.mark4);
    private EditText markField5 = (EditText)findViewById(R.id.mark5);
    private EditText markField6 = (EditText)findViewById(R.id.mark6);
    //Define all the percentage fields in java from XML
    private EditText percentageField1 = (EditText)findViewById(R.id.mark1);
    private EditText percentageField2 = (EditText)findViewById(R.id.mark2);
    private EditText percentageField3 = (EditText)findViewById(R.id.mark3);
    private EditText percentageField4 = (EditText)findViewById(R.id.mark4);
    private EditText percentageField5 = (EditText)findViewById(R.id.mark5);
    private EditText percentageField6 = (EditText)findViewById(R.id.mark6);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_input);
    }
}
