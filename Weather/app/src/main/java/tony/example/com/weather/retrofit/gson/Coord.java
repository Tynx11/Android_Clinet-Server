package tony.example.com.weather.retrofit.gson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Tony on 11/20/2017.
 */

public class Coord {

    @SerializedName("lon")
    @Expose
    private double lon;
    @SerializedName("lat")
    @Expose
    private double lat;

    /**
     *
     * @return
     *     The lon
     */
    public double getLon() {
        return lon;
    }

    /**
     *
     * @param lon
     *     The lon
     */
    public void setLon(double lon) {
        this.lon = lon;
    }

    public Coord withLon(double lon) {
        this.lon = lon;
        return this;
    }

    /**
     *
     * @return
     *     The lat
     */
    public double getLat() {
        return lat;
    }

    /**
     *
     * @param lat
     *     The lat
     */
    public void setLat(double lat) {
        this.lat = lat;
    }

    public Coord withLat(double lat) {
        this.lat = lat;
        return this;
    }

}