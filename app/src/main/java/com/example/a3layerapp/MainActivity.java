package com.example.a3layerapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements TeamListFragment {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void itemClicked(long id){
        View fragmentContainer = findViewByID(R.id.fragment_container);
        if (fragmentContainer != null){
            TeamDetailFragment details = new TeamDetailFragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            details.setTeam(id);
            ft.replace(R.id.fragment_container, deatils);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.addToBackStack(null);
            ft.commit();
        }
        else {
            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(DetailActivity.EXTRA_TEAM_ID, (int)id);
            startActivity(intent);
        }

    }
}
