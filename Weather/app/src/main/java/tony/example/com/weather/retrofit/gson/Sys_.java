package tony.example.com.weather.retrofit.gson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Tony on 11/20/2017.
 */

public class Sys_ {

    @SerializedName("pod")
    @Expose
    private String pod;

    /**
     *
     * @return
     *     The pod
     */
    public String getPod() {
        return pod;
    }

    /**
     *
     * @param pod
     *     The pod
     */
    public void setPod(String pod) {
        this.pod = pod;
    }

    public Sys_ withPod(String pod) {
        this.pod = pod;
        return this;
    }

}
