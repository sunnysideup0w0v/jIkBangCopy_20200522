package com.example.jikbangcopy_20200522;

import android.os.Bundle;
import android.view.View;

import androidx.databinding.DataBindingUtil;

import com.example.jikbangcopy_20200522.databinding.ActivityDetailRoomBinding;

public class DetailRoomActivity extends BaseActivity {
    ActivityDetailRoomBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_detail_room);
        setValues();
        SetupEvents();
    }

    @Override
    public void SetupEvents() {
        binding.closeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    public void setValues() {

    }
}
