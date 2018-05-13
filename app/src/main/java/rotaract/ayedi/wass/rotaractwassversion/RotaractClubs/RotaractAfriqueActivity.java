package rotaract.ayedi.wass.rotaractwassversion.RotaractClubs;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import rotaract.ayedi.wass.rotaractwassversion.R;

public class RotaractAfriqueActivity extends AppCompatActivity {
    ListView lv;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotaract_afrique);
        String[] bled = new String[]{"rotaract sfax doyen", "rotaract sidi bousseid", "rotaract marsa", "rotaract lac"};
        Bundle bundle = getIntent().getExtras();
        if (bundle != null)
        {
            bundle.getString("myValue");
            lv = (ListView) findViewById(R.id.listView);
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(RotaractAfriqueActivity.this,
                    android.R.layout.simple_list_item_1, bled);
            lv.setAdapter(adapter);
        }
    }
}
