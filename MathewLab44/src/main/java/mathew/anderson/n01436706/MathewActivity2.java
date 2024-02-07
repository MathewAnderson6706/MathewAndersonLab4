package mathew.anderson.n01436706;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class MathewActivity2 extends AppCompatActivity {

    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathew2);

        textview = findViewById(R.id.txtView2);
        Intent intent = getIntent();
        long num = intent.getLongExtra("key", 0);
        String text = "Number: " + num;
        textview.setText(text);
    }
}