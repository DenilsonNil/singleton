package br.com.kualit.singleton;

public class SecurityManager {
    private SecurityManager() {}
    private static SecurityManager instance;

    public static SecurityManager getInstance() {
        if (instance == null)
            instance = new SecurityManager();

        return instance;
    }
}
