    package com.example.uasberita;

    import android.content.Intent;
    import android.os.Bundle;
    import android.view.View;
    import android.widget.ArrayAdapter;
    import android.widget.Button;
    import android.widget.EditText;
    import android.widget.Spinner;
    import android.widget.TextView;

    import androidx.appcompat.app.AppCompatActivity;
    import androidx.fragment.app.DialogFragment;


    public class cariData extends AppCompatActivity{
        EditText tanggal;
        Spinner spnnr;
        Button sbmtButton;
        TextView usiaUser;
        int usia;
        public static final String MESSAGE_EXTRA = "MESSAGE_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cari_data);

        tanggal = findViewById(R.id.tgl_lahir);
        spnnr = findViewById(R.id.spinner);
        sbmtButton = findViewById(R.id.btn_submit);
        usiaUser = findViewById(R.id.txt_umur);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.kategori_berita, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        if (spnnr != null){
            spnnr.setAdapter(adapter);
        }
    }
//        tanggal.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//            @Override
//            public void onFocusChange(View view, boolean b) {
//                if(b){
//                    showDatePicker();
//                }
//            }
//        });
//
//        tanggal.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                showDatePicker();
//            }
//        });

//        sbmtButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(inputData.this, hasilInput.class);
//                startActivity(intent);
//            }
//        });

        public void showDatePicker(View view){
            DialogFragment dateFragment = new DatePickerFragment();
            dateFragment.show(getSupportFragmentManager(), getString(R.string.date_picker));
        }

        public void processDatePickerResult(int year, int month, int day) {
            String month_string = Integer.toString(month + 1);
            String day_string = Integer.toString(day);
            String year_string = Integer.toString(year);

            String dateMessage = day_string + "-" + month_string + "-" + year_string;
            tanggal.setText(dateMessage);

            //Untuk menampilkan usia user
            usia = (2022 - year);
            String strUmur = Integer.toString(usia);
            usiaUser.setText(strUmur);
        }

        //untuk mengintent atau memindahkan activity dari inputData ke hasilInput
        public void filterBerita(View view){
            Intent intent = new Intent(cariData.this, rvBerita.class);
            String message = spnnr.getSelectedItem().toString();
            int message2 = usia;
            intent.putExtra(MESSAGE_EXTRA, message);
            intent.putExtra("kodeUmur", message2);
            startActivity(intent);
        }
    }
//        @Override
//        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//
//        }
//
//        @Override
//        public void onNothingSelected(AdapterView<?> parent) {
//
//        }
