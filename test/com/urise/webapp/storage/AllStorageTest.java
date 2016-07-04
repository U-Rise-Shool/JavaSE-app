package com.urise.webapp.storage;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * gkislin
 * 04.07.2016
 */
@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                ArrayStorageTest.class,
                SortedArrayStorageTest.class,
                ListStorageTest.class,
                MapUuidStorageTest.class,
                MapResumeStorageTest.class
        })
public class AllStorageTest {
}
