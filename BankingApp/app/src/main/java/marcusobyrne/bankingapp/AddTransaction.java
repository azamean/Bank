package marcusobyrne.bankingapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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

        Description = (EditText) findViewById(R.id.editTextDecription);
        Amount = (EditText) findViewById(R.id.editTextAmount);

        dbHandler = new DBHandler(this, null, null, 1);

    }

    public void addTransaction(){
            Transaction transaction = new Transaction(Description.getText().toString(),
                    Double.valueOf(Amount.getText().toString()));

            dbHandler.addTransaction(transaction);


/*
            AlertDialog alertDialog = new AlertDialog.Builder(AddTransaction.this).create();
            alertDialog.setTitle("Success");
            alertDialog.setMessage("Transaction has been added successfully");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                            Intent transactionAdded = new Intent(this, MainMenu.class);
                            startActivity(transactionAdded);
                        }
                    });
            alertDialog.show();
*/

    }
}
