package marcusobyrne.bankingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class AddTransaction extends AppCompatActivity {


    DBHandler dbHandler;
    EditText Description;
    EditText Amount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_transaction);
        setTitle("");

    }

    public void addTransaction(){

    }
}
