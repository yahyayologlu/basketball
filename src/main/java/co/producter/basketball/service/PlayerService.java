package co.producter.basketball.service;

import co.producter.basketball.model.Player;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    private final PlayerRepo repo;

    public PlayerService(PlayerRepo repo) {
        this.repo = repo;
    }


    public List<Player> findAll() {
        return repo.findAll();
    }

    public Player save(Player input) {
        return repo.save(input);
    }

    public void deleteById(Long id) {
        repo.deleteById(id);
    }
}
