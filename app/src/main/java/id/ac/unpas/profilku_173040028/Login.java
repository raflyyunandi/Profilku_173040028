package id.ac.unpas.profilku_173040028;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    EditText editUsername;
    EditText editPassword;
    Button btnLogin;
    String username;
    String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_login);

        editUsername = (EditText) findViewById(R.id.usename);
        editPassword = (EditText) findViewById(R.id.password);

        btnLogin = (Button) findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                username = editUsername.getText().toString();
                password = editPassword.getText().toString();
                if (!username.isEmpty() || !password.isEmpty()) {
                    if (username.equalsIgnoreCase("123") && password.equalsIgnoreCase("123")) {
                        Intent i = new Intent(Login.this, MainActivity.class);
                        startActivity(i);
                    } else {
                        Toast.makeText(Login.this, "Username dan Password salah! Harap inputan yang benar", Toast.LENGTH_LONG).show();
                    }
                } else {
                    Toast.makeText(Login.this, "Inputan Tidak boleh Kosong", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
