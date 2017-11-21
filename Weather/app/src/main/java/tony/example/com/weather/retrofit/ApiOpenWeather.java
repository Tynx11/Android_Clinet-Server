package tony.example.com.weather.retrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import tony.example.com.weather.retrofit.gson.AllWeather;

/**
 * Created by Tony on 11/20/2017.
 */
public interface ApiOpenWeather {

    @GET("/data/2.5/forecast")
    Call<AllWeather> getWeather(@Query("q") String city, @Query("id") String id, @Query("APPID") String appid);

}