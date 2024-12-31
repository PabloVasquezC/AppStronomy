package com.example.appstronomy.data.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.appstronomy.data.model.UserPreference;

import java.util.List;

@Dao
public interface UserPreferenceDao {

    @Insert
    void insert(UserPreference userPreference);

    @Query("SELECT * FROM user_preferences")
    List<UserPreference> getAllPreferences();

    @Query("SELECT * FROM user_preferences WHERE itemId = :itemId LIMIT 1")
    UserPreference getPreferenceByItemId(String itemId);
}