package marcusobyrne.bankingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        setTitle("");

        Bundle bundle = getIntent().getExtras();
        int ID = bundle.getInt("ID");
        String name = bundle.getString("name");
        String addressLine1 = bundle.getString("addressLine1");
        String addressLine2 = bundle.getString("addressLine2");
        int accNo = bundle.getInt("accNo");
        int PIN = bundle.getInt("PIN");
        double balance = bundle.getDouble("balance");
    }

    public void viewAccount(View view){

    }
}
