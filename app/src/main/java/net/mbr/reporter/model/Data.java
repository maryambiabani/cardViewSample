package net.mbr.reporter.model;

import java.io.Serializable;

public class Data  implements Serializable,Cloneable {
    private String name;
    private String family;
    private long id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
