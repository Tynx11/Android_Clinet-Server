package tony.example.com.weather.retrofit.gson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Tony on 11/20/2017.
 */

public class Snow {

    @SerializedName("3h")
    @Expose
    private double _3h;

    /**
     *
     * @return
     *     The _3h
     */
    public double get3h() {
        return _3h;
    }

    /**
     *
     * @param _3h
     *     The 3h
     */
    public void set3h(double _3h) {
        this._3h = _3h;
    }

    public Snow with3h(double _3h) {
        this._3h = _3h;
        return this;
    }

}