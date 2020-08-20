package com.example.recycleviewdb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder> {
    private Context mContext;
    private ArrayList<ExampleItem> mExampleList;

    public ExampleAdapter(Context context, ArrayList<ExampleItem> exampleList) {
        mContext = context;
        mExampleList = exampleList;
    }

    @Override
    public ExampleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.example_item, parent, false);
        return new ExampleViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ExampleViewHolder holder, int position) {
        ExampleItem currentItem = mExampleList.get(position);
        int pvNr = currentItem.getPvNr();
        String realName = currentItem.getRealName();

        holder.mTextViewPvNr.setText(pvNr);
        holder.mTextViewRealName.setText(realName);
    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }

    public class ExampleViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextViewPvNr;
        public TextView mTextViewRealName;

        public ExampleViewHolder(View itemView) {
            super(itemView);

            mTextViewPvNr = itemView.findViewById(R.id.tv_pv_nr);
            mTextViewRealName = itemView.findViewById(R.id.tv_eka);
        }
    }
}
