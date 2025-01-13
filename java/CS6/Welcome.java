package CS6;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.classroom.R;

public class Welcome extends AppCompatActivity {

    TextView t1; // Declare the TextView reference here

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_welcome);

        // Initialize the TextView after setContentView
        t1 = findViewById(R.id.wlcm);

        // Retrieve the "Username" extra from the Intent
        String uname = getIntent().getStringExtra("Username");

        // Append the username to the existing text
        String newstr = t1.getText().toString() + "  " + uname;

        // Update the TextView
        t1.setText(newstr);
    }
}
