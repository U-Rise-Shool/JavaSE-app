package com.urise.webapp.storage;

import com.urise.webapp.Config;

/**
 * gkislin
 * 23.06.2016
 */
public class SqlStorageTest extends AbstractStorageTest {

    public SqlStorageTest() {
        super(Config.get().getStorage());
    }
}