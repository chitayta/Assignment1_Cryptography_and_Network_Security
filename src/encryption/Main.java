/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encryption;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/**
 *
 * @author ctVan
 */
public class Main {
    public static String ex = ".txt";
    public static String plain = "data/1" + ex;
    public static String cipher = "data/cipher"+ ex;
    public static String afterdec = "data/decypt"+ ex;

    public static void main(String[] args) throws Exception {
//
//        String password = IO.readin("1.docx");
//        ICryto enc = new CrytoSym("DES");
//        SecretKey key = enc.keyGenerator();
//        String passwordEnc = enc.encrypt(password,key);
//        
//        IO.printout(passwordEnc.getBytes(), "2.docx");
//        
//        String passwordEnc1 = IO.readin("2.docx");
//        
//        String passwordDec = enc.decrypt(passwordEnc1,key);
//        
//        IO.printout(passwordDec.getBytes(), "3.docx");
//        System.out.println("Plain Text : " + password);
//        System.out.println("Encrypted Text : " + passwordEnc);
//        System.out.println("Decrypted Text : " + passwordDec);
//       Cipher aesCipher = Cipher.getInstance("AES");
//       aesCipher.init(Cipher.ENCRYPT_MODE, KeyGenerator.getInstance("AES").generateKey());   
//
//        String cleartextFile = "123456789";
//        byte[] arr = aesCipher.doFinal(cleartextFile.getBytes());
//        String ciphertextFile = "ciphertextSymm.txt";
//        

      ICryto cryto = new CrytoSym("AES","/ECB/NoPadding", 16);
      SecretKey key = cryto.keyGenerator();
      cryto.encrypt(key, plain , cipher); 
      cryto.decrypt(key, cipher, afterdec);
    }
}