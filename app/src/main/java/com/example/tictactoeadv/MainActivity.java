package com.example.tictactoeadv;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,restart,rematch;
    TextView result;
    int time=1,temp=1,X=0,O=0;
    String b1,b2,b3,b4,b5,b6,b7,b8,b9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        init();

    }

    public void init(){
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        restart=findViewById(R.id.restart);
        result=findViewById(R.id.result);
        rematch=findViewById(R.id.rematch);
    }

    public void click(View w){
        Button btnn=(Button) w;
        if(btnn.getText().toString()==""){
            if(temp==1){
                btnn.setText("X");
                temp=0;
            } else {
                btnn.setText("O");
                temp=1;
            }
            time++;

            if(time>5){
                b1 = btn1.getText().toString();
                b2 = btn2.getText().toString();
                b3 = btn3.getText().toString();
                b4 = btn4.getText().toString();
                b5 = btn5.getText().toString();
                b6 = btn6.getText().toString();
                b7 = btn7.getText().toString();
                b8 = btn8.getText().toString();
                b9 = btn9.getText().toString();
                if((b1.equals(b2)&&b1.equals(b3)&&!b1.equals(""))||(b1.equals(b5)&&b1.equals(b9)&&!b1.equals(""))||(b1.equals(b4)&&b1.equals(b7)&&!b1.equals(""))){
                    Toast.makeText(this, "Winner: "+b1, Toast.LENGTH_SHORT).show();
                    restartauto();
                    if(b1=="X"){
                        X++;
                        temp = 0;
                    }
                    else{
                        O++;
                        temp = 1;
                    }
                    result.setText("X: "+X+" and  O: "+O);

                } else if(b2.equals(b5)&&b2.equals(b8)&&!b2.equals(""))  {
                    Toast.makeText(this, "Winner: "+b2, Toast.LENGTH_SHORT).show();
                    restartauto();
                    if(b2=="X"){
                        X++;
                        temp =0;
                    }
                    else{
                        O++;
                        temp =1;
                    }
                    result.setText("X: "+X+" and  O: "+O);

                } else if ((b3.equals(b5)&&b3.equals(b7)&&!b3.equals(""))||(b3.equals(b6)&&b3.equals(b9)&&!b3.equals(""))) {
                    Toast.makeText(this, "Winner: "+b3, Toast.LENGTH_SHORT).show();
                    restartauto();
                    if(b3=="X"){
                        X++;
                        temp =0;
                    }
                    else{
                        O++;
                        temp =1;
                    }
                    result.setText("X: "+X+" and  O: "+O);
                } else if (b7.equals(b8)&&b7.equals(b9)&&!b7.equals("")) {
                    Toast.makeText(this, "Winner: "+b7, Toast.LENGTH_SHORT).show();
                    restartauto();
                    if(b7=="X"){
                        X++;
                        temp = 0;
                    }
                    else{
                        O++;
                        temp =1;
                    }
                    result.setText("X: "+X+" and  O: "+O);
                }

            }
            if(time==10){
                Toast.makeText(this, "Match draw", Toast.LENGTH_SHORT).show();
                restartauto();
            }
        }
    }
    public void restartauto(){
        time=1;
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
    }

    public void cl(View v){
        Button bn=(Button) v;
        restartauto();
        if (bn.getText().equals("Rematch")) {
                X = 0;
                O = 0;
                result.setText("");
        }
    }

}