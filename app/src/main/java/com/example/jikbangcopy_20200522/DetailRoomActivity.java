package com.example.jikbangcopy_20200522;

import android.os.Bundle;
import android.view.View;

import androidx.databinding.DataBindingUtil;

import com.example.jikbangcopy_20200522.databinding.ActivityDetailRoomBinding;
import com.example.jikbangcopy_20200522.datas.Room;

public class DetailRoomActivity extends BaseActivity {
    ActivityDetailRoomBinding binding;
    // 이 화면에 전체적으로 사용할 방 객체.
    Room mRoom;

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
        mRoom = (Room) getIntent().getSerializableExtra("room");
        binding.priceTxt.setText(mRoom.getFormatted());
        binding.descTxt.setText(mRoom.getDesc());
        binding.addressTxt.setText(mRoom.getAddress());
        binding.floorTxt.setText(mRoom.getFormattedFloor());
    }
}
