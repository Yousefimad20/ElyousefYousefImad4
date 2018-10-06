package yousefimad.elyousef.com.elyousefyousefimad4;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class logcat extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logcat);

        Button toastButton = (Button)findViewById(R.id.toastButton);
        Button snackbarButton = (Button)findViewById(R.id.snackbarButton);

        toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = "PREVIOUS";
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(getApplicationContext(), message, duration).show();
            }
        });
        snackbarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View view1 = findViewById(R.id.view);
                String message = "NEXT PAGE";
                int duration = Snackbar.LENGTH_SHORT;
                showSnack(view, message, duration);
            }
        });
        Log.d("4ITI", "onStart() has executed ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4ITI", "onStart() has executed ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4ITI", "onResume() has executed ");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("4ITI", "onPause() has executed ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4ITI","onStop() has executed ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("4ITI", "onRestart() has executed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("4ITI", "onDestroy() has executed ");
    }

    public void showToast (View v)
    {
        Toast.makeText(this, "Back button was clicked ", Toast.LENGTH_LONG).show();
    }

    public void showSnack (View view, String message, int duration)
    {
        Snackbar.make(view,"Next button was clicked", Snackbar.LENGTH_LONG).show();

    }
}
