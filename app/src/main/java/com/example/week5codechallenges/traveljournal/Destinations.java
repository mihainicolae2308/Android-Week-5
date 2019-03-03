package com.example.week5codechallenges.traveljournal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.week5codechallenges.R;

import java.util.ArrayList;
import java.util.List;

public class Destinations extends AppCompatActivity {
    public static final String TRIP_NAME = "trip name";
    public static final String DESTINATION = "destination";

    private RecyclerView mRecyclerViewDestinations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destinations);

        initView();
    }

    private void initView() {
        mRecyclerViewDestinations = findViewById(R.id.recycler_view_destinations);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerViewDestinations.setLayoutManager(layoutManager);

        DestinationAdapter destinationAdapter = new DestinationAdapter(getDestinations(), Destinations.this);
        mRecyclerViewDestinations.setAdapter(destinationAdapter);
    }

    private List<Destination> getDestinations() {
        List<Destination> destinations = new ArrayList<>();
        destinations.add(new Destination("Holiday 2017", "Islands", "https://upload.wikimedia.org/wikipedia/commons/5/58/Fernando_noronha.jpg"));
        destinations.add(new Destination("Fall 2017", "Rome", "https://cdn.fodors.com/wp-content/uploads/2018/10/2_UltimateRome_TheColosseum.jpg"));
        destinations.add(new Destination("Summer 2017", "London", "https://london.ac.uk/sites/default/files/styles/promo_large/public/2018-10/london-aerial-cityscape-river-thames_1.jpg?itok=BMaDUhjp"));
        destinations.add(new Destination("Winter 2017", "Paris", "http://www.groupe-rondy.com/wp-content/uploads/2017/11/Rondy-nuit-du-bricolage-unibal.jpg"));
        destinations.add(new Destination("Spring 2018", "San Francisco", "https://cdn.britannica.com/s:700x450/85/155085-004-E7605258.jpg"));
        destinations.add(new Destination("Summer 2018", "Bucharest", "https://cdn.tourradar.com/s3/tour/750x400/99500_630b34a9.jpg"));
        return destinations;
    }

    public void addNewDestinationOnClick(View view) {
        Intent intent = new Intent(this, ManageTrip.class);
        startActivity(intent);
    }

    public void addDestination(String season, String location, String imageLocation) {
        List<Destination> currentDestinationList = getDestinations();
        currentDestinationList.add(new Destination(season, location, imageLocation));
    }

    public void editDestinationOnClick(View view) {

        mRecyclerViewDestinations.addOnItemTouchListener(new RecyclerItemClickListener(this, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Intent intent = new Intent(Destinations.this, ManageTrip.class);
                intent.putExtra(TRIP_NAME, getDestinations().get(position).getSeason());
                intent.putExtra(DESTINATION, getDestinations().get(position).getDestination());
                startActivity(intent);
            }
        }));
    }
}
