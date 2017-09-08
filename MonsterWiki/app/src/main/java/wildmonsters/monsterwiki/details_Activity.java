package wildmonsters.monsterwiki;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.view.inputmethod.InputMethodManager;

public class details_Activity extends AppCompatActivity {

    Intent intent;
    TextView nomMonstre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details2);

        int monsterID;
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if(bundle != null){
            monsterID = bundle.getInt("monsterID");
        }else{monsterID=0;}

        nomMonstre = (TextView) findViewById(R.id.monsterName);
        

        if (monsterID == 0) {
            nomMonstre.setText("Eclair");
        }

    }


}




