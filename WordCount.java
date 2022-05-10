// @author:����
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
        //������ȡ�ļ��е�����
        BufferedReader br = new BufferedReader(in);//ʹ�û�����������������ĵ�������ʹ�û�������read(),readLine()������
        while(br.read()!=-1)//read()=-1�������ݶ�ȡ���
        {
            //split() �������ڰ�һ���ַ����ָ���ַ�������,�ַ�������ĳ��ȣ����ǵ��ʸ���//�ڴ�ֻ������Ӣ��
            String s = br.readLine();
            countChar += s.length();//�ַ����������ַ�����
            String[] s1 = s.split(" ");
            for (String s2 : s1) {
                String[] s3 = s2.split(",");
                countWord += s3.length;
            }

        }
        //�ر��ļ�
        in.close();
        br.close();

        for (String flag : args) {
            switch (flag) {
                case "-c":
                    System.out.println("�ַ�����" + countChar);
                    break;
                case "-w":
                    System.out.println("��������" + countWord);
                    break;
            }
        }
    }
}
