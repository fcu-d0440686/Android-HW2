package com.example.mac.homework2;

import android.os.Bundle;
import android.content.DialogInterface;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText input;
    Button submit;
    TextView name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        name = (TextView)findViewById(R.id.textView2);
        input = (EditText)findViewById(R.id.editText2);
        submit =(Button)findViewById(R.id.button);
        submit.setOnClickListener(calcResult);
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
        switch(id){
            case R.id.action_settings:
                return true;
            case R.id.action_reset:
                input.setText("");
                break;
            case R.id.action_about:
                AlertDialog.Builder add = new AlertDialog.Builder(this);
                add.setTitle("About this APP");
                add.setMessage("Author : Shin-Yu Chang");
                DialogInterface.OnClickListener listener = new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dia,int i){

                    }
                };
                add.setPositiveButton("OK",listener);
                add.show();
                break;
        }


        return super.onOptionsItemSelected(item);
    }

    private View.OnClickListener calcResult = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String input_str = input.getText().toString();
            //input.setText("");
            Toast.makeText(MainActivity.this, "Hello " +input_str, Toast.LENGTH_LONG).show();

        }
    };
}


