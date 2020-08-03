package guides.hazelcast.micronaut;

import com.hazelcast.core.HazelcastInstance;
import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest
public class SmokeTest {

    @Inject
    CommandController instance;

    @Test
    void testItWorks() {
        instance.put("foo", "bar");

        assertEquals("bar", instance.get("foo").getValue());
    }
}
