package CS6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.classroom.R;

public class Student_info extends AppCompatActivity {

    Button btn;
    EditText firstname, lastname, middlename, email, dob, address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_student_info);


        btn = findViewById(R.id.studsubmit);
        firstname = findViewById(R.id.fname);
        lastname = findViewById(R.id.lname);
        middlename = findViewById(R.id.mname);
        email = findViewById(R.id.emailid);
        dob = findViewById(R.id.Dob);
        address = findViewById(R.id.addr);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Retrieve data when button is clicked
                String Studentname = firstname.getText().toString() + " " +
                        middlename.getText().toString() + " " +
                        lastname.getText().toString();
                String em = email.getText().toString();
                String Dob = dob.getText().toString();
                String addr = address.getText().toString();


                Intent i = new Intent(getApplicationContext(), StudResult.class);
                i.putExtra("Name", Studentname);
                i.putExtra("Email", em);
                i.putExtra("Dob", Dob);
                i.putExtra("Address", addr);
                startActivity(i);
            }
        });
    }
}
