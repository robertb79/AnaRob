import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class main {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        PersonalDetails person = null;

        try {
            InputStream json = new FileInputStream("person.json");
            PersonalDetails car = objectMapper.readValue(json, PersonalDetails.class);
        } catch (IOException exception) {
    }
}
