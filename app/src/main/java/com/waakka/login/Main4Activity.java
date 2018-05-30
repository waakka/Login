package com.waakka.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        TextView textView = (TextView) findViewById(R.id.test_text_view);

        TestDataModel.getInstance().setRetainedTextView(textView);
    }
}
