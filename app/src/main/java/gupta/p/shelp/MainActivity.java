package gupta.p.shelp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonTrackMe,buttonActivate,buttonSafe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonTrackMe= (Button) findViewById(R.id.buttonTrackMe);
        buttonTrackMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Track.class);
                startActivity(i);
            }
        });
        buttonActivate= (Button) findViewById(R.id.buttonActivate);
        buttonSafe= (Button) findViewById(R.id.buttonSafe);
    }
}
