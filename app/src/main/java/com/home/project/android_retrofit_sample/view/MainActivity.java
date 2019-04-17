package com.home.project.android_retrofit_sample.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.home.project.android_retrofit_sample.R;
import com.home.project.android_retrofit_sample.data.webdata.RetrofitConfig;
import com.home.project.android_retrofit_sample.domain.model.City;

import retrofit2.Call;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    private TextView tvName, tvState, tvCountry;
    private Button btnGetService;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myFindById();
    }

    private void myFindById(){
        tvName = findViewById(R.id.tv_name);
        tvState = findViewById(R.id.tv_state);
        tvCountry = findViewById(R.id.tv_country);
        btnGetService = findViewById(R.id.btn_get_service);
    }

    private void myClickItens(){
        btnGetService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }


}
