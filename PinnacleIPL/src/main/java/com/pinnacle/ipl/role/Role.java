package com.pinnacle.ipl.role;

public class Role {
    public static final Role BATSMAN = new Role("Batsman");
    public static final Role BOWLER = new Role("Bowler");
    public static final Role ALLROUNDER = new Role("Allrounder");

    private final String role;

    private Role(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return role;
    }
}
