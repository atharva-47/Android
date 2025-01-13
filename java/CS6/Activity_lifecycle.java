package CS6;

import android.health.connect.datatypes.units.Length;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.classroom.R;

public class Activity_lifecycle extends AppCompatActivity {

    String tag = "Activity LifeCycle";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lifecycle);
        Toast.makeText(this, "Oncreate", Toast.LENGTH_SHORT).show();
        Log.d(tag,"Oncreate initiated");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag,"OnStart initiated");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(tag,"OnRestart initiated");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag,"OnPause initiated");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag,"OnResume initiated");
        Toast.makeText(this, "Onresume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(tag,"OnStop initiated");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(tag,"OnDestroy initiated");
    }
}