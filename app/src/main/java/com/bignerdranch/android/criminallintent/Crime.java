package com.bignerdranch.android.criminallintent;

/**
 * Created by Alex on 29.12.2016.
 */

public class Crime {
    private UUID mId;
    private String mTitle;
    public Crime() {
// Generate unique identifier
        mId = UUID.randomUUID();
    }
}
