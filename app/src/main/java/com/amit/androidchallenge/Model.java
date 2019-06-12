package com.amit.androidchallenge;

public class Model {

    private String photo;
    private String name;
    private String age;
    private String location;

    public Model(String photo, String name, String age, String location) {
        this.photo = photo;
        this.name = name;
        this.age = age;
        this.location = location;
    }


    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
