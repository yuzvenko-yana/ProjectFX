package com.example.projectfx;


import java.io.Serializable;

public class Fertilize implements Serializable {
    public int id_fertilize;
    public boolean isOrganic;
    public int weight;
    public Producer producer;

    public Fertilize() {
    }

    public Fertilize(int weight, Producer producer, boolean isOrganic,int id_fertilize) {
        this.id_fertilize=id_fertilize;
        this.isOrganic = isOrganic;
        this.weight = weight;
        this.producer = producer;
    }

    public int getId_fertilize() {
        return id_fertilize;
    }

    public void setId_fertilize(int id_fertilize) {
        this.id_fertilize = id_fertilize;
    }

    public void setOrganic(boolean organic) {
        isOrganic = organic;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public boolean isOrganic() {
        return isOrganic;
    }



    public int getWeight() {
        return weight;
    }

    public Producer getProducer() {
        return producer;
    }


    @Override
    public String toString() {
        return "Fertilize{" +
                "id_fertilize=" + id_fertilize +
                ", isOrganic=" + isOrganic +
                ", weight=" + weight +
                ", producer=" + producer +
                '}';
    }
}
