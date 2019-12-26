package stream.bytestream.InputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * 使用输入流的缓冲区从文件读取字节数据
 *
 * @author 霖灬霖
 */
public class BufferedInputStreamTest {


    public static void main(String[] args) throws Exception {
        //1读取文件的数据到字节流inputStream
        InputStream fileInputStream = new FileInputStream("src/main/resources/FileInputStreamTest.txt");

        //2创建字节流缓冲区
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

        //3声明每次存储的字节长度
        byte[] buf = new byte[1024];

        //声明中间变量
        int len = 0;

        //4将读取到的字节存到buf数组中,返回读取的字节数
        while ((len = bufferedInputStream.read(buf)) != -1) {

            //5解析字节码为string类型，并输出到控制台
            System.out.println(new String(buf, 0, len));
        }

        //6关闭缓冲区
        bufferedInputStream.close();

        //7关闭输入流
        fileInputStream.close();

    }


}
