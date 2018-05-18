package rotaract.ayedi.wass.rotaractwassversion.RotaractClubs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import rotaract.ayedi.wass.rotaractwassversion.R;

public class PaysAmeriqueDeNordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pays_amerique_de_nord);
        ListView mListView;
        String[] bled = new String[]{
                "Etats Unis", "Canada", "Mexique"};


        Bundle bundle = getIntent().getExtras();
        if(bundle!=null)

        {
            bundle.getString("myValue");
            mListView = (ListView) findViewById(R.id.listView);

            //android.R.layout.simple_list_item_1 est une vue disponible de base dans le SDK android,
            //Contenant une TextView avec comme identifiant "@android:id/text1"

            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(PaysAmeriqueDeNordActivity.this,
                    android.R.layout.simple_list_item_1, bled);
            mListView.setAdapter(adapter);


        }
    }
}
