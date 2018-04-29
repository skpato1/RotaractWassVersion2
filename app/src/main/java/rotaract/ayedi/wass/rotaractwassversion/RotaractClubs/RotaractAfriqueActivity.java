package rotaract.ayedi.wass.rotaractwassversion.RotaractClubs;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import rotaract.ayedi.wass.rotaractwassversion.R;

public class RotaractAfriqueActivity extends AppCompatActivity {
    TextView tt;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotaract_afrique);
        tt=(TextView) findViewById(R.id.textView);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            tt.setText(bundle.getString("key1"));
        }
    }
}
