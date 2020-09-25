package com.yuni.tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView txtTampil;
    EditText edtNpm, edtNama, edtTtl, edtAlamat, edtHobi, edtNamaAyah, edtNamaIbu;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTampil = (TextView) findViewById(R.id.txtBiodata);

        edtNpm = (EditText) findViewById(R.id.edtNpm);
        edtNama = (EditText) findViewById(R.id.edtNama);
        edtTtl = (EditText) findViewById(R.id.edtTtl);
        edtAlamat = (EditText) findViewById(R.id.edtAlamat);
        edtHobi = (EditText) findViewById(R.id.edtHobi);
        edtNamaAyah = (EditText) findViewById(R.id.edtNamaAyah);
        edtNamaIbu = (EditText) findViewById(R.id.edtNamaIbu);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strNpm = edtNpm.getText().toString();
                String strNama = edtNama.getText().toString();
                String strTtl = edtTtl.getText().toString();
                String strAlamat = edtAlamat.getText().toString();
                String strHobi = edtHobi.getText().toString();
                String strNamaAyah = edtNamaAyah.getText().toString();
                String strNamaIbu = edtNamaIbu.getText().toString();

                txtTampil.setText(strNpm + "\n" + strNama + "\n" + strTtl + "\n" + strAlamat + "\n" + strHobi + "\n" + strNamaAyah + "\n" + strNamaIbu);

            }
        });
    }
}