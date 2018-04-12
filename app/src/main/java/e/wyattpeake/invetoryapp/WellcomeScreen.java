package e.wyattpeake.invetoryapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class WellcomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(e.wyattpeake.invetoryapp.R.layout.activity_wellcome_screen);
        Button start_The_App= findViewById(R.id.welcomScreenButton);


    }
}
