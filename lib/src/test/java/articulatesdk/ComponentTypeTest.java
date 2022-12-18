package articulatesdk;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ComponentTypeTest {

    private static final String PARA_EXPECTED_RESULT = "paragraph-one";

    @Test void tokenFormatterTest() {
        final String result = ComponentType.PARAGRAPH_ONE.getFormattedToken();
        assertEquals(PARA_EXPECTED_RESULT, result);
    }
}
