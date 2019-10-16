package io.github.arnabmaji19.websource;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void fetchSource(View view) {
        EditText urlTextEditText = findViewById(R.id.editText);
        String url = urlTextEditText.getText().toString();
        try {
            new URL(url);
            Intent intent = new Intent(MainActivity.this, WebSourceActivity.class);
            intent.putExtra("requested_url",url);
            startActivity(intent);
        } catch (MalformedURLException e) {
            Toast.makeText(this, "Invalid URL", Toast.LENGTH_SHORT).show();
        }
    }

}
