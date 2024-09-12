package com.basejava;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import com.security.RSAUtil;

import java.time.LocalDateTime;

public class HttpUtil {

    static String body = "";
    static  String privateKey = "MIIBVAIBADANBgkqhkiG9w0BAQEFAASCAT4wggE6AgEAAkEAmN6IQFQTAdX3EnlfEOrifV2vpzKtXWIvopUzt+w6crWblt/U3jKTqia2lCyRFuG3Yq7Qo8ONWmRStxYgKZj8WQIDAQABAkAi/aTgXJ4xKGGyd9ebzrfjDEO9mKr4GhZfN5mr+sVyJeYhOCSxD73FzvPWBfAFNfF8Tdfx04jZD7eljrpz3b2RAiEA5JyHuHiQNe66EQW/clmkGF8UvOrb86EDp1PtojhXcbUCIQCrLwD1czGmsegSF/GzkK7oRayJppXPm13kjVrVyR1WlQIhANHLsGWjBrzn0wtyGeonx4ayIwboBWgEOKUjSW3YhK8NAiA1KjoAATDQdrx+shUNEchgtxLpBWXNvpEgpI4ri3SjKQIgELA6pwG0ANsUhmWNVziPN4IqBOQzMkck7MnAMuVpaAI=";

    static  String publicKey = "MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAJjeiEBUEwHV9xJ5XxDq4n1dr6cyrV1iL6KVM7fsOnK1m5bf1N4yk6omtpQskRbht2Ku0KPDjVpkUrcWICmY/FkCAwEAAQ==";

    public static void main(String[] args) throws Exception {
/*        String fdafdafd = RSAUtil.encryptByPri("fdafdafd", privateKey);
        String signature = RSAUtil.decryptByPub(fdafdafd, publicKey);*/

        String signature = RSAUtil.decryptByPub("Js7UNO362XI02xA3oGWjlSl/0ZO2kFP8lyDS7ADVG5pdfT+AmQXFbTi5SdWwUFxN28FX2OPbeJmL42a4aj8Azw==", publicKey);
        long currentTimeMillis = System.currentTimeMillis();
        String digest = MD5Utils.getMD5Str(body  + currentTimeMillis + signature);
        System.out.println(digest);
        HttpResponse authToken =
                 HttpRequest.post("localhost:8910/bc/scanList/uploadSigningData")
                .body( body )
                .header("authToken", "1b492526992d4cc8a67d323a9ba76aee")
                .header("digestv", digest)
                .header("timeEpoch", ""+currentTimeMillis)
                .header("App-Version", "1.0.80")
                .header("User-Agent", "xxx/app_in")
                .execute();
        String body = authToken.body();
    }
}
