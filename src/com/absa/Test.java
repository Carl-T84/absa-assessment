package com.absa;

public class Test extends TestMethods {

    public static void main(String[] args) {

        navigateToWebsite();
        clickNewUser();
        enterUserOneDetails();
        clickNewUser();
        enterUserTwoDetails();
        verifyAddedUsers();
    }
}
