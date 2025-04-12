package chapter_1.lesson_2;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class WebPageDownloader {

    public static void main(String[] args) throws IOException {

        String url = "https://stackoverflow.com/questions/238547/how-do-you-programmatically-download-a-webpage-in-java";
        String fileName = "file.html";

        String sourceCode = webPageDownload(url);
        writeToFile(fileName, sourceCode);
    }

    private static String webPageDownload(String url) throws IOException {
        StringBuilder result = new StringBuilder();
        String line;
        URLConnection urlConnection = new URL(url).openConnection();

        try (InputStream inputStream = urlConnection.getInputStream(); BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {
            while ((line = bufferedReader.readLine()) != null) {
                result.append(line);
            }
        }
        return result.toString();
    }

    private static void writeToFile(String fileName, String content) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.write(content);
        writer.close();
    }
}