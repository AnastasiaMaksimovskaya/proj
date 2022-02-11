package com.store_server.type;

public enum OrderStatus {
    WAIT_FOR_PROCESSING ("Ждет обработки"),
    IN_PROGRESS ("В процессе"),
    READY ("Готов"),
    BOUGHT ("Выкуплен");

    private String status;

    OrderStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
