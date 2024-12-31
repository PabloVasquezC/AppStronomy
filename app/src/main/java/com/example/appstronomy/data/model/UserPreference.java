package com.example.appstronomy.data.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "user_preferences")
public class UserPreference {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String itemId;
    private boolean liked;

    // Getters y Setters
}