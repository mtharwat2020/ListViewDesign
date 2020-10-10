package com.example.myapplication;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // fake data for testing
        ArrayList<TestObject> arrayList = new ArrayList<>();
        arrayList.add(new TestObject("Anooon Anooon Anooon", R.drawable.person1, 1,1500));
        arrayList.add(new TestObject("Anon.2", R.drawable.person2, 2,1450));
        arrayList.add(new TestObject("Anon.3", R.drawable.person3, 3,1400));
        arrayList.add(new TestObject("Anon.4", R.drawable.person4, 4,1350));
        arrayList.add(new TestObject("Anon.5", R.drawable.person5, 5,1300));
        arrayList.add(new TestObject("Anon.6", R.drawable.person6, 6,1260));
        arrayList.add(new TestObject("Anon.7", R.drawable.person7, 7,1250));
        arrayList.add(new TestObject("Anon.8", R.drawable.person8, 8,1230));
        arrayList.add(new TestObject("Anon.9", R.drawable.person9, 9,1210));
        arrayList.add(new TestObject("Anon.10", R.drawable.person10, 10,1200));
        arrayList.add(new TestObject("Anon.11", R.drawable.person11, 11,1190));
        arrayList.add(new TestObject("Anon.12", R.drawable.person12, 12,1170));
        arrayList.add(new TestObject("Anon.13", R.drawable.person13, 13,1160));

        arrayList.add(new TestObject("Anon.14", R.drawable.person1, 14,1150));
        arrayList.add(new TestObject("Anon.15", R.drawable.person2, 15,1140));
        arrayList.add(new TestObject("Anon.16", R.drawable.person3, 16,1130));
        arrayList.add(new TestObject("Anon.17", R.drawable.person4, 17,1100));
        arrayList.add(new TestObject("Anon.18", R.drawable.person5, 18,1090));
        arrayList.add(new TestObject("Anon.19", R.drawable.person6, 19,1080));
        arrayList.add(new TestObject("Anon.20", R.drawable.person7, 20,1070));
        arrayList.add(new TestObject("Anon.21", R.drawable.person8, 21,1060));
        arrayList.add(new TestObject("Anon.22", R.drawable.person9, 22,1050));
        arrayList.add(new TestObject("Anon.23", R.drawable.person10, 23,1040));
        arrayList.add(new TestObject("Anon.24", R.drawable.person11, 24,1030));
        arrayList.add(new TestObject("Anon.25", R.drawable.person12, 25,1020));
        arrayList.add(new TestObject("Anon.26", R.drawable.person13, 26,1000));


        ListView listView = (ListView) findViewById(R.id.list);
        CustomAdapter customAdapter = new CustomAdapter(this, arrayList);
        listView.setAdapter(customAdapter);


    }
}