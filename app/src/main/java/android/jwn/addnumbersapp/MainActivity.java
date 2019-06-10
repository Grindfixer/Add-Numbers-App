package android.jwn.addnumbersapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addBtn = (Button)findViewById(R.id.addBtn); // get the button
        addBtn.setOnClickListener(new View.OnClickListener() {// when button is clicked run this code
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                //find the views by their id and assign them to variables
                EditText firstNumEditText = (EditText)findViewById(R.id.firstNumEditText);
                EditText secondNumEditText = (EditText)findViewById(R.id.secondNumEditText);
                TextView resultTextView = (TextView)findViewById(R.id.resultTextView);

                // get the text values from the input boxes and convert to String
                int num1 = Integer.parseInt(firstNumEditText.getText().toString());
                int num2 = Integer.parseInt(secondNumEditText.getText().toString());
                int result = num1 + num2;
                resultTextView.setText(result + "");

            }
        });
    }
}
