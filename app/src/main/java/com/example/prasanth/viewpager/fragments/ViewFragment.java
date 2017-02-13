package com.example.prasanth.viewpager.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.prasanth.viewpager.R;

public class ViewFragment extends Fragment {

    public static ViewFragment newInstance(String text,int image)
    {
        ViewFragment viewFragment=new ViewFragment();
        Bundle bundle=new Bundle();
        bundle.putString("text",text);
        bundle.putInt("image",image);
        viewFragment.setArguments(bundle);
        return viewFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater,ViewGroup viewGroup,Bundle savedInstanceState)
    {
        TextView sampleText;
        ImageView logos;
        View view=layoutInflater.inflate(R.layout.fragment_view,viewGroup,false);
        sampleText=(TextView)view.findViewById(R.id.sampleTxt);
        sampleText.setText(getArguments().getString("text"));
        logos=(ImageView)view.findViewById(R.id.image);
        logos.setBackgroundResource(getArguments().getInt("image"));
        return view;
    }

}
