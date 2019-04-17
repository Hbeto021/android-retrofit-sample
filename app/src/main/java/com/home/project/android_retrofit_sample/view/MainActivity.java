package com.home.project.android_retrofit_sample.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.home.project.android_retrofit_sample.R;
import com.home.project.android_retrofit_sample.data.webdata.RetrofitConfig;
import com.home.project.android_retrofit_sample.domain.model.City;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    private TextView tvName, tvState, tvCountry;
    private Button btnGetService;
    private final String LOG = "RESPONSE_SERVICE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myFindById();
        myClickItens();
    }

    private void myFindById() {
        tvName = findViewById(R.id.tv_name);
        tvState = findViewById(R.id.tv_state);
        tvCountry = findViewById(R.id.tv_country);
        btnGetService = findViewById(R.id.btn_get_service);
    }

    private void myClickItens() {
        btnGetService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getApiService();
            }
        });
    }

    private void getApiService() {
        Call<City> call = new RetrofitConfig().getApiService().getService();
        call.enqueue(new Callback<City>() {
            @Override
            public void onResponse(Call<City> call, Response<City> response) {
                if (response.isSuccessful()) {

                    City city = response.body();

                    if (city != null) {
                        tvName.setText(city.getName());
                        tvState.setText(city.getState());
                        tvCountry.setText(city.getCountry());

                        Log.e(LOG, city.toString());
                    }

                } else {

                    Toast.makeText(MainActivity.this, "An error has ocurred.", Toast.LENGTH_SHORT).show();
                    Log.e(LOG, "An error has ocurred.");
                }
            }

            @Override
            public void onFailure(Call<City> call, Throwable t) {


                Toast.makeText(MainActivity.this, "An error has ocurred.", Toast.LENGTH_SHORT).show();
                Log.e(LOG, "An error has ocurred.");
            }
        });
    }
}
