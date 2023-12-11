package org.example.algo.tuny_url;

//https://leetcode.com/problems/encode-and-decode-tinyurl/
public class Test {

    public static void main(String[] args) {

        String longURL = "https://epam-my.sharepoint.com/personal/hayk_avdalyan_epam_com/_layouts/15/onedrive.aspx?id=%2Fpersonal%2Fhayk%5Favdalyan%5Fepam%5Fcom%2FDocuments%2FRecordings%2FMorning%20Coffee%20%2815%20min%20problem%20solving%29%2D20210903%5F110159%2DMeeting%20Recording%2Emp4&parent=%2Fpersonal%2Fhayk%5Favdalyan%5Fepam%5Fcom%2FDocuments%2FRecordings&originalPath=aHR0cHM6Ly9lcGFtLW15LnNoYXJlcG9pbnQuY29tLzp2Oi9wL2hheWtfYXZkYWx5YW4vRVVJemYzRFU4eVZNdkllREhkN2dfTEFCNkhaa2t4aEN5VkZiRy03TXQ1X1lpQT9ydGltZT1ZanlBcXh0djJVZw";
        String shortUrl = Solution.encode(longURL);
        System.out.println(shortUrl);

        String decodedUrl = Solution.decode(shortUrl);
        System.out.println("Succeed: " + decodedUrl.equals(longURL));

    }
}
