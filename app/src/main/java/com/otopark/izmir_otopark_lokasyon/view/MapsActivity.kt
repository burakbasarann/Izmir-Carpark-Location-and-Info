package com.otopark.izmir_otopark_lokasyon.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.otopark.izmir_otopark_lokasyon.R

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)


    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        val names = intent.getStringExtra("names")
        val lat = intent.getStringExtra("lat")
        val lng = intent.getStringExtra("lng")
        var zoomLevel = 16.0f
        mMap = googleMap

        // Add a marker in Sydney and move the camera
        val carParkMaps = LatLng(lat!!.toDouble(), lng!!.toDouble())
        mMap.addMarker(MarkerOptions().position(carParkMaps).title("$names"))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(carParkMaps, zoomLevel))
    }
}