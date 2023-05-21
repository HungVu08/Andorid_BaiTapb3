package com.example.andorid_baitapb3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {
    private Button btnJoin;
    private EditText edtName;
    private EditText edtEmail;
    private EditText edtPasswords;
    private EditText edtPhone;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        initView();
    }

    private void initView() {
        btnJoin = findViewById(R.id.btnJoin);
        edtName = findViewById(R.id.edtName);
        edtEmail = findViewById(R.id.edtEmail);
        edtPasswords = findViewById(R.id.edtPasswords);
        edtPhone = findViewById(R.id.edtPhone);

        btnJoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();

                String name = edtName.getText().toString();
                String email = edtEmail.getText().toString();
                String passwords = edtPasswords.getText().toString();
                String phone = edtPhone.getText().toString();

                UserModel userModel = new UserModel();
                userModel.setName(name);
                userModel.setEmail(email);
                userModel.setPasswords(passwords);
                userModel.setPhone(phone);

                intent.putExtra(Constants.USER,userModel);

                setResult(RESULT_OK,intent);
                finish();

            }
        });



    }
}