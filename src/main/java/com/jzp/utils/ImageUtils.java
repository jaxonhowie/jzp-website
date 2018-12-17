package com.jzp.utils;

import net.coobird.thumbnailator.Thumbnails;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * Image process utilities
 *
 * @author Hongyi Zheng
 * @date 2018/12/17
 */
public class ImageUtils {

    private static final Logger logger = LoggerFactory.getLogger(ImageUtils.class);

    private static final Double DEFAULT_QUALITY = 1D;
    private static final Double DEFAULT_SCALE = 1D;

    public static void compress(String target, double scale, double quality, String dest) {
        try {
            Thumbnails.of(target).scale(scale).outputQuality(quality).toFile(dest);
        } catch (IOException e) {
            logger.error("Image compress error: {}", target);
        }
    }

    public static void compress(String path){
        compress(path, DEFAULT_SCALE);
    }

    public static void compress(String path, double scale){
        compress(path, scale, path);
    }

    public static void compress(String target, double scale,String dest){
        compress(target, scale, DEFAULT_QUALITY, dest);
    }
}
