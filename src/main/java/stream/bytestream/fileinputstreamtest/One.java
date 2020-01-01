package stream.bytestream.fileinputstreamtest;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * 使用输入流从文件读取数据
 *
 * @author 霖灬霖
 * @create 2019-12-26 14:57
 */
public class One {

    public static void main(String[] args) throws Exception {
        //1读取文件的数据到字节流inputStream
        InputStream fileInputStream = new FileInputStream("src/main/resources/FileInputStreamTest.txt");

        //2声明每次存储的字节长度
        byte[] buf = new byte[1024];

        //声明中间变量
        int len = 0;


        //3将读取到的字节存到buf数组中,返回读取的字节数
        while ((len = fileInputStream.read(buf)) != -1) {

            //4解析字节码为string类型，并输出到控制台
            System.out.println(new String(buf, 0, len));
        }

        //5关闭输入流
        fileInputStream.close();


    }

}

