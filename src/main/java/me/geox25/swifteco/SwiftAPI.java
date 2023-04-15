package me.geox25.swifteco;

import java.util.List;

public interface SwiftAPI {

    /*
    Sets a property of a bank account
     */
    public void setAccountProperty(String path, String prop);
    public void setAccountProperty(String path, int prop);
    public void setAccountProperty(String path, double prop);

    /*
    Gets a property of a bank account
     */
    public String getAccountProperty(String path);
    public double getAccountDoubleProperty(String path);

    /*
    Checks if a bank account exists
     */
    public boolean accountExists(String account);

    /*
    Gets the managers of a bank account
     */
    public List<String> getAccountManagers(String account);

    /*
    Checks if player is a manager of the specified account
     */
    public boolean isManager(String account, String playerName);

    /*
    Gets the balance of a bank account
     */
    public double getBalance(String account);
}
