package com.bit01.alok.tap2pay;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    public void addProduct (View view) {

        Intent intent = new Intent (getApplicationContext(), ViewBill.class);
        startActivity(intent);
    }

    public void receivePayment (View view) {

        Intent intent = new Intent (getApplicationContext(), ReceivePayment.class);
        startActivity(intent);
    }

    public void transactionHistory (View view) {

        Intent intent = new Intent (getApplicationContext(), History.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button addProductButton = (Button)findViewById(R.id.addProductButton);
        Button receivePaymentButton = (Button)findViewById(R.id.receivePaymentButton);
        Button transactionHistoryButton = (Button)findViewById(R.id.transactionHistoryButton);

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
