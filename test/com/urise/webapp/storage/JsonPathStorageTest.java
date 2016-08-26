package com.urise.webapp.storage;

import com.urise.webapp.storage.serializer.JsonStreamSerializer;

/**
 * gkislin
 * 23.06.2016
 */
public class JsonPathStorageTest extends AbstractStorageTest {

    public JsonPathStorageTest() {
        super(new PathStorage(STORAGE_DIR.getAbsolutePath(), new JsonStreamSerializer()));
    }
}