// @author:樊川
// @email:945001786@qq.com

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class WordCount {
    public static void main(String[] args) throws Exception {
        String path = "test.txt";

        int countChar = 0;
        int countWord = 0;

        InputStreamReader in = new InputStreamReader(new FileInputStream(path));
        //用来读取文件中的数据
        BufferedReader br = new BufferedReader(in);//使用缓冲区，缓存输入的文档，可以使用缓冲区的read(),readLine()方法；
        while(br.read()!=-1)//read()=-1代表数据读取完毕
        {
            //split() 方法用于把一个字符串分割成字符串数组,字符串数组的长度，就是单词个数//在此只适用于英文
            String s = br.readLine();
            countChar += s.length();//字符个数就是字符长度
            String[] s1 = s.split(" ");
            for (String s2 : s1) {
                String[] s3 = s2.split(",");
                countWord += s3.length;
            }

        }
        //关闭文件
        in.close();
        br.close();

        for (String flag : args) {
            switch (flag) {
                case "-c":
                    System.out.println("字符数：" + countChar);
                    break;
                case "-w":
                    System.out.println("单词数：" + countWord);
                    break;
            }
        }
    }
}
