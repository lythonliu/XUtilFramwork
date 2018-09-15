package com.example.administrator.xutilframwork;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Administrator on 2017/2/24 0024.
 */

public class BaseActivity  extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        InjectUtils.inject(this);
    }
}
