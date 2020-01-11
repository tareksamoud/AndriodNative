package tarek.samoud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class QuizActivity extends AppCompatActivity {
    private Button btn_valider;
    private ImageView imageView;

    private Random r;
    private Integer[] imageList= {
      R.drawable.img,
      R.drawable.img1,
      R.drawable.img2,
      R.drawable.img3,
      R.drawable.img4,
      R.drawable.img5,
      R.drawable.img6,
      R.drawable.img7,
      R.drawable.img8,
      R.drawable.img9,
      R.drawable.img10,
      R.drawable.img11,
      R.drawable.img12,
      R.drawable.img13,
      R.drawable.img14,
      R.drawable.img15,
      R.drawable.img16,
      R.drawable.img17,
      R.drawable.img18,
      R.drawable.img19,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        btn_valider=findViewById(R.id.btn_valider);
        imageView

        btn_valider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToScore();
            }
        });
    }

    private void goToScore() {
        Intent intent=new Intent(this, Scoor_Activity.class);
        startActivity(intent);
    }
}
