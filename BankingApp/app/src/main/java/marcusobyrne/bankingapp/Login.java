package marcusobyrne.bankingapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
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

        PIN = ((EditText) findViewById(R.id.enteredPIN));
        dbHandler = new DBHandler(this, null, null, 1);

        if(dbHandler.checkUser(PIN.getText().toString())){
            String[] userData = dbHandler.getData(PIN.getText().toString());
            Intent loggedIn = new Intent(this, MainMenu.class);
            loggedIn.putExtra("ID", userData[0]);
            loggedIn.putExtra("name", userData[1]);
            loggedIn.putExtra("addressLine1", userData[2]);
            loggedIn.putExtra("addressLine2", userData[3]);
            loggedIn.putExtra("accNo", userData[4]);
            loggedIn.putExtra("PIN", userData[5]);
            loggedIn.putExtra("balance", userData[6]);
            startActivity(loggedIn);
        }else{
            AlertDialog alertDialog = new AlertDialog.Builder(Login.this).create();
            alertDialog.setTitle("Error");
            alertDialog.setMessage("There was a problem logging in, your PIN may be incorrect. Please try again.");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
            alertDialog.show();

        }


    }
}
