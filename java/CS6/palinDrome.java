package CS6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.classroom.R;


class checkPalindrome{

    public String isPalindrome(String str){

        int left = 0 , right = str.length() - 1;
        while( left<right){
            if(str.charAt(left) != str.charAt(right))
            {
                return "False";

            }
            left++;
            right--;
        }
        return "True";
    }

}


public class palinDrome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_palin_drome);

        Button btn = findViewById(R.id.palindrome);
        TextView t1 =findViewById(R.id.res);

        checkPalindrome p1 = new checkPalindrome();




        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText e1 = findViewById(R.id.str);
                String text = e1.getText().toString();

                String result = p1.isPalindrome(text);
                t1.setText(result);


            }
        });
    }
}