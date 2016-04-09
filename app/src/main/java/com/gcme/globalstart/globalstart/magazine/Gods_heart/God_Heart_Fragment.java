package com.gcme.globalstart.globalstart.magazine.Gods_heart;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gcme.globalstart.globalstart.MainActivity;
import com.gcme.globalstart.globalstart.R;


public class God_Heart_Fragment extends Fragment {
    private ViewPager myPager;
    public God_Heart_Fragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the splash for this fragment
        View view = inflater.inflate(R.layout.blank_page, container, false);
        myPager = (ViewPager) view.findViewById(R.id.mypager);
        FragmentManager manager = getChildFragmentManager();
        myPager.setAdapter(new God_Heart_Adapter(manager));
        MainActivity.setImage();
        return view;


    }
}
