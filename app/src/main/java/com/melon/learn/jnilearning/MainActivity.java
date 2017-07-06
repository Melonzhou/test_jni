package com.melon.learn.jnilearning;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener{

    private TextView mButton;
    private TextView mShowView;
    private JNIClass mJni;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        mButton = (TextView) findViewById(R.id.view_button);
        mShowView = (TextView) findViewById(R.id.view_show);
        mButton.setOnClickListener(this);
        mJni = new JNIClass();

    }

    @Override
    public void onClick(View view) {
        if(view == mButton){
            mShowView.setText(mJni.getNativeString());
        }
    }
}
