package com.store_server.type;

public enum SneakerPurpose {

    VOLLEYBALL ("Волейбольные"),
    BASKETBALL ("Баскетбольные"),
    FOOTBALL ("Футбольные"),
    FOR_RUN ("Для бега"),
    DAILY ("Повседневные");

    private String name;

    SneakerPurpose(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
