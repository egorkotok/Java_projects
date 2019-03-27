package com.company;

public enum Faculty { FACULTY_OF_COMPUTER_AIDED_DESIGN ("The Faculty of Computer-Aided Design"),
    FACULTY_OF_COMPUTER_SYSTEMS_AND_NETWORKS ("The Faculty of Computer Systems and Networks"),
    FACULTY_OF_RADIOENGINEERING_AND_ELECTRONICS("The Faculty of Radioengineering and Electronics"),
    NO_FACULTY("No faculty");

    private String value;

    public String getValue() {
        return value;
    }

    Faculty(String value) {
        this.value = value;
    }
}
