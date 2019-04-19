package com.jzp.utils;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * 图片处理工具类
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
            logger.error("图片压缩失败！ 目标文件：{}，Exception:{}", target, e.toString());
        }
    }

    public static void compress(String path) {
        compress(path, DEFAULT_SCALE);
    }

    public static void compress(String path, double scale) {
        compress(path, scale, path);
    }

    public static void compress(String target, double scale, String dest) {
        compress(target, scale, DEFAULT_QUALITY, dest);
    }

    /**
     * 添加水印
     *
     * @param source    需要添加水印的源文件
     * @param p         水印位置
     * @param watermark 水印图片文件
     * @param opacity   透明度
     */
    public static void watermark(File source, Positions p, File watermark, float opacity) {
        try {
            Thumbnails.of(source).watermark(p, ImageIO.read(watermark), opacity).scale(1).toFile(source);
        } catch (IOException e) {
            logger.error("添加水印失败: {}", e.toString());
        }
    }
}
