package id.sch.smktelkom_mlg.learn.fragment1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
        implements InputFragment.IListener {
    EditText etNama;
    EditText etUmur;
    TextView tvHasil;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void doProses(String nama, String umur) {
        OutputFragment fragOut =
                (OutputFragment) getSupportFragmentManager().
                        findFragmentById(R.id.fragment2);
        fragOut.doProses(nama, umur);
    }
}
