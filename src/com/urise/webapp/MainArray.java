package com.urise.webapp;

import com.urise.webapp.model.Resume;
import com.urise.webapp.storage.ArrayStorage;
import com.urise.webapp.storage.Storage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Test for com.urise.webapp.storage.ArrayStorage
 */
public class MainArray {
    private final static Storage ARRAY_STORAGE = new ArrayStorage();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Resume r;
        while (true) {
            System.out.print("Введите одну из команд - (list | save uuid | delete uuid | get uuid | update uuid | clear | exit): ");
            String[] params = reader.readLine().trim().toLowerCase().split(" ");
            if (params.length < 1 || params.length > 2) {
                System.out.println("Неверная команда.");
                continue;
            }
            if (params.length == 2) {
                params[1] = params[1].intern();
            }
            switch (params[0]) {
                case "list":
                    printAll();
                    break;
                case "size":
                    System.out.println(ARRAY_STORAGE.size());
                    break;
                case "save":
                    r = new Resume();
                    r.setUuid(params[1]);
                    ARRAY_STORAGE.save(r);
                    printAll();
                    break;
                case "update":
                    r = new Resume();
                    r.setUuid(params[1]);
                    ARRAY_STORAGE.update(r);
                    printAll();
                    break;
                case "delete":
                    ARRAY_STORAGE.delete(params[1]);
                    printAll();
                    break;
                case "get":
                    System.out.println(ARRAY_STORAGE.get(params[1]));
                    break;
                case "clear":
                    ARRAY_STORAGE.clear();
                    printAll();
                    break;
                case "exit":
                    return;
                default:
                    System.out.println("Неверная команда.");
                    break;
            }
        }
    }

    static void printAll() {
        Resume[] all = ARRAY_STORAGE.getAll();
        System.out.println("----------------------------");
        if (all.length == 0) {
            System.out.println("Empty");
        } else {
            for (Resume r : all) {
                System.out.println(r);
            }
        }
        System.out.println("----------------------------");
    }
}
