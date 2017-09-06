package wildmonsters.monsterwiki;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
//import android.widget.ArrayAdapter;
//import android.widget.ListView;

//import java.util.ArrayList;
//import java.util.List;

public class MainActivity extends AppCompatActivity {

/*ListView listView;
    List list = new ArrayList();
    ArrayAdapter adapter;*/

ArrayList<listeMonstre> arrayofliste;
    listeMonstreAdapter adapter;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayofliste = new ArrayList<listeMonstre>();
        adapter = new listeMonstreAdapter(this, arrayofliste);
        lv = (ListView)findViewById(R.id.list_monster);
        lv.setAdapter(adapter);

        listeMonstre monstre1 = new listeMonstre("Pikachu", "Eclair");
        listeMonstre monstre2 = new listeMonstre("Pikachu", "Eclair");
        listeMonstre monstre3 = new listeMonstre("Pikachu", "Eclair");
        listeMonstre monstre4 = new listeMonstre("Pikachu", "Eclair");
        listeMonstre monstre5 = new listeMonstre("Pikachu", "Eclair");
        listeMonstre monstre6 = new listeMonstre("Pikachu", "Eclair");

        adapter.add(monstre1);
        adapter.add(monstre2);
        adapter.add(monstre3);
        adapter.add(monstre4);
        adapter.add(monstre5);
        adapter.add(monstre6);

/*listView = (ListView)findViewById(R.id.list_view);

        list.add("Test");
        list.add("Test2");
        list.add("Test3");
        list.add("Test4");
        list.add("Test5");
        list.add("Test6");
        list.add("Test7");
        list.add("Test8");
        list.add("Test9");
        list.add("Test");
        list.add("Test");
        list.add("Test");
        list.add("Test");
        list.add("Test");

        adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);*/

    }
}


