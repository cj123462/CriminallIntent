package com.bignerdranch.android.criminallintent;

import android.app.Fragment;
import android.os.Bundle;

/**
 * Created by Alex on 29.12.2016.
 */

public class CrimeFragment extends android.support.v4.app.Fragment {
    private Crime mCrime;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        mCrime = new Crime();
    }
}
