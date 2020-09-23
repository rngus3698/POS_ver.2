package com.pos.pos.test.domain;

import org.apache.ibatis.type.Alias;

@Alias("Menu")
public class Menu {

    private String menu;

    public Menu(String menu) {
        this.menu = menu;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }
}
