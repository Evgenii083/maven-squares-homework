import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.squareshomework.services.SQRService;

public class SQRServiceTest {

    @Test
    void firstDataMassive() {
        SQRService service = new SQRService();

        int minVolue = 100;
        int maxVolue = 400;
        int expected = 11;

        int actual = service.calcSquare(minVolue, maxVolue);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void WrongDataMassive() {
        SQRService service = new SQRService();

        int minVolue = -100;
        int maxVolue = -400;
        int expected = 0;

        int actual = service.calcSquare(minVolue, maxVolue);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void ZeroDataMassive() {
        SQRService service = new SQRService();

        int minVolue = 0;
        int maxVolue = 0;
        int expected = 0;

        int actual = service.calcSquare(minVolue,maxVolue);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    void MaxItarationCount(){
        SQRService service = new SQRService();

        int minVolume = 1 ;
        int maxVolume = 10_000;
        int expected = 90;

        int actual = service.calcSquare(minVolume,maxVolume);

        Assertions.assertEquals(expected,actual);
    }
}
