package com.store_server.type;

public enum BallPurpose {

    VOLLEYBALL ("Волейбольные"),
    BASKETBALL ("Баскетбольные"),
    FOOTBALL ("Футбольные"),
    TENNIS ("Теннисные"),
    TABLE_TENNIS ("Для настольного тенниса");

    private String name;

    BallPurpose(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
