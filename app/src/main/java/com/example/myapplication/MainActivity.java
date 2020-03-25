package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1, e2;
    String s1,s2;
    TextView t1;
    int num1, num2;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = (TextView)findViewById(R.id.textView);
        registerForContextMenu(t1);

    }
    public boolean getNumbers()
    {
        // defining the edit text 1 to e1
        e1 = (EditText)findViewById(R.id.editText1);

        // defining the edit text 2 to e2
        e2 = (EditText)findViewById(R.id.editText2);

        // defining the text view to t1
        t1 = (TextView)findViewById(R.id.textView);
        registerForContextMenu(t1);

        // taking input from text box 1
        s1 = e1.getText().toString();

        // taking input from text box 2
        s2 = e2.getText().toString();

        // condition to check if box is not empty
        if ((s1.equals(null) && s2.equals(null))
                || (s1.equals("") && s2.equals("")))
        {

            String result = "Please enter a value";
            t1.setText(result);

            return false;
        }
        else
        {
            // converting string to int.
            num1 = Integer.parseInt(e1.getText().toString());

            // converting string to int.
            num2 = Integer.parseInt(e2.getText().toString());
        }

        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu1, menu);
        return true;
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo MenuInfo)
    {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu1, menu);
        return ;
    }
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add:
                if (getNumbers()) {
                    int sum = num1 + num2;
                    t1.setText(Integer.toString(sum));
                }
                return true;
            case R.id.mul:
                if (getNumbers()) {
                    int sum = num1 * num2;
                    t1.setText(Integer.toString(sum));
                }
                return true;
            case R.id.sub_1:
                if (getNumbers()) {
                    int sum=Integer.parseInt(t1.getText().toString())*3;
                    t1.setText(Integer.toString(sum));
                }
                return true;
            case R.id.sub2:
                if (getNumbers())
                {
                    int sum=Integer.parseInt(t1.getText().toString())*4;
                    t1.setText(Integer.toString(sum));
                }
                return true;
            case R.id.div:
                if (getNumbers()) {

                    // displaying the text in text view assigned as t1
                    double sum = num1 / (num2 * 1.0);
                    t1.setText(Double.toString(sum));
                }
                return true;
            case R.id.sub:
                if (getNumbers())
                {
                    int sum = num1 - num2;
                    t1.setText(Integer.toString(sum));
                }
                return true;

        }
        return super.onContextItemSelected(item);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {

        switch (item.getItemId())
        {
            case R.id.add:
                if (getNumbers()) {
                    int sum = num1 + num2;
                    t1.setText(Integer.toString(sum));
                }
                return true;
            case R.id.mul:
                if (getNumbers()) {
                    int sum = num1 * num2;
                    t1.setText(Integer.toString(sum));
                }
                return true;
            case R.id.sub_1:
                if (getNumbers())
                {
                    int sum = num1 * num2;
                    sum=sum*3;
                    t1.setText(Integer.toString(sum));
                }
                return true;
            case R.id.sub2:
                if (getNumbers())
                {
                    int sum = num1 * num2;
                    sum=sum*4;
                    t1.setText(Integer.toString(sum));
                }
                return true;
            case R.id.div:
                if (getNumbers()) {

                    // displaying the text in text view assigned as t1
                    double sum = num1 / (num2 * 1.0);
                    t1.setText(Double.toString(sum));
                }
                return true;
            case R.id.sub:
                if (getNumbers())
                {
                    int sum = num1-num2 ;
                    t1.setText(Integer.toString(sum));
                }
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }


    }

    public void Clear(View view)
    {
        TextView editText = (TextView) findViewById(R.id.textView);
        editText.setText("");
        EditText editText1 = (EditText) findViewById(R.id.editText1);
        editText1.setText("");
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        editText2.setText("");
    }
}
