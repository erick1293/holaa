package com.example.holaa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TableLayout;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

public class principalActivity extends AppCompatActivity {
    TabLayout tablayaout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);
        tablayaout =(TabLayout) findViewById(R.id.tabL);
        tablayaout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int resultado =tab.getPosition();
                switch (resultado){
                    case 0 :
                        getSupportFragmentManager().beginTransaction().replace(R.id.containerFragmento,Tab1Fragment.class,null).commit();
                        break;
                    case 1 :
                        getSupportFragmentManager().beginTransaction().replace(R.id.containerFragmento,Tab2Fragment.class,null).commit();
                        break;
                    case 2 :
                        getSupportFragmentManager().beginTransaction().replace(R.id.containerFragmento,Tab3Fragment.class,null).commit();
                        break;

                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.menuOp1:
                getSupportFragmentManager().beginTransaction().replace(R.id.containerFragmento,fragment_registrar.class,null).commit();
                return true;
            case R.id.menuOp2:
                getSupportFragmentManager().beginTransaction().replace(R.id.containerFragmento,fragment_alumnos.class,null).commit();
                return true;
            case R.id.menuOp3:
                getSupportFragmentManager().beginTransaction().replace(R.id.containerFragmento,fragment_configuraciones.class,null).commit();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}