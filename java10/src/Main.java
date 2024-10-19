import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        //	通过IP地址和TCP端口号创建一个对象并打开通道
        try {
            Socket socket = new Socket("192.168.109.131",8080);
            System.out.println("连接成功");
            //发送一段消息的到服务器
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            String message = "good morning my neighbours!";
            out.println(message);
            System.out.println("已发送消息到服务器：192.168.109.131");
            socket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        //

    }
}
