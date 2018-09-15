package com.example.administrator.xutilframwork;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import com.example.administrator.xutilframwork.annotion.ContentView;
import com.example.administrator.xutilframwork.annotion.ViewInject;
@ContentView(R.layout.activity_main)
public class MainActivity extends com.lythonliu.LinkBaseActivity{
    @Override
    public String getAppName(){
        return BuildConfig.APP_NAME;
    }
    public static  final String TAG="dongnao";
    @ViewInject(R.id.text)
    TextView textView;

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG,"-----> "+textView);
    }
}
