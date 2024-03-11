package org.example.models;

public interface Identifiable<ID> {
    void setId(ID id);
    ID getId();
}