package com.edu.app.ckcc.hotelreservation;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by se7en on 4/12/18.
 */

public class AdapterActivity extends RecyclerView.Adapter<AdapterActivity.ViewHolder> {

    private List<Todo>todos;
    //public AdapterActivity(List<Todo>todos){
      //  this.todos=todos;
   // }

    public AdapterActivity(List<Todo> todos) {
        this.todos=todos;
    }

    //public AdapterActivity(List<Todo> allTodos) {
    //}


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) { //function build viewholder
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_single_view,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Todo todo = todos.get(position);

        holder.tvName.setText(todos.get(position).getName());
        holder.tvDesc.setText(todos.get(position).getDesc());
    }

    @Override
    public int getItemCount() {

        return todos.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvName, tvDesc;

        public ViewHolder(View itemview) {
            super(itemview);

            tvName=itemview.findViewById(R.id.tv_name);
            tvDesc=itemview.findViewById(R.id.tv_desc);
        }
    }
}
