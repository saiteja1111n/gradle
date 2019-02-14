import Manager.ObjectMapperLearner;

import java.io.IOException;
// In reference to https://www.baeldung.com/jackson-object-mapper-tutorial
public class ObjectMapperLearnerMain {
    public static void main(String[] args) throws IOException {
        String fileLocation = "target/car.json";
        ObjectMapperLearner.learnWriteToJson(fileLocation);

    }
}
