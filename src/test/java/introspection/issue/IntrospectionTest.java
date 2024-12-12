package introspection.issue;

import io.micronaut.core.beans.BeanIntrospector;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IntrospectionTest {

    @Test
    void canInstantiatePOJO() {
        POJO pojo = BeanIntrospector.SHARED.getIntrospection(POJO.class).instantiate();
        Assertions.assertNotNull(pojo);
    }

    @Test
    void defaultConstructorPresent() {
        POJO pojo = new POJO();
        Assertions.assertNotNull(pojo);
    }

}
