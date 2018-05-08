package com.edu.app.ckcc.hotelreservation;

import android.app.Fragment;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by se7en on 4/27/18.
 */

public class FragmentHome extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View fragmenthome = inflater.inflate(R.layout.fragment_home, container,false);
        return fragmenthome;
    }

    @Override                       //obj
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView rcyEvnet = view.findViewById(R.id.rcy_event); //call fragment_home.xml id

        //Create a Layout Manager
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL, false);
        rcyEvnet.setLayoutManager(layoutManager);

        //Create an Adapter
        HomeViewHolder adapter = new HomeViewHolder();
        EventStore[] eventStores = getEventStore();
        adapter.setEventStores(eventStores);

        rcyEvnet.setAdapter(adapter);

    }
    private EventStore[] getEventStore(){
        EventStore[] eventStores = new EventStore[5];
        eventStores[0] = new EventStore("Phnom Penh","29/4/2018","","","http://www.hotelroomsearch.net/im/hotels/asia/kh/onederz-hostel-siem-reap-1.jpg");
        eventStores[1] = new EventStore("Seim Reap","29/4/2018","","","https://images.trailfinders.com/asset/112b53/TF1125202/a%20-%20Villa%20exterior%20001_960x960.jpg");
        eventStores[2] = new EventStore("Koh Kong","29/4/2018","","","https://g.otcdn.com/imglib/hotelfotos/8/294/oc-boutique-hotel-sihanoukville-sihanouk-ville-030.jpg");
        eventStores[3] = new EventStore("Koh Rong","29/4/2018","","","https://t-ec.bstatic.com/images/hotel/max1024x768/658/65877699.jpg");
        eventStores[4] = new EventStore("Kam Pot","29/4/2018","","","https://r.bstatic.com/images/hotel/max1024x768/111/111167224.jpg");
        return eventStores;
    }
        //Temporary Event lists

}
