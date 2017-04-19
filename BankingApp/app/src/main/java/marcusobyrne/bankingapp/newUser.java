package marcusobyrne.bankingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;

public class newUser extends AppCompatActivity {

    DBHandler dbHandler;
    EditText Name;
    EditText Address1;
    EditText Address2;
    EditText AccountNumber;
    EditText PINno;
    EditText Balance;

    //TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_user);
        Name = (EditText) findViewById(R.id.Name);
        Address1 = (EditText) findViewById(R.id.Address1);
        Address2 = (EditText) findViewById(R.id.Address2);
        AccountNumber = (EditText) findViewById(R.id.AccountNumber);
        PINno = (EditText) findViewById(R.id.PINno);
        Balance = (EditText) findViewById(R.id.Balance);
        dbHandler = new DBHandler(this, null, null, 1);
    }

    public void saveUser(View view){

    }
}
