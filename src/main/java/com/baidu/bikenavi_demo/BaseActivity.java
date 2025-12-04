package com.baidu.bikenavi_demo;

import android.app.Activity;
import android.widget.Toast;

/**
 * Created by hexiaojiang
 * on 2025/11/26
 */
public abstract class BaseActivity extends Activity {
    protected void toast(String s) {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }
}
