package project13;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Text {

	public static void main(String[] args) {
		
		
		File file=new File("d:\\abc\\abc.txt");
		File file2=new File("d:\\abc\\abc1.txt");
		
		FileReader fileReader=null;
		FileWriter fileWriter=null;//�ַ����������,ʹ��filereader��filewriter����ʵ���ı��ļ��ĸ���
		//���ڷ��ı��ļ���������Ƶ����Ƶ��ͼƬ����ʹ���ֽ���
		
		try {
			fileReader=new FileReader(file);
			fileWriter=new FileWriter(file2);
			
			char[] c=new char[1024];
			int len=0;
			
			while((len=fileReader.read(c))!=-1)
			{
				fileWriter.write(c,0,len);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(fileReader!=null)
			{
				try {
					fileReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(fileWriter!=null)
			{
				try {
					fileWriter.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
