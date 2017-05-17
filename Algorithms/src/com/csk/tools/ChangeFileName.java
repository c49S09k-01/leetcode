package com.csk.tools;

import java.io.*;

/**
 * Created by 24866 on 2017/4/28.
 */
public class ChangeFileName {
    public static void main(String[] args) {
        int num = 1;
        File dir = new File("C:\\Users\\24866\\Desktop\\new3\\new2");
        File[] files = dir.listFiles();
        System.out.println("total " + files.length + " files");
        BufferedReader bf = null;
        BufferedWriter bw = null;
        String fileName;
        String s;
        for (File f : files) {
            try {
                fileName = f.getName();
                bf = new BufferedReader(new FileReader(f));
                bw = new BufferedWriter(new FileWriter("C:\\Users\\24866\\Desktop\\new3_\\" + (num++) + ".txt"));
                while ((s = bf.readLine()) != null) {
                    if (!s.startsWith("<")) {
                        bw.write(s + "\r\n");
                        bw.flush();
                    }
                }
                bw.write(fileName.substring(0, fileName.length() - 4));
                bw.flush();
            } catch (Exception e) {
            } finally {
                try {
                    bf.close();
                    bw.close();
                } catch (IOException ioe) {
                }
            }
        }
    }
}
