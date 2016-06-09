package com.urise.webapp.exception;

/**
 * gkislin
 * 10.06.2016
 */
public class ExistStorageException extends StorageException{
    public ExistStorageException(String uuid) {
        super("Resume " + uuid + " already exist", uuid);
    }
}
