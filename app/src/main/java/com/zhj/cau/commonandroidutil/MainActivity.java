package com.zhj.cau.commonandroidutil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zhj.cau.commonandroidutil.utils.AsciiSortUtil;
import com.zhj.cau.commonandroidutil.viewmodel.AdModel;
import com.zhj.cau.commonandroidutil.viewmodel.EventModel;

import java.util.Map;
import java.util.TreeMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdModel adModel = new AdModel();
        String platform = "google";
        Map<String, Object> map = new TreeMap<>();
        map.put("locationId", 1);
        map.put("time", System.currentTimeMillis()/1000);
        map.put("platform", platform);

        String adsign = AsciiSortUtil.buildSign(map);
        map.put("sign", adsign);
        adModel.getAd(map);

        EventModel eventModel = new EventModel();
        Map<String, Object> map1 = new TreeMap<>();
        map1.put("time", System.currentTimeMillis()/1000);
        map1.put("sign", AsciiSortUtil.buildSign(map1));
        eventModel.getEventLogo(map1);
    }
}
