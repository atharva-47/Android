package CS6;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.classroom.R;

public class StudResult extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_stud_result);

        String name = "Name : "+getIntent().getStringExtra("Name");
        String email = "Email : "+getIntent().getStringExtra("Email");
        String dob = "Date of Birth : "+ getIntent().getStringExtra("Dob");
        String addr = "Email : "+getIntent().getStringExtra("Address");

        TextView t1 = findViewById(R.id.resname);
        TextView t2 = findViewById(R.id.resmail);
        TextView t3  =findViewById(R.id.resdob);
        TextView t4 = findViewById(R.id.resaddr);

        t1.setText(name);
        t2.setText(email);
        t3.setText(dob);
        t4.setText(addr);



    }
}