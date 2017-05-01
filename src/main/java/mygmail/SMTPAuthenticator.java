package mygmail;

import javax.mail.PasswordAuthentication;

/**
 * Created by KVP on 14.04.2017.
 */
public class SMTPAuthenticator extends javax.mail.Authenticator {
    public PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication("arise.project.resourse@gmail.com", "Zxc09qW1");
    }
}
