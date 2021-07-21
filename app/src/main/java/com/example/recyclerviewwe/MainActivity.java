package com.example.recyclerviewwe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private RecyclerView recyclerView;
private ArrayList<Student> studentList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initviews();
        buildStudentList();
        setRecyclerView();
    }

    private void initviews() {
recyclerView = findViewById(R.id.recyclerView);

    }
    private void buildStudentList(){
studentList = new ArrayList<>();
Student student1 = new Student("saurabh",24,"Emp123");
studentList.add(student1);
Student student2 = new Student("Ali", 23,"Emp234");
studentList.add(student2);

for (int i=0;i<13;i++){
    Student student = new Student("XYZ"+i,21,"Emp125");
}
    }
    private void setRecyclerView(){
        StudentAdapter studentAdapter = new StudentAdapter(studentList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(studentAdapter);
    }
}