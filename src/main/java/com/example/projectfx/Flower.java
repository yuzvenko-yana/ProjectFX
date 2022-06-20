package com.example.projectfx;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Flower implements Serializable {
    private int id;
    private String vid;
    private String color;
    private boolean polit;
    private Fertilize fertilize;
    private LocalDateTime wateringTime;

    public Flower() {
    }

    public Flower(int id, String vid, String color, boolean polit, Fertilize fertilize) {
        this.id = id;
        this.vid = vid;
        this.color = color;
        this.polit = polit;
        this.fertilize = fertilize;
        this.wateringTime = wateringTime;
    }

    public String getFormattedWateringTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-YYYY HH:mm:ss");
        return wateringTime.format(formatter);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isPolit() {
        return polit;
    }

    public Fertilize getFertilize() {
        return fertilize;
    }

    public void setFertilize(Fertilize fertilize) {
        this.fertilize = fertilize;
    }

    public LocalDateTime getWateringTime() {
        return wateringTime;
    }

    public void setWateringTime(LocalDateTime wateringTime) {
        this.wateringTime = wateringTime;
    }

    public void waterFlower() {
        wateringTime = LocalDateTime.now();
    }

    public String getVid() {
        return vid;
    }

    public void setVid(String vid) {
        this.vid = vid;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {this.color = color;}

    public Boolean getPolit() {
        return polit;
    }
    public void setPolit(boolean polit) {this.polit = polit;}

    public Fertilize getYdobr() {
        return fertilize;
    }
    public void setYdobr(Fertilize fertilize) {this.fertilize = fertilize;}

    public void replaceYdobr(Fertilize fertilize) {
        this.fertilize = fertilize;
    }



    @Override
    public String toString() {
        return "Flower{" +
                "id=" + id +
                ", vid='" + vid + '\'' +
                ", color='" + color + '\'' +
                ", polit=" + polit +
                ", fertilize=" + fertilize +
                '}';
    }
}
