package com.example.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public class Number{
        int number;
        Number(int d){
            this.number = d;
        }

        public boolean isTriangular() {
            int i = 1;
            int d = 2;
            while(i < number) {
                i+=d;
                d++;
            }
            if(i == number) {
                return true;
            }
            return false;
        }

        public boolean isSquare() {
            double x = Math.sqrt(number);
            if(x == Math.floor(x)) {
                return true;
            }
            return false;
        }
    }

    public void check(View view){
        EditText text = (EditText) findViewById(R.id.NUMBER);
        String s = text.getText().toString();
        int d = Integer.parseInt(s);
        Number num = new Number(d);
        boolean T = num.isTriangular();
        boolean S = num.isSquare();
        if(T && S){
            Toast.makeText(MainActivity.this, d +" is Triangular as well as Square", Toast.LENGTH_SHORT).show();
        }else if(T && !S){
            Toast.makeText(MainActivity.this, d + " is Triangular but not Square ", Toast.LENGTH_SHORT).show();

        }else if(!T && S){
            Toast.makeText(MainActivity.this, d + " is Square but not Triangular", Toast.LENGTH_SHORT).show();

        }else{
            Toast.makeText(MainActivity.this, d + " is neither Square nor Triangular", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
