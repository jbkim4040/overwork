package com.abacus.overwork.common.util;

import org.jasypt.util.password.StrongPasswordEncryptor;

/**
 * packageName    : com.abacus.overwork.common.util
 * fileName       : Security
 * author         : jbkim
 * date           : 2023-07-16
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-07-16        jbkim       최초 생성
 */
public class PasswordEncryptor {

    public static String Scrypt(String password) {
//        // Scrypt 알고리즘을 사용하는 StrongPasswordEncryptor 인스턴스 생성
//        StrongPasswordEncryptor encryptor = new StrongPasswordEncryptor();
//
//        // 비밀번호 해싱
//        String hashedPassword = encryptor.encryptPassword(password);
//

//
//        // 비밀번호 검증
//        boolean passwordMatch = encryptor.checkPassword(password, hashedPassword);
//        System.out.println("비밀번호 일치 여부: " + passwordMatch);
        StrongPasswordEncryptor encryptor = new StrongPasswordEncryptor();
        String hashedPassword = encryptor.encryptPassword(password);

        System.out.println("원본 비밀번호: " + password);
        System.out.println("해싱된 비밀번호: " + hashedPassword);

        return hashedPassword;
    }

    public static String Bcrypt(String password) {


        return password;
    }
}
