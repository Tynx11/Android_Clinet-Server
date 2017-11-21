package tony.example.com.recyclerhw1.screen.splash_screen;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import tony.example.com.recyclerhw1.R;
import tony.example.com.recyclerhw1.screen.contact_list.EventViewListActivity;

/**
 * Created by Tony on 06.10.2017.
 */

public class SplashScreen extends AppCompatActivity {

    private final int TIME = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Handler handler = new Handler();
        handler.postDelayed(new Thread(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), EventViewListActivity.class);
                startActivity(intent);
                finish();
            }
        }),TIME);

    }
}
