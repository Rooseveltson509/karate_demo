package users.getMethod;

import com.intuit.karate.junit5.Karate;

public class userRunner {

    @Karate.Test
    Karate testCreateUserTest() {
        return new Karate()
                .feature("listUsers").relativeTo(getClass())
                .feature("singleUser").relativeTo(getClass())
                .feature("userFail").relativeTo(getClass());
    }

}
