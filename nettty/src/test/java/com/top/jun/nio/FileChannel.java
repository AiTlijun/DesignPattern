package com.top.jun.nio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URL;
import java.nio.ByteBuffer;

/**
 * @ClassName: FileChannel
 * @Description: FileChannel
 * @Author: lijun
 * @Date: 2019/4/16 0016下午 4:53
 * @Version: 1.0.0$
 **/
public class FileChannel {

    public static void main(String[] args) {
        RandomAccessFile randomAccessFile = null;
        URL resource = new FileChannel().getClass().getClassLoader().getResource("com.top.jun.nio".replaceAll("\\.", "/"));
        String resourceFile = resource.getFile() + "/nio-data.txt";
        System.out.println(resourceFile);
        try {
            randomAccessFile = new RandomAccessFile(resourceFile, "rw");
            //randomAccessFile.skipBytes(3);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("文件未找到！");
        } catch (IOException e) {
            e.printStackTrace();
        }
        java.nio.channels.FileChannel channel = randomAccessFile.getChannel();
        ByteBuffer allocate = ByteBuffer.allocate(48);
        try {
            int  read = channel.read(allocate);
            if (read != -1) {
                System.out.println("Read " + read);
                System.out.println("flip before：" + allocate.hasRemaining());
                allocate.flip();
                System.out.println("flip after：" + allocate.hasRemaining());
                while (allocate.hasRemaining()) {
                    System.out.print((char) allocate.get());
                }
                //allocate.clear();
                // read = channel.read(allocate);
            }
            System.out.println(channel.size());
            RandomAccessFile randomAccessFileNew1 = new RandomAccessFile("E:\\data\\new1-nio-data.txt","rw");
            randomAccessFileNew1.getChannel().transferFrom(channel,0,channel.size());
            randomAccessFile.close();
            /*File fileNew = new File("E:\\data\\new-nio-data.txt");
            RandomAccessFile randomAccessFileNew = new RandomAccessFile(fileNew,"rw");
            java.nio.channels.FileChannel channelNew = randomAccessFileNew.getChannel();
            allocate.flip();
            channelNew.write(allocate);*/

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("读写失败！");
        }
    }
}
