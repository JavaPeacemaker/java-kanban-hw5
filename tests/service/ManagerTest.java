package service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ManagerTest {

    @Test
    void shouldCreateDefaultManager() {
        assertNotNull(Managers.getDefault());
    }

    @Test
    void shouldCreateDefaultHistoryManager() {
        assertNotNull(Managers.getDefaultHistory());
    }

    @Test
    public void shouldCorrectlyAssembleProgramm() {
        Assertions.assertNotNull(Managers.getDefault());
        Assertions.assertNotNull(Managers.getDefaultHistory());
    }
}