//Mathew Anderson, n01436706
package mathew.anderson.n01436706;

import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

public class MathewActivity extends MenuClass {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathew);

        Toolbar toolbar = findViewById(R.id.theToolbar);
        setSupportActionBar(toolbar);





        Button btnOpen = (Button) findViewById(R.id.btnOpen);
        //register the button with an event listener
        btnOpen.setOnClickListener(new View.OnClickListener()
        { //anonymous class
            //implement your event handler method
            public void onClick(View v) {
                EditText editText = findViewById(R.id.txtName);
                String text = editText.getText().toString();
                Long num;

                if (!text.isEmpty()) {
                    num = Long.valueOf(text);
                } else {
                    num = -1000L;
                }

                Intent intent = new Intent(MathewActivity.this, MathewActivity2.class);
                intent.putExtra("key", num);

                CharSequence clicked = getString(R.string.snk);
                CharSequence start = getString(R.string.start);
                Snackbar.make(findViewById(android.R.id.content), clicked, Snackbar.LENGTH_INDEFINITE)
                        .setAction(start, new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                startActivity(intent);
                            }
                        })
                        .show();
            }


        });


    }

}