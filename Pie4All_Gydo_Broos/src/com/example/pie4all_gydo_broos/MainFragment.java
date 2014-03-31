package com.example.pie4all_gydo_broos;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainFragment extends Fragment{

	 public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState )
	 {
		 View v = inflater.inflate( R.layout.fragment_main, container, false );
		 
	     Spinner dropdown = (Spinner)v.findViewById(R.id.categorie);
	     String[] items = new String[]{"Kies uw categorie...", "Vlaaien", "Cakes", "Bruidstaarten", "Verjaardagstaarten"};
	       
	     ArrayAdapter<String> adapter = new ArrayAdapter<String>(v.getContext(),android.R.layout.simple_spinner_item, items);
	     dropdown.setAdapter(adapter);
	
		 return v;
	 }
}
