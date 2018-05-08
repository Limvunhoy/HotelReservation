package com.edu.app.ckcc.hotelreservation;

import android.app.Fragment;
import android.net.wifi.hotspot2.pps.HomeSp;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by se7en on 4/8/18.
 */

public class FragmentActivity extends Fragment {
    private RecyclerView recyclerView;
    private AdapterActivity adapterActivity;


    @Nullable
    @Override   //method
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View framentview = inflater.inflate(R.layout.activity_recycle_view,container,false);

        recyclerView=framentview.findViewById(R.id.recycler_view);
        adapterActivity=new AdapterActivity(getAllTodos());

        recyclerView.setLayoutManager(new LinearLayoutManager(framentview.getContext()));
        recyclerView.setAdapter(adapterActivity);

        return framentview;
    }

    private List<Todo> getAllTodos(){
        List<Todo> todos=new ArrayList<>();

        todos.add(new Todo("Hello","Description"));
        todos.add(new Todo("Hello","Description"));
        todos.add(new Todo("Hello","Description"));
        todos.add(new Todo("Hello","Description"));
        todos.add(new Todo("Hello","Description"));
        return todos;


    }

}

