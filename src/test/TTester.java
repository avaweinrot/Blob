package test;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import andrewgit.Tree;

public class TTester {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() throws NoSuchAlgorithmException, UnsupportedEncodingException {
		ArrayList<String> list = new ArrayList<String>();
		list.add("62X : d99ed7744a09c6078ef391a07eca50cd2d3622da fileName1.txt");
		list.add("Anika : 01670a0aee5d4289cb1c8231ac7cd6db7b4e4be8 fileName2.txt");
		list.add("Audrey : 9f56d9b292b55162ca3999b56f054b407a2ae67e fileName3.txt");
		list.add("Eric : 6d0e5951f2a9d928c1d17b25d57f0461296048e6 fileName4.txt");
		list.add("Karen : 961c4ce5692d8f0f612b4cd6d8665865aac3ace4 fileName5.txt");
		list.add("Kensuke : 2fa6905f03507615399918510f07657b129890fb fileName6.txt");
		Tree tree = new Tree(list);
	}

}
