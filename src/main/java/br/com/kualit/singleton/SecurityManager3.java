package br.com.kualit.singleton;

public class SecurityManager3 {
    private SecurityManager3() {}
    private static SecurityManager3 instance;

    static {
        try {
            instance = new SecurityManager3();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static SecurityManager3 getInstance() {
        return instance;
    }
}
