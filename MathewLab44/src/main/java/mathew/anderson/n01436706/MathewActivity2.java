//Mathew Anderson, n01436706
package mathew.anderson.n01436706;


import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class MathewActivity2 extends MenuClass {

    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathew2);

        Toolbar toolbar = findViewById(R.id.theToolbar);
        setSupportActionBar(toolbar);

        textview = findViewById(R.id.txtView2);
        Intent intent = getIntent();
        long num = intent.getLongExtra("key", 0);
        String number = getString(R.string.number);
        String text = number + num;
        textview.setText(text);
    }
}