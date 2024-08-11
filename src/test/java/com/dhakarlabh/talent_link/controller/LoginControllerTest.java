package com.dhakarlabh.talent_link.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoginControllerTest {

    @Test
    public void login() {
        String emptyString = "";
        String backDir = "..";
        StringBuilder sol = new StringBuilder();
        sol.append("/");
        String s = "/home/asv//dfb/";
        String[] splitString = s.split("/");
        for(String str : splitString){
            if(backDir.equals(str)) continue;
            else if(!emptyString.equals(str)) sol.append(str).append("/");
        }
        sol = new StringBuilder(sol.substring(0, sol.length() - 1));
        System.out.println(sol.toString());
    }

}