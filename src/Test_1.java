import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

public class Test_1 {

	public static void main(String[] args) throws IOException
	
	{
		// TODO Auto-generated method stub
		byte[] arr = new byte[4];
		arr[0] = 0x78;
		arr[1] = 0x56;
		arr[2] = 0x34;
		arr[3] = 0x12;
		
		ByteArrayInputStream bais = new ByteArrayInputStream(arr);
		DataInputStream dis = new DataInputStream(bais);
		System.out.println(Integer.toHexString(dis.readInt()));
		
	}

}

//[out]:78563412 高位字节78 存在低位地址，是大端。存储顺序Little-Endian【小端】高位在低地址，big-endian【大端】高位在高地址 