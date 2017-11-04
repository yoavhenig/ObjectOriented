package matala0;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		String path = "C:\\Users\\נגה\\Desktop\\אוניברסיטה\\שנה ב\\מונחה עצמים\\מטלה 0\\27.10\\Lenovo";

		Stream<Path> paths = null;
		List<File> csvFiles = new ArrayList<>();
		try {
			paths = Files.walk(Paths.get(path));
		} catch (IOException e) {
			System.err.println("Cano't find files in path");
			e.printStackTrace();
		}

		List<File> regularFiles = paths.filter(Files::isRegularFile).map(Path::toFile).collect(Collectors.toList());
		for (File file : regularFiles) {
			System.out.println(file.getAbsolutePath());
			String fileName = file.getName().toLowerCase();
			if (fileName.endsWith(".csv"))
			{
				csvFiles.add(file);
			}
		}

		System.out.println();

		for (File file : csvFiles) {
			System.out.println(file.getAbsolutePath());
		}

	}

}
