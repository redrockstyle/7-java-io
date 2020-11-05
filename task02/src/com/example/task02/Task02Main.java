package com.example.task02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test
        convertEndOfLine(System.in, System.out);
    }

    public static void convertEndOfLine(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (inputStream == null) {
            throw new IllegalArgumentException("stream is null");
        }
        int code1 = inputStream.read(), code2;
        while(code1 != -1){
            code2 = inputStream.read();

            if (!(code2 == 10 && code1 == 13)){
                outputStream.write(code1);
            }

            code1 = code2;
        }
        outputStream.flush();
    }

}
