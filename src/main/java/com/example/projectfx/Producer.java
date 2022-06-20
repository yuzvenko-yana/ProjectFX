package com.example.projectfx;


import java.io.Serializable;

public class Producer implements Serializable {
    public int id_producer;
    public String name;
    public String email;

    public Producer() {
    }

    public Producer(String name, String email, int id_producer) {
        this.id_producer= id_producer;
        this.name = name;
        this.email = email;
    }

    public int getId_producer() {
        return id_producer;
    }

    public void setId_producer(int id_producer) {
        this.id_producer = id_producer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        int endIndex = this.email.indexOf("@");
        int length = this.email.substring(2, endIndex).length();
        String stars = (new String(new char[length])).replace("\0", "*");
        return this.email.substring(0, 2) + stars + this.email.substring(endIndex);
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Producer{" +
                "id_producer=" + id_producer +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
