package tony.example.com.weather.retrofit.gson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Tony on 11/20/2017.
 */

public class Clouds {

    @SerializedName("all")
    @Expose
    private long all;

    /**
     *
     * @return
     *     The all
     */
    public long getAll() {
        return all;
    }

    /**
     *
     * @param all
     *     The all
     */
    public void setAll(long all) {
        this.all = all;
    }

    public Clouds withAll(long all) {
        this.all = all;
        return this;
    }

}
