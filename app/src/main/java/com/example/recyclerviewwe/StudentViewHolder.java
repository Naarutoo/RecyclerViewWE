package com.example.recyclerviewwe;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class StudentViewHolder extends RecyclerView.ViewHolder {
    private TextView mTvName;
    private TextView mTvAge;
    private TextView mTvRollNo;
    public StudentViewHolder(@NonNull  View itemView) {
        super(itemView);
        iniViews();
    }
    private void iniViews(){
mTvName = itemView.findViewById(R.id.tvName);
mTvAge = itemView.findViewById(R.id.tvAge);
mTvRollNo = itemView.findViewById(R.id.tvRollNo);

    }
    public void setData(Student student){
        mTvName.setText(student.getName());
        mTvAge.setText(student.getAge()+"");
        mTvRollNo.setText(student.getRollNo());
    }
}
