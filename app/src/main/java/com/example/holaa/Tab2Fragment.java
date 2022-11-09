package com.example.holaa;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Tab2Fragment extends Fragment {

    EditText etNombre,etApellido,etEdad;
    Button btnRegTrab;
    public Tab2Fragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_tab2, container, false);
        etNombre = (EditText) v.findViewById(R.id.nombreTrabajador);
        etApellido = (EditText)  v.findViewById(R.id.apellidoTrabajador);
        etEdad = (EditText)  v.findViewById(R.id.edadTrabajador);
        btnRegTrab = (Button)  v.findViewById(R.id.btnRegTrab);
        btnRegTrab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //registrar ,enviar o base de datos
                Toast.makeText(getContext(), "registrando", Toast.LENGTH_SHORT).show();
                System.out.println("registrando!!");
            }
        });

        return v;
    }
}