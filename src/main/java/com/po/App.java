package com.po;

import com.po.picture.ImageUtil;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import sun.misc.BASE64Encoder;

/**
 * Hello world!
 */
public class App {

  public static void main(String[] args) throws IOException, InterruptedException {
    ArrayList stringList = new ArrayList<String>(1001);
    long t = System.currentTimeMillis();

    BufferedImage image = ImageIO.read(new File("/Users/zj/Desktop/data.jpeg"));
    BASE64Encoder encoder = new BASE64Encoder();

    for (int i = 0; i < 1001; i++) {
      stringList.add(encoder.encode(ImageUtil
          .getCircleImage(image).toByteArray()));
      System.gc();
      System.out.println(i);
    }
    long u = System.currentTimeMillis() - t;
    System.out.println(u);
  }
}
