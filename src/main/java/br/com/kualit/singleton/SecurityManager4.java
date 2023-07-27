package br.com.kualit.singleton;

public class SecurityManager4 {

    private SecurityManager4() {}
    private static SecurityManager4 instance;

    public static SecurityManager4 getInstance() {
        if (instance == null) {
            synchronized (SecurityManager4.class) {

                if (instance == null)
                    instance = new SecurityManager4();
            }
        }
        return instance;
    }
}
