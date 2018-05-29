package com.dxt2.databingdemoo.https;

import android.util.Log;

import com.dxt2.databingdemoo.BR;
import com.dxt2.databingdemoo.R;
import com.dxt2.databingdemoo.adapter.RecyclerCommonAdapter2;
import com.dxt2.databingdemoo.api.ApiService;
import com.dxt2.databingdemoo.bean2.Movie;
import com.dxt2.databingdemoo.databinding.ActivityDetailBinding;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 2018/5/29 0029.
 */

public class Https {
    public static void loadTextData2(final ActivityDetailBinding dataBinding, String baseUrl) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create()).build();

        try {
//            EssayCallBack call = retrofit.create(EssayCallBack.class);
//            Call<Essay> essayCall = call.getEssayList("1", "20", "0", "1");
            ApiService apiService = retrofit.create(ApiService.class);
            Call<Movie> call= apiService.getTopMovie(0, 10);

            call.enqueue(new Callback<Movie>() {
                @Override
                public void onResponse(Call<Movie> call, Response<Movie> response) {
                    Log.e("=====", "==onResponse====");
                    RecyclerCommonAdapter2 adapter = new RecyclerCommonAdapter2(response.body().getSubjects(),
                            dataBinding.getRoot().getContext(),
                            R.layout.item_recyclerview, BR.dateBean);
                    dataBinding.setAdapter(adapter);
                }

                @Override
                public void onFailure(Call<Movie> call, Throwable t) {

                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
