package com.commercial.commande.models.enums;

public enum Roles {
    ADMIN("Admin"),
    USER("User");

    private final String role;

    Roles(String role) {
        this.role = role;
    }
}
