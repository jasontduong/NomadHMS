package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Suite implements Serializable {
    private String fname;
    private String lname;
    private String conf;
    private String room;
    private String suite;
    private Boolean status;

    public Suite(String fname, String lname, String conf, String room, String suite) {
        this.fname = fname;
        this.lname = lname;
        this.conf = conf;
        this.room = room;
        this.suite = suite;
    }



    String getFname() {
        return fname;
    }

    void setFname(String fname) {
        this.fname = fname;
    }

    String getLname() {
        return lname;
    }

    void setLname(String lname) {
        this.lname = lname;
    }

    String getConf() {
        return conf;
    }

    void setConf(String conf) {
        this.conf = conf;
    }

    String getRoom() {
        return room;
    }

    void setRoom(String room) {
        this.room = room;
    }

    String getSuite() {
        return suite;
    }

    void setSuite(String suite) {
        this.suite = suite;
    }

    Boolean getStatus() {
        return status;
    }

    void setStatus(Boolean status) {
        this.status = status;
    }
}
