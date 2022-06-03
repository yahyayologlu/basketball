package co.producter.basketball.controller;

import co.producter.basketball.model.Player;
import co.producter.basketball.service.PlayerService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.List;

@Controller
@RestController
public class PlayerController {

    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }


    @QueryMapping
    public List<Player> playerList() {
        return playerService.findAll();
    }

    @Transactional
    @MutationMapping
    public Player createPlayer(@Argument @Valid Player input) {
        return playerService.save(input);
    }

    @Transactional
    @MutationMapping
    public String deletePlayer(@Argument @Valid Long id) {
        playerService.deleteById(id);
        return "true";
    }
}
