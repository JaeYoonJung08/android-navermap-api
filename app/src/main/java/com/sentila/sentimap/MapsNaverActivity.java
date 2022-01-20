package com.sentila.sentimap;

import android.app.Activity;
import android.os.Bundle;



import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


import com.naver.maps.geometry.LatLng;
import com.naver.maps.map.MapView;
import com.naver.maps.map.NaverMap;
import com.naver.maps.map.OnMapReadyCallback;
import com.naver.maps.map.overlay.Marker;

public class MapsNaverActivity extends Activity implements OnMapReadyCallback {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_naver);

        MapView mapView = findViewById(R.id.map_view);

        mapView.getMapAsync((OnMapReadyCallback) this);
    }

    @Override
    public void onMapReady(@NonNull NaverMap naverMap) {
        Marker marker = new Marker();
        marker.setPosition(new LatLng(35.14388926113559, 129.01055949708655));
        marker.setMap(naverMap);


    }


}
