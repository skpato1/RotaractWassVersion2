package rotaract.ayedi.wass.rotaractwassversion;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.TextView;

import rotaract.ayedi.wass.rotaractwassversion.RotaractClubs.ClubsFragment;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;
    FrameLayout frame;
    FragmentTransaction ft;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
      // = getFragmentManager().beginTransaction();
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    HomeFragment home = new HomeFragment();
                    ft = getFragmentManager().beginTransaction();
                    ft.replace(R.id.container, home);
                    ft.commit();
                    return true;
                case R.id.navigation_dashboard:
                    HistoriqueFragment history = new HistoriqueFragment();
                    ft = getFragmentManager().beginTransaction();
                    ft.replace(R.id.container, history);
                    ft.commit();
                    return true;
                case R.id.navigation_notifications:
                    ClubsFragment clubs = new ClubsFragment();
                    ft = getFragmentManager().beginTransaction();
                    ft.replace(R.id.container, clubs);
                    ft.commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HomeFragment home = new HomeFragment();
        ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.container, home);
        ft.commit();
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
