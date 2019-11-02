package one;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class App4 {

	public static void main(String[] args) throws Exception {
 
		//reading file , which must be exist before
		File f = new File("f.doc");
		FileInputStream fis = new FileInputStream(f);
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		//writing into file
		File f2 = new File("f.zip");
		FileOutputStream fos = new FileOutputStream(f2);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ZipOutputStream zos = new ZipOutputStream(bos);
		
		zos.setMethod(ZipOutputStream.DEFLATED);//to choose a zip type
		zos.putNextEntry(new ZipEntry(f.getName())); //to specify the entry to ur file 
		
		int c;
		while((c=bis.read())!=-1) {
			zos.write(c);
			
		}
		bos.close();

	}

}
