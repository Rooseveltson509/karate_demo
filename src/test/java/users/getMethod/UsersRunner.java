package users.getMethod;

import com.intuit.karate.junit5.Karate;

public class UsersRunner {

    @com.intuit.karate.junit5.Karate.Test
    com.intuit.karate.junit5.Karate testCreateUserTest() {
        return new Karate()
                .feature("listUsers").relativeTo(getClass())
                .feature("singleUser").relativeTo(getClass())
                .feature("usersFail").relativeTo(getClass());
    }

}
