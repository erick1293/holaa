package com.example.holaa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class principalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);
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