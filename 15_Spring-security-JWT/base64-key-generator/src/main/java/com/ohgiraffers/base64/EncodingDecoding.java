package com.ohgiraffers.base64;

import java.util.Base64;
import java.util.Base64.*;

public class EncodingDecoding {
    public static void main(String[] args) {

        // Java v8 부터 기본 제공하는 Base64 기반의 인코더와 디코더
        Encoder encoder = Base64.getEncoder();
        Decoder decoder = Base64.getDecoder();

        //1. 인코더 사용해보기
        String plainText = "동해물과백두산이마르고닳도록";
        byte[] plainTextToByteArr = plainText.getBytes();

        byte[] encodedArr = encoder.encode(plainTextToByteArr);

        String encodedStr = new String(encodedArr);
        System.out.println("인코딩된 애국가 = " + encodedStr);


        //2. decoder 사용해보기
        byte[] decoderArr = decoder.decode(encodedStr);
        System.out.println("다시 디코딩된 애국가 = " + new String(decoderArr));
    }
}
