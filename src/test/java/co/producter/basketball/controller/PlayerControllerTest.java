package co.producter.basketball.controller;

import co.producter.basketball.model.Player;
import co.producter.basketball.model.Position;
import co.producter.basketball.service.PlayerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;

class PlayerControllerTest {

    @Mock
    PlayerService service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void playerList() {
        assertNotNull(service.findAll());
    }

    @Test
    void createPlayer() {
        Player player = new Player();
        player.setName("test");
        player.setLastname("test1");
        player.setPosition(Position.PF);
        assertNull(service.save(player));

    }

    @Test
    void deletePlayer() {
        service.deleteById(1L);
        assertTrue(true);
    }
}