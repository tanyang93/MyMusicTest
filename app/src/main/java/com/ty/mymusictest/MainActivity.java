package com.ty.mymusictest;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

@SuppressWarnings("unused")
public class MainActivity extends Activity implements View.OnClickListener{

    private final String start = "start";
    private final String stop = "stop";
    private final String add = "add";
    private final String remove = "remove";
    private final String pause = "pause";


    Button btnstart;
    Button btnstop;
    Button btnpause;
    Button btnadd;
    Button btnremove;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MediaUtil.getInstance().setContext(getApplicationContext());
        initView();
        initEvent();
    }

    private void initView(){
        btnstart = (Button) findViewById(R.id.start);
        btnadd = (Button) findViewById(R.id.add);
        btnpause = (Button) findViewById(R.id.pause);
        btnremove = (Button) findViewById(R.id.remove);
        btnstop = (Button) findViewById(R.id.stop);
    }

    private void initEvent(){
        btnstart.setOnClickListener(this);
        btnadd.setOnClickListener(this);
        btnpause.setOnClickListener(this);
        btnremove.setOnClickListener(this);
        btnstop.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.start:
                MediaUtil.getInstance().play(start,"929.mp3");
                break;
            case R.id.stop:
                MediaUtil.getInstance().stop(start);
                break;
            case R.id.pause:
                MediaUtil.getInstance().pause(start);
                break;
            case R.id.remove:
                break;
            case R.id.add:

                break;
        }
    }
}
