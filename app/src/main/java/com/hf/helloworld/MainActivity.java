package com.hf.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = ((TextView) findViewById(R.id.tv1));
        mTextView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, mTextView.getText().toString(), Toast.LENGTH_SHORT).show();
    }
}
