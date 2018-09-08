package iics.columna.christianjoseph.greaternumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            Button button = (Button) findViewById(R.id.button);
            button.setOnClickListener (new View.OnClickListener() {

                @Override

                public void onClick (View v){
                    EditText editText = (EditText) findViewById(R.id.editText);
                    EditText editText2 = (EditText) findViewById(R.id.editText2);
                    TextView textView3 = (TextView) findViewById(R.id.textView3);

                    int x = Integer.parseInt(editText.getText().toString());
                    int y = Integer.parseInt(editText2.getText().toString());

                        if (x > y) {
                        textView3.setText(" The greater number is " + x + ".");
                        }
                        else if (y > x) {
                        textView3.setText(" The greater number is " + y + ".");
                        }
                        else {
                        textView3.setText(x + " and" + y + " are equal.");
                        }
                    }

            });
    }
}