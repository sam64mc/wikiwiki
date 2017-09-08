package wildmonsters.monsterwiki;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import android.content.Intent;
import android.view.View;
import android.view.Menu;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.graphics.drawable.Drawable;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<listeMonstre> arrayofliste;
    listeMonstreAdapter adapter;
    ListView lv;
    String monsterID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayofliste = new ArrayList<listeMonstre>();
        adapter = new listeMonstreAdapter(this, arrayofliste);
        lv = (ListView) findViewById(R.id.list_monster);
        lv.setAdapter(adapter);

        listeMonstre monstre1 = new listeMonstre("Fire Lion", "Fire", R.drawable.fire_lion_1);
        listeMonstre monstre2 = new listeMonstre("Arch Knight", "Legend", R.drawable.arch_knight_1);
        listeMonstre monstre3 = new listeMonstre("Genie", "Magic", R.drawable.genie_1);
        listeMonstre monstre4 = new listeMonstre("Light Spirit", "Light", R.drawable.light_spirit_1);
        listeMonstre monstre5 = new listeMonstre("Metalsaur", "Metal", R.drawable.metalsaur_1);
        listeMonstre monstre6 = new listeMonstre("Panda", "Nature", R.drawable.panda_1);
        listeMonstre monstre7 = new listeMonstre("Rockilla", "Earth", R.drawable.rockilla_1);
        listeMonstre monstre8 = new listeMonstre("Thunder Eagle", "Thunder", R.drawable.thunder_eagle_1);
        listeMonstre monstre9 = new listeMonstre("Turtle", "Water", R.drawable.turtle_1);
        listeMonstre monstre10 = new listeMonstre("Tyrannoking", "Dark", R.drawable.tyrannoking_1);


        adapter.add(monstre1);
        adapter.add(monstre2);
        adapter.add(monstre3);
        adapter.add(monstre4);
        adapter.add(monstre5);
        adapter.add(monstre6);
        adapter.add(monstre7);
        adapter.add(monstre8);
        adapter.add(monstre9);
        adapter.add(monstre10);

        lv.setOnItemClickListener(new OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapter, View view, int i, long l) {
                listeMonstre item = (listeMonstre) adapter.getItemAtPosition(i);

                Intent intent = new Intent(MainActivity.this,details_Activity.class);
                intent.putExtra("monsterID", i);
                startActivity(intent);
            }

        });

    }


    }

