package com.example.intentexample1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class CustomTitleBar extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.birthday_message);
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.mytitle);

    }

}
