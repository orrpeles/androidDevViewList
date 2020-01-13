package com.example.listviewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    // implement array and instantiate it over viewlist
    // main issue when setting up adapter (R.layout.support_simple_spinner_dropdown_item
    // resource suggeted adding textView in separate XML in res/layout and displaying the data based on textView design settings
    // https://www.tutorialspoint.com/android/android_list_view.htm

    String[] mobileArray = {"Android","IPhone","WindowsMobile","Blackberry",
            "WebOS","Ubuntu","Windows7","Max OS X"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter i = new ArrayAdapter<String>(this, R.layout.listview, mobileArray);

        ListView mobileList = findViewById(R.id.mobileList);
        mobileList.setAdapter(i);
    }
}
