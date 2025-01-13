package CS6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.classroom.R;

public class Password_program extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_password_program);

        Button btn = findViewById(R.id.login);
        EditText uname = findViewById(R.id.uname);
        EditText pwd = findViewById(R.id.passwd);

        Intent i = new Intent(Password_program.this, Welcome.class);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                String username = uname.getText().toString();
                String password = pwd.getText().toString();


                if (password.equals("pwd")) {

                    i.putExtra("Username", username);
                    startActivity(i);
                } else {

                    Toast.makeText(Password_program.this, "Incorrect password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
