package marcusobyrne.bankingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    private Session session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        setTitle("");
        session = new Session(this);

    }

    public void viewAccount(View view){
        Intent viewAcc = new Intent(this, AccountInformation.class);

        startActivity(viewAcc);

    }

    public void logoutClicked(){
        session.setLoggedin(false);
        Intent loggedOut = new Intent(this, MainActivity.class);
        startActivity(loggedOut);
    }

}
