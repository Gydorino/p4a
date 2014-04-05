package com.example.pie4all_gydo_broos;

import java.util.ArrayList;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class MainFragment extends Fragment implements OnItemClickListener{

	
	 private Spinner soorttaartmenu;
	
	 public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState )
	 {
		 View v = inflater.inflate( R.layout.fragment_main, container, false );
		 
	     Spinner dropdown = (Spinner)v.findViewById(R.id.categorie);
	     String[] categorie = new String[]{"Kies uw categorie...", "Vlaaien", "Cakes", "Bruidstaarten", "Verjaardagstaarten"};
	     dropdown.setOnItemClickListener(this);
	     
         Spinner soorttaartmenu = (Spinner)v.findViewById(R.id.soorttaart);
         soorttaartmenu.setOnItemClickListener(this);
	     
	     ArrayAdapter<String> categorieadapter = new ArrayAdapter<String>(v.getContext(),android.R.layout.simple_spinner_item, categorie);
	     dropdown.setAdapter(categorieadapter);
	     
	    
		 return v;
	 }

	public void onItemClick(AdapterView<?> arg0, View v, int position, long arg3) {
		if(arg0.getId() == R.id.dropdown){
			String[] soort;
			ArrayAdapter<String> soortadapter;
			switch(position){
				case 0 :
				
					break;	
			
				case 1:
					soort = new String[]{"Kersenvlaai", "Perzikvlaai"};
				    soortadapter = new ArrayAdapter<String>(v.getContext(),android.R.layout.simple_spinner_item, soort);
				    soorttaartmenu.setAdapter(soortadapter);
			        break;
			    case 2:
					soort = new String[]{"Boerencake", "Chocoladecake"};
				    soortadapter = new ArrayAdapter<String>(v.getContext(),android.R.layout.simple_spinner_item, soort);
				    soorttaartmenu.setAdapter(soortadapter);			        
			        break;
			    case 3:
					soort = new String[]{"Chocolade bruidstaart", "Aardbei bruidstaart"};
				    soortadapter = new ArrayAdapter<String>(v.getContext(),android.R.layout.simple_spinner_item, soort);
				    soorttaartmenu.setAdapter(soortadapter);			        
			        break;
			    case 4:
					soort = new String[]{"Slagroomtaart", "Kwarktaart"};
				    soortadapter = new ArrayAdapter<String>(v.getContext(),android.R.layout.simple_spinner_item, soort);
				    soorttaartmenu.setAdapter(soortadapter);			        
			        break;			        
			
			}
		}
		
		else {
			// TO-DO
		}
	}
}
