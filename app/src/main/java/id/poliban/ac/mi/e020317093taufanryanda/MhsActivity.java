package id.poliban.ac.mi.e020317093taufanryanda;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MhsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mhs);
    btSend.setOnClickListener(v -> {
        Intent intent = new Intent();
        String dataNim = etNim.getText().toString();
        String dataNama = etNama.getText().toString();
        String dataAlamat = etAlamat.getText().toString();
        String dataTelp = etTelp.getText().toString();
        intent.putExtra("MhsActivity",dataNim);
        intent.putExtra("MhsActivity",dataNama);
        intent.putExtra("MhsActivity",dataAlamat);
        intent.putExtra("MhsActivity",dataTelp);
        setResult(Activity.RESULT_OK, intent);
        finish();
            }
    );
    }

    EditText etNim = findViewById(R.id.etNim);
    EditText etNama = findViewById(R.id.etNama);
    EditText etAlamat = findViewById(R.id.etAlamat);
    EditText etTelp = findViewById(R.id.etTelp);
    Button btSend = findViewById(R.id.btSend);




}
