package Manager;

import Model.Car;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.List;

public class ObjectMapperLearner {
    public static void learnWriteToJson(String fileLocation) {
        ObjectMapper objectMapper = new ObjectMapper();
        Car car1 = new Car("Red","Race");
        try {
            objectMapper.writeValue(new File(fileLocation), car1);
        } catch (Exception e) {
            // do nothing
        }
    }

    public static Car learnReadFromJson(String fileLocation) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            Car car = objectMapper.readValue(new File(fileLocation), Car.class);
            return car;
        } catch (Exception e) {
            // do nothing
            return null;
        }
    }

    public static Car learnReadJavaListFromJSONArray(String jsonArray) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            List<Car> carList = objectMapper.readValue(jsonArray, new TypeReference<List<Car>>() {
            });
        } catch (Exception e) {
            // do nothing
        }
    }
}
