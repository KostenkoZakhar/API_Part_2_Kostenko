import RickAndMortyModels.Characters;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import models.exchanges.Pages;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static rest.RestGet.Get;

@RunWith(Parameterized.class)
public class RickAndMortyTest{
    static String url = "https://rickandmortyapi.com/api/character?page=";
    static Characters characters;

    @Parameterized.Parameters
    public static Collection options() {
        return Arrays.asList(Pages.values());
    }


    public RickAndMortyTest(Pages pages) throws JsonProcessingException {
        ObjectMapper om = new ObjectMapper();
        characters= om.readValue( Get(url + pages.getPageNumber()), Characters.class);
    }


    @Test
    public void checkCharacters() {
            for(int i = 0; i< characters.results.size() & characters.info.next!=null; i++){
                System.out.println(characters.results.get(i).name);
            }
    }}