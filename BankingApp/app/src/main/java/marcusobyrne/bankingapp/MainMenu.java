package marcusobyrne.bankingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends AppCompatActivity {



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
        setContentView(R.layout.activity_main_menu);
        setTitle("");

    }

    public void viewAccount(View view){
        Intent viewAcc = new Intent(this, MainMenu.class);
        viewAcc.putExtra("ID", ID);
        viewAcc.putExtra("name", name);
        viewAcc.putExtra("addressLine1", addressLine1);
        viewAcc.putExtra("addressLine2", addressLine2);
        viewAcc.putExtra("accNo", accNo);
        viewAcc.putExtra("PIN", PIN);
        viewAcc.putExtra("balance", balance);
        startActivity(viewAcc);

    }
}
