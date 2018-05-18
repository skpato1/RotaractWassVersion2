package rotaract.ayedi.wass.rotaractwassversion.RotaractClubs;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import rotaract.ayedi.wass.rotaractwassversion.R;


public class ClubsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_clubs, container, false);
        CardView afrique,amerique_sud,amerique_nord,ASIE,OCEANIE,europe;
        afrique= (CardView) v.findViewById(R.id.afrique);
        amerique_sud= (CardView) v.findViewById(R.id.sud);
        amerique_nord= (CardView) v.findViewById(R.id.nord);
        ASIE= (CardView) v.findViewById(R.id.asie);
        europe= (CardView) v.findViewById(R.id.europe);
        OCEANIE= (CardView) v.findViewById(R.id.oceanie);


        afrique.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getActivity(),PaysAfriqueActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("myValue","Tunisie");
                i.putExtras(bundle);
                startActivity(i);
            }
        });

        amerique_sud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getActivity(),PaysAmeriqueDeSudActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("myValue1","bled1");
                i.putExtras(bundle);
                startActivity(i);

            }
        });

        amerique_nord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getActivity(),PaysAmeriqueDeNordActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("myValue2","bled2");
                i.putExtras(bundle);
                startActivity(i);
            }
        });

        ASIE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getActivity(),PaysAsieActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("myValue3","bled3");
                i.putExtras(bundle);
                startActivity(i);
            }
        });

        europe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getActivity(),PaysEuropeActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("myValue4","bled4");
                i.putExtras(bundle);
                startActivity(i);
            }
        });

        OCEANIE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getActivity(),PaysOceanieActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("myValue5","bled5");
                i.putExtras(bundle);
                startActivity(i);
            }
        });
        return v;
    }
}
