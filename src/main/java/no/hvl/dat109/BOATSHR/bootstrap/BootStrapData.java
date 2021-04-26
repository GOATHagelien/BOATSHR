package no.hvl.dat109.BOATSHR.bootstrap;

import no.hvl.dat109.BOATSHR.repositories.BoatParkingRepository;
import no.hvl.dat109.BOATSHR.repositories.BoatRepository;
import no.hvl.dat109.BOATSHR.repositories.KundeRepository;
import no.hvl.dat109.BOATSHR.repositories.SelskapRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class BootStrapData implements CommandLineRunner {

    private final SelskapRepository selskapRepository;
    private final BoatParkingRepository boatParkingRepository;
    private final KundeRepository kundeRepository;
    private final BoatRepository boatRepository;

    public BootStrapData(SelskapRepository selskapRepository, BoatParkingRepository boatParkingRepository, KundeRepository kundeRepository, BoatRepository boatRepository) {
        this.selskapRepository = selskapRepository;
        this.boatParkingRepository = boatParkingRepository;
        this.kundeRepository = kundeRepository;
        this.boatRepository = boatRepository;
    }

    @Override
    public void run(String... args) throws Exception {





    }
}
