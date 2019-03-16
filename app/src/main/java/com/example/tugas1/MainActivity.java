package com.example.tugas1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtnama, txtnpm, txtttl, txtalamat, txthobi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnama = (TextView) findViewById(R.id.txtnama);
        txtnama.setText("Nama   : Anggi Raka Siwi");

        txtnpm = (TextView) findViewById(R.id.txtnpm);
        txtnpm.setText("NPM : 16411050");

        txtttl = (TextView) findViewById(R.id.txtttl);
        txtttl.setText("TTL : Bandar Lampung, 21 Juli 1998");

        txtalamat = (TextView) findViewById(R.id.txtalamat);
        txtalamat.setText("Alamat   : Jln. Patimura Gang Singgalang No.19 TBU");

        txthobi = (TextView) findViewById(R.id.txthobi);
        txthobi.setText("Hobi   : Mendengarkan KPOP, Menonton Drakor");

    }
}
