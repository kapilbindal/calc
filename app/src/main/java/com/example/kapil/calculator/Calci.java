package com.example.kapil.calculator;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calci extends AppCompatActivity {
    Button n0,n1,n2,n3,n4,n5,n6,n7,n8,n9,dec,add,sub,prod,div,perc,sol,clr,back;
    EditText ed,pre;
    Float v1,v2,p1,p2,result;
    String flag;
    boolean ispressed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calci);
        ed = findViewById(R.id.ans);
        pre = findViewById(R.id.pre);
        n0= findViewById(R.id.b0);
        n1= findViewById(R.id.b1);
        n2= findViewById(R.id.b2);
        n3= findViewById(R.id.b3);
        n4= findViewById(R.id.b4);
        n5= findViewById(R.id.b5);
        n6= findViewById(R.id.b6);
        n7= findViewById(R.id.b7);
        n8= findViewById(R.id.b8);
        n9= findViewById(R.id.b9);
        dec= findViewById(R.id.pnt);
        add= findViewById(R.id.add);
        sub= findViewById(R.id.sub);
        div= findViewById(R.id.div);
        prod= findViewById(R.id.prod);
        perc= findViewById(R.id.perc);
        sol= findViewById(R.id.result);
        clr= findViewById(R.id.clear);
        back= findViewById(R.id.del);

        n0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ispressed == true) {
                    ed.setText("0");
                    pre.setText("");
                    ispressed=false;
                }
                else{
                    ed.setText(ed.getText() + "0");
                    ispressed=false;
                }
            }
        });
        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ispressed == true) {
                    ed.setText("1");
                    pre.setText("");
                    ispressed=false;
                }
                else{
                    ed.setText(ed.getText() + "1");
                    ispressed=false;
                }
            }
        });
        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ispressed == true) {
                    ed.setText("2");
                    pre.setText("");
                    ispressed=false;
                }
                else{
                    ed.setText(ed.getText() + "2");
                    ispressed=false;
                }            }
        });
        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ispressed == true) {
                    ed.setText("3");
                    pre.setText("");
                    ispressed=false;
                }
                else{
                    ed.setText(ed.getText() + "3");
                    ispressed=false;
                }
            }
        });
        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ispressed == true) {
                    ed.setText("4");
                    pre.setText("");
                    ispressed=false;
                }
                else{
                    ed.setText(ed.getText() + "4");
                    ispressed=false;
                }
            }
        });
        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ispressed == true) {
                    ed.setText("5");
                    pre.setText("");
                    ispressed=false;
                }
                else{
                    ed.setText(ed.getText() + "5");
                    ispressed=false;
                }
            }
        });
        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ispressed == true) {
                    ed.setText("6");
                    pre.setText("");
                    ispressed=false;
                }
                else{
                    ed.setText(ed.getText() + "6");
                    ispressed=false;
                }
            }
        });
        n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ispressed == true) {
                    ed.setText("7");
                    pre.setText("");
                    ispressed=false;
                }
                else{
                    ed.setText(ed.getText() + "7");
                    ispressed=false;
                }
            }
        });
        n8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ispressed == true) {
                    ed.setText("8");
                    pre.setText("");
                    ispressed=false;
                }
                else{
                    ed.setText(ed.getText() + "8");
                    ispressed=false;
                }
            }
        });
        n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ispressed == true) {
                    ed.setText("9");
                    pre.setText("");
                    ispressed=false;
                }
                else{
                    ed.setText(ed.getText() + "9");
                    ispressed=false;
                }
            }
        });
        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ispressed == true){
                    ed.setText("0.");
                    pre.setText("");
                    ispressed=false;
                }
                if( ed.getText().toString().equals("")){
                    ed.setText("0.");
                    ispressed=false;
                }
                if(ed.getText().toString().contains(".")){
                    ed.setText(ed.getText());
                }
                else{
                    ed.setText(ed.getText() + ".");
                    ispressed=false;
                }
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ed.getText().toString().equals("") && pre.getText().toString().equals("")){
                    Context context = getApplicationContext();
                    CharSequence text = "Enter the Number!";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                if(ed.getText().toString().equals("") && !pre.getText().toString().isEmpty()){
                    ed.setText("");
                    String s3 = pre.getText().toString();
                    s3= s3.substring(0,s3.length()-3);
                    pre.setText(s3 + " + ");
                    flag = "+";
                }
                if(!ed.getText().toString().isEmpty() && pre.getText().toString().isEmpty()) {
                    v1 = Float.parseFloat(ed.getText().toString());
                    flag = "+";
                    pre.setText(ed.getText() + " + ");
                    ed.setText(null);
                    ispressed = false;
                }
                if(!ed.getText().toString().isEmpty() && !pre.getText().toString().isEmpty()&& ispressed == true) {
                    v1 = Float.parseFloat(ed.getText() + "");
                    flag = "+";
                    pre.setText(ed.getText() + " + ");
                    ed.setText(null);
                    ispressed = false;
                }
                if(!ed.getText().toString().isEmpty() && !pre.getText().toString().isEmpty() && ispressed == false){
                    String s3 = pre.getText().toString();
                    char s4 = s3.charAt(s3.length()-2);
                    s3= s3.substring(0,s3.length()-3);
                    p1 = Float.parseFloat(s3);
                    p2 = Float.parseFloat(ed.getText() + "");
                    if(p2 == 0){
                        Context context = getApplicationContext();
                        CharSequence text = "Divide By 0 not possible!";
                        int duration = Toast.LENGTH_SHORT;
                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }
                    else {
                        switch (s4) {
                            case '+':
                                v1 = p1 + p2;
                                break;
                            case '-':
                                v1 = p1 - p2;
                                break;
                            case '*':
                                v1 = p1 * p2;
                                break;
                            case '/':
                                v1 = p1 / p2;
                                break;
                            case '%':
                                v1 = p1 % p2;
                                break;
                        }
                        pre.setText(v1 + " + ");
                        flag = "+";
                        ed.setText(null);
                        ispressed = false;
                    }
                }
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ed.getText().toString().equals("") && pre.getText().toString().equals("")){
//                    Context context = getApplicationContext();
//                    CharSequence text = "Enter the Number!";
//                    int duration = Toast.LENGTH_SHORT;
//                    Toast toast = Toast.makeText(context, text, duration);
//                    toast.show();
                    v1= Float.valueOf(0);
                    pre.setText("0 - ");
                    flag="-";
                }
                if(ed.getText().toString().equals("") && !pre.getText().toString().isEmpty()){
                    ed.setText("");
                    String s3 = pre.getText().toString();
                    s3= s3.substring(0,s3.length()-3);
                    pre.setText(s3 + " - ");
                    flag = "-";
                }
                if(!ed.getText().toString().isEmpty() && pre.getText().toString().isEmpty()) {
                    v1 = Float.parseFloat(ed.getText() + "");
                    flag = "-";
                    pre.setText(ed.getText() + " - ");
                    ed.setText(null);
                    ispressed = false;
                }
                if(!ed.getText().toString().isEmpty() && !pre.getText().toString().isEmpty()&& ispressed == true) {
                    v1 = Float.parseFloat(ed.getText() + "");
                    flag = "-";
                    pre.setText(ed.getText() + " - ");
                    ed.setText(null);
                    ispressed = false;
                }
                if(!ed.getText().toString().isEmpty() && !pre.getText().toString().isEmpty() && ispressed == false){
                    String s3 = pre.getText().toString();
                    char s4 = s3.charAt(s3.length()-2);
                    s3= s3.substring(0,s3.length()-3);
                    p1 = Float.parseFloat(s3);
                    p2 = Float.parseFloat(ed.getText() + "");
                    if(p2 == 0){
                        Context context = getApplicationContext();
                        CharSequence text = "Divide By 0 not possible!";
                        int duration = Toast.LENGTH_SHORT;
                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }
                    else {
                        switch (s4) {
                            case '+':
                                v1 = p1 + p2;
                                break;
                            case '-':
                                v1 = p1 - p2;
                                break;
                            case '*':
                                v1 = p1 * p2;
                                break;
                            case '/':
                                v1 = p1 / p2;
                                break;
                            case '%':
                                v1 = p1 % p2;
                                break;
                        }
                        pre.setText(v1 + " - ");
                        flag = "-";
                        ed.setText(null);
                        ispressed = false;
                    }
                }
            }
        });
        prod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ed.getText().toString().equals("") && pre.getText().toString().equals("")){
                    Context context = getApplicationContext();
                    CharSequence text = "Enter the Number!";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                if(ed.getText().toString().equals("") && !pre.getText().toString().isEmpty()){
                    ed.setText("");
                    String s3 = pre.getText().toString();
                    s3= s3.substring(0,s3.length()-3);
                    pre.setText(s3 + " * ");
                    flag = "*";
                }
                if(!ed.getText().toString().isEmpty() && pre.getText().toString().isEmpty()) {
                    v1 = Float.parseFloat(ed.getText() + "");
                    flag = "*";
                    pre.setText(ed.getText() + " * ");
                    ed.setText(null);
                    ispressed = false;
                }
                if(!ed.getText().toString().isEmpty() && !pre.getText().toString().isEmpty()&& ispressed == true) {
                    v1 = Float.parseFloat(ed.getText() + "");
                    flag = "*";
                    pre.setText(ed.getText() + " * ");
                    ed.setText(null);
                    ispressed = false;
                }
                if(!ed.getText().toString().isEmpty() && !pre.getText().toString().isEmpty() && ispressed == false){
                    String s3 = pre.getText().toString();
                    char s4 = s3.charAt(s3.length()-2);
                    s3= s3.substring(0,s3.length()-3);
                    p1 = Float.parseFloat(s3);
                    p2 = Float.parseFloat(ed.getText() + "");
                    if(p2 == 0){
                        Context context = getApplicationContext();
                        CharSequence text = "Divide By 0 not possible!";
                        int duration = Toast.LENGTH_SHORT;
                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }
                    else {
                        switch (s4) {
                            case '+':
                                v1 = p1 + p2;
                                break;
                            case '-':
                                v1 = p1 - p2;
                                break;
                            case '*':
                                v1 = p1 * p2;
                                break;
                            case '/':
                                v1 = p1 / p2;
                                break;
                            case '%':
                                v1 = p1 % p2;
                                break;
                        }
                        pre.setText(v1 + " * ");
                        flag = "*";
                        ed.setText(null);
                        ispressed = false;
                    }
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ed.getText().toString().equals("") && pre.getText().toString().equals("")){
                    Context context = getApplicationContext();
                    CharSequence text = "Enter the Number!";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                if(ed.getText().toString().equals("") && !pre.getText().toString().isEmpty()){
                    ed.setText("");
                    String s3 = pre.getText().toString();
                    s3= s3.substring(0,s3.length()-3);
                    pre.setText(s3 + " / ");
                    flag = "/";
                }
                if(!ed.getText().toString().isEmpty() && pre.getText().toString().isEmpty()) {
                    v1 = Float.parseFloat(ed.getText() + "");
                    flag = "/";
                    pre.setText(ed.getText() + " / ");
                    ed.setText(null);
                    ispressed = false;
                }
                if(!ed.getText().toString().isEmpty() && !pre.getText().toString().isEmpty()&& ispressed == true) {
                    v1 = Float.parseFloat(ed.getText() + "");
                    flag = "/";
                    pre.setText(ed.getText() + " / ");
                    ed.setText(null);
                    ispressed = false;
                }
                if(!ed.getText().toString().isEmpty() && !pre.getText().toString().isEmpty() && ispressed == false){
                    String s3 = pre.getText().toString();
                    char s4 = s3.charAt(s3.length()-2);
                    s3= s3.substring(0,s3.length()-3);
                    p1 = Float.parseFloat(s3);
                    p2 = Float.parseFloat(ed.getText() + "");
                    if(p2 == 0){
                        Context context = getApplicationContext();
                        CharSequence text = "Divide By 0 not possible!";
                        int duration = Toast.LENGTH_SHORT;
                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }
                    else {
                        switch (s4) {
                            case '+':
                                v1 = p1 + p2;
                                break;
                            case '-':
                                v1 = p1 - p2;
                                break;
                            case '*':
                                v1 = p1 * p2;
                                break;
                            case '/':
                                v1 = p1 / p2;
                                break;
                            case '%':
                                v1 = p1 % p2;
                                break;
                        }
                        pre.setText(v1 + " / ");
                        flag = "/";
                        ed.setText(null);
                        ispressed = false;
                    }
                }
            }
        });
        perc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ed.getText().toString().equals("") && pre.getText().toString().equals("")){
                    Context context = getApplicationContext();
                    CharSequence text = "Enter the Number!";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                if(ed.getText().toString().equals("") && !pre.getText().toString().isEmpty()){
                    ed.setText("");
                }
                if(!ed.getText().toString().isEmpty() && pre.getText().toString().isEmpty()) {
                    v1 = Float.parseFloat(ed.getText() + "");
                    flag = "%";
                    v1 = v1/100;
                    ed.setText(v1 + "");
                    ispressed = true;
                }
                if(!ed.getText().toString().isEmpty() && !pre.getText().toString().isEmpty()&& ispressed == true) {
                    v1 = Float.parseFloat(ed.getText() + "");
                    //pre.setText(v1 + " / 100");
                    v1=v1/100;
                    //flag = "%";
                    ed.setText(v1+"");
                    //ispressed = false;
                }
                if(!ed.getText().toString().isEmpty() && !pre.getText().toString().isEmpty() && ispressed == false){
                    String s3 = pre.getText().toString();
                    char s4 = s3.charAt(s3.length()-2);
                    s3= s3.substring(0,s3.length()-3);
                    p1 = Float.parseFloat(s3);
                    p2 = Float.parseFloat(ed.getText() + "");
                    if(s4 == '+' || s4 == '-'){
                        p2=p2/100;
                        p2=p2*p1;
                    }
                    if(s4 == '*' || s4 == '/'){
                        p2=p2/100;
                    }
                    switch (s4){
                        case '+': v1 = p1+p2;
                            break;
                        case '-': v1 = p1-p2;
                            break;
                        case '*': v1 = p1*p2;
                            break;
                        case '/': v1 = p1/p2;
                            break;
                    }
                    ed.setText(p2 + "");
                    flag= "%";
                }
            }
        });
        sol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ed.getText().toString().equals("")){
                    Context context = getApplicationContext();
                    CharSequence text = "Enter the Number!";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                if(pre.getText().toString().equals("") && !ed.getText().toString().isEmpty()){
                    Context context = getApplicationContext();
                    CharSequence text = "Enter the Operation!";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                else if(!ed.getText().toString().isEmpty() && !pre.getText().toString().isEmpty()){
                    v2 = Float.parseFloat(ed.getText() + "");
                    if(v2 == 0 && flag == "/"){
                        Context context = getApplicationContext();
                        CharSequence text = "Divide By 0 not possible!";
                        int duration = Toast.LENGTH_SHORT;
                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }
                    else if(ispressed == false){
                        switch(flag){
                            case "+" : result = v1 + v2;
                                pre.setText(pre.getText() + "" + ed.getText());
                                break;
                            case "-" : result = v1 - v2;
                                pre.setText(pre.getText() + "" + ed.getText());
                                break;
                            case "*" : result = v1 * v2;
                                pre.setText(pre.getText() + "" + ed.getText());
                                break;
                            case "/" : result = v1 / v2;
                                pre.setText(pre.getText() + "" + ed.getText());
                                break;
                            case "%" : result = v1;
                                pre.setText(pre.getText() + "" + ed.getText());
                                break;
                        }
                        ed.setText("" + result);
                        ispressed=true;
                    }
                }
            }
        });
        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed.setText("");
                pre.setText("");
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = ed.getText().toString();
                if(s.equals(""))
                    ed.setText("");
                else{
                    ed.setText(s.substring(0,s.length()-1));
                }

            }
        });

    }
}
