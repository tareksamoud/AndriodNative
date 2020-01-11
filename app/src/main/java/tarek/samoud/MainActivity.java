package tarek.samoud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText username;//"tareksamoud";
    private EditText password;//"p@ssw0rd";
    private TextView inscription;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button= findViewById(R.id.btn_authentifier);
        username= findViewById(R.id.txt_username);
        username= findViewById(R.id.txt_password);
        inscription=findViewById(R.id.txt_linkInscription);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuizActivity();
            }
        });

        inscription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInscriptionActivity();
            }


        });
    }

    private void openInscriptionActivity() {
        Intent intent=new Intent(this, Inscription.class);
        startActivity(intent);
    }

    private void openQuizActivity() {
        Intent intent=new Intent(this, QuizActivity.class);
        startActivity(intent);
    }
}
