package io_binary_file_Serialization.bai_tap.copy_file_nhi_phan;

import java.io.*;
import java.util.Scanner;

public class CopyFile {
    static void copyFileUsingStream(File source, File dest)throws IOException {
        InputStream is = null;
        OutputStream os = null;
        int count=0;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
                for (int i=0;i<os.toString().length();i++){
                    count++;
                }
            }
        } finally {
            System.out.println("Number of char: "+count);
            is.close();
            os.close();
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("Enter source file:");
        String sourcePath = in.nextLine();
        System.out.printf("Enter destination file:");
        String destPath = in.nextLine();

        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);
// Input F:\4. Nguyen_Hong_Nhat\Module2\src\io_binary_file_Serialization\bai_tap\copy_file_nhi_phan\CopyFile.txt
//       F:\4. Nguyen_Hong_Nhat\Module2\src\io_binary_file_Serialization\bai_tap\copy_file_nhi_phan\FileEmpty.txt
        try {
            copyFileUsingStream(sourceFile,destFile);
            System.out.printf("Copy completed");
        } catch (IOException ioe) {
            System.out.printf("Can't copy that file");
            System.out.printf(ioe.getMessage());
        }
    }
}
