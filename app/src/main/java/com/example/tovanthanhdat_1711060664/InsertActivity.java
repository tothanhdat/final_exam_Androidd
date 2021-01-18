package com.example.tovanthanhdat_1711060664;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import java.util.Map;

public class InsertActivity extends AppCompatActivity {
    private Button btnInsert;
    private EditText MaSP, TenSP, giaSP;
    private RadioGroup loaiSPGroup;
    private Spinner thuonghieuSP;
    private RadioButton loaiSP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);

        MaSP = findViewById(R.id.txtID);
        TenSP = findViewById(R.id.txtNameProduct);
        giaSP = findViewById(R.id.txtPrice);
        thuonghieuSP = findViewById(R.id.thuonghieu);
        loaiSPGroup = findViewById(R.id.radio_group);
        btnInsert = findViewById(R.id.btnInsert);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.array_thuonghieu, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        thuonghieuSP.setAdapter(adapter);

        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String maInsert = MaSP.getText().toString();
                String nameInsert = TenSP.getText().toString();
                String priceInsert = giaSP.getText().toString();
                int selectedId = loaiSPGroup.getCheckedRadioButtonId();
                loaiSP = findViewById(selectedId);
                String categoryInsert = loaiSP.getText().toString();
                String thuongHieuInsert = thuonghieuSP.getSelectedItem().toString();

                //CONSOLE.LOG
                Log.d(maInsert, "maInsert");
                Log.d(nameInsert, "nameInsert");
                Log.d(priceInsert, "priceInsert");
                Log.d(categoryInsert, "categoryInsert");
                Log.d(thuongHieuInsert, "thuongHieuInsert");

                Intent intent = new Intent(InsertActivity.this, ListPhoneActivity.class);
                intent.putExtra("maSP", maInsert);
                intent.putExtra("tenSP", nameInsert);
                intent.putExtra("giaSP", priceInsert);
                intent.putExtra("loaiSP", categoryInsert);
                intent.putExtra("thuongHieuSP", thuongHieuInsert);
                startActivity(intent);
            }
        });
    }
}