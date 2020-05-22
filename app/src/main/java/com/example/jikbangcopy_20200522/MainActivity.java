package com.example.jikbangcopy_20200522;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.jikbangcopy_20200522.adapters.RoomAdapter;
import com.example.jikbangcopy_20200522.databinding.ActivityMainBinding;
import com.example.jikbangcopy_20200522.datas.Room;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {
    ActivityMainBinding binding;
    List<Room> rooms = new ArrayList<>();
    RoomAdapter mRoomAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setValues();
        SetupEvents();
    }

    @Override
    public void SetupEvents() {

    }

    @Override
    public void setValues() {
        addRooms();
        mRoomAdapter = new RoomAdapter(mContext,R.layout.room_list_item,rooms);
        binding.roomListView.setAdapter(mRoomAdapter);
    }
    void addRooms(){
        rooms.add(new Room(7500, "은평구 불광동", 4, "불광동에 위치한 주택입니다."));
        rooms.add(new Room(28500, "마포구 서교동", 2, "신혼부부의 보금자리 서교동.."));
        rooms.add(new Room(35000, "종로구 안국동", 0, "안국동에 위치한 반지하 빌라입니다.."));
        rooms.add(new Room(1900, "은평구 응암동", -1, "응암동에 위치한 다세대 주택입니다."));
        rooms.add(new Room(34850, "은평구 신사동", 5, "신사동에 위치한 아파트입니다.."));
    }
}
