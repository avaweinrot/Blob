package test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.NoSuchAlgorithmException;

import org.junit.BeforeClass;
import org.junit.Test;

import andrewgit.Blob;

public class BTester {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Path p = Paths.get("junit.txt");
        try {
            Files.writeString(p, "example", StandardCharsets.ISO_8859_1);
        } catch (IOException e) {
            // TODO Auto-generated catch block
        	System.out.println(e.toString());
//            e.printStackTrace();
        }
	}

	@Test
	public void test() throws NoSuchAlgorithmException, IOException {
		Blob b = new Blob("junit.txt"); 
		b.makeNewFile();
		File file2 = new File("objects/c3499c2729730a7f807efb8676a92dcb6f8a3f8f");
		assertTrue(file2.exists());
		
	
	}

}
