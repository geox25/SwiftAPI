# SwiftAPI
[![](https://jitpack.io/v/geox25/SwiftAPI.svg)](https://jitpack.io/#geox25/SwiftAPI)

Allows other plugins to interact with the SwiftEco economy plugin.

How to include in your project:
https://jitpack.io/#geox25/SwiftAPI

Example Usage:
```java
// imports ...

// Registration
SwiftAPICompatible swift = Objects.requireNonNull(getServer().getServicesManager().getRegistration(SwiftAPICompatible.class)).getProvider();
SwiftAPI swiftAPI = swift.getAPI();

// Sample Actions
swiftAPI.setAccountProperty("playerUUID.isRestricted", "false");
boolean isManager = swiftAPI.isManager("accountName", "playerUUID");
```
