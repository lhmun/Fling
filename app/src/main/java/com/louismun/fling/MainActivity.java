package com.louismun.fling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CheckBox cbName, cbEmail, cbNumber, cbLinkedIn, cbTwitter, cbFacebook, cbInstagram;
    private Button btnSend;
    private EditText etName, etNumber, etEmail, etLinkedIn, etFacebook, etInstagram, etTwitter;
    private ImageButton imgFacebook, imgInstagram, imgTwitter, imgLinkedIn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        cbFacebook = (CheckBox) findViewById(R.id.cbFacebook);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupButtons();
        addListenerOnButton();

    }

    public void setupButtons(){
        imgFacebook = (ImageButton) findViewById(R.id.imgFacebook);
        imgInstagram = (ImageButton) findViewById(R.id.imgInstagram);
        imgTwitter = (ImageButton) findViewById(R.id.imgTwitter);
        imgLinkedIn = (ImageButton) findViewById(R.id.imgLinkedIn);
        cbFacebook = (CheckBox) findViewById(R.id.cbFacebook);
        cbInstagram = (CheckBox) findViewById(R.id.cbInstagram);
        cbTwitter = (CheckBox) findViewById(R.id.cbTwitter);
        cbLinkedIn = (CheckBox) findViewById(R.id.cbLinkedIn);
        buttonSetupOnClick(cbFacebook, imgFacebook);
        buttonSetupOnClick(cbInstagram, imgInstagram);
        buttonSetupOnClick(cbTwitter, imgTwitter);
        buttonSetupOnClick(cbLinkedIn, imgLinkedIn);


    }

    public void buttonSetupOnClick(final CheckBox checkbox, final ImageButton imagebutton){
        checkbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(imagebutton.getVisibility() != View.VISIBLE)
                    imagebutton.setVisibility(View.VISIBLE);
                else
                    imagebutton.setVisibility(View.GONE);
            }
        });
    }

    public void addListenerOnButton(){
        cbName = (CheckBox) findViewById(R.id.cbName);
        cbEmail = (CheckBox) findViewById(R.id.cbEmail);
        cbNumber = (CheckBox) findViewById(R.id.cbNumber);

        etName = (EditText) findViewById(R.id.etName);
        etNumber = (EditText) findViewById(R.id.etNumber);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etLinkedIn = (EditText) findViewById(R.id.etLinkedIn);
        etFacebook = (EditText) findViewById(R.id.etFacebook);
        etInstagram = (EditText) findViewById(R.id.etInstagram);
        etTwitter = (EditText) findViewById(R.id.etTwitter);
        btnSend = (Button) findViewById(R.id.btnSend);


        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer result = new StringBuffer();
                if (cbName.isChecked()) {
                        result.append("\nName: "+etName.getText().toString());
                    }
                if (cbEmail.isChecked()) {
                    result.append("\nEmail: "+etEmail.getText().toString());
                }
                if (cbNumber.isChecked()) {
                    result.append("\nPhone: "+etNumber.getText().toString());
                }

                if (cbLinkedIn.isChecked()) {
                    result.append("\nLinkedIn: "+etLinkedIn.getText().toString());
                }

                if (cbTwitter.isChecked()) {
                    result.append("\nTwitter: "+etTwitter.getText().toString());
                }

                if (cbFacebook.isChecked()) {
                    result.append("\nFacebook: "+etFacebook.getText().toString());
                }

                if (cbInstagram.isChecked()) {
                    result.append("\nInstagram: "+etInstagram.getText().toString());;
                }

                Toast.makeText(MainActivity.this, result.toString().trim(), Toast.LENGTH_LONG).show();

            }
        });


    }


}
