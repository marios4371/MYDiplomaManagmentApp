package model;

import lombok.Getter;

@Getter
public enum Role {
    STUDENT("Student") ,
    PROFESSOR("Professor");

    private final String value;

    Role(String value) {
        this.value = value;
    }
}
