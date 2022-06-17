package com.example.universitylocations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.example.universitylocations.databinding.ActivityMapsBinding

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

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

        // Add a marker in Sydney and move the camera
        val UOK = LatLng(6.9744, 79.9161)
        val UOC = LatLng(6.9000, 79.8588)
        val UniversityofJayawardanapura = LatLng(6.8528, 79.9036)
        val UniversityofMoratuwa = LatLng(6.7951, 79.9009)
        val UniversityofPeradeniya = LatLng(7.2549, 80.5974)
        val UOR = LatLng(5.9381, 80.5761)
        val UniversityofSabaragamuwa = LatLng(6.7146, 80.7872)
        mMap.addMarker(MarkerOptions().position(UOK).title("Marker in UOK"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(UOK))
        mMap.addMarker(MarkerOptions().position(UOC).title("Marker in UOC"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(UOC))
        mMap.addMarker(MarkerOptions().position(UniversityofJayawardanapura).title("Marker in UniversityofJayawardanapura"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(UniversityofJayawardanapura))
        mMap.addMarker(MarkerOptions().position(UniversityofMoratuwa).title("Marker in UniversityofMoratuwa"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(UniversityofMoratuwa))
        mMap.addMarker(MarkerOptions().position(UniversityofPeradeniya).title("Marker in UniversityofPeradeniya"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(UniversityofPeradeniya))
        mMap.addMarker(MarkerOptions().position(UOR).title("Marker in UOR"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(UOR))
        mMap.addMarker(MarkerOptions().position(UniversityofSabaragamuwa).title("Marker in UniversityofSabaragamuwa"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(UniversityofSabaragamuwa))
    }
}