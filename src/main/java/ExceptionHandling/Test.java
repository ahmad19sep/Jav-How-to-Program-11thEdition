package ExceptionHandling;

import java.io.File;
import java.io.IOException;

public class Test {

    String getMyConicalPath(File file) throws IOException {

            return file.getCanonicalPath();

    }
}
