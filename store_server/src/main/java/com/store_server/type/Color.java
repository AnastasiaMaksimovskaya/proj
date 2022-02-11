package com.store_server.type;

public enum Color {
    YELLOW("Желтый"),
    RED("Красный"),
    GREEN("Зеленый"),
    BLUE("Синий"),
    GRAY("Серый"),
    CYAN("Голубой"),
    BLACK("Черный"),
    MAGENTA("Розовый");

    private String name;

    Color(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
