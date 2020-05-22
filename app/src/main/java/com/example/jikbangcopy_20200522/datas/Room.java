package com.example.jikbangcopy_20200522.datas;

public class Room {
    private int price; // 만원단위로 기록. 15000 > 1억 5천
    private String address;  // 구와 동
    private int floor; // 층수 => 양수: 층수. 0 => 반지하 -2 => 지하2층


    public Room(int price, String address, int floor) {
        this.price = price;
        this.address = address;
        this.floor = floor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
}
