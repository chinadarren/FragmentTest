package com.example.FragmentTest;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by leichen on 7/28/2015.
 */
public class RightFragment extends Fragment{

    public static final String TAG = "RightFragment";

    @Override
    public void onAttach(Activity activity){
        super.onAttach(activity);
        Log.d(TAG, "onAttach");
    }
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Log.d(TAG,"onCreate");
    }
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
        Log.d(TAG,"onCreateView");
            View view = inflater.inflate(R.layout.right_fragment,container,false);
        return view;
    }



}
