import  java.io.*;
class TestFileStream 
{
	public static void main(String[] args) 
	{
/*		if (args.length != 1)
		{
			System.out.println("Usage: java TestFileStream FileName");
			System.exit(0);
		}
		String fileName = args[0];
*/
		try
		{   //���ļ���װ��File����
			//File file = new File("F:\\Java-learning\\IO\\temp.dat");
			//����FileInputStream����,temp.dat�����ڣ��򸲸ǣ������򴴽�temp.dat
			//FileOutputStream outStream = new FileOutputStream(file);
			FileOutputStream outStream = new FileOutputStream("F:\\Java-learning\\IO\\temp.dat");
			for (int i=0; i<10; i++ )
			{
				//д��
				outStream.write(i+10);
			}
			//�ر������
			outStream.close();

			//temp.dat�������ڣ����׳��쳣
			FileInputStream inStream = new FileInputStream("temp.dat");
			int value;
			//�����������ĩβ���򷵻� -1��
			while ((value = inStream.read())!= -1)
			{
				System.out.print(value+" ");
			}

		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}