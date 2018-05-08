package com.edu.app.ckcc.hotelreservation;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

/**
 * Created by se7en on 4/27/18.
 */

public class HomeViewHolder extends RecyclerView.Adapter<HomeViewHolder.EventViewHolder> {
    private EventStore[] eventStores; //bos array ney event oy yerng

    public void setEventStores(EventStore[] eventStores) {
        this.eventStores = eventStores;
    }

    @Override
    public EventViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext()); //doch setContentView
        View view = layoutInflater.inflate(R.layout.view_holder_news,parent,false);
        EventViewHolder viewHolder=new EventViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(EventViewHolder holder, int position) {
                                //array
        EventStore eventStore = eventStores[position];
        holder.txttitle.setText(eventStore.getTitle());
        holder.txtdate.setText(eventStore.getDate());
        Glide.with(holder.txtimage.getContext()).load(eventStore.getImage()).into(holder.txtimage);
    }

    @Override
    public int getItemCount() {

        return eventStores.length; //event mean marn jenh pin neng
    }

    class EventViewHolder extends RecyclerView.ViewHolder{
        private TextView txttitle;
        private TextView txtdate;
        private ImageView txtimage;
        public EventViewHolder(View itemView) {
            super(itemView);

            txttitle = itemView.findViewById(R.id.txt_title);
            txtdate = itemView.findViewById(R.id.date);
            txtimage = itemView.findViewById(R.id.img_news);
        }
    }


}
