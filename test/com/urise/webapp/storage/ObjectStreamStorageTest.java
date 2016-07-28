package com.urise.webapp.storage;

/**
 * gkislin
 * 23.06.2016
 */
public class ObjectStreamStorageTest extends AbstractStorageTest {

    public ObjectStreamStorageTest() {
        super(new ObjectStreamStorage(STORAGE_DIR));
    }
}