package ca.utoronto.intellidroid.guieval.manybuttonsapp;

import java.util.Date;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("ManyButtonsApp", "Starting at " + new Date());
        setContentView(R.layout.activity_main);
    }

    public void buttonClicked(View v) {
        if (v.getId() == R.id.button_15_4) {
            crashApp();
        }
    }

    public static void crashApp() {
        Log.e("ManyButtonsApp", "Crashing at " + new Date());
        throw new RuntimeException("Target hit; crashing app!");
    }

}
