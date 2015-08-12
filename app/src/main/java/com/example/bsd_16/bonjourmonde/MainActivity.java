package com.example.bsd_16.bonjourmonde;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edit_text;
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        output = (TextView) findViewById(R.id.output);

    }

    public void button1(View v) {
        edit_text = (EditText) findViewById(R.id.editText);
        CharSequence edit_text_val = edit_text.getText(); // Get value of edit_text
        edit_text.setText(null); // Empty the input text field
        String output_text = "Hello, " + edit_text_val.toString(); // Insert "Hello" in the front
        output.setText(output_text); // Set the output text
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
