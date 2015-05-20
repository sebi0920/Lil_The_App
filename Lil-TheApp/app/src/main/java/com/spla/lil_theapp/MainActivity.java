package com.spla.lil_theapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    int zahl = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView1 = (TextView)findViewById(R.id.textView);
        final TextView textView2 = (TextView)findViewById(R.id.textView2);
        final TextView textView3 = (TextView)findViewById(R.id.textView3);
        final TextView textView4 = (TextView)findViewById(R.id.textView4);
        final TextView textView5 = (TextView)findViewById(R.id.textView5);
        final TextView textView6 = (TextView)findViewById(R.id.textView6);
        final TextView textView7 = (TextView)findViewById(R.id.textView7);
        final TextView textView8 = (TextView)findViewById(R.id.textView8);
        final TextView textView9 = (TextView)findViewById(R.id.textView9);
        final TextView textView10 = (TextView)findViewById(R.id.textView10);
        final TextView textView11 = (TextView)findViewById(R.id.textView11);
        final TextView textView12 = (TextView)findViewById(R.id.textView12);
        final TextView textView13 = (TextView)findViewById(R.id.textView13);
        final TextView textView14 = (TextView)findViewById(R.id.textView14);
        final TextView textView15 = (TextView)findViewById(R.id.textView15);
        final TextView textView16 = (TextView)findViewById(R.id.textView16);
        final TextView textView19 = (TextView)findViewById(R.id.textView19);
        final TextView textView20 = (TextView)findViewById(R.id.textView20);
        final TextView textView21 = (TextView)findViewById(R.id.textView21);
        final TextView textView22 = (TextView)findViewById(R.id.textView22);
        final TextView textView23 = (TextView)findViewById(R.id.textView23);
        final TextView textView24 = (TextView)findViewById(R.id.textView24);
        final TextView textView25 = (TextView)findViewById(R.id.textView25);
        final TextView textView26 = (TextView)findViewById(R.id.textView26);
        final TextView textView27 = (TextView)findViewById(R.id.textView27);
        final TextView textView28 = (TextView)findViewById(R.id.textView28);
        final TextView textView29 = (TextView)findViewById(R.id.textView29);
        final TextView textView30 = (TextView)findViewById(R.id.textView30);
        final TextView textView31 = (TextView)findViewById(R.id.textView31);
        final TextView textView32 = (TextView)findViewById(R.id.textView32);
        final TextView textView33 = (TextView)findViewById(R.id.textView33);
        final TextView textView34 = (TextView)findViewById(R.id.textView34);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                zahl ++;

                switch (zahl){
                    case 1:
                        textView1.setText("Lil is toll!");
                        break;
                    case 2:
                        textView2.setText("Lil is toll!");
                        break;
                    case 3:
                        textView3.setText("Lil is toll!");
                        break;
                    case 4:
                        textView4.setText("Lil is toll!");
                        break;
                    case 5:
                        textView5.setText("Lil is toll!");
                        break;
                    case 6:
                        textView6.setText("Lil is toll!");
                        break;
                    case 7:
                        textView7.setText("Lil is toll!");
                        break;
                    case 8:
                        textView8.setText("Lil is toll!");
                        break;
                    case 9:
                        textView9.setText("Lil is toll!");
                        break;
                    case 10:
                        textView10.setText("Lil is toll!");
                        break;
                    case 11:
                        textView11.setText("Lil is toll!");
                        break;
                    case 12:
                        textView12.setText("Lil is toll!");
                        break;
                    case 13:
                        textView13.setText("Lil is toll!");
                        break;
                    case 14:
                        textView14.setText("Lil is toll!");
                        break;
                    case 15:
                        textView15.setText("Lil is toll!");
                        break;
                    case 16:
                        textView16.setText("Lil is toll!");
                        zahl = zahl+2;
                        break;
                    case 19:
                        textView19.setText("Lil is toll!");
                        break;
                    case 20:
                        textView20.setText("Lil is toll!");
                        break;
                    case 21:
                        textView21.setText("Lil is toll!");
                        break;
                    case 22:
                        textView22.setText("Lil is toll!");
                        break;
                    case 23:
                        textView23.setText("Lil is toll!");
                        break;
                    case 24:
                        textView24.setText("Lil is toll!");
                        break;
                    case 25:
                        textView25.setText("Lil is toll!");
                        break;
                    case 26:
                        textView26.setText("Lil is toll!");
                        break;
                    case 27:
                        textView27.setText("Lil is toll!");
                        break;
                    case 28:
                        textView28.setText("Lil is toll!");
                        break;
                    case 29:
                        textView29.setText("Lil is toll!");
                        break;
                    case 30:
                        textView30.setText("Lil is toll!");
                        break;
                    case 31:
                        textView31.setText("Lil is toll!");
                        break;
                    case 32:
                        textView32.setText("Lil is toll!");
                        break;
                    case 33:
                        textView33.setText("Lil is toll!");
                        break;
                    case 34:
                        textView34.setText("Lil is toll!");
                        zahl = zahl+2;
                        break;
                    case 37:
                        Toast.makeText(getApplicationContext(), "Sebi is auch toll!", Toast.LENGTH_SHORT).show();
                        break;
                    case 38:
                        Toast.makeText(getApplicationContext(), "Nochmal?", Toast.LENGTH_SHORT).show();
                        break;
                    case 39:
                        Toast.makeText(getApplicationContext(), "Ok, here we go!", Toast.LENGTH_SHORT).show();

                        textView1.setText("");
                        textView2.setText("");
                        textView3.setText("");
                        textView4.setText("");
                        textView5.setText("");
                        textView6.setText("");
                        textView7.setText("");
                        textView8.setText("");
                        textView9.setText("");
                        textView10.setText("");
                        textView11.setText("");
                        textView12.setText("");
                        textView13.setText("");
                        textView14.setText("");
                        textView15.setText("");
                        textView16.setText("");
                        textView19.setText("");
                        textView20.setText("");
                        textView21.setText("");
                        textView22.setText("");
                        textView23.setText("");
                        textView24.setText("");
                        textView25.setText("");
                        textView26.setText("");
                        textView27.setText("");
                        textView28.setText("");
                        textView29.setText("");
                        textView30.setText("");
                        textView31.setText("");
                        textView32.setText("");
                        textView33.setText("");
                        textView34.setText("");


                        zahl = 0;

                        break;
                }

            }
        });

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
        }else if(id == R.id.impressum){
            Intent intent = new Intent(this, Impressum.class);
            startActivity(intent);

            }

        return super.onOptionsItemSelected(item);
    }
}
