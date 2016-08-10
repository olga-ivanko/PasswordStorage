/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.codefire.javamaven;

import java.util.Scanner;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author homefulloflove
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter password");
        String line = scan.nextLine();
        
        System.out.println("md2: " + DigestUtils.md2Hex(line));
        System.out.println("md5: " + DigestUtils.md5Hex(line));
        System.out.println("sha1: " + DigestUtils.sha1Hex(line));
        System.out.println("sha256: " + DigestUtils.sha256Hex(line));
        System.out.println("sha384: " + DigestUtils.sha384Hex(line));
        System.out.println("sha512: " + DigestUtils.sha512Hex(line));
        

        

    }

}
