package com.jw.mynbaapplication.controller;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.jw.mynbaapplication.R;
import com.jw.mynbaapplication.model.Item;
import com.jw.mynbaapplication.view.TeamDetailActivity;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    private List<Item> items;
    private Context context;

    public ItemAdapter(Context applicationContext, List<Item> itemArrayList) {

        this.context = applicationContext;
        this.items = itemArrayList;
    }


    @Override
    public ItemAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_team, viewGroup, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(ItemAdapter.ViewHolder viewHolder, int i) {
        viewHolder.title.setText(items.get(i).getName());
        viewHolder.locationT1.setText(items.get(i).getLocationT());




        Picasso.with(context)
                .load(items.get(i).getLogoUrl())
                .placeholder(R.drawable.load)
                .into(viewHolder.imageView);
    }



    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView title;
        private TextView locationT1;
        private ImageView imageView;



        public ViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            locationT1 = (TextView) view.findViewById(R.id.locationT1);
            imageView = (ImageView) view.findViewById(R.id.logo);

            //on item click
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int pos = getAdapterPosition();
                    if (pos != RecyclerView.NO_POSITION) {
                        Item clickedDataItem = items.get(pos);
                        Intent intent = new Intent(context, TeamDetailActivity.class);
                        intent.putExtra("name", items.get(pos).getName());
                        intent.putExtra("location", items.get(pos).getLocationT());
                        intent.putExtra("logo", items.get(pos).getLogoUrl());
                        intent.putExtra("arena",items.get(pos).getArenaT());
                        intent.putExtra("simpleName",items.get(pos).getSimpleName());
                        intent.putExtra("abbreviation", items.get(pos).getAbbreviationT());
                        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(intent);
                        Toast.makeText(v.getContext(), "You clicked on " + clickedDataItem.getAbbreviationT(), Toast.LENGTH_SHORT).show();
                    }

                }

            });

        }
    }
}
