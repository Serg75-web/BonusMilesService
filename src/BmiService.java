public class BmiService {

    public int calculate (double height) {
        int weight = 98; // килограммы
        double index = weight/ (height * height);
        return (int) index;
    }
}
