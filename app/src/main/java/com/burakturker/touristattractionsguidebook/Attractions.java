package com.burakturker.touristattractionsguidebook;

import java.io.Serializable;

public class Attractions implements Serializable {
    String name;
    String city;
    String presentation;
    int image;

    public Attractions(String name, String city, String presentation,int image) {
        this.name = name;
        this.city = city;
        this.presentation = presentation;
        this.image =image;
    }
}
