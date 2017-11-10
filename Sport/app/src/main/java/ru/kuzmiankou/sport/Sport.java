package ru.kuzmiankou.sport;

/**
 * Created by Anatoliy on 10.11.2017.
 */

public class Sport {
    private String name;
    private String description;
    private int imageResourceId;

    public String getDescription() {
        return description;
    }

    public String toString() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public static final Sport[] sports = {
            new Sport("basketball", "basketball", R.mipmap.basketball),
            new Sport("boxing", "boxing", R.mipmap.boxing),
            new Sport("dancing", "dancing", R.mipmap.dancing),
            new Sport("football", "football", R.mipmap.football),
            new Sport("hockey", "hockey", R.mipmap.hockey),
            new Sport("karate", "karate", R.mipmap.karate),
            new Sport("logo", "logo", R.mipmap.logo),
            new Sport("rugby", "rugby", R.mipmap.rugby),
            new Sport("swimming", "swimming", R.mipmap.swimming),
            new Sport("tennis", "tennis", R.mipmap.tennis),
            new Sport("volleyball","volleyball", R.mipmap.volleyball)
    };

    private Sport(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }
}
