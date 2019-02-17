package com.example.tubr;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.ssl.SSLContextBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Functionality {

    public static void getTutor() {

    }

    public static void main (String[] args) throws Exception {
        sendCreateUserToHTTP("Spencer Michalski", "spencer@abc.com",
                                "123-456-7890", "CMSC320", "1,3");
    }

    public static void sendCreateUserToHTTP(String name, String email, String phone,
                                      String classes, String location) throws Exception {

        HttpClient httpclient = HttpClientBuilder.create().build();
        HttpPost httppost = new HttpPost("http://13.82.25.117:8080/TubrServer/MainServlet");

        // Request parameters and other properties.
        List<NameValuePair> params = new ArrayList<NameValuePair>(5);
        params.add(new BasicNameValuePair("name", name));
        params.add(new BasicNameValuePair("email", email));
        params.add(new BasicNameValuePair("phone", phone));
        params.add(new BasicNameValuePair("classes", classes));
        params.add(new BasicNameValuePair("location", location));

        try {

            httppost.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));

            //Execute and get the response.
            HttpResponse response = httpclient.execute(httppost);
            HttpEntity entity = response.getEntity();

            if (entity != null) {

                InputStream instream = entity.getContent();
                System.out.println(instream.read());
            }

        } catch (IOException e) { }
    }

}
