package lesson30.hw;

public class Moon {
    private static volatile Moon instance;
    private final String FIRST_MAN_ON_THE_MOON;
    private final Integer TEMPERATURE;

    private Moon(){
        this.FIRST_MAN_ON_THE_MOON = "Neil Armstrong";
        this.TEMPERATURE = -85;
    }
    public static Moon getInstance(){
        if(instance == null){
            synchronized (Moon.class){
                if(instance == null){
                    instance = new Moon();
                }
            }
        }
        return instance;
    }

    public String whoIsFirstManOnMe(){
        return this.FIRST_MAN_ON_THE_MOON;
    }

    public Integer checkTemperature(){
        return this.TEMPERATURE;
    }
}
