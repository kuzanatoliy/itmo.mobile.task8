package ru.kuzmiankou.sport;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SportActivity extends AppCompatActivity {
    public static final String EXTRA_SPORTID = "sportId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport);

        int sportId = (Integer)getIntent().getExtras().get(EXTRA_SPORTID);
        Sport sport = Sport.sports[sportId];

        ImageView imageView = (ImageView) findViewById(R.id.photo);
        imageView.setImageResource(sport.getImageResourceId());
        imageView.setContentDescription(sport.getDescription());

        TextView name = (TextView) findViewById(R.id.name);
        name.setText(sport.toString());

        TextView description = (TextView) findViewById(R.id.description);
        description.setText(sport.getDescription());
    }
}
