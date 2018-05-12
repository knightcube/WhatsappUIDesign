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

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Rajat Kumar Gupta on 12/05/2018.
 */

public class CustomChatRecyclerAdapter  extends RecyclerView.Adapter<CustomChatRecyclerAdapter.ChatHolder> {

    private Context context;
    private List<String> chatNames;
    private ArrayList<String> chatDescriptionList;
    private ArrayList<String> chatDatesList;
    private SharedPreferences  prefs;
    public CustomChatRecyclerAdapter(Context context,List<String> chatNames, ArrayList<String> chatDescriptionList, ArrayList<String> chatDatesList) {
        this.context = context;
        this.chatNames = chatNames;
        this.chatDescriptionList = chatDescriptionList;
        this.chatDatesList = chatDatesList;
    }

    @NonNull
    @Override
    public ChatHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_chat,
                parent,false);

        return new ChatHolder(view);
    }

    @Override
    public void onBindViewHolder(ChatHolder holder, int position) {
        holder.chatNameText.setText(chatNames.get(position));
        holder.chatDescriptionText.setText(chatDescriptionList.get(position));
        holder.chatDateText.setText(chatDatesList.get(position));
        prefs = context.getSharedPreferences("THEME_CODE",Context.MODE_PRIVATE);
        if(prefs.getInt("theme_code",0)==2){
            holder.chatNameText.setTextColor(context.getResources().getColor(R.color.colorSelected));
            holder.chatDividerText.setBackgroundColor(context.getResources().getColor(R.color.colorDarkGray));
        }else{
            holder.chatNameText.setTextColor(context.getResources().getColor(R.color.colorDarkTheme));
            holder.chatDividerText.setBackgroundColor(context.getResources().getColor(R.color.colorLightGray));
        }
        if(getRandomNumber()<4){
            holder.chatDateText.setTextColor(context.getResources().getColor(R.color.colorAccent));
            holder.chatNotifsText.setVisibility(View.VISIBLE);
        }else
            holder.chatNotifsText.setVisibility(View.INVISIBLE);
        // change the icon for Windows and iPhone
        if(position==4){
            holder.chatDescriptionText.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_check, 0, 0, 0);
        }
        if(position==5){
            holder.chatDescriptionText.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_photo_camera, 0, 0, 0);
        }
    }
    private int getRandomNumber() {
        Random random = new Random();
        int x = random.nextInt(10);
        return x;
    }
    @Override
    public int getItemCount() {
        return chatDatesList.size();
    }

    public class ChatHolder extends RecyclerView.ViewHolder{

        public TextView chatNameText;
        public TextView chatDescriptionText;
        public TextView chatDateText;
        public TextView chatNotifsText;
        public TextView chatDividerText;
        public ImageView imageView;
        public ChatHolder(View itemView) {
            super(itemView);
            chatNameText = (TextView) itemView.findViewById(R.id.chat_name_txt);
            chatDescriptionText = (TextView) itemView.findViewById(R.id.chat_description);
            chatDateText = (TextView)itemView.findViewById(R.id.chat_date_txt);
            chatNotifsText = (TextView) itemView.findViewById(R.id.chat_notifs_txt);
            chatDividerText = (TextView)itemView.findViewById(R.id.chat_divider);
            imageView = (ImageView) itemView.findViewById(R.id.icon);
        }

    }

}
