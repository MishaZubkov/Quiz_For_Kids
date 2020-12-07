package misha.zubkov.quizforkids;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GameLevels extends AppCompatActivity implements View.OnClickListener {

    Button btn_back;

    TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gamelevels);

        //удаляет часы, время с экрана
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(this);

        //кнопки для перехода уровней - начало
        textView1 = findViewById(R.id.textView1);
        textView1.setOnClickListener(this);
        //кнопки для перехода уровней - конец




    }

    @Override
    public void onClick(View view) {
        //кнопка назад
        if(view == btn_back) {
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
        }

        //кнопка для перехода на 1 уровень - начало
        if(view == textView1) {
                Intent intent = new Intent(this, Level1.class);
                startActivity(intent);
            }
    }
        //кнопка для перехода на 1 уровень - конец


    //сиситемная конопка "Назад" начало
    @Override
    public void onBackPressed(){
        try {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        }
        catch (Exception e){
        }
    }
    //сиситемная конопка "Назад" конец
}