package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int idNumber;
    private final String userName;
    private final char gender;
    private final LocalDate birthDay;
    private final int postNumber;

    public ForumUser(final int idNumber, final String userName, final char gender, final int yearOfBirth, final int monthOfBirth, final int dayOfBirth, final int postNumber) {
        this.idNumber = idNumber;
        this.userName = userName;
        this.gender = gender;
        this.birthDay = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.postNumber = postNumber;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getUserName() {
        return userName;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public int getPostNumber() {
        return postNumber;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "idNumber=" + idNumber +
                ", userName='" + userName + '\'' +
                ", gender=" + gender +
                ", birthDay=" + birthDay +
                ", postNumber=" + postNumber +
                '}';
    }
}

