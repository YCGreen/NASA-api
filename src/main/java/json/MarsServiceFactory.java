package json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class MarsServiceFactory {
    public MarsService getService() {
        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-mm-dd")
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://mars-photo-api.herokuapp.com/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                .build();

        return retrofit.create(MarsService.class);
    }
}
