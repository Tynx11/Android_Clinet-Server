package tony.example.com.weather.retrofit.gson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Tony on 11/20/2017.
 */

public class Sys {

    @SerializedName("population")
    @Expose
    private long population;

    /**
     *
     * @return
     *     The population
     */
    public long getPopulation() {
        return population;
    }

    /**
     *
     * @param population
     *     The population
     */
    public void setPopulation(long population) {
        this.population = population;
    }

    public Sys withPopulation(long population) {
        this.population = population;
        return this;
    }

}

