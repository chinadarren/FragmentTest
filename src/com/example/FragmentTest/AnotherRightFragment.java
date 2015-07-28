package com.example.FragmentTest;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by leichen on 7/28/2015.
 */
public class AnotherRightFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savdInsatanceState){

        View view = inflater.inflate(R.layout.another_right_fragment,container,false);
        return view;
    }

}
