/**
 * @author 霖灬霖
 * @create 2019-12-26 16:01
 */
package stream.bytestream.InputStream;

/*
 * FileInputStreamTest
 *  使用输入流从文件读取字节数据
 * BufferedInputStreamTest
 *  使用输入流的缓冲区从文件读取字节数据
 *
 * */


//在学习字符流时，发现 对于不同的编码文件，字节与字符的转换比例是不同的

// ASCII编码是单字节编码，只有英文字符，不能编码汉字。

// GBK编码1个英文字符是1个字节，一个汉字是是2个字节。

// UTF-8编码1个英文字符是1个字节，一个汉字是3个字节。

// Unicode编码1个英文字符是2个字节，一个汉字是2个字节
