package tarek.samoud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Inscription extends AppCompatActivity {
    private Button btn_valider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);

        btn_valider= findViewById(R.id.btn_valider);

        btn_valider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                returnToMainActivity();
            }
        });
    }

    private void returnToMainActivity() {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
