package org.example;

public enum OSData {

    IOS("Ordner IOS"),
    ANDROID("Ordner Android"),
    WINDOWS("Ordner Win64"),
    LINUX("Ordner Linux"),
    APPLE("Ordner AppleM");

    private final String downloader;

    OSData(String downloader) {
        this.downloader = downloader;
    }
}
