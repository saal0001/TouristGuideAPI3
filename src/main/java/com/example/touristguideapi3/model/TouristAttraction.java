package com.example.touristguideapi3.model;

public class TouristAttraction {
    private String name;
    private String description;


    public TouristAttraction (String name,String describtion){
        this.description = describtion;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
