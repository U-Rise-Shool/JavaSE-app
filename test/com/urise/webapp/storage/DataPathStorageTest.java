package com.urise.webapp.storage;

import com.urise.webapp.storage.serializer.DataStreamSerializer;

/**
 * gkislin
 * 23.06.2016
 */
public class DataPathStorageTest extends AbstractStorageTest {

    public DataPathStorageTest() {
        super(new PathStorage(STORAGE_DIR.getAbsolutePath(), new DataStreamSerializer()));
    }
}