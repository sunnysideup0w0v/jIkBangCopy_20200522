package com.example.jikbangcopy_20200522;

import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {
    public Context mContext = this;
    public abstract void SetupEvents();
    public abstract void setValues();
}
