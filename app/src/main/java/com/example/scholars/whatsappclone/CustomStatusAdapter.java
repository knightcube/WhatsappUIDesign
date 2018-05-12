package com.example.scholars.whatsappclone;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Rajat Kumar Gupta on 25-03-2018.
 */

public class CustomStatusAdapter extends RecyclerView.Adapter<CustomStatusAdapter.StatusHolder> {

    private Context context;
    private SharedPreferences prefs;

    public CustomStatusAdapter(Context context) {
        this.context = context;
        prefs = context.getSharedPreferences("THEME_CODE",Context.MODE_PRIVATE);
    }

    @NonNull
    @Override
    public StatusHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.status_item_layout, parent,false);
        return new StatusHolder(view);
    }

    @Override
    public void onBindViewHolder(StatusHolder holder, int position) {

        holder.userName.setText("Rajat Kumar Gupta");
        holder.statusTime.setText("5 minutes ago");
        if(prefs.getInt("theme_code",0)==2){
            holder.userName.setTextColor(context.getResources().getColor(R.color.colorSelected));
        }else{
            holder.userName.setTextColor(context.getResources().getColor(R.color.colorDarkTheme));
        }
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    class StatusHolder extends RecyclerView.ViewHolder{

        ImageView statusImage;
        TextView userName,statusTime;

        public StatusHolder(View itemView) {
            super(itemView);
            statusImage = itemView.findViewById(R.id.status_image);
            userName = itemView.findViewById(R.id.user_name);
            statusTime = itemView.findViewById(R.id.status_time);
        }
    }
}
