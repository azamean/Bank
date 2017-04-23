package marcusobyrne.bankingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class viewTransactions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_transactions);
        setTitle("");

        TextView transactions = (TextView) findViewById(R.id.textViewTransactions);
        DBHandler dbHandler = new DBHandler(this, null, null, 1);

        transactions.setText(dbHandler.databaseToString());

    }


}
