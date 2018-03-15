package com.example.lilyan.dating;

import android.location.Location;

/**
 * Created by Lilyan on 3/6/2018.
 */

public class User {

    Location prefered[];
    Location current;

    public String email;
    public String name;
    public User() {

    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
