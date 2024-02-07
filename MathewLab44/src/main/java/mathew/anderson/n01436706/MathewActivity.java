//Mathew Anderson, n01436706
package mathew.anderson.n01436706;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.net.Uri;

import com.google.android.material.snackbar.Snackbar;

public class MathewActivity extends AppCompatActivity {

    String tag = "Assignment";

    public void onResume()
    {
        super.onResume();
        Log.d(tag, "Mathew Anderson-Saavedra, n01436706");
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_dial) {

            Intent dialIntent = new Intent(Intent.ACTION_DIAL);
            dialIntent.setData(Uri.parse("tel:123456789"));
            startActivity(dialIntent);
        }

        if (item.getItemId() == R.id.action_exit) {

            finishAffinity();
        }

        if (item.getItemId() == R.id.action_help) {

            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com"));
            startActivity(browserIntent);
        }

        return false;
    }


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