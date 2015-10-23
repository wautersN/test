package com.example.waute.testgithub;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
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
    //nog een test
    //mss eens nieuwe naam geven?
    //test naarn ieuwe branch
    //staan we nu op branch 2????
    //toch terug naar de master
    //nu staan we op de master
    //nog eens op de master
    //test
    //test2
    //nieuwe branch
    //dees is info voor onder de nieuwe branch te zetten
    //is dit nu niet gelukt?
    //beschrijvin eens aanpassen
    //een een andere branch aanmaken
    //test?
    //nog eens een knop
    //dit nu op master?


    //voor de zoveelste keer een nieuwe branch
}
