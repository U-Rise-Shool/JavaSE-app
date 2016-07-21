package com.urise.webapp.exception;

/**
 * gkislin
 * 10.06.2016
 */
public class StorageException extends RuntimeException {
    private final String uuid;

    public StorageException(String message, String uuid) {
        super(message);
        this.uuid = uuid;
    }

    public StorageException(String message, String uuid, Exception e) {
        super(message, e);
        this.uuid = uuid;
    }


    public String getUuid() {
        return uuid;
    }
}
