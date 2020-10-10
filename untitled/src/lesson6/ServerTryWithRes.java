package lesson6;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerTryWithRes {
    public static void main(String[] args) {
        final int PORT = 8189;

        try (ServerSocket server = new ServerSocket(PORT)) {
            System.out.println("Server started");
            try (Socket socket = server.accept();
                 Scanner in = new Scanner(socket.getInputStream());
                 PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {

                System.out.println("Client connected");
                while (true) {
                    String str = in.nextLine();

                    if (str.equals("/end")) {
                        break;
                    }

                    System.out.println("Client: " + str);
                    out.println("echo: " + str);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
