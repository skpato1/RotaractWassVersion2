package rotaract.ayedi.wass.rotaractwassversion.RotaractClubs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import rotaract.ayedi.wass.rotaractwassversion.R;

public class PaysAfriqueActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pays_afrique);
        final ListView mListView;
        String[] bled = new String[]{
                "Tunisie", "Algerie", "Maroc", "Angola", "Cameroon", "Nigeria",
                "Senegal", "Cote d'hivoire"};


        Bundle bundle = getIntent().getExtras();
        if(bundle!=null)

            {
                bundle.getString("myValue");
                mListView = (ListView) findViewById(R.id.listView);

                //android.R.layout.simple_list_item_1 est une vue disponible de base dans le SDK android,
                //Contenant une TextView avec comme identifiant "@android:id/text1"

                final ArrayAdapter<String> adapter = new ArrayAdapter<String>(PaysAfriqueActivity.this,
                        android.R.layout.simple_list_item_1, bled);
                mListView.setAdapter(adapter);
                mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Intent intent=new Intent(PaysAfriqueActivity.this,RotaractAfriqueActivity.class);
                        intent.putExtra("key1",mListView.getItemAtPosition(i).toString());
                        startActivity(intent);
                    }
                });
                mListView.setAdapter(adapter);



            }


        }
    }

