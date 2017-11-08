package P4;

import java.util.ArrayList;

public class mainclass_p4 {
	public static void main(String[] args)
	{
		ArrayList<UserFile> files = new ArrayList<>();
	
		
		files.add(new UserFile("file1", "jpg", "image", 2000));
		files.add(new UserFile("file2", "jpg", "image", 1000));
		// etc
		
		System.out.println(files);
		files.sort(new UserFile());
		System.out.println(files);
		
		
		Files f = new Files();
		System.out.println("supported file types: " + f.getFile_types_extensions().keySet().toString());
		System.out.println("supported extensions: " + f.getFile_types_extensions().values().toString());
		
		f.addFileExtension("text", "log");
		
		System.out.println("supported file types: " + f.getFile_types_extensions().keySet().toString());
		System.out.println("supported extensions: " + f.getFile_types_extensions().values().toString());
		
		f.addFileExtension("data", "db");
		
		System.out.println("supported file types: " + f.getFile_types_extensions().keySet().toString());
		System.out.println("supported extensions: " + f.getFile_types_extensions().values().toString());
	}
}
