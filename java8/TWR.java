import java.io.*;
import java.net.*;
public class TWR {
  public static void main(String args[]) {
    String file = "c.out";
    URL url = null;
    try {
      url = new URL("http://www.google.com");
    } catch (final Exception e) {}
    try (OutputStream out = new FileOutputStream(file);
         InputStream in = url.openStream()) {
      byte[] buf = new byte[4096];
      int len;
  
      while ((len = in.read(buf)) > 0) {
        out.write(buf, 0, len);
      }
    } catch (Exception e) {}
  }
}
