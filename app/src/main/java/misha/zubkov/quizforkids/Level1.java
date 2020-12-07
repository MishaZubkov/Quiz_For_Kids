package misha.zubkov.quizforkids;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class Level1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levels);

        final ImageView image_left = findViewById(R.id.image_left);
        // код который скругляет углы левой картинки
        image_left.setClipToOutline(true);

        final ImageView image_right = findViewById(R.id.image_right);
        // код который скругляет углы правой картинки
        image_right.setClipToOutline(true);

        //удаляет часы, время с экрана
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //удаляет часы, время с экрана-конец
    }
}