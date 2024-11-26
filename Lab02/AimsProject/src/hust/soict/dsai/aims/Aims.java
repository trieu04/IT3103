package hust.soict.dsai.aims;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star wars","Science Fiction","Geogre Lucas",87,24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",18.99f);
        
        anOrder.addDigitalVideoDisc(dvd1, dvd2, dvd3);
        anOrder.print();
        
        anOrder.removeDigitalVideoDisc(dvd1, dvd2, dvd3);
        anOrder.print();
    }
}
