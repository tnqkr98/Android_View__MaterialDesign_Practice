package com.example.bottomnavigationdrawer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.navigation.NavigationView;

public class BottomNavigationDrawerFragment extends BottomSheetDialogFragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_bottomsheet,container,false);

        NavigationView nav_view = view.findViewById(R.id.navigation_view);

        nav_view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch(menuItem.getItemId()){
                    case R.id.item1:
                        Toast.makeText(getContext(),"item1",Toast.LENGTH_LONG).show();
                        return true;
                    case R.id.item2:
                        Toast.makeText(getContext(),"item2",Toast.LENGTH_LONG).show();
                        return true;
                    case R.id.item3:
                        Toast.makeText(getContext(),"item3",Toast.LENGTH_LONG).show();
                        return true;
                }
                return false;
            }
        });

        return view;
    }
}
