package com.example.cinq_mai_dofus.presentation.view;


import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.cinq_mai_dofus.R;
import com.example.cinq_mai_dofus.presentation.model.Arme;

import java.io.Serializable;
import java.util.List;

import static androidx.core.content.ContextCompat.startActivity;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    private List<Arme> values;

    private Context context;
    private ImageView imageView;
    public static Arme arme;



    class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        TextView txtHeader;
        TextView txtFooter;
        View layout;



        ViewHolder(View v) {
            super(v);
            layout = v;
            txtHeader = (TextView) v.findViewById(R.id.firstLine);
            txtFooter = (TextView) v.findViewById(R.id.secondLine);
            imageView = (ImageView) v.findViewById(R.id.icon_arme);

        }
    }

    public void add(int position, Arme item) {
        values.add(position, item);
        notifyItemInserted(position);
    }

    public void remove(int position) {
        values.remove(position);
        notifyItemRemoved(position);
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public ListAdapter(List<Arme> myDataset, Context context) {
        values = myDataset;
        this.context = context;

    }

    // Create new views (invoked by the layout manager)
    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v =  inflater.inflate(R.layout.row_layout, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

        final Arme current = values.get(position);

        // arme = ArmeActivity.listArme.get(position);

        holder.txtHeader.setText(current.getName());  //il ne va etre affiché que le nom et l'url
        // ici il sera possible de rajouter limage ou dautre info
        holder.txtFooter.setText(current.getDescription());




        Glide.with(context).load(current.getImgUrl()).fitCenter().into(imageView);




        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ArmeActivity.ArmeContext, ArmeDetailActivity.class);
                intent.putExtra("Details", current);
                startActivity(ArmeActivity.ArmeContext,intent,null);




            }
        });




    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return values.size();
    }

}
