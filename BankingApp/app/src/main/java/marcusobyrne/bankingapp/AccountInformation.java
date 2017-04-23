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


    Bundle bundle = getIntent().getExtras();
    int ID = bundle.getInt("ID");
    String name = bundle.getString("name");
    String addressLine1 = bundle.getString("addressLine1");
    String addressLine2 = bundle.getString("addressLine2");
    int accNo = bundle.getInt("accNo");
    int PIN = bundle.getInt("PIN");
    double balance = bundle.getDouble("balance");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_information);
        setTitle("");

        textName.setText(name);
        textAddress1.setText(addressLine1);
        textAddress2.setText(addressLine2);
        textAccNo.setText(accNo);
        textPIN.setText(PIN);
        textBalance.setText((int) balance);
    }
}
