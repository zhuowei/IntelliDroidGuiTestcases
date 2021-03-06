package ca.utoronto.intellidroid.guieval.listenertypesapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    private static final String TAG = "ListenerTypesApp";
    private Button mButtonWithoutIdCheck;
    private Button mButtonWithIdCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButtonWithoutIdCheck = findViewById(R.id.button_without_id_check);
        mButtonWithoutIdCheck.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                logInfo("Button without ID clicked");
            }
        });
        mButtonWithIdCheck = findViewById(R.id.button_with_id_check);
        mButtonWithIdCheck.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (v.getId() == R.id.button_with_id_check) {
                    logInfo("Button with ID check clicked");
                }
            }
        });
    }

    // referenced by android:onClick attribute in XML
    public void buttonXmlClicked(View v) {
        logInfo("XML button clicked");
    }

    public static void logInfo(String msg) {
        Log.i(TAG, msg);
    }
}
