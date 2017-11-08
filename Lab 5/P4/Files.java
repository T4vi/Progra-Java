package P4;

import java.util.ArrayList;
import java.util.HashMap;

class Generics_02 {
	public static <T> ArrayList<T> fromArrayToArrayList(T[] a) 
	{
		ArrayList<T> c = new ArrayList<>();
		for (T o : a) 
			c.add(o);
		return c;
	}
}

public class Files 
{
	private HashMap<String, ArrayList<String>> file_types_extensions = new HashMap<>();

	public HashMap<String, ArrayList<String>> getFile_types_extensions() {
		return file_types_extensions;
	}

	public void setFile_types_extensions(HashMap<String, ArrayList<String>> file_types_extensions) {
		this.file_types_extensions = file_types_extensions;
	}
	
	public Files()
	{
		ArrayList<String> tmpc;
		String[] tmp;
		
		tmp = new String[]{"jpg", "bmp", "png"};
		tmpc = Generics_02.fromArrayToArrayList(tmp);
		file_types_extensions.put("image", tmpc);
		
		tmp = new String[]{"txt", "doc"};
		tmpc = Generics_02.fromArrayToArrayList(tmp);
		file_types_extensions.put("text", tmpc);
		
		tmp = new String[]{"exe", "bat", "com"};
		tmpc = Generics_02.fromArrayToArrayList(tmp);
		file_types_extensions.put("executable", tmpc);
		
		tmp = new String[]{"cfg", "ini"};
		tmpc = Generics_02.fromArrayToArrayList(tmp);
		file_types_extensions.put("config", tmpc);
	}
	
	public void addFileExtension(String type, String extension)
	{
		ArrayList<String> tmpc = new ArrayList<>();
		if(file_types_extensions.containsKey(type))
		{
			tmpc = file_types_extensions.get(type);
			tmpc.add(extension);
			file_types_extensions.remove(type);
			file_types_extensions.put(type, tmpc);
		}
		else
		{
			tmpc.add(extension);
			file_types_extensions.put(type, tmpc);
		}
	}
	
	public boolean isFileType(String type)
	{
		return file_types_extensions.containsKey(type);
	}
	
	public boolean isFileExt(String extension)
	{
		return (file_types_extensions.values().toString().contains(extension) && 
				(extension.length() == 3  || extension.length() == 2) && 
				! extension.contains("[] ;,.!@#$%^&*()\"\'"));
	}
}
