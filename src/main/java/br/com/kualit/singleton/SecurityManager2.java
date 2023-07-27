package br.com.kualit.singleton;

public class SecurityManager2 {

    private SecurityManager2() {
    }

    private static SecurityManager2 instance = new SecurityManager2();

    public static SecurityManager2 getInstance() {

        return instance;
    }

    public void login() {
    }
}
