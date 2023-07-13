package me.geox25.swifteco;

import java.util.List;

public interface SwiftAPI {

    // Property Management Methods
    public void setAccountProperty(String path, String property);
    public String getAccountProperty(String path);

    // Account Management Methods
    public boolean accountExists(String path);
    public List<String> getAccountManagers(String path);
    public boolean isManager(String path, String uuid);
    public void setBalance(String path, double balance);
    public double getBalance(String path);
}
