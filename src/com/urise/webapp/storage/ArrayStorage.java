package com.urise.webapp.storage;

import com.urise.webapp.model.Resume;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    private Resume[] storage = new Resume[100000];
    private int size;

    public void clear() {

    }


    public void update(Resume r) {
    for(int i=0;i<size;i++){
        if(r.equals(storage[i])){
            storage[i]=r;
        }
        else
            System.out.println("Error");
    }

    }


    public void save(Resume r) {
    for (int i = 0;i<size;i++){
        if(!(r.equals(storage[i].getUuid()))&&storage[i]==null){
            storage[i] = r;
            size++;
            System.out.println(size);


        }

    }

    }

    public Resume get(String uuid) {
        for (int i = 0; i < size; i++) {
            if (uuid == storage[i].getUuid()) {
                return storage[i];
            }
        }
        return null;
    }

    public void delete(String uuid) {
        for (int i = 0; i < size; i++) {
            if (uuid == storage[i].getUuid()) {
                storage[i] = storage[size - 1];
                storage[i] = null;
                size--;
            }
        }
    }
    /**
     * @return array, contains only Resumes in storage (without null)
     */
    public Resume[] getAll(){
        Resume[] result = new Resume[size];
        return result;
    }

    public int size() {
        return size;
    }
}
