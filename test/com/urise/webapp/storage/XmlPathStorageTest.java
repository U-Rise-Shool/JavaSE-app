package com.urise.webapp.storage;

import com.urise.webapp.storage.serializer.XmlStreamSerializer;

/**
 * gkislin
 * 23.06.2016
 */
public class XmlPathStorageTest extends AbstractStorageTest {

    public XmlPathStorageTest() {
        super(new PathStorage(STORAGE_DIR.getAbsolutePath(), new XmlStreamSerializer()));
    }
}