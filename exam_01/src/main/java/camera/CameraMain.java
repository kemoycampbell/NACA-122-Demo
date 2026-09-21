package camera;

public class CameraMain {
    public static void main(String args[]) {
        AnalogCamera analog = new AnalogCamera("Nikkon","ABC-123",LensType.FISHEYE);

        System.out.println("Analog Camera");
        System.out.println("take picture: " + analog.takePicture());
        analog.loadFilmRoll(5);
        System.out.println("Added film roll of size 5");
        System.out.println("take picture: " + analog.takePicture());
        System.out.println("take picture: " + analog.takePicture());
        System.out.println("take picture: " + analog.takePicture());
        System.out.println("take picture: " + analog.takePicture());
        System.out.println("take picture: " + analog.takePicture());
        System.out.println("take picture: " + analog.takePicture());
        System.out.println("Added film roll of size 1");
        analog.loadFilmRoll(1);
        System.out.println("take picture: " + analog.takePicture());

        System.out.println("\nDigital Camera");
        DigitalCamera digital = new DigitalCamera("Sony","567-DEF",LensType.STANDARD,2);
        System.out.println("take picture: " + digital.takePicture());
        digital.insertMemoryCard(9);
        System.out.println("Added memory card of size 9MB");
        System.out.println("take picture: " + digital.takePicture());
        System.out.println("take picture: " + digital.takePicture());
        System.out.println("take picture: " + digital.takePicture());
        System.out.println("take picture: " + digital.takePicture());
        System.out.println("take picture: " + digital.takePicture());
        digital.insertMemoryCard(2);
        System.out.println("Added memory card of size 2MB");
        System.out.println("take picture: " + digital.takePicture());


    }
    
}
