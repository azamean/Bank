package marcusobyrne.bankingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AccountInformation extends AppCompatActivity {

    TextView textName = (TextView) findViewById(R.id.textViewName);
    TextView textAddress1 = (TextView) findViewById(R.id.textViewAddress1);
    TextView textAddress2 = (TextView) findViewById(R.id.textViewAddress2);
    TextView textAccNo = (TextView) findViewById(R.id.textViewAccNo);
    TextView textPIN = (TextView) findViewById(R.id.textViewPIN);
    TextView textBalance = (TextView) findViewById(R.id.textViewBalance);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_information);
        setTitle("");


    }
}
