package marcusobyrne.bankingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    DBHandler dbHandler;
    EditText PIN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setTitle("");



    }

    public void loginClicked(View view){

        PIN = (EditText) findViewById(R.id.enteredPIN);
        dbHandler = new DBHandler(this, null, null, 1);


    }
}
