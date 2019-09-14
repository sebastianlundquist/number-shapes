package com.sebastianlundquist.numbershapes;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void checkShape(View view) {
        EditText editText = findViewById(R.id.editText);
        int number;
        String message;
        try {
            number = Integer.parseInt(editText.getText().toString());
        }
        catch (Exception e) {
            Toast.makeText(this, "Enter a valid integer!", Toast.LENGTH_SHORT).show();
            return;
        }
        Number myNumber = new Number();
        myNumber.number = number;
        if (myNumber.isTriangular() && myNumber.isSquare()) {
            message = number + " is both square and triangular!";
        }
        else if (myNumber.isSquare()) {
            message = number + " is square, but not triangular.";
        }
        else if (myNumber.isTriangular()) {
            message = number + " is triangular, but not square.";
        }
        else {
            message = number + " is neither square nor triangular.";
        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        editText.getText().clear();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
