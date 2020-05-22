package com.example.jikbangcopy_20200522.datas;

import java.io.Serializable;

public class Room implements Serializable {
    private int price; // 만원단위로 기록. 15000 > 1억 5천
    private String address;  // 구와 동
    private int floor; // 층수 => 양수: 층수. 0 => 반지하 -2 => 지하2층
    private String desc;

    public String getFormattedFloor(){
        if(this.floor>0){
            return this.floor+"층";
        } else if (this.floor<0){
            return String.format("지하 %d층",-this.floor);
        } else {
            return "반지하";
        }
    }


    public String getFormatted() {
        if(price<10000){
            // 1,000 2,000
            return String.format("%,d",this.price);

        } else {
            //2억 8,500과 같이 가공
            return String.format("%d억 %,d",(this.price/10000),(this.price%10000));
        }
    }

    public Room(int price, String address, int floor, String desc) {
        this.price = price;
        this.address = address;
        this.floor = floor;
        this.desc = desc;
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
