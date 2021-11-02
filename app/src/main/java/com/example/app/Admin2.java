package com.example.app;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

public class Admin2 extends AppCompatActivity {

    String[] adminArray = {"Admin Name1", "Admin Name2", "Admin Name3"};
    private ImageButton button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin2);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.admin_list, adminArray);
        ListView listView = (ListView) findViewById(R.id.adminList);
        listView.setAdapter(adapter);

        button1 = (ImageButton) findViewById(R.id.imageButtonEdit);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityAdmin5();
            }
        });

        button2 = (ImageButton) findViewById(R.id.imageButtonDel);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Admin2.this);
                builder.setCancelable(true);
                builder.setMessage("Do you permanently want to delete the selected users?");
                builder.setPositiveButton("Confirm",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                builder.setNegativeButton(android.R.string.cancel,
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });
    }
    public void openActivityAdmin5() {
        Intent intent = new Intent(this, Admin5.class);
        startActivity(intent);
    }
}