package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public final class Forum {

    private final List<ForumUser> forumUsersList = new ArrayList<>();

    public Forum() {
        forumUsersList.add(new ForumUser(001, "Leeroy Jenkins", 'M', 2015, 11, 02, 100));
        forumUsersList.add(new ForumUser(002, "xXMasterXx", 'M', 2002, 11, 03, 0));
        forumUsersList.add(new ForumUser(003, "Johnataan", 'F', 2002, 03, 29, 50));
        forumUsersList.add(new ForumUser(004, "Usser", 'M', 1999, 01, 11, 1));
        forumUsersList.add(new ForumUser(005, "Leeroy", 'F', 1990, 11, 17, 200));
        forumUsersList.add(new ForumUser(006, "Tester", 'M', 1992, 11, 17, 5));
    }

    public List<ForumUser>getList(){
        return new ArrayList<>(forumUsersList);
    }
}
