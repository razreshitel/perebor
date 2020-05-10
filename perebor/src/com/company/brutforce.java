package com.company;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class brutforce {
    int t;
    public brutforce(int _t){
        t=_t;
    }
    private String shacod(String text) throws NoSuchAlgorithmException {
        byte[] plainText = text.getBytes();
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.reset();
        md.update(plainText);
        byte[] encodedPassword = md.digest();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < encodedPassword.length; i++) {
            if ((encodedPassword[i] & 0xff) < 0x10) {
                sb.append("0");
            }
            sb.append(Long.toString(encodedPassword[i] & 0xff, 16));
        }
        return sb.toString();
    }
    private String sha1 = "1115dd800feaacefdf481f1f9070374a2a81e27880f187396db67958b207cbad";
    private String sha2 = "3a7bd3e2360a3d29eea436fcfb7e44c735d117c42d1c1835420b6b9942dd4f1b";
    private String sha3 = "74e1bb62f8dabb8125a58852b63bdf6eaef667cb56ac7f7cdba6d7305c50a22f";
    void brut() throws NoSuchAlgorithmException {
        String sha="";
        int ch=0;
        String pass="";
        switch (t){
            case 1:{
                for(char i='a';i<='i';i++){
                    for(char j='a';j<='z';j++){
                        for(char k='a';k<='z';k++){
                            for(char l='a';l<='z';l++){
                                for(char m='a';m<='z';m++){
                                    pass=String.valueOf(i)+String.valueOf(j)+String.valueOf(k)+String.valueOf(l)+String.valueOf(m);
                                    sha=shacod(pass);
                                    if(sha.equals(sha1)){
                                        System.out.println(pass+" "+sha+" first th");
                                    }
                                    if(sha.equals(sha2)){
                                        System.out.println(pass+" "+sha+" first th");
                                    }
                                    if(sha.equals(sha3)){
                                        System.out.println(pass+" "+sha+" first th");
                                    }
                                    pass="";
                                }
                            }
                        }
                    }
                }
                break;
            }
            case 2:{
                for(char i='j';i<='r';i++){
                    for(char j='a';j<='z';j++){
                        for(char k='a';k<='z';k++){
                            for(char l='a';l<='z';l++){
                                for(char m='a';m<='z';m++){
                                    pass=String.valueOf(i)+String.valueOf(j)+String.valueOf(k)+String.valueOf(l)+String.valueOf(m);
                                    sha=shacod(pass);
                                    if(sha.equals(sha1)){
                                        System.out.println(pass+" "+sha+" second th");
                                    }
                                    if(sha.equals(sha2)){
                                        System.out.println(pass+" "+sha+" second th");
                                    }
                                    if(sha.equals(sha3)){
                                        System.out.println(pass+" "+sha+" second th");
                                    }
                                    pass="";
                                }
                            }
                        }
                    }
                }
                break;
            }
            case 3:{
                for(char i='s';i<='z';i++){
                    for(char j='a';j<='z';j++){
                        for(char k='a';k<='z';k++){
                            for(char l='a';l<='z';l++){
                                for(char m='a';m<='z';m++){
                                    pass=String.valueOf(i)+String.valueOf(j)+String.valueOf(k)+String.valueOf(l)+String.valueOf(m);
                                    sha=shacod(pass);
                                    if(sha.equals(sha1)){
                                        System.out.println(pass+" "+sha+" third th");
                                    }
                                    if(sha.equals(sha2)){
                                        System.out.println(pass+" "+sha+" third th");
                                    }
                                    if(sha.equals(sha3)){
                                        System.out.println(pass+" "+sha+" third th");
                                    }
                                    pass="";
                                }
                            }
                        }
                    }
                }
                break;
            }
        }
    }
}
