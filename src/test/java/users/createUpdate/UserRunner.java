package users.createUpdate;

import com.intuit.karate.junit5.Karate;

public class UserRunner {

    @Karate.Test
    Karate testCreateUserTest() {
        return new Karate()
                .feature("createUser").relativeTo(getClass())
                .feature("update").relativeTo(getClass());
    }

}
