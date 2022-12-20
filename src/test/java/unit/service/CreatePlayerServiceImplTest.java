package unit.service;

import com.cydeo.spacecraft.dto.CreateGameDTO;
import com.cydeo.spacecraft.entity.Player;
import com.cydeo.spacecraft.enumtype.Boost;
import com.cydeo.spacecraft.enumtype.Level;
import com.cydeo.spacecraft.service.impl.CreatePlayerServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreatePlayerServiceImplTest {

    private CreatePlayerServiceImpl createPlayerService;

    @BeforeEach
    public void setUp(){
        createPlayerService = new CreatePlayerServiceImpl();
    }

    @Test
    public void should_create_player_with_big_bomb_boost_type_and_level_easy(){
        CreateGameDTO createGameDTO= new CreateGameDTO();
        //the testing structure is
        //given something
        //when something happens
        //then something else happens

        //this is the given part
        createGameDTO.setBoost(Boost.BIG_BOMB);
        createGameDTO.setLevel(Level.EASY);
        createGameDTO.setUsername("username");

        //this is the when part
        Player player= createPlayerService.createPlayer(createGameDTO);

        //this is the then part
        assertEquals(player.getHealth(), 2000 );
        assertEquals(player.getArmor(), 7 );
        assertEquals(player.getShootPower(), 5010 );
    }
    @Test
    public void should_create_player_with_extra_shield_type_and_level_easy(){
        CreateGameDTO createGameDTO= new CreateGameDTO();

        //this is the given part
        createGameDTO.setBoost(Boost.EXTRA_SHIELD);
        createGameDTO.setLevel(Level.EASY);
        createGameDTO.setUsername("username");

        //this is the when part
        Player player= createPlayerService.createPlayer(createGameDTO);

        //this is the then part
        assertEquals(player.getHealth(), 4145);
        assertEquals(player.getArmor(), 242 );
        assertEquals(player.getShootPower(), 10 );
    }

    @Test
    public void should_create_player_with_super_ammo_type_and_level_easy(){
        CreateGameDTO createGameDTO= new CreateGameDTO();

        //this is the given part
        createGameDTO.setBoost(Boost.SUPER_AMMO);
        createGameDTO.setLevel(Level.EASY);
        createGameDTO.setUsername("username");

        //this is the when part
        Player player= createPlayerService.createPlayer(createGameDTO);

        //this is the then part
        assertEquals(player.getHealth(), 2000);
        assertEquals(player.getArmor(), 7 );
        assertEquals(player.getShootPower(), 160 );
    }


}
