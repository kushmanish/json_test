package com.manish.json3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

import static com.manish.json3.Json.amag;
import static com.manish.json3.Json.aplace;
import static com.manish.json3.Json.atime;

public class MainActivity extends AppCompatActivity {
   ListView lv;
    ArrayList al;
    String keys[]={"mags","cities","dates"};
    int ids[]  = {R.id.tv1,R.id.tv2,R.id.tv3};


   // String mag[]={"4.5","6.4","7.1","5.2","4.3","3.7","7.2","8.3","6.2","2.7"};
    //String cities[]={"New Delhi","Mumbai","Bangalore","Chenni","Patna","Lucknow","Hyderabad","Jaipur","Pune","Chandigarh"};
    //String dates[]={"02/06/2015","21/12/2015","04/06/2015","16/07/2015","21/05/2015","24/03/2015","31/10/2015","12/04/2015","05/06/2015","17/09/2015"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.lv);
        al = new ArrayList();

        float mag[]=amag;
        String cities[]= aplace;
        long dates[]=atime;


        for(int i=0;i<mag.length;i++)
        {
            HashMap hm = new HashMap();
            hm.put(keys[0],mag[i]);
            hm.put(keys[1],cities[i]);
            hm.put(keys[2],dates[i]);
             al.add(hm);
        }

        SimpleAdapter simpleAdapter = new SimpleAdapter(getApplicationContext(),al,R.layout.listview_item_style,keys,ids);
        lv.setAdapter(simpleAdapter);
    }
}
