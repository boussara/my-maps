package com.example.mymaps

import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptor
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

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
        mMap = googleMap
        val extraMarkers: ArrayList<LatLng> = ArrayList()


        extraMarkers.add(LatLng(34.04595025000031,-6.812889330000002))
        extraMarkers.add(LatLng(34.0459318900003,-6.812878999999999))
        extraMarkers.add(LatLng(33.9977420300003,-6.849294970000001))
        extraMarkers.add(LatLng(33.4288065800004,-6.00299268))
        extraMarkers.add(LatLng(33.4286172500004,-6.00307351))
        extraMarkers.add(LatLng(33.428354060000395,-6.0030923099999995))
        extraMarkers.add(LatLng(33.428173510000384,-6.00336325))
        extraMarkers.add(LatLng(33.4280136900004,-6.003446079999999))
        extraMarkers.add(LatLng(33.42785644000038,-6.0035418300000005))
        extraMarkers.add(LatLng(33.4279184800004,-6.003374609999998))
        extraMarkers.add(LatLng(33.427919350000394,-6.0031679))
        extraMarkers.add(LatLng(33.42785223000039,-6.002971860000001))
        extraMarkers.add(LatLng(33.396240530000384,-6.08468802))
        extraMarkers.add(LatLng(33.396111570000386,-6.08486365))
        extraMarkers.add(LatLng(33.39341960000038,-6.09080054))
        extraMarkers.add(LatLng(33.39357703000039,-6.0909405))
        extraMarkers.add(LatLng(33.425138810000405,-6.005682909999998))
        extraMarkers.add(LatLng(33.43108673000039,-6.00257426))
        // Add a marker in Sydney and move the camera
       // val sydney = LatLng(33.9976735,-6.8486683)

        for (latLng in extraMarkers)
        {


            mMap.addMarker(MarkerOptions()
                .position(latLng)
                .title("Groupe Derichebourg")
                .snippet("Commune D'Oulmes")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.z))

            )
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng,16f))
        }


    }
}
