import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParseTest {
   @Test
   public void addition() {
       assertEquals(2, 1 + 1);
   }

   @Test
   public void testLinks() throws IOException{
       Path fileName = Path.of("/Users/alexsurek/Documents/GitHub/markdown-parser/test-file.md");
       String content = Files.readString(fileName) ;
       MarkdownParse obj = new MarkdownParse();
       ArrayList<String> links = obj.getLinks(content);
       assertEquals(List.of("https://something.com", "some-thing.html"), links);
   }

   @Test
   public void testFile2() throws IOException{
       Path fileName = Path.of("/Users/alexsurek/Documents/GitHub/markdown-parser/test-file2.md");
       String content = Files.readString(fileName);
       MarkdownParse obj = new MarkdownParse();
       ArrayList<String> links = obj.getLinks(content);
       assertEquals(List.of("https://something.com", "some-thing.html"), links);
   }
}



   