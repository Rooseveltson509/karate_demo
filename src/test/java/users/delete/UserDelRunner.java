package users.delete;

import com.intuit.karate.junit5.Karate;

public class UserDelRunner {
    @Karate.Test
    Karate testDeleteTest() {
        return new Karate()
                .feature("delete").relativeTo(getClass());
    }
}
